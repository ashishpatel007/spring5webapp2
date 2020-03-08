package com.ashtimes.spring5webapp2.repositories;

import com.ashtimes.spring5webapp2.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
