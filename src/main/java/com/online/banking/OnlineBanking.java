package com.online.banking;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OnlineBanking 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(OnlineBanking.class, args);
    }
}
