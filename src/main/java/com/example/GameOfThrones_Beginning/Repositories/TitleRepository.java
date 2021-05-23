package com.example.GameOfThrones_Beginning.Repositories;


import com.example.GameOfThrones_Beginning.model.Title;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Title, Integer> {
}
