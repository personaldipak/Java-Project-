/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhero;

import java.util.Comparator;

/**
 *
 * @author dipak
 */
public class Height implements Comparator<SuperHero> {
     public int compare(SuperHero t, SuperHero t1) {
           
   if("n/a".equals(t.getHeight())) {
        	return -1;
        } else if ("n/a".equals(t1.getHeight())){
        	return -1;
        } else {
       return Integer.valueOf(t1.getHeight()).compareTo(Integer.valueOf(t.getHeight()));
        }
         }       
}
