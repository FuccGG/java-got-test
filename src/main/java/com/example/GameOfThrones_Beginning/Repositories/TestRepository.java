package com.example.GameOfThrones_Beginning.Repositories;

import com.example.GameOfThrones_Beginning.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TestRepository extends CrudRepository<Test,Integer> {
}
