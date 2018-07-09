package models;

import java.util.ArrayList;
import java.util.Collections;

public class Randomiser {

    ArrayList<String> names;

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

    public String getOne(){

        Collections.shuffle(names);
        return names.get(0);
    }

    public String getTwo(){
        String results = "";
        Collections.shuffle(names);
        results += names.get(0);
        results += ", ";
        results += names.get(1);

        return results;
    }
}
