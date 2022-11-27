package com.springboot.ATM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ATM.model.UserData;


@Repository
public interface registrationRepository extends JpaRepository<UserData, Long> {

}
