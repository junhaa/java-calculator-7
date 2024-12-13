package calculator.controller;

import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class Calculator {
    public void run(){
        Extractor extractor = new Extractor();

        String input = getInput();

        List<Integer> numbers = extractor.extractNumbers(input);

        int result = getSum(numbers);

        OutputView.getInstance().printAddOutput(result);
    }

    private int getSum(List<Integer> numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

    private String getInput(){
        OutputView.getInstance().printAddStringPrompt();
        return InputView.getInstance().readConsoleInput();
    }
}
