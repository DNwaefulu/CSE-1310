import java.util.ArrayList;

public class ListMerge
{
    public static ArrayList<String> listMerge(ArrayList<String> a, ArrayList<String> b)
    {
        ArrayList<String> result = new ArrayList<String> (a);
        for(int i = 0; i < a.size(); i++)
        {
            result.set(i, a.get(i));
        }
        for(int y = 0; y < b.size(); y++)
        {
            result.add(b.get(y));
        }
        return result;
    }
  public static void printStringList(String name, ArrayList<String> a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.size(); i++)
    {
      System.out.printf("%12s", a.get(i));
    }
    System.out.printf("\n");
  }
  
  public static void main(String[] args)
  {
    ArrayList<String> a = new ArrayList<String>();
    a.add("Chicago");
    a.add("New York");
    a.add("Dallas");
    
    ArrayList<String> b = new ArrayList<String>();
    b.add("Berlin");
    b.add("London");
    b.add("Paris");
    b.add("Rome");
      
    ArrayList<String> result = listMerge(a, b);
    printStringList("a", a);
    printStringList("b", b);
    printStringList("result", result);
  }
}