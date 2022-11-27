package com.springboot.ATM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ATM.model.UserData;

public interface registrationRepository extends JpaRepository<UserData, Long> {

}
