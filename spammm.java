import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class spammm{
    public static void main(String[]args){
        int spkspam = 0;// how many total spam words in all spam emails
        int wctsp = 0;// total word count in spam
        int wcth = 0;// total word count in ham
        int spkham = 0;//how many total spam words in all ham emails
        int spexc = 0; //how many total exclamation marks in all spam emails
        int hexcl = 0;// how many total exclamation marks in all ham emails
        int charsp = 0;// total char count in spam
        int charh = 0;// total char count in ham

        HashMap<String,Integer> maps = new HashMap<>();//occurance in each spam email
        HashMap<String,Integer> maph = new HashMap<>();//occurance in each ham email
        HashMap<String,Double> mapavgsp = new HashMap<>();//average occurance in a spam email
        HashMap<String,Double> mapavgh = new HashMap<>(); //average occurance in a ham email



        ArrayList<String> spamarray = new ArrayList<>(); //this is the array of words that occur in spam emails
        ArrayList<String> emailsct = new ArrayList<>(); //this is the test for the spam filter
        ArrayList<String> spamemails = new ArrayList<>(); //spam emails find the average time a word occurs in a spam email
        ArrayList<String> hamemails = new ArrayList<>(); //ham emails find the average time a word occurs in a ham email
        
        String[] spookwords = {"free contract urgent claim"};
        


        ArrayList<String> emailcombined = new ArrayList<>();
        ArrayList<String> wordocc = new ArrayList<>();
        int emails = emailsct.size();

       

        for(int i = 0;i<spamemails.size();i++){
            String[] wordinsp = spamemails.get(i).split(" ");
            for(int j = 0;j<wordinsp.length;j++){
                wctsp++;
                for(int k = 0;k < spookwords.length;k++){
                    if((wordinsp[j].toLowerCase().contains(spookwords[k])) == true){
                        spkspam++;
                    } 
                }
            }
        }
        double totspookspam = spkspam/wctsp;// spookword percentage in spam emails
        double totspksphundred = totspookspam*100;

        for(int i = 0;i<spamemails.size();i++){
            String[] charinsp = spamemails.get(i).split("");
            for(int j = 0;j<charinsp.length;j++){
                charsp++;
                if(charinsp[j].equals("!")){
                    spexc++;
                }
            }
        }
        double spex = spexc/charsp;// exclamation mark divided by the char count in spam
        double honkk = spex*100;// 



        for(int i = 0;i<hamemails.size();i++){
            String[] wordinh = hamemails.get(i).split(" ");
            for(int j = 0;j<wordinh.length;j++){
                wcth++;
                for(int k = 0;k < spookwords.length;k++){
                    if((wordinh[j].toLowerCase().contains(spookwords[k])) == true){
                        spkham++;
                    } 
                }
            }
        }
        double totspookham = spkham/wcth;// spookword percentage in ham emails
        
       

        for(int i = 0;i<hamemails.size();i++){
            String[] charinh = hamemails.get(i).split("");
            for(int j = 0;j<charinh.length;j++){
                charh++;
                if(charinh.equals("!")){
                    hexcl++;
                }
            }
        }
        double hamexcl = hexcl/wcth;// how many exclamation points per char




        
        for(int i = 0;i<hamemails.size();i++){
            String[] wordinh = hamemails.get(i).split(" ");
            for(int j = 0;j<wordinh.length;j++){
                if(maph.containsKey(wordinh[j])){
                    int ct = maph.get(wordinh[j]);
                    maph.replace(wordinh[j],ct++);
                }
                else{
                    maph.put(wordinh[j],1);
                }
            }
        }
        
        for(int i = 0;i<spamarray.size();i++){
            
            double emct = spamemails.size();
            double ct = maps.get(spamarray.get(i));
            double avg = ct/emct; 
            mapavgsp.put(spamarray.get(i),avg);
            
        }
        for(int i = 0;i<spamarray.size();i++){
            
            double emct = spamemails.size();
            double ct = maps.get(spamarray.get(i));
            double avg = ct/emct; 
            mapavgsp.put(spamarray.get(i),avg);
            
        }
        for(int i = 0;i<spamarray.size();i++){// this is the average char ct
            
            double emct = spamemails.size();
            double ct = 
            double avg = ct/emct; 
            mapavgsp.put(spamarray.get(i),avg);
            
        }


        for(int i = 0;i<hamarray.size();i++){
            
            double emct = hamemails.size();
            double ct = maph.get(hamarray.get(i));
            double avg = ct/emct;
            mapavgh.put(hamarray.get(i),avg);
            
        }
        ArrayList<String> testsett = new ArrayList<>();
        testsett.add("you have won a free iphone");
        for(int i = 0;i<testsett.size();i++){




            for(int i = 0;i<wordocc.size();i++){
                int totsp = maps.get(wordocc.get(i));
                int toth = maph.get(wordocc.get(i));
                double avgsp = totsp/spamemails.size();
                double avgh = toth/hamemails.size();
                mapavgsp.put(wordocc.get(i),avgsp);
                mapavgh.put(wordocc.get(i),avgh);
            }


        // for i in range {String[] honk = email[i].split(" "); forString se : honk) { emcomb.add honk[i]}
        // for(int i = 0;i < emcomb.length;i++){
        //     if map.containsemcomb[i] ? int ct = map.getemcomb[i] map.replace emcomb,ct++ : map.put(emcomb[i],1) wordocc.add(emcomb[i])}
        // hashmap str int avgmapsp = new hashmap; 


        // for(int i = 0;i<wordocc.length;i++){
        //     int tot = map.get(wordocc[i]), double avg = tot/emails.length avgmap.put(wordocc[i],avg)  
        //     }

        // hashmap testhm = new hashmap
        // array wordoccc
        // emailstest =  the email  String[] words = emailstest.split(" ") for words.len if thm.contains(words[i]) ? int ct = thm.getwords[i] thm.replace words[i],ct++: thm.put words[i],1
        // for wordocc.length{int hamppint int spampp sppavgmapsp.get wordoccc int hamm = if havgmap .contains havgmap.get wordoccc else hampp ++ } 

        // int spsc = 0
        // int hsc = 0 
        // for each email in emails String[]words = email.split(" ") String[]chars = email.split("") int exct = 0 int spookct = 0 for i in range chars.length: if chars[i] = "!" exct++ else continuefor i in range words.length: for j in range spookk.length if words[i].equals(spookk[j]) spookct++ else continue  
        //lets just say we have an integer exclct spamemails.append email and we have spam emails  and it is all in an array and String[] wias = spamemails.split("");  for i in range 0,wias.length :  if wias[i] == "!" exclct++ else continue  double avgexcl = spamemails.size()/exclct  
        //lets just say we have an integer tsp spamemails.append email and we have spam emails  and it is all in an array and String[] wias = spamemails.split(" "); spook[] = ["honk","at","the","deer"] for i in range 0,wias.length : for j in range 0,spook.length : if wias[i] == spook[j] tsp++ else continue  double avgspook = spamemails.size()/tsp  

    }
}
