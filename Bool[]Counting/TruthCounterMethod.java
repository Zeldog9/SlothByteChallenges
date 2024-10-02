public class TruthCounterMethod {
    /* //demo
    public static void main(String[] args){
        boolean[] x = {true, false, false, false, true, false};

        System.out.print(countTruths(x));

    }
        //*/
    public static int countTruths(boolean[] other)
    {
        int toReturn = 0;
        for(int x = other.length-1; x>=0; x--)
            if(other[x]) toReturn++;
        return toReturn;
    }
}
