package com.company;
import java.util.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> absolutes = new ArrayList<>();
        Set<Integer> negatives = new HashSet<>();
        String regex = "[-]?[0-9]+";
        Pattern p = Pattern.compile(regex);
        while (true){
            String newStr = input.nextLine();
            Matcher matcher = p.matcher(newStr);
            if (matcher.matches()){
                int num = Integer.parseInt(newStr);
                numbers.add(num);
                absolutes.add(Math.abs(num));
                int index = absolutes.size()-1;
                if (!numbers.get(index).equals(absolutes.get(index))) negatives.add(num);
            } else if (newStr.equalsIgnoreCase("c")&&(numbers.size()>=1)){
                makeCalculation(numbers, absolutes, negatives);
                break;
            }
            else {
                System.out.println("Incorrect input, try again or press \"c\"");
            }
        }
    }
    private static void makeCalculation(List<Integer> num, List<Integer> abses, Set<Integer> neg){
        Collections.sort(num);
        Collections.sort(abses);
        System.out.println("The Biggest: " + num.get(num.size()-1));
        System.out.println("The Smallest: " + num.get(0));

        int longest = abses.get(abses.size()-1);
        String signForLongest = neg.contains(-longest) ? "-" : "";
        System.out.println("The Longest: " + signForLongest + longest);
        int shortest = abses.get(0);
        String signForShortest = neg.contains(-shortest) ? "-" : "";
        System.out.println("The Shortest: " + signForShortest + shortest);
    }
}
