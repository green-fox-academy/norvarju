import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDo {

  private static int previousId;
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private int complitionTime;
  private String[] args;
  private Scanner scanner;
  private boolean completed;
  private String description;

  public ToDo(String[] args) {
    previousId++;
    this.id = previousId;
    this.createdAt = LocalDateTime.now();
    this.completedAt = LocalDateTime.now();
    this.args = args;
    scanner = new Scanner(System.in);
    this.description = args[1];
    }

  public ToDo(int id, LocalDateTime createdAt, LocalDateTime completedAt, int complitionTime,
              String description) {
    this.id = id;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.complitionTime = complitionTime;
    this.description = description;
  }

  public ToDo() {
  }

  public String toString() {
    return id + "%@#" + createdAt + "%@#" + completedAt + "%@#" + complitionTime + "%@#" /*+
          description + "%@#"*/;
  }
}
