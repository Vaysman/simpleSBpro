package com.example.spdockpro.service;

import com.example.spdockpro.entity.EmployeeEntity;
import com.example.spdockpro.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public EmployeeEntity getUserById(Long id){
        EmployeeEntity employee =  userRepository.getReferenceById(id);

        return employee;

    }


}
