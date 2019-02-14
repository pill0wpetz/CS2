/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jason_s_string_array_practice;

/**
 *
 * @author masterhacker
 */
public class Jason_S_String_Array_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myname = "Jason";
//myname.toCharArray();
char [] letters = myname.toCharArray();
for (int i=myname.length()-1;i>=0; i--){
    System.out.print(letters[i]);
}
System.out.println();

  int [] nums = new int [100];
    for(int j =0; j<=100; j++){
        nums[j]=j;
           }
        System.out.print(nums);
  
  
    }
    
}
