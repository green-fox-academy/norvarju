public class Main {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList(args);
    //ToDo toDo1 = new ToDo(args);
    //toDoList.listTasks();
    if (toDoList.noArgs()) {
      toDoList.noArgsPrinter();
    } else if (toDoList.isCompletionNeeded()) {
      toDoList.addTask();
      System.out.println(toDoList);
    } else if (toDoList.isListNeeded()) {
      toDoList.listTasks();
    }
  }
}
