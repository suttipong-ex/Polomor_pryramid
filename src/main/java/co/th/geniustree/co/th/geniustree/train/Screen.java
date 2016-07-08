/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.th.geniustree.co.th.geniustree.train;

import co.th.geniustree.best.PiramidBest;
import co.th.geniustree.co.th.train.neng.implement.TriangleStars;

/**
 *
 * @author suttipong
 */
public class Screen {

    public void print(Shape shape) {
        shape.shape();
    }

    public static void main(String[] args) {
        Screen sc = new Screen();
        sc.print(new Pryramid());
        sc.print(new Triangle());
        sc.print(new TriangleStars());
        sc.print(new PiramidBest());
        
    }
}
