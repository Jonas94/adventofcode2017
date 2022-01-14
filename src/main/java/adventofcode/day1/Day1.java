package adventofcode.day1;

import adventofcode.utils.FileHandler;

import java.util.List;

public class Day1 {

    public long part1(String inputFile) {
        List<String> lines = FileHandler.readFileIntoList(inputFile);

        String input = lines.get(0);

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                if (input.charAt(i) == input.charAt(0)) {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                }
            } else if (input.charAt(i) == input.charAt(i + 1)) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }

        }

        return sum;
    }

    public long part2(String inputFile) {
        List<String> lines = FileHandler.readFileIntoList(inputFile);

        String input = lines.get(0);

        int stepsAhead = input.length() / 2;

        int sum = 0;

        int length = input.length();

        for (int i = 0; i < input.length(); i++) {
            int index = i + stepsAhead;
            if (i + stepsAhead >= length) {
                index = index - length;
            }

            if (input.charAt(i) == input.charAt(index)) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }

        }

        return sum;
    }

}
