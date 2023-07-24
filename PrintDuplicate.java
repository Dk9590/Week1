package week2.day2;

public class PrintDuplicate {

        public static void main(String[] args) {

             int temp, size;

              int array[] = {10, 20, 75, 63, 96, 57,75,10};

              size = array.length;

 

              for(int i = 0; i<size; i++ ){

                 for(int j = i+1; j<size; j++){

 

                    if(array[i] == array[j]){

                 

                      System.out.println("Duplicate Element " +array[i]);

                    }

                 }

              }

              

        }

}

