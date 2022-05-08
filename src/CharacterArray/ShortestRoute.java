package CharacterArray;

import java.util.Scanner;

public class ShortestRoute {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String route = scn.nextLine();

        int x = 0;
        int y = 0;

        for(int i=0; i < route.length() ; i++){

            switch(route.charAt(i)){
                case 'N': y++;
                    break;

                case 'S': y--;
                    break;

                case 'E': x++;
                    break;

                case 'W': x--;
                    break;
            }
        }

        System.out.println("Final x and y is: " + x + ", " + y + ".");

        //Other cases
        if(x>=0 && y>=0){

            while(y-- > 0){
                System.out.print("N");
            }
            while(x-- > 0){
                System.out.print("E");
            }
        }
        else if(x<=0 && y<=0){

            while(y++ < 0){
                System.out.print("S");
            }
            while(x++ < 0){
                System.out.print("W");
            }
        }
        else if(x<=0 && y>=0){

            while(y-- > 0){
                System.out.print("N");
            }
            while(x++ < 0){
                System.out.print("W");
            }
        }
        else{

            while(y++ < 0){
                System.out.print("S");
            }
            while(x-- > 0){
                System.out.print("E");
            }
        }
    }
}
/*
INPUT: SWENEWS
OUTPUT:
Final x and y is: 0, -1.
S
* */
