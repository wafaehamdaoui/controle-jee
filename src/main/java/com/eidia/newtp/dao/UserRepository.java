package com.eidia.newtp.dao;

import com.eidia.newtp.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  UserRepository extends JpaRepository<Utilisateur, Long> {
    @Query("select p from Utilisateur p ")
    public List<Utilisateur> search(@Param("x")String key);
}
