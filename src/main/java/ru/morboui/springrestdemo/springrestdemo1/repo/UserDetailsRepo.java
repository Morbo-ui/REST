package ru.morboui.springrestdemo.springrestdemo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.morboui.springrestdemo.springrestdemo1.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
