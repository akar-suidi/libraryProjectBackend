package com.akar_dev.project.Service;

import com.akar_dev.project.Entity.Authors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    Authors addAuthor(Authors authors);
    List<Authors> retrieveJsonAuthors();
    Authors updateAuth(Long authID , Authors authors);




}
