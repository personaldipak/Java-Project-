
package superhero;

import java.util.Comparator;


public class TitleComparator implements Comparator<SuperHero>{

 @Override
    public int compare(SuperHero s1, SuperHero s2) {
        if(s1.getTitle().compareToIgnoreCase(s2.getTitle()) >= 1)
            return 1;
        else if(s1.getTitle() == s2.getTitle())
            return 0;
        return -1;
         }
             
    }