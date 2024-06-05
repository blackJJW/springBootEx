package com.example.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.guestbook.entity.Guestbook;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long>{
}
