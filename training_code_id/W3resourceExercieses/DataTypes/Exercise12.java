/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3resourceExercieses.DataTypes;

/**
 *
 * @author Bagus
 */
public class Exercise12 {
   
    public static void main(String[] args) {
        int in1 = Integer.MIN_VALUE;
		int in2 = Integer.MAX_VALUE;
		System.out.println("Signed integers: " + in1 + ", " + in2);
		System.out.println("-----------------------------------------");
		int compare_Signed_num = Integer.compare(in1, in2);
		System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
		int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }

}
