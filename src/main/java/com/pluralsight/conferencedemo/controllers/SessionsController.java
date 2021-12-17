package com.pluralsight.conferencedemo.controllers;

import java.util.List;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.repositories.SessionRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getById(id);
    }

    @PostMapping
    //Give a more detailed Response
    //usually, the response for this endpoint is 200
     //@ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session) {
      return sessionRepository.saveAndFlush(session);
    }

    @PutMapping("/{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        Session existingSession = sessionRepository.getById(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        sessionRepository.deleteById(id);
    }
    
}
