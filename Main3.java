public class Main3{
    public static void main(String[] args){
        try{
            int[]arr=new int[2];
            System.out.println(arr[9]);
            String str =null;
            System.out.println("Size od str is" + str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception "+  e.getMessage());
        }
        catch (NullPointerException e2) {
            System.out.println("Caught Exception "+  e2.getMessage());
        }
        catch (Exception e3) {
            System.out.println("Caught Exception "+  e3.getMessage());
        }

    }
}