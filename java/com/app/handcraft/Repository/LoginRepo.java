package com.app.handcraft.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.handcraft.Model.LoginPage;

public interface LoginRepo extends JpaRepository<LoginPage, Long>{

boolean existsByUsermail(String usermail);

Optional<LoginPage> findById(Long id);

void deleteById(Long id);
    @Query("select s from LoginPage s")
    List<LoginPage> findAllQuery();
    @Query("select s from LoginPage s where s.usermail= :usermail")
LoginPage findByUsermail(@Param("usermail")String usermail);

}
