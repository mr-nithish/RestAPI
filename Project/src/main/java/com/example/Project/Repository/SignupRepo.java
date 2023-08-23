package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Project.Model.Signup;

@Repository
public interface SignupRepo extends JpaRepository<Signup, String> {

}
