public class ArgumentHandler {

  private String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public boolean noArgs(){
    return args.length == 0;
  }

  public boolean isListNeeded() {
    return args[0].equals("-l") || args[0].equals("list");
  }

  public boolean isCompletionNeeded(){
    return args[0].equals("-a") || args[0].equals("add");
  }

  public boolean isRemovalNeeded(){
    return args[0].equals("-r") || args[0].equals("remove");
  }

  public boolean isCheckNeeded(){
    return args[0].equals("-c") || args[0].equals("check");
  }

  public boolean isUpdateNeeded(){
    return args[0].equals("-u") || args[0].equals("update");
  }

  public boolean unsupportedArg(){
    return !isListNeeded() && !isCompletionNeeded() && !isRemovalNeeded() && !isCheckNeeded() &&
            !isUpdateNeeded();
  }

  public void noArgsPrinter(){
    System.out.println("Command line todo application");
    System.out.println("-----------------------------");
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes a task");
    System.out.println("-c   Completes a task");
    System.out.println("-u   Update description");
  }

  public void unsupportedArgPrinter(){
    System.out.println("Unsupported argument");
  }
}
