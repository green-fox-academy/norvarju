package Exam;

public class Box {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
  private int width;
  private int height;
  private int length;

  public Box(int width, int height, int length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public int getSurface(){
    return 2*(width*height + height*length + width*length);
  }

  public int getVolume(){
    return width*height*length;
  }

  public static void main(String[] args) {
    Box cuboid = new Box(6, 5, 8);
    System.out.println(cuboid.getSurface());
    System.out.println(cuboid.getVolume());
  }
}