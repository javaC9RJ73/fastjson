package com.htym.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private double money;

    public static void main(String[] args) {

    }

}
