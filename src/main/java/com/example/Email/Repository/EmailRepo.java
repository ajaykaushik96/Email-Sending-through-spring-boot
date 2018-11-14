package com.example.Email.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Email.Dto.EmailDto;
import com.example.Email.Model.EmailModel;


@Repository
public interface EmailRepo extends JpaRepository< EmailModel,Long >
{

}
 