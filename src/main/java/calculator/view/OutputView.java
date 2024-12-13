package calculator.view;

public class OutputView {
    private static OutputView instance;

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
}
