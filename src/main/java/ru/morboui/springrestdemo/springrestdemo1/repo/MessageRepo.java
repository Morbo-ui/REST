package ru.morboui.springrestdemo.springrestdemo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.morboui.springrestdemo.springrestdemo1.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
