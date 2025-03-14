import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProject {
    public ArrayList<ArrayList <String>> distribution(ArrayList<String> list, int dist){
        ArrayList<ArrayList <String>> temp = new ArrayList<ArrayList <String>>();
        int i = list.size() / dist;
        int remander = list.size() % dist;
        int index = 0;
        for(int z = 0; z < dist; z++){
            ArrayList<String> temporary = new ArrayList<>();
            for(int x =0; x < i; x++){
                
                temporary.add(list.get(index));
                index++;
            }if(remander != 0){
                temporary.add(list.get(index));
                remander--;
                index++;

        } 
            temp.add(temporary);
           
        }return temp;
        




    }
    //the space complixity is n the adtional space is the array list of temporary
    //the time complexity is n**2 the first n is the array list of temporary the second n is the nested loop

    
    public static void main(String[] args) {


        ArrayList<String> arrOne = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight"));
        ArrayListProject x = new ArrayListProject();
        System.out.println(x.distribution(arrOne, 2));

        ArrayList<String> arrTwo = new ArrayList<String>(Arrays.asList("Majed", "Saud", "Fahad", "Fasial", "Sarah", "Noura"));
        System.out.println(x.distribution(arrTwo, 3));

    }
}