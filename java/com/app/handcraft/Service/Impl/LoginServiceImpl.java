package com.app.handcraft.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.handcraft.Model.LoginPage;
import com.app.handcraft.Repository.LoginRepo;
import com.app.handcraft.Service.LoginService;

import jakarta.transaction.Transactional;
//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Service
@Transactional
public class LoginServiceImpl implements LoginService{

@Autowired
private LoginRepo loginRepository;

@Override
public boolean addUser(LoginPage login) {
boolean userExists = loginRepository.existsByUsermail(login.getUsermail());
if(!userExists) {
loginRepository.save(login);
return true;
} else {
return false;
}
}

public List<LoginPage> getUser() {
return loginRepository.findAll();
}

public boolean updateUser(Long id,LoginPage login) {
Optional<LoginPage> existingUserOptional = loginRepository.findById(id);
if(existingUserOptional.isPresent()) {
LoginPage userExists = existingUserOptional.get();

userExists.setUsername(login.getUsername());
userExists.setUsermail(login.getUsermail());
userExists.setContactno(login.getContactno());
userExists.setPassword(login.getPassword());
loginRepository.save(userExists);
return true;
} else {
return false;
}

}
@Override
public boolean deleteUser(Long id) {
Optional<LoginPage> existingUserOptional = loginRepository.findById(id);
if(existingUserOptional.isPresent()) {
loginRepository.deleteById(id);
return true;
} else {
return false;
}
}
@Override
public Page<LoginPage> getAllUser(PageRequest pageRequest){
return loginRepository.findAll(pageRequest);
}
@Override
public List<LoginPage> findAllQuery(){
return loginRepository.findAllQuery();
}
@Override
public LoginPage findByUsermail(String usermail) {
return loginRepository.findByUsermail(usermail);
}
//
@Override
public LoginPage findByUsermail() {
// TODO Auto-generated method stub
return null;
}

@Override
public LoginPage findUsermail() {
// TODO Auto-generated method stub
return null;
}
}