import java.util.Arrays;
import java.util.Scanner;
public class Main {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What would you like to print?");

    String a = scan.nextLine();
    print(a);

  }

  public static void print(String info){
    String[] info2 = getPigLatin(info);
    int y = info2.length;
    for(int x =0; x < y; x++)
    System.out.print(info2[x]);
  }

  public static String[] getPigLatin(String info) {
    String[] words = info.split(" ");
    String[] pigLatin = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      pigLatin[i] = words[i].substring(indexVowel(words[i])) + "-"+words[i].substring(0, indexVowel(words[i])) + "ay ";
    }
    return pigLatin;
  }

  public static int indexVowel(String info){

      int[] vowels = {info.toLowerCase().indexOf("a"),info.toLowerCase().indexOf("e"),info.toLowerCase().indexOf("i"),info.toLowerCase().indexOf("o"),info.toLowerCase().indexOf("u")};
      Arrays.sort(vowels);
    for(int x = 0; x < vowels.length; x++){
        if(vowels[x] > -1){
          return vowels[x];}
      }
      return info.length();        
  }



}//class Bracket


