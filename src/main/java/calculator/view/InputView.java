package calculator.view;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static InputView instance;

    private InputView() {
    }

    public static synchronized InputView getInstance() {
        if (instance == null) {
            instance = new InputView();
        }
        return instance;
    }

    public String readConsoleInput() {
        return Console.readLine();
    }

}
