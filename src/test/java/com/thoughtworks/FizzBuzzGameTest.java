package com.thoughtworks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "Fizz", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "Fizz", "24", "25", "26", "27", "28", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "40",
                "41", "42", "Fizz", "44", "45", "46", "47", "48", "49", "50",
                "51", "52", "Fizz", "54", "55", "56", "57", "58", "59", "60",
                "61", "62", "Fizz", "64", "65", "66", "67", "68", "69", "70",
                "71", "72", "Fizz", "74", "75", "76", "77", "78", "79", "80",
                "81", "82", "Fizz", "84", "85", "86", "87", "88", "89", "90",
                "91", "92", "Fizz", "94", "95", "96", "97", "98", "99", "100"
        );


        FizzBuzzGame game = new FizzBuzzGame();
        game.return_Fizz_when_have_3(100);
        List<String> results = game.getResults();
        assertThat(results, equalTo(expectedResults));
    }
}
