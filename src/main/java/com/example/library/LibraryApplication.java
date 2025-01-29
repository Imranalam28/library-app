package com.example.library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LibraryApplication  {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	// Adding a basic controller mapping
    @RestController
    public static class LibraryController {

        @GetMapping("/")
        public String libraryHome() {
            return "Welcome to the Library!";
        }
    }

}