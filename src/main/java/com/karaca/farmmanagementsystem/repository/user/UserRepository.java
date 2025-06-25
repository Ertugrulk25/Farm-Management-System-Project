package com.karaca.farmmanagementsystem.repository.user;

import com.karaca.farmmanagementsystem.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {


}
