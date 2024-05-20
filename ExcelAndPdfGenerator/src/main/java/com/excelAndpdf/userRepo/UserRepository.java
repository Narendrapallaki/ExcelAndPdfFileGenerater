package com.excelAndpdf.userRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelAndpdf.entity.UserDetails;
@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer>{

}
