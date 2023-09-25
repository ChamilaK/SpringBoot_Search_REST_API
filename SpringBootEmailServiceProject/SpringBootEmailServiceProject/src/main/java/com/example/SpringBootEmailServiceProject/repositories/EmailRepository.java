package com.example.SpringBootEmailServiceProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootEmailServiceProject.beans.Email;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmailRepository extends JpaRepository<Email,Integer>
{

    @Query("SELECT s FROM Email s WHERE " +
            "subject LIKE CONCAT('%',:query, '%')")

    List<Email> getEmailBySubjectSQL(String query);
}
