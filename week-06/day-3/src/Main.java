public class Main {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList(args);
    //toDoList.addTask();
    //toDoList.addTask();
    //toDoList.addTask();
    //System.out.println(toDoList.toString());
    ArgumentHandler handler = new ArgumentHandler(args);
    toDoList.converter();
    if (handler.noArgs()) {
      handler.noArgsPrinter();
    } else if (handler.isCompletionNeeded()) {
      toDoList.addTask();
      System.out.println(toDoList);
    } else if (handler.isRemovalNeeded()){
      toDoList.removeTask();
    } else if (handler.isListNeeded()) {
      toDoList.listTasks();
    } else if (handler.isCheckNeeded()) {
      toDoList.checkTask();
    } else if (handler.isUpdateNeeded()) {
      toDoList.updateTask();
    }
  }
}
