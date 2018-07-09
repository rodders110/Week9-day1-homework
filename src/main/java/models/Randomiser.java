package models;

import java.util.ArrayList;
import java.util.Collections;

public class Randomiser {

   private ArrayList<String> names;

    public  Randomiser() {
        names = new ArrayList<String>();
        names.add("Daffy Duck");
        names.add("Mickey Mouse");
        names.add("Donald Duck");
        names.add("Popeye");
        names.add("Olive Oyle");
        names.add("Minnie Mouse");
        names.add("Elmer Fudd");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String getList(int number){

        if (number <= names.size()) {
            number = number;
        } else {
            number = names.size();
        }
        String results = "";
        Collections.shuffle(names);
        int counter = 0;
        while (counter != number){
            results += names.get(counter);
            results += ", ";
            counter++;
        }
        return results.substring(0, results.length() -2);
    }
}
