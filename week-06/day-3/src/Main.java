public class Main {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList(args);
    ArgumentHandler handler = new ArgumentHandler(args);
    if (handler.noArgs()) {
      handler.noArgsPrinter();
    } else if (handler.isCompletionNeeded()) {
      toDoList.addTask();
      System.out.println(toDoList);
    } else if (handler.isListNeeded()) {
      toDoList.listTasks();
    }
  }
}
