
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import javax.xml.crypto.Data;
// public class ARR {
//     public ArrayList<String> entries;
//     public ARR (ArrayList<String> entries){
//         this.entries = entries;
//     }
//     // public static ArrayList<String> Entries(){
//     //     ArrayList<String> banshee = new ArrayList<String>();
//     //     // = "em a i l l, email2, email3, email4, email5";
//     //     for(int i=0; i<this.entries.size(); i++){
//     //         System.out.println(this.entries.get(i));
//     //         String[] cm = this.entries.get(i); // i=0 cm= "em a i l l"
//     //         int charct = 0;
//     //         int wordct = cm.length; // 5
//     //         int avchct = 0;
//     //         for(int j=0; j<cm.length; j++){
//     //             System.out.println(cm[j]);
//     //             String mb = cm[j]; // j=0 mb= "em"
//     //             charct = charct + mb.length(); // charct = 0 + 2
//     //         }
//     //         avchct = charct/wordct; 
//     //         String chocoisland = "email " + (i+1) + " has " + charct + " characters, " + wordct + " words, and an average of " + avchct + " characters per word.";
//     //         banshee.add(chocoisland);
//     //     }
//     //     return banshee;
//     // }     
//     public static void main(String[] args) {
//     }
// }
public class ARR {
    public static void main(String[] args) {
        boolean label = Integer.parseInt("0") == 1;
        System.out.println(label);
        Dataset entry = new Dataset("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv");
        for (DSEntry e : entry.entries) {
            System.out.println(" : " + e.message);
            System.out.println("Is Spam: " + e.isSpam);
            System.out.println("Average Word Length: " + e.getAverageWordLength());
            System.out.println();
        }
    }
} 