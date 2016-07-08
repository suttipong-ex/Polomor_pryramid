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
public class Triangle implements Shape{
    @Override
    public void shape() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many do you want : ");
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j <= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
