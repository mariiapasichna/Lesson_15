package com.javaelementary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {

    /*
    1.) Создать список случайных чисел. Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
    */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        Double average = list.stream().collect(Collectors.averagingDouble((v) -> Math.pow(v, 2)));
        System.out.println(average);
    }
}