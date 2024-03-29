import java.util.*;
 
class Me_18_Todo_Array_List{
  
  static void ShowList(ArrayList <String>  Arr)
  {
    for(String task : Arr)
    System.out.println(task);
  }
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    ArrayList   <String> Todos = new ArrayList<String>();
    String Option,task;
    int index;

    while(true)
    {
      System.out.print("Enter A[Add] D[Delete] E[Exit]: ");
      Option =  scan.nextLine();
      if(Option.equalsIgnoreCase("a"))
      {
        System.out.print("Enter Task: ");
        task = scan.nextLine();
        Todos.add(task);
        ShowList(Todos);
      }
      else if(Option.equalsIgnoreCase("d"))
      {
        ShowList(Todos);
        System.out.print("Enter Index: ");
        index = scan.nextInt();
        if(index>0)
        Todos.remove(index-1);
        else
        System.out.println("Index Should Be Greater Than 0.");
      }
      else if(Option.equalsIgnoreCase("e"))
      {
        break;
      }
    }

    ShowList(Todos);
    scan.close();
    
  }
}