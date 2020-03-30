public class FourByFour {
    public static void main(String [] args) {
        //code to define an initially empty int 2D array,
        //minimum size 4x4
        int[][] li = new int [4][4];

        //code to output all original values
        System.out.println(li[0][0]);
        System.out.println(li[0][1]);
        System.out.println(li[0][2]);
        System.out.println(li[0][3]);
        System.out.println(li[1][0]);
        System.out.println(li[1][1]);
        System.out.println(li[1][2]);
        System.out.println(li[1][3]);
        System.out.println(li[2][0]);
        System.out.println(li[2][1]);
        System.out.println(li[2][2]);
        System.out.println(li[2][3]);
        System.out.println(li[3][0]);
        System.out.println(li[3][1]);
        System.out.println(li[3][2]);
        System.out.println(li[3][3]);

        //code to change half the values to even positive numbers
        li[0][0] = 2;
        li[0][1] = 2;
        li[0][2] = 2;
        li[0][3] = 2;
        li[1][0] = 2;
        li[1][1] = 2;
        li[1][2] = 2;
        li[1][3] = 2;

        //and the other half to negative odd numbers
        li[2][0] = -1;
        li[2][1] = -1;
        li[2][2] = -1;
        li[2][3] = -1;
        li[3][0] = -1;
        li[3][1] = -1;
        li[3][2] = -1;
        li[3][3] = -1;

        //code to output a blank line separating output sets
        System.out.println();

        //code to output all array elements
        System.out.println(li[0][0]);
        System.out.println(li[0][1]);
        System.out.println(li[0][2]);
        System.out.println(li[0][3]);
        System.out.println(li[1][0]);
        System.out.println(li[1][1]);
        System.out.println(li[1][2]);
        System.out.println(li[1][3]);
        System.out.println(li[2][0]);
        System.out.println(li[2][1]);
        System.out.println(li[2][2]);
        System.out.println(li[2][3]);
        System.out.println(li[3][0]);
        System.out.println(li[3][1]);
        System.out.println(li[3][2]);
        System.out.println(li[3][3]);
    }

}