import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

  private String name;
  private String type;
  private String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  @Override
  public String toString() {
    return name + " " + type + " " + color;
  }

  public static void main(String[] args) {
    //Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
    //it's up to you how you name/create them! Write a Stream Expression to find the foxes with
    //green color! Write a Stream Expression to find the foxes with green color and pallida type!
    Fox fox1 = new Fox("Jerry", "macrotis", "green");
    Fox fox2 = new Fox("Fluffy", "pallida", "white");
    Fox fox3 = new Fox("Lazy", "bengalensis", "green");
    Fox fox4 = new Fox("Charming", "ferrilata", "blue");
    Fox fox5 = new Fox("Crazy", "pallida", "green");
    List<Fox> foxList = new ArrayList<>();
    foxList.add(fox1);
    foxList.add(fox2);
    foxList.add(fox3);
    foxList.add(fox4);
    foxList.add(fox5);
    List<Fox> greenFoxes = foxList.stream()
            .filter((Fox f) -> f.color == "green")
            .collect(Collectors.toList());
    List<Fox> greenPallidaFoxes = foxList.stream()
            .filter((Fox f) -> f.color == "green" && f.type == "pallida")
            .collect(Collectors.toList());

    System.out.println(greenFoxes);
    System.out.println(greenPallidaFoxes);
    //Old method:
    List<Fox> myGreenFoxes = new ArrayList<>();
    for (int i = 0; i < foxList.size(); i++) {
      if(foxList.get(i).color == "green"){
        myGreenFoxes.add(foxList.get(i));
      }
    }
    System.out.println(myGreenFoxes);
    List<Fox> myGreenAndPallidaFoxes = new ArrayList<>();
    for (int i = 0; i < foxList.size(); i++) {
      if(foxList.get(i).color == "green" && foxList.get(i).type == "pallida"){
        myGreenAndPallidaFoxes.add(foxList.get(i));
      }
    }
    System.out.println(myGreenAndPallidaFoxes);
  }
}
