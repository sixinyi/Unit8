public class FourByFour {
    public static void main(String [] args) {
        //code to define an initially empty int 2D array,
        //minimum size 4x4
        int[][] list = new int [4][4];
        //code to output all original values
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
        //code to change half the values to even positive numbers
        list[0][0] = 2;
        list[0][1] = 2;
        list[0][2] = 2;
        list[0][3] = 2;
        list[1][0] = 2;
        list[1][1] = 2;
        list[1][2] = 2;
        list[1][3] = 2;
        //and the other half to negative odd numbers
        list[2][0] = -1;
        list[2][1] = -1;
        list[2][2] = -1;
        list[2][3] = -1;
        list[3][0] = -1;
        list[3][1] = -1;
        list[3][2] = -1;
        list[3][3] = -1;
        //code to output a blank line separating output sets
        System.out.println();
        //code to output all array elements
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
    }
}