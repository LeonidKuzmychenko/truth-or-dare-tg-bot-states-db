package com.ltechlab.truthordare.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "chat_id", unique = true, nullable = false, length = 50)
    @JsonIgnore
    private String chatId;

    @Column(name = "command", unique = false, nullable = true, length = 255)
    private String command;

    public User(String chatId) {
        this.chatId = chatId;
        this.command = null;
    }

}