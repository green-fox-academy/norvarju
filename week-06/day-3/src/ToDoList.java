import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  FileManipulation manipulator = new FileManipulation();
  private List<ToDo> myToDoList;
  private String[] args;
  private Path filePath;
  private int numberOfRelevantData;
  private Path incrementingNumberFile;

  public ToDoList(String[] args) {
    myToDoList = new ArrayList<>();
    this.args = args;
    filePath = Paths.get("C:/Users/norac/Desktop/Gitpractice/Greenfox/norvarju/week-06/day-3/file.txt");
    numberOfRelevantData = 6;
    this.incrementingNumberFile = Paths.get
            ("C:/Users/norac/Desktop/Gitpractice/Greenfox/norvarju/week-06/day-3/number.txt");
  }

  public void addTask(){
    if (args.length < 2){
      System.out.println("Unable to add: no task provided");
    } else {
      ToDo myTodo = new ToDo(args);
      try {
        int numberForId = Integer.parseInt(Files.readAllLines(incrementingNumberFile).get(0));
        myTodo.setId(numberForId + 1);
        int newNumberOfId = numberForId + 1;
        Files.write(incrementingNumberFile, String.valueOf(newNumberOfId).getBytes());
      } catch (IOException e) {
        e.printStackTrace();
      }
      myToDoList.add(myTodo);
      manipulator.writer(myToDoList);
    }
  }

  public void removeTask() {
    try {
      if (args.length < 2) {
        System.out.println("Unable to remove: no index provided");
      } else if (Integer.parseInt(args[1]) > myToDoList.size()) {
        System.out.println("Unable to remove: index is out of bound");
        System.out.println(myToDoList.size());
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
      myToDoList.stream().map(t -> t.toPresent()).forEach(System.out::println);
    }
  }

  public void checkTask(){
    ToDo task = myToDoList.get(Integer.parseInt(args[1])-1);
    task.setCompleted(true);
    task.setCompletedAt(LocalDateTime.now());
    task.setComplitionTime(ChronoUnit.DAYS.between(task.getCreatedAt(),
            task
            .getCompletedAt()));
    System.out.println(myToDoList);
    manipulator.writer(myToDoList);
  }

  public void updateTask(){
    ToDo task = myToDoList.get(Integer.parseInt(args[1])-1);
    task.setDescription(args[2]);
    manipulator.writer(myToDoList);

  }

  public void converter() {
    List<String> convertedContent = new ArrayList<>();
    String convertedContentString = "";
    manipulator.Reader(convertedContent);
    for (int i = 0; i < convertedContent.size(); i++) {
        convertedContentString += convertedContent.get(i);
      }
      String[] contentArray = convertedContentString.split("%@#");
      for (int j = 0; j < contentArray.length/numberOfRelevantData; j++) {
        int newId = Integer.parseInt(contentArray[j*numberOfRelevantData]);
        LocalDateTime newCreatedAt = LocalDateTime.parse(contentArray[j * numberOfRelevantData
                + 1]);
        LocalDateTime newCompletedAt = LocalDateTime.parse(contentArray[j
                * numberOfRelevantData + 2]);
        int newCompletionTime = Integer
                .parseInt(contentArray[j * numberOfRelevantData + 3]);
        String newDescription = contentArray[j * numberOfRelevantData + 4];
        boolean newIsCompleted = Boolean
                .parseBoolean(contentArray[j * numberOfRelevantData + 5]);
        myToDoList.add(new ToDo(newId, newCreatedAt, newCompletedAt, newCompletionTime,
                newDescription, newIsCompleted));
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
