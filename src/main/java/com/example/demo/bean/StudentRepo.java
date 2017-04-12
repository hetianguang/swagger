package com.example.demo.bean;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tghe on 4/12/17.
 */
@Repository
public interface StudentRepo extends CrudRepository {
    Student findById(String id);
}
