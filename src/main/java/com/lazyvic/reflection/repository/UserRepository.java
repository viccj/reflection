package com.lazyvic.reflection.repository;

import com.lazyvic.reflection.model.DailyPlan;
import com.lazyvic.reflection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByTelegramId(Long telegramId);
}
