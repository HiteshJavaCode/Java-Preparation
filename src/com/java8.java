package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class java8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");
        names.stream().filter(name -> name.contains("J")).forEach(System.out::println);
        Optional<String> optionalName = Optional.ofNullable(null);
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        LocalDate x = LocalDate.now();
        LocalDateTime y = LocalDateTime.now();
        LocalTime z= LocalTime.now();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        List<String> names1 = Arrays.asList("John", "Jane", "Doe");
        List<String> filteredNames = names1.stream()
                .filter(name -> name.startsWith("D"))
                .collect(Collectors.toList());
System.out.println(filteredNames);

    }

}
