

public class DSEntry {

    //class DSEntry {
    public String message;
    public boolean isSpam;
    public static void main(String[] args) {
        
        
        // Dataset entry = new Dataset("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv");
        // for (DSEntry e : entry.entries) {
        //     System.out.println("Message: " + e.message);
        //     System.out.println("Is Spam: " + e.isSpam);
        //     System.out.println("Average Word Length: " + e.getAverageWordLength());
        //     System.out.println();
        // }
    }
    
    public DSEntry(String message, boolean isSpam) {
        this.message = message;
        this.isSpam = isSpam;
    }
    // booleam is spam if(1) is spam, if(0) is not spam

    public int getAverageWordLength() {
        String[] words = this.message.split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        return words.length > 0 ? totalLength / words.length : 0;
    }

    // public static ArrayList<String> wordocc(){
    //     ArrayList<String> skyy = new ArrayList<>();
    //     Dataset airf = new Dataset("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv");
    //     //airf.ttc();
    //     skyy = airf.getarr();
    //     return skyy;
    // }
    public static void avr(){
        // Dataset donpl = new Dataset("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv");
        // //airf.ttc();
        
        // ArrayList<Integer> aver = donpl.avre();
        // for(int bp=0; bp<aver.size(); bp++){
        //     System.out.println("avera word len for email " + (bp+1) + " is " + aver.get(bp));
        // }
    }
    
    
        // public void wordct(){
        //     System.out.println("honkatthedeer" + spamon + messg);
        // }
        public void charct(){

        }

        
}
