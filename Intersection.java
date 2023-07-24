package week2.day2;

public class Intersection {
	public static void main(String[] args) {

        int arr1[] = { 9, 5, 4, 7, 6, 2 };

        int arr2[] = { 1, 5, 6, 7, 9, 0 };

        int length = arr1.length;

        for (int i = 0; i < length; i++) // first iteration value of arr[i]=0

        {

            for (int j = 0; j < length; j++) // first iteration value of arr[j]=0

            {

                if (arr1[i] == arr2[j]) {

                    System.out.println("The Intersection value is :" + arr1[i]);

                    // [0,0][0,1][0,2][0,3[0,4][0,5] condition will satisfy at [0,4]

                    // [1,0][1,1][1,2][1,3[1,4][1,5]condition will satisfy [1,1]

                    // [2,0][2,1][2,2][2,3[2,4]2,5]condition will not satisfy

                    // [3,0][3,1][3,2][3,3[3,4]3,5]condition will satisfy [3,3]

                    // [4,0][4,1][4,2][4,3[4,4]4,5]condition will satisfy [4,2]

                    // [5,0][5,1][5,2][5,3[5,4][5,5]condition will not satisfy

                }

 

            }

        }

    }

}
