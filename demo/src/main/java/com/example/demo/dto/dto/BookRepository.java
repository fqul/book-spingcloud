package com.example.demo.dto.dto;

import com.example.demo.dao.Book;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kun.wang on 2017/7/12.
 */
public interface BookRepository extends CrudRepository<Book, Long>, JpaSpecificationExecutor<Book>{
}
