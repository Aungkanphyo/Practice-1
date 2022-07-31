package controlflow;

public class switchstatement {
    public static void main(String[] args) {
        int a = 9;
       switch(a)
       {
           case 1:
               System.out.println("a is equal to 10");
               break;
           case 2:
               System.out.println("a is not equal to 45");
               break;
           case 3:
               System.out.println("a is not equal to 78");
               break;
           case 4:
               System.out.println("a is not equal to 5");
               break;
           case 5:
               System.out.println("a is not equal to 1");
               break;
           case 6:
               System.out.println("a is not equal to 6");
               break;
           case 7:
               System.out.println("a is not equal to 3");
               break;
           case 8:
               System.out.println("a is not equal to 4");
               break;
           default:
               System.out.println("Somthing was wrong");
       }
    }
}
