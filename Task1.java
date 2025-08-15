import java.util.TreeSet; // I use TreeSet because it prints strings and numbers in sorted form automatically
public class Task1{
    public static void main(String[] args){
        TreeSet<String> names = new TreeSet<>();
        names.add("Zain");
        names.add("Moeed");
        names.add("Fayez");
        names.add("Saud");
        names.add("Ahsan");
        names.add("Rehman");
        names.add("Salman");
        names.add("Burhan");
        names.add("Daniyal");
        names.add("Ali");
        System.out.println("The student list are: ");
        for (String n:names){
            System.out.println(n);
        }
    }
}