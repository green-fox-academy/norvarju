import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  FileManipulation manipulator = new FileManipulation();
  private List<ToDo> myToDoList;
  private String[] args;
  private Path filePath;

  public ToDoList(String[] args) {
    myToDoList = new ArrayList<>();
    this.args = args;
    filePath = Paths.get("C:/Users/norac/Desktop/Gitpractice/Greenfox/norvarju/week-06/day-3/file.txt");
  }

  public void addTask(){
    myToDoList.add(new ToDo(args));
    String content = "";
    for (int i = 0; i < myToDoList.size(); i++) {
      content += myToDoList.get(i);
      content += "\n";
    }
    manipulator.Writer(content);
  }

  public void removeTask(){

  }

  public boolean noArgs(){
    return args.length == 0;
  }

  public boolean isListNeeded() {
    return args[0].equals("-l") || args[0].equals("list");
  }

  public boolean isCompletionNeeded(){
    return args[0].equals("-a") || args[0]
            .equals("add");
  }

  public boolean isRemovalNeeded(){
    return args[0].equals("-r") || args[0].equals("remove");
  }

  public void noArgsPrinter(){
    System.out.println("Command line todo application");
    System.out.println("-----------------------------");
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes a task");
    System.out.println("-c   Completes a task");

  }

  public void listTasks(){
    myToDoList.stream()
            .forEach(System.out::println);
  }

  public void converter(){
    List<String> convertedContent = new ArrayList<>();
    String convertedContentString = "";
    manipulator.Reader(convertedContent);
    for (int i = 0; i < convertedContent.size(); i++) {
      convertedContentString += convertedContent.get(i);
    }
    String[] contentArray = convertedContentString.split("%@#");
    myToDoList.add(new ToDo(Integer.parseInt(contentArray[0]), LocalDateTime.parse
            (contentArray[1]),
            LocalDateTime.parse(contentArray[2]),
            Integer.parseInt(contentArray[3]), contentArray[4]));

  }

  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < myToDoList.size(); i++) {
      result += myToDoList.get(i).toString();
      result += "\n";
    }
    return result;
  }
}
