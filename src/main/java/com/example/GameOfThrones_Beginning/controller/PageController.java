package com.example.GameOfThrones_Beginning.controller;
import com.example.GameOfThrones_Beginning.Repositories.PersonRepository;
import com.example.GameOfThrones_Beginning.Repositories.QuestionRepository;
import com.example.GameOfThrones_Beginning.TestResolver;
import com.example.GameOfThrones_Beginning.model.Person;
import com.example.GameOfThrones_Beginning.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.GameOfThrones_Beginning.TestResolver.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class PageController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public ModelAndView index(Map<String,Object> model){
        model.put("TestChoiceLink","/test_choice");
        return new ModelAndView("index",model);
    }

   
    @GetMapping("/test_choice")
    public ModelAndView test_choice(Map<String,Object> model){
        model.put("person_test_link","/test_person");
        model.put("houses_test_link","/test_houses");
        return new ModelAndView("test_choice",model);
    }

//person test
    @RequestMapping(value = "/test_person",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView test_person(Map<String,Object> model){
        var questions = questionRepository.findAll();
        model.put("questions", questions);
        return new ModelAndView("test_person",model);
    }

    @RequestMapping(value = "/test_houses",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView test_houses(Map<String,Object> model) {
        model.put("SomeTest", "Here Will Be A Test About Houses");
        return new ModelAndView("test_houses", model);
    }

    @GetMapping("/person_res/{str_id}")
    public  ModelAndView person_res_another(@PathVariable String str_id,Map<String,Object> model){
//        int id = TestResolver.GetID(0,0,0,0);
//        String str_id = String.valueOf(id);
        var person = personRepository.findById(Integer.valueOf(str_id)).stream().toArray();
        model.put("person", person);
        return new ModelAndView("person_res",model);
    }

    @RequestMapping(value="/person_res",method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView person_res(@RequestParam("1") String q1,@RequestParam("2") String q2,
                                   @RequestParam("3") String q3, @RequestParam("4") String q4, @RequestParam("name") String name,
                                   Map<String,Object> model){

        model.put("q1", q1);
        model.put("q2", q2);
        model.put("q3", q3);
        model.put("q4", q4);
        int id = TestResolver.GetID(0,0,0,0);
        Optional<Person> person = personRepository.findById(id);
        model.put("person", person);
        return new ModelAndView("person_res",model);
    }
}
