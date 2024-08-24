package com.pangTogether.repository;

import com.pangTogether.domain.Cartuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartuserRepository extends JpaRepository<Cartuser, Long> {

}