package adventofcode;

import adventofcode.day1.Day1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDay1 {

    @Test
    public void part1() {
        Day1 day = new Day1();
        long result = day.part1("testinput1.txt");
        assertEquals(3, result);
        System.out.println(day.part1("input1.txt"));
    }

    @Test
    public void part2() {
        Day1 day = new Day1();
        long result = day.part2("testinput1.txt");
       // assertEquals(12, result);
        System.out.println(day.part2("input1.txt"));
    }
}