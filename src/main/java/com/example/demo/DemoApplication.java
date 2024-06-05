package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import org.rocksdb.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hello world");

		RocksDB.loadLibrary();

        try {
            Connection conn = DriverManager.getConnection("jdbc:duckdb:");
            System.out.println(conn.toString());
        }
        catch (SQLException exception) {
            System.out.println(exception.toString());
        }
	}

}
