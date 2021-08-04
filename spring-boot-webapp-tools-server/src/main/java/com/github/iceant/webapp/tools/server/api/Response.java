package com.github.iceant.webapp.tools.server.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
    private T data;
    private String message;
    private Integer code;

    public static <T> Response<T> success(T value){
        return (Response<T>) builder().data(value).code(200).message("success").build();
    }

    public static <T> Response<T> fail(Integer code, String message){
        return (Response<T>) builder().data(null).code(code).message(message).build();
    }
}
