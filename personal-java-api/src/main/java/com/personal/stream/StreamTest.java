package com.personal.stream;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 * Created by ASUS on 2018/8/2.
 */
public class StreamTest {

    public static void main(String[] args) {
//        List<Integer> data = new ArrayList<>();
//        data.add(1);
//        data.add(2);
//        data.add(3);
//
//        data.parallelStream().;
        StringStream();
    }

    private static void StringStream(){
        List<String> data = new ArrayList<>();
        data.add("Appledd");
        data.add("Bug");
        data.add("Ana");
        data.add("ABCD");
        OptionalInt a = data.stream()
                .filter(s -> s.startsWith("A"))
                .mapToInt(String::length)
                .max();
        System.out.println(a.getAsInt());
    }
}
