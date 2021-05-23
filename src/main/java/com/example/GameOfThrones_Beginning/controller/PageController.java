package com.example.GameOfThrones_Beginning.controller;
import com.example.GameOfThrones_Beginning.Classes.TestForm;
import com.example.GameOfThrones_Beginning.Repositories.PersonRepository;
import com.example.GameOfThrones_Beginning.Repositories.QuestionRepository;
import com.example.GameOfThrones_Beginning.Repositories.TestRepository;
import com.example.GameOfThrones_Beginning.Repositories.TitleRepository;
import com.example.GameOfThrones_Beginning.TestResolver;
import com.example.GameOfThrones_Beginning.model.Person;
import com.example.GameOfThrones_Beginning.model.Question;
import com.example.GameOfThrones_Beginning.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.GameOfThrones_Beginning.TestResolver.*;
import com.google.gson.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class PageController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private TitleRepository titleRepository;

    @GetMapping("/")
    public ModelAndView index(Map<String,Object> model){
        model.put("TestChoiceLink","/test_choice");
        return new ModelAndView("index",model);
    }

   
    @GetMapping("/test_choice")
    public ModelAndView test_choice(Map<String,Object> model){
        model.put("person_test_link","/test_person");
        model.put("houses_test_link","/test_title");
        return new ModelAndView("test_choice",model);
    }



    @RequestMapping(value = "/test_houses",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView test_houses(Map<String,Object> model) {
        model.put("SomeTest", "Here Will Be A Test About Houses");
        return new ModelAndView("test_houses", model);
    }

    @GetMapping("/person_res/{str_id}")
    public  ModelAndView person_res_another(@PathVariable String str_id,Map<String,Object> model){
        var person = personRepository.findById(Integer.valueOf(str_id)).stream().toArray();
        model.put("person", person);
        return new ModelAndView("person_res",model);
    }

    @GetMapping("/title_res/{str_id}")
    public  ModelAndView houses_res_another(@PathVariable String str_id,Map<String,Object> model){
        var title = titleRepository.findById(Integer.valueOf(str_id)).get();
        model.put("title", title);
        return new ModelAndView("title_res_1", model);
    }

//    //person test
//    @RequestMapping(value = "/test_person",method = {RequestMethod.GET})
//    public ModelAndView test_person(Map<String,Object> model){
//        var questions = questionRepository.findAll();
//        model.put("questions", questions);
//        return new ModelAndView("test_person",model);
//    }
//
//    @RequestMapping(value="/test_person",method={RequestMethod.POST})
//    public ModelAndView person_res(@RequestParam(value = "q1") String data,
//                                   Map<String,Object> model){
//
////        var testData = new Gson().fromJson(data, JsonObject.class);
//        int id = TestResolver.GetID(0,0,0,0);
//        Optional<Person> person = personRepository.findById(id);
//        model.put("data",data);
//        model.put("person", person);
//        return new ModelAndView("redirect:/person_res/" + String.valueOf(id), model);
//    }

    @RequestMapping(value = "/test_person", method = RequestMethod.GET)
    protected ModelAndView getTest(HttpServletRequest hsr, HttpServletResponse hsr1){
        ModelAndView result = new ModelAndView("simple_persontest");
        var test = testRepository.findById(1).get();
        var testName = test.getDescription();
        var Q1 = questionRepository.findById(test.getQ1_id()).get();
        var Q2 = questionRepository.findById(test.getQ2_id()).get();
        var Q3 = questionRepository.findById(test.getQ3_id()).get();
        var Q4 = questionRepository.findById(test.getQ4_id()).get();
        result.addObject("Q1",Q1);
        result.addObject("Q2",Q2);
        result.addObject("Q3",Q3);
        result.addObject("Q4",Q4);
        result.addObject("testName",testName);
        result.addObject("testForm", new TestForm());
        return result;
    }

    @RequestMapping(value = "/test_person", method = RequestMethod.POST)
    protected ModelAndView getTestPost(@ModelAttribute TestForm testForm){
        int id = TestResolver.GetID(Integer.parseInt(testForm.getQ1()),Integer.parseInt(testForm.getQ2()),
                Integer.parseInt(testForm.getQ3()), Integer.parseInt(testForm.getQ4()));
        return new ModelAndView("redirect:/person_res/" + String.valueOf(id));
    }

    @RequestMapping(value = "/test_title", method = RequestMethod.GET)
    protected ModelAndView getTestTitle(HttpServletRequest hsr, HttpServletResponse hsr1){
        ModelAndView result = new ModelAndView("simple_titletest");
        var test = testRepository.findById(2).get();
        var testName = test.getDescription();
        var Q1 = questionRepository.findById(test.getQ1_id()).get();
        var Q2 = questionRepository.findById(test.getQ2_id()).get();
        var Q3 = questionRepository.findById(test.getQ3_id()).get();
        var Q4 = questionRepository.findById(test.getQ4_id()).get();
        result.addObject("Q1",Q1);
        result.addObject("Q2",Q2);
        result.addObject("Q3",Q3);
        result.addObject("Q4",Q4);
        result.addObject("testName",testName);
        result.addObject("testForm", new TestForm());
        return result;
    }

    @RequestMapping(value = "/test_title", method = RequestMethod.POST)
    protected ModelAndView getTestTitlePost(@ModelAttribute TestForm testForm){
        int id = TestResolver.GetID(Integer.parseInt(testForm.getQ1()),Integer.parseInt(testForm.getQ2()),
                Integer.parseInt(testForm.getQ3()), Integer.parseInt(testForm.getQ4()));
        return new ModelAndView("redirect:/title_res/" + String.valueOf(id));
    }
}
