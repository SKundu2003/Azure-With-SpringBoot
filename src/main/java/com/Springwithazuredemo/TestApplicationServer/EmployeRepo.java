package com.Springwithazuredemo.TestApplicationServer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<Employe,Integer> {
}
