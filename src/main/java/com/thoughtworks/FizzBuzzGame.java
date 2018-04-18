package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= 100; i++) {
            String temp = "";
            if (i % 3 != 0 & i % 5 != 0 & i % 7 != 0 & i / 10 != 3 & i % 10 != 3)
                temp += i;
            else if (i / 10 == 3 || i % 10 == 3) {
                temp += "Fizz";
            } else {
                if (i % 3 == 0)
                    temp += "Fizz";
                if (i % 5 == 0)
                    temp += "Buzz";
                if (i % 7 == 0)
                    temp += "Whizz";
            }
            results.add(temp);
        }
    }
public void return_Fizz_when_have_3(int count) {
    for (int i = 1; i <= 100; i++) {
        String temp = "";
        if (i / 10 != 3 & i % 10 != 3)
            temp += i;
        else if (i / 10 == 3 || i % 10 == 3) {
            temp += "Fizz";
        }
        results.add(temp);

    }
}
    public List<String> getResults() {
        return results;
    }
}


