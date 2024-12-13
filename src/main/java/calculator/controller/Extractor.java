package calculator.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Extractor {
    Set<Character> delimiters = new HashSet<>(':', ',');

    public String extractCustomDelimiters(String input){
        String curStr = input;
        while(curStr.length() >= 4){
            if(curStr.startsWith("//") && curStr.charAt(3) == '\n') {
                char delimiter = input.charAt(2);
                if(Character.isDigit(delimiter)){
                    throw new IllegalArgumentException("숫자는 커스텀 구분자가 될 수 없습니다.");
                }
                delimiters.add(delimiter);
                curStr = input.substring(4);
            }
            else{
                break;
            }
        }
        return curStr;
    }

    public List<Integer> extractNumbers(String str){
        List<Integer> list = new ArrayList<>();
        String convertStr = convertDelimiters(str);
        for (String numS : convertStr.split(":")) {
            try{
                list.add(Integer.parseInt(numS));
            } catch (NumberFormatException e){
                throw new IllegalArgumentException("올바르지 않은 입력입니다.");
            }
        }
        return list;
    }

    public String convertDelimiters(String str){
        String convert = "";
        for(char c : str.toCharArray()){
            if(delimiters.contains(c)){
                convert += ':';
                continue;
            }
            convert += c;
        }
        return convert;
    }

}
