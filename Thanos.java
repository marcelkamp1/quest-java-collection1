import java.util.*;

public class Thanos {

    public static void main(String[] args) {
    	 // TODO 1 : Create an empty heroes list

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        // TODO 4 : Shuffle the heroes list

        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	
    	ArrayList<Hero> heroes = new ArrayList<>();
    	
    	Hero blackWidow = new Hero ("Black Widow", 34);
    	Hero cptAmerica = new Hero ("Captain America", 100);
    	Hero vision = new Hero ("Vision", 3);
    	Hero ironMan = new Hero ("Iron Man", 48);
    	Hero scarletWitch = new Hero ("Scarlet Witch", 29);
    	Hero thor = new Hero ("Thor", 1500);
    	Hero spiderMan = new Hero ("Spider-Man", 18);
    	Hero hulk = new Hero ("Hulk", 49);
    	Hero docStrange = new Hero ("Doctor Strange", 42);
    	
    	heroes.add(blackWidow);
    	heroes.add(docStrange);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(cptAmerica);
    	heroes.add(hulk);
    	heroes.add(spiderMan);
    	heroes.add(scarletWitch);
    	heroes.add(thor);
    	
    	System.out.println(heroes);
    	
    	Hero thor1 = new Hero("Thor", 1501);
    	heroes.set(8, thor1);
    	
    	System.out.println(heroes.get(8));
    	
    	Collections.shuffle(heroes);
    	System.out.println(heroes);
    	System.out.println(heroes.subList(0, 4));
    	
    	for (Hero position: heroes.subList(0, 4)) {
    		System.out.println(position.getName());
    	}
    	
    	
    	
    	
       
    }
}