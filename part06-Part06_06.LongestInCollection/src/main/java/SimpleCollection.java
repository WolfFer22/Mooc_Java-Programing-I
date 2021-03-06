
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
 
        String toReturn = this.elements.get(0);
        for (String element : this.elements) {
            if (element.length() > toReturn.length()) {
                toReturn = element;
            }
        }
 
        return toReturn;
    }    
    
//    public Integer lengthCollection(){
//        return this.name.length();
//    }
//    
//    public String longest(){
//        if (this.elements.isEmpty()){
//            return null;
//        }
//        Integer longestCollection = lengthCollection();
//        String longestName = "";
//        
//        for (String longest: this.elements){
//            if (longest.length() > longestCollection){
//                longestCollection = longest.length();
//                longestName = longest;
//            }
//        }
//        return longestName; 
//   
//    }
    
}
