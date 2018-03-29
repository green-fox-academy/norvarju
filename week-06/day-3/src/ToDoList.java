import com.sun.org.apache.xpath.internal.SourceTree;

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
    if (args.length < 2){
      System.out.println("Unable to add: no task provided");
    } else {
      ToDo myTodo = new ToDo(args);
      myToDoList.add(myTodo);
      manipulator.writer(myToDoList);
    }
  }

  public void removeTask() {
    try {
      if (args.length < 2) {
        System.out.println("Unable to remove: no index provided");
      } else if (Integer.parseInt(args[1]) > args.length) {
        System.out.println("Unable to remove: index is out of bound");
      } else {
        myToDoList.remove(Integer.parseInt(args[1]) - 1);
        manipulator.writer(myToDoList);
      }
    } catch (NumberFormatException e) {
      System.out.println("Unsupported argument");
    }
  }

  public void listTasks(){
    if (myToDoList.size() == 0){
      System.out.println("No todos for today");
    } else {
      myToDoList.stream().forEach(System.out::println);
    }
  }

  public void converter() {
    List<String> convertedContent = new ArrayList<>();
    String convertedContentString = "";
    manipulator.Reader(convertedContent);
    for (int i = 0; i < convertedContent.size(); i++) {
        convertedContentString += convertedContent.get(i);
      }
      String[] contentArray = convertedContentString.split("%@#");
      for (int j = 0; j < contentArray.length/5; j++) {
        myToDoList.add(new ToDo(Integer.parseInt(contentArray[j * 5]), LocalDateTime.parse
                (contentArray[j * 5 + 1]), LocalDateTime.parse(contentArray[j * 5 + 2]), Integer
                .parseInt(contentArray[j * 5 + 3]), contentArray[j * 5 + 4]));
      }
    }

  public String toString() {
    String result = "";
    for (int i = 0; i < myToDoList.size(); i++) {
      result += myToDoList.get(i).toString();
      result += "\n";
    }
    return result;
  }


}
