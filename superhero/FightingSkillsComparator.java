
package superhero;

import java.util.*;

public class FightingSkillsComparator implements Comparator<SuperHero>{
    
    @Override
    public int compare(SuperHero s1, SuperHero s2) {
        // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           if(s1.getFightingskills() > s2.getFightingskills() )
            return -1;
        else if(s1.getFightingskills() == s2.getFightingskills())
            return 0;
        return 1;
             
    } 
}
