import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDo {

  //private static final AtomicInteger number = new AtomicInteger();
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private long complitionTime;
  private String[] args;
  //private Scanner scanner;
  private boolean isCompleted;
  private String description;

  public ToDo(String[] args) {
    this.id = 0;
    this.createdAt = LocalDateTime.now();
    this.completedAt = LocalDateTime.of(2000, 1, 1, 0, 0);
    this.complitionTime = 0;
    this.args = args;
    //scanner = new Scanner(System.in);
    description = args[1];
    isCompleted = false;
    }

  public ToDo(int id, LocalDateTime createdAt, LocalDateTime completedAt, long complitionTime,
              String description, boolean isCompleted) {
    this.id = id;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.complitionTime = complitionTime;
    this.description = description;
    this.isCompleted = isCompleted;
  }

  public ToDo() {
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }

  public void setCompletedAt(LocalDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public void setComplitionTime(long complitionTime) {
    this.complitionTime = complitionTime;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    return id + "%@#" + createdAt + "%@#" + completedAt + "%@#" + complitionTime + "%@#" +
          description + "%@#" + isCompleted + "%@#";
  }

  public String toPresent() {
    return (isCompleted ? "[X] " : "[ ] ") + description;
  }
}
