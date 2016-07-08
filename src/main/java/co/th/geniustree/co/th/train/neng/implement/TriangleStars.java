/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.co.th.train.neng.implement;

import co.th.geniustree.co.th.geniustree.train.Shape;
import java.util.Scanner;

/**
 *
 * @author neng
 */
public class TriangleStars implements Shape {

    public static void printTriangle(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= rows; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = i; k <= rows; k++) {
                if (k <= (rows - 1)) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    @Override
    public void shape() {        
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please input rows of pyramid (exit 0) :");
            int rows = scan.nextInt();
            if (rows > 0) {
                printTriangle(rows);
            } else if (rows < 0) {
                System.out.println("Invalid input try again");
            } else {
                break;
            }
        }
    }

}
