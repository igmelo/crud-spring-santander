package com.igor.crud.spring.santander.controller;

import com.igor.crud.spring.santander.domain.User;
import com.igor.crud.spring.santander.domain.dto.UserDto;
import com.igor.crud.spring.santander.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    //Endpoint que retorna todos os usuários
    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
        //recebe os dados em forma de User
        List<User> list = userService.findAll();
        //faz a conversão de cada user em userDto
        List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
        //retorna uma lista de usuarios no banco de dados
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable String id){
        User user = userService.findById(id);

        return ResponseEntity.ok().body(new UserDto(user));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody UserDto userDto){
        User user = userService.fromDto(userDto);
        user = userService.insert(user);
        //pega o endereço do novo objeto inserido
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        //created retorna o código http 201 contendo no cabeçalho o endereço do novo recurso criado
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@RequestBody UserDto userDto, @PathVariable String id){
        User user = userService.fromDto(userDto);
        user.setId(id);
        userService.update(user);
        return ResponseEntity.noContent().build();
    }
}
