package com.softuni.springintroex.repositories;


import com.softuni.springintroex.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {


    @Query("SELECT a from Author as a ORDER BY a.books.size DESC ")
    List<Author> findAuthorByCountOfBook();

    Author findByFirstNameAndLastName(String firstName, String lastName);

    List<Author> findAllByFirstNameEndsWith(String endsWith);


}
