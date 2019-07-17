/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhero;

import java.util.*;
//import superhero.SuperHero;

/**
 *
 * @author dm1103
 */
public class HeroData  {
    
    public static LinkedList<SuperHero> addData() {
        
        LinkedList<SuperHero> data = new LinkedList<SuperHero>();
     
        
        data.add(new SuperHero("Apocalyse", "En Sabah Nuh", "n/a", 8, 50, 16, 22, 80, "Born into Slavery at the dawn of Civilisation."));
        data.add(new SuperHero("Black Panther", "T'Challa", "180", 7, 29, 7, 17, 79, "With The Sleekness of the jungle cat."));
        data.add(new SuperHero("Black Widow", "Natasha Romanov", "168", 4, 26, 4, 14, 81, "Natasha Romanov is the quintessential spy who came in from the cold. "));
        data.add(new SuperHero("Blade", "Unrevealed", "185", 3, 29, 5, 14, 85, "he has sharpened his combat skills to a lethal edge."));
        data.add(new SuperHero("Captain America", "Steve Rogers", "186", 4, 29, 6, 16, 86, "Roger was truly a man out of time."));
        data.add(new SuperHero("Dr Doom", "Victor Von Doom", "186", 8, 48, 4, 13, 70, "A brilliant but arrogant Scientist."));
        data.add(new SuperHero("Dr Octopus", "Dr Otto Octavius", "173", 7, 23, 2, 12, 65, "Armed with a bevy of Bone-crushing steel tentacles."));
        data.add(new SuperHero("Dr Strange", "Dr Stephen Strange", "184", 5, 35, 4, 14, 85, "Former Surgeon Stephen Strange is now Master of the Mystic Art."));
        data.add(new SuperHero("Elektra", "Elektra Natchios", "173", 4, 15, 6, 16, 80, "Assassin, Lover, Enignma, Driven by tragedy and honed by training."));
        data.add(new SuperHero("Ghost Rider", "Johhny Blase", "181", 3, 37, 8, 15, 66, "He avenges souls tarnished by the touch of evil!."));
        data.add(new SuperHero("Green Goblin", "Norman Osborn 2", "178", 6, 35, 10, 18, 55, "A professional criminal and former owner and president of Osborn Industries."));             
        data.add(new SuperHero("Hawkeye", "Clint Barton", "188", 3, 26, 4, 16, 80, "outlaw-turned Clint Bartoon was a valued member of the Avengers."));           
        data.add(new SuperHero("IceMan", "Bobby Drake", "170", 3, 28, 4, 12, 70, "A joker with amazing gifts but lacking the ambition to trap his true potential."));
        data.add(new SuperHero("Invisible Woman", "Susan Richard", "165", 3, 23, 2, 12, 70, "..But this invisible Woman isn't about to fade into the background."));
        data.add(new SuperHero("Iron Man", "Tony Stark", "183", 6, 48, 2, 12, 85, "Ironman is a modern-day knight in shining armour."));
        data.add(new SuperHero("Juggernaut", "Cain Marko", "205", 3, 48, 2, 10, 63, "once the jugmenet beings moving in a certin direction. No power on Earth can stand in his way."));
        data.add(new SuperHero("Kingpin", "Wilson Fisk", "198", 7, 30, 4, 13, 75, "A self-made mass of muscle."));
        data.add(new SuperHero("Magneto", "Magnus", "185", 8, 46, 2, 12, 81, "Once a close friend of mutant mentor Charles Xavier."));
        data.add(new SuperHero("Mr Fantastic", "Reed Richards", "183", 9, 23, 2, 22, 65, "Mr Fantastic is a capable of converting his body into a highly malleable."));
        data.add(new SuperHero("Mysterio", "Queentin Beck", "178", 3, 23, 3, 14, 70, "A Master magician and hypnotist"));
        data.add(new SuperHero("Nick Fury", "Nick Fury", "183", 3, 27, 4, 12, 86, "Nick Fury worked his way up the U.S intellignece ladder on the strength."));
        data.add(new SuperHero("Professor X", "Charles Xavier", "180", 7, 24, 1, 12, 64, "The World's most powerful telepath."));
        data.add(new SuperHero("Silver Surfer", "Norrin Radd", "190", 4, 46, 13, 18, 72, "As the world-devourer's herald, he would search the galaxy for his master's sustenance."));
        data.add(new SuperHero("Spider Man", "Peter Parker", "175", 7, 36, 11, 21, 66, "Spider-man posseses superhuman strength."));
        data.add(new SuperHero("Storm", "Ororo Munroe", "178", 4, 27, 12, 14, 69, "As a member of the X-Men, she wields her unique genetic gifts to protect a world that hates and fears mutants!."));
        data.add(new SuperHero("The Beast", "Hank McCoy", "177", 5, 35, 10, 20, 72, "Hank McCoy not only possesses superhuman agility, strength, speed, endurance and dextority."));
        data.add(new SuperHero("The Human Torch", "Johhny Storm", "175", 4, 26, 5, 14, 71, "Johhny storm is the hothead of the Fantastic Four."));
        data.add(new SuperHero("The Thing", "Ben Grim", "180", 3, 47, 8, 12, 85, "Once a skilled fighter pilot."));
        data.add(new SuperHero("Thor", "Jack Olson", "195", 4, 49, 9, 19, 85, "He is the Norse God of Thunder, master of storm and lighting."));
        data.add(new SuperHero("Vemon", "Eddie Brock", "188", 3, 38, 10, 20, 64, "Vemon is an amalgamation of two being."));
        
        Collections.sort(data);  
        return data; 
        
    }    
    
}
