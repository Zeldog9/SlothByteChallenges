import java.util.Scanner;

public class CountTruth 
{
    static String input = "";
    static int truthCount = 0;

    public static boolean[] getArray(){


        Scanner s = new Scanner(System.in);
        System.out.println("How many values do you have?");
        int tNum = s.nextInt();

        boolean[] truths = new boolean[tNum];
        tNum--;
        while (tNum>=0){

            System.out.println("Enter t for true and f for false.");
            input = s.next();
            if(input.toLowerCase().indexOf("t")!=-1){
                truths[tNum] = true;
            }
            else truths[tNum] = false;
            tNum--;

        }
        return truths;
    }

    public static void main(String[] args) 
    {
        boolean[] toCount = getArray();

        for(int x = toCount.length-1; x>=0; x--)
            if(toCount[x]) truthCount++;
    
        System.out.println("You have "+truthCount+" truths.");
    }
}
