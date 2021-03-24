package com.igor.crud.spring.santander.domain.dto;

import com.igor.crud.spring.santander.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = 7470439142698517699L;

    private String id;
    private String name;
    private String email;

    public UserDto (User obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }
}
