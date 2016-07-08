/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.co.th.geniustree.train.ex.implement;

import co.th.geniustree.co.th.geniustree.train.Shape;
import java.util.Scanner;

/**
 *
 * @author Suttipong
 */
public class SquareImple implements Shape {
    @Override
    public void shape() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Type Square : ");
         String getStr = sc.nextLine();
         printDrawing(getStr);
    }
    public void printDrawing(String str){
         System.out.println("this squqre impli"+str);
    }
}
