package com.igor.crud.spring.santander.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardError implements Serializable {
    //classe contando os atributos padrões de uma exceção http
    private static final long serialVersionUID = 156735508391139419L;

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
