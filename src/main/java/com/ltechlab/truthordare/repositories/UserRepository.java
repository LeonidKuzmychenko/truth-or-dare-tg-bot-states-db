package com.ltechlab.truthordare.repositories;

import com.ltechlab.truthordare.models.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users u where u.chat_id = :chatId", nativeQuery = true)
    Optional<User> findByChatId(@Param("chatId") String chatId);

    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = "serials")
    List<User> findAll();
}