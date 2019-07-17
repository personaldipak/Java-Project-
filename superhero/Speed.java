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
public class Speed implements Comparator<SuperHero> {
     public int compare(SuperHero s1, SuperHero s2) {
     if(s1.getSpeed() > s2.getSpeed() )
            return - 1;
        else if(s1.getSpeed() == s2.getSpeed())
            return 0;
        return 1;
     }
}
