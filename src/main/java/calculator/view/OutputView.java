package calculator.view;

public class OutputView {
    private static OutputView instance;
    private final String ADD_STRING_PROMPT = "덧셈할 문자열을 입력해 주세요.";
    private final String ADD_OUTPUT_FORMAT = "결과 : %d";

    private OutputView() {
    }

    public static synchronized OutputView getInstance() {
        if (instance == null) {
            instance = new OutputView();
        }
        return instance;
    }

    public void println(String string){
        System.out.println(string);
    }

    public void printAddStringPrompt(){
        System.out.println(ADD_STRING_PROMPT);
    }

    public void printAddOutput(int result){
        System.out.printf(ADD_OUTPUT_FORMAT, result);
    }
}
