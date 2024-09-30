package com.ltechlab.truthordare.services;

import com.ltechlab.truthordare.models.User;
import com.ltechlab.truthordare.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User getAndCheckToExist(String chatId) {
        log.info("Проверка юзера {} на существование", chatId);
        return repository.findByChatId(chatId).orElseGet(() -> repository.save(new User(chatId)));
    }
}