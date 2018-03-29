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
    ToDo myTodo = new ToDo(args);
    myToDoList.add(myTodo);
    String content = "";
    for (int i = 0; i < myToDoList.size(); i++) {
      content += myToDoList.get(i);
      content += "\n";
    }
    manipulator.Writer(content);
  }

  public void removeTask(){

  }

  public void listTasks(){
    myToDoList.stream()
            .forEach(System.out::println);
    /*System.out.println(myToDoList.toString());*/
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
