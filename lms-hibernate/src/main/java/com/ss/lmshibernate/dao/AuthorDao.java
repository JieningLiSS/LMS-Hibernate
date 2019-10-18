package com.ss.lmshibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ss.lmshibernate.entity.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Long> {

}