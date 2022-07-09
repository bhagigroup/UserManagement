package com.bhagi.UserManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhagi.UserManagement.Entity.Customers;

@Repository
public interface UserRepo extends JpaRepository<Customers, Integer> {
}
