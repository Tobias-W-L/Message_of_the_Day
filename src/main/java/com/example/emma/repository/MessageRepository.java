package com.example.emma.repository;

import com.example.emma.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository <Message, Long> {

}
