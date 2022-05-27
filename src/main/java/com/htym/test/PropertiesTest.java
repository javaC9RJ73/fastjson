package com.htym.test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test() throws IOException {
        //InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("classpath:druid.properties");
        InputStream in = new BufferedInputStream(new FileInputStream(
                new File("src/main/resources/druid.properties")));
        Properties properties = new Properties();
        properties.load(in);
        Object name1 = properties.get("name");
        System.out.println(name1 + "haha");
    }
}
