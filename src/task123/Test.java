package task123;

public class Test {
    public static void main(String[] args) {
//        task1.RunnableTask runnableTask = new task1.RunnableTask();
//        runnableTask.runnable1.run();
//        runnableTask.runnable2.run();

        String[] loginy = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        FunctionTask functionTaskTest = new FunctionTask();
        String[] afterFunction = functionTaskTest.combinedFunctions.apply(loginy);
        printArray(afterFunction);
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
