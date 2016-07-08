/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.co.th.geniustree.train;

import java.util.Scanner;

/**
 *
 * @author suttipong
 */
public class Pryramid implements Shape{
    @Override
    public void shape() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many do you want : ");
        int row = sc.nextInt();
        int rowCount = 1;
        for(int i=row;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rowCount;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println();
    }
}
