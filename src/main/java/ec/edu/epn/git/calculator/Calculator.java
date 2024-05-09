package ec.edu.epn.git.calculator;

public class Calculator {
    private int answer;
    public int adicion(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public int divide(int a, int b) {
        return a / b;
    }
    public void timeout(int time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public int getAnswer(){
        return answer;
    }
    public void setAnswer(int answer){
        this.answer = answer;
    }
}
