package preseverancePath;

public class Result {
    boolean reached;
    int[][] field;
    int counter;

    Result(boolean reached, int[][] field, int counter){
        this.reached = reached;
        this.field = field;
        this.counter = counter;
    }
}
