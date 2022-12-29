package com.akar_dev.project.ServiceImplementation;

import com.akar_dev.project.Entity.Authors;
import com.akar_dev.project.Repository.AuthorsRepository;
import com.akar_dev.project.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AuthorServiceImplementation implements AuthorService {


    @Autowired
    AuthorsRepository authorsRepository;

    @Override
    public Authors addAuthor(Authors authors) {
        return authorsRepository.save(authors);

    }

    @Override
    public List<Authors> retrieveJsonAuthors() {
        return authorsRepository.findAll();
    }

    @Override
    public Authors updateAuth(Long authID, Authors authors) {
        Authors authDB = authorsRepository.findById(authID).get();
        if(Objects.nonNull(authors.getAuthFName()) &&
                !"".equalsIgnoreCase(authors.getAuthFName())) {
            authDB.setAuthFName(authors.getAuthFName());
        }
        if(Objects.nonNull(authors.getAuthLName()) &&
                !"".equalsIgnoreCase(authors.getAuthLName())) {
            authDB.setAuthLName(authors.getAuthLName());
        }
        if(Objects.nonNull(authors.getAuthEmail()) &&
                !"".equalsIgnoreCase(authors.getAuthEmail())) {
            authDB.setAuthEmail(authors.getAuthEmail());
        }
        if(Objects.nonNull(authors.getAuthPassword()) &&
                !"".equalsIgnoreCase(authors.getAuthPassword())) {
            authDB.setAuthPassword(authors.getAuthPassword());
        }
        return authorsRepository.save(authDB);

    }

}
