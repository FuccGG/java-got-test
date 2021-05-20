package com.example.GameOfThrones_Beginning.Repositories;

import com.example.GameOfThrones_Beginning.model.Question;
import com.sun.istack.Nullable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface QuestionRepository extends CrudRepository<Question, String>{
}




