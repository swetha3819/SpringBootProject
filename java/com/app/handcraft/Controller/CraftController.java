package com.app.handcraft.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.handcraft.Model.LoginPage;
import com.app.handcraft.Service.LoginService;

@RestController
@RequestMapping("/api/v1/user")
public class CraftController {

@Autowired

private LoginService loginService;

@GetMapping("/getUser")
public ResponseEntity<List<LoginPage>> getUser(){
return ResponseEntity.status(200).body(loginService.getUser());
}

@GetMapping("/getAllUser")
public ResponseEntity<Page<LoginPage>> getAllUser(
@RequestParam(defaultValue="0") int page,
@RequestParam(defaultValue="10") int size,
@RequestParam(defaultValue="id") String sortField,
@RequestParam(defaultValue="asc") String sortOrder){
PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortField));
return ResponseEntity.status(200).body(loginService.getAllUser(pageRequest));
}

@PostMapping("/addUser")
public ResponseEntity<String> addUser(@RequestBody LoginPage user){
boolean dataSaved = loginService.addUser(user);
if(dataSaved) {
return ResponseEntity.status(200).body("User added successfully!");
}else {
return ResponseEntity.status(404).body("Something went wrong!");
}
}

@PutMapping("/updateUser/{id}")
public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody LoginPage user){
boolean userData = loginService.updateUser(id,user);
if(userData) {
return ResponseEntity.status(200).body("User updated successfully");
} else{
return ResponseEntity.status(404).body("No record found to be updated");
}
}


@DeleteMapping("/deleteUser")
public ResponseEntity<String> deleteUser(@RequestParam Long id){
boolean userDeleted = loginService.deleteUser(id);
if(userDeleted) {
return ResponseEntity.status(200).body("User deleted successfully");
} else {
return ResponseEntity.status(404).body("No record found to be updated");
}
}

}