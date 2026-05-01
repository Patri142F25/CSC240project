// import java.util.ArrayList;

// public class spammm{
//     public static void main(String[]args){
//         int spkspam = 0;// how many total spam words in all spam emails
//         int wctsp = 0;// total word count in spam
//         int wcth = 0;// total word count in ham
//         int spkham = 0;//how many total spam words in all ham emails
//         int spexc = 0; //how many total exclamation marks in all spam emails
//         int hexcl = 0;// how many total exclamation marks in all ham emails
//         int charsp = 0;// total char count in spam
//         int charh = 0;// total char count in ham
//         int urlh = 0;// total url in ham 
//         int urlsp = 0;// total url in spam



//         // HashMap<String,Integer> maps = new HashMap<>();//occurance in each spam email
//         // HashMap<String,Integer> maph = new HashMap<>();//occurance in each ham email
//         // HashMap<String,Double> mapavgsp = new HashMap<>();//average occurance in a spam email
//         // HashMap<String,Double> mapavgh = new HashMap<>(); //average occurance in a ham email

        



//         // ArrayList<String> spamarray = new ArrayList<>(); //this is the array of words that occur in spam emails
//         // ArrayList<String> emailsct = new ArrayList<>(); //this is the test for the spam filter
//         ArrayList<String> spamemails = ARR.spamem(); //spam emails find the average time a word occurs in a spam email
//         ArrayList<String> hamemails = ARR.hamem(); //ham emails find the average time a word occurs in a ham email
//         if (spamemails == null) spamemails = new ArrayList<>();
//         if (hamemails == null) hamemails = new ArrayList<>();
//         String[] spookwords = {"free", "contract", "urgent", "claim", "click"};//String[] spookwords = {"free contract urgent claim click "};//String[] spookwords = {"free", "contract", "urgent", "claim", "click"};
//         int diffspkct = 0 ;
//         String[] links = {"http", "www", ".com", ".org", ".net", ".ly"};//String[] links = {"http www .com .org .net .ly "};String[] links = {"http", "www", ".com", ".org", ".net", ".ly"};
//         String[]excep = {"freedom", "contractor", "disclaimer", "proclaim", "overclaim", "underclaim", "freeload", "freely", "freeman", "carefree", "freewall", "freefall", "contraction", "contractive", "contractility", "contractile", "contractual", "contractible"};

        
        


//         ArrayList<String> emailcombined = new ArrayList<>();
//         ArrayList<String> wordocc = new ArrayList<>();
//         // int emails = emailsct.size();

//         // SPAM
//         for(int i = 0;i<spamemails.size();i++){
//             String[] wordinsp = spamemails.get(i).split(" ");
//             for(int j = 0;j<wordinsp.length;j++){
//                 wctsp++;
//                 for(int k = 0;k < spookwords.length;k++){
//                     if((wordinsp[j].toLowerCase().contains(spookwords[k])) == true){
//                         int sppp = 0;
//                         for(int sp = 0; sp<excep.length;sp++){
//                             if ((wordinsp[j].contains(excep[sp])) == true){
//                                 sppp++;
//                             }
//                         }
//                         if(sppp == 0){
//                             spkspam++;
//                         }
//                     } 
//                 }
//             }
//         }
//         //the occure 3 times on average spam 2 on average ham 
//         if (wctsp>0)
//         {
//             double totspookspam = spkspam/wctsp;// spookword percentage in spam emails System.out.println("decimal for spookword occurance in spam is " + totspookspam);
//             double totspksphundred = totspookspam*100;
//             System.out.println("decimal for spookword occurance in spam is " + totspookspam);
//             System.out.println("percent of spook in spam is " + totspksphundred);

//             double urlpwordsp = urlsp/wctsp; // System.out.println("urls per word in spam is " + urlpwordsp);
//             System.out.println("urls per word in spam is " + urlpwordsp);
//         }
        
//         // System.out.println("percent of spook in spam is " + totspksphundred);

//         for(int i = 0;i<spamemails.size();i++){
//             String[] charinsp = spamemails.get(i).split("");
//             for(int j = 0;j<charinsp.length;j++){
//                 charsp++;
//                 if(charinsp[j].equals("!")){
//                     spexc++;
//                 }
//             }
//         }
//         if(charsp>0){
//             double spex = spexc/charsp;// exclamation mark divided by the char count in spam System.out.println("exclamation mark count divided by char count in spam " + spex)
//             double honkk = spex*100;// System.out.println("percent of the exclamation mark count out of all chars in spam" honkk);
//             System.out.println("exclamation mark count divided by char count in spam " + spex);
//             System.out.println("percent of the exclamation mark count out of all chars in spam"  + honkk);

//         }
        

//         for(int i = 0;i<spamemails.size();i++){
//             String[] wordsp = spamemails.get(i).split(" ");
//             for(int j = 0;j<wordsp.length;j++){
//                 for(int k = 0;k < links.length;k++){
//                     if((wordsp[j].toLowerCase().contains(links[k])) == true){
//                         urlsp++;
//                     } 
//                 }
//             }
//         }
//         // double urlpwordsp = urlsp/wctsp; // System.out.println("urls per word in spam is " + urlpwordsp);
//         // System.out.println("urls per word in spam is " + urlpwordsp);




// // HAM

//         for(int i = 0;i<hamemails.size();i++){
//             String[] wordinh = hamemails.get(i).split(" ");
//             for(int j = 0;j<wordinh.length;j++){
//                 wcth++;
//                 for(int k = 0;k < spookwords.length;k++){
//                     if((wordinh[j].toLowerCase().contains(spookwords[k])) == true){
//                         int sppp = 0;
//                         for(int sp = 0; sp<excep.length;sp++){
//                             if ((wordinh[j].contains(excep[sp])) == true){
//                                 sppp++;
//                             }
//                         }
//                         if(sppp == 0){
//                             spkham++;
//                         }
//                     } 
//                 }
//             }
//         }
        
        
       

//         for(int i = 0;i<hamemails.size();i++){
//             String[] charinh = hamemails.get(i).split("");
//             for(int j = 0;j<charinh.length;j++){
//                 charh++;
//                 if(charinh.equals("!")){
//                     hexcl++;
//                 }
//             }
//         }
        

//         for(int i = 0;i<hamemails.size();i++){
//             String[] wordh = hamemails.get(i).split(" ");
//             for(int j = 0;j<wordh.length;j++){
//                 for(int k = 0;k < links.length;k++){
//                     if((wordh[j].toLowerCase().contains(links[k])) == true){
//                         urlh++;
//                     } 
//                 }
//             }
//         }
        
//         if(wcth>0){
//             double urlpwordh = urlh/wcth;// System.out.println("url divided by wordct in ham is " + urlpwordh);
//             System.out.println("url divided by wordct in ham is " + urlpwordh);
//             double hamexcl = hexcl/wcth;// how many exclamation points per charSystem.out.println("exclamarion marks per character in ham is " + hamexcl);
//             System.out.println("exclamarion marks per character in ham is " + hamexcl);
//             double totspookham = spkham/wcth;// spookword percentage in ham emails System.out.println("spookwords out of all words in ham " + totspookham);
//             System.out.println("spookwords out of all words in ham " + totspookham);

//         }
        
//         // spam


//         // System.out.println("urls per word in spam is " + urlpwordsp);
//         // ham
        
        
        

//     }
// }


        


//         // END

// ENHANCED

import java.util.ArrayList;
import java.util.HashMap;


public class spammm {
    public static void main(String[] args) {
        int spkspam = 0; // how many total spam words in all spam emails
        int wctsp = 0; // total word count in spam
        int wcth = 0; // total word count in ham
        int spkham = 0; // how many total spam words in all ham emails
        int spexc = 0; // how many total exclamation marks in all spam emails
        int hexcl = 0; // how many total exclamation marks in all ham emails
        int charsp = 0; // total char count in spam
        int charh = 0; // total char count in ham
        int urlh = 0; // total url in ham
        int urlsp = 0; // total url in spam
        int numhct = 0;
        int numspct = 0;
        int numspctpch = 0;
        int numhctpch = 0;

        ArrayList<String> spamemails = ARR.spamem();
        ArrayList<String> hamemails = ARR.hamem();
        


        if (spamemails == null) spamemails = new ArrayList<>();
        if (hamemails == null) hamemails = new ArrayList<>();

        HashMap<String,Integer> maps = new HashMap<>();//occurance in each spam email
        HashMap<String,Integer> maph = new HashMap<>();//occurance in each ham email
        HashMap<String,Double> mapavgsp = new HashMap<>();//average occurance in a spam email
        HashMap<String,Double> mapavgh = new HashMap<>(); //average occurance in a ham email
        ArrayList<String> spamwords = new ArrayList<>();
        ArrayList<String> hamwords = new ArrayList<>();

        ArrayList<String> tspam = new ArrayList<>();
        ArrayList<String> tham = new ArrayList<>();

        // for email in tspam string[] words = email.split(" ") for word in words{ for spook in spokwords {if word.equals(spook) spkspam++ } 



        String[] spookwords = {"free", "contract", "urgent", "claim", "click"};
        String[] links = {"http", "www", ".com", ".org", ".net", ".ly"};
        String[] excep = {"freedom", "contractor", "disclaimer", "proclaim", "overclaim", "underclaim",
                "freeload", "freely", "freeman", "carefree", "freewall", "freefall", "contraction",
                "contractive", "contractility", "contractile", "contractual", "contractible"};

        // SPAM: word counts, spookwords, URLs, chars, exclamations
        System.out.println(spamemails.size());
        for (String email : spamemails) {
            if (email == null) continue;

            String[] words = email.split("\\s+");

            for (String rawWord : words) {
                
                if (rawWord.length() == 0) continue;
                wctsp++;
                if (spamwords.contains(rawWord)== false) {
                    spamwords.add(rawWord);
                    maps.put(rawWord,1);
                }else{
                    int ct = maps.get(rawWord);
                    ct++;
                    maps.replace(rawWord,ct);

                }
                String word = rawWord.toLowerCase();
                // c
                for (String spook : spookwords) {
                    if (word.contains(spook)) {
                        boolean isException = false;
                        for (String nspk : excep) {
                            if (word.contains(nspk)) {
                                isException = true;
                                
                            }
                        }
                        if (!isException) {
                            spkspam++;
                            
                        }
                    }
                }
                // check links .com.net
                int ct = 0;
                for (String link : links) {
                    
                    if (word.contains(link)) {
                        urlsp++;
                        ct++;
                        
                    }

                }
            }

            // chars and exclamation marks
            for (char c : email.toCharArray()) {
                charsp++;
                if (c == '!') spexc++;
                if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') numspct++;
            }
        }

        // for(String shroom: spamwords){
        //     int occ = maps.get(shroom);
        //     if(occ > 1){
        //         System.out.println(occ + " " + shroom);
        //     }
        //     //System.out.println(occ + " " + shroom);
        // }

        // HAM: word counts, spookwords, URLs, chars, exclamations
        for (String email : hamemails) {
            if (email == null) continue;
            String[] words = email.split("\\s+");
            for (String rawWord : words) {
                if (rawWord.length() == 0) continue;
                wcth++;
                if (hamwords.contains(rawWord)== false) {
                    hamwords.add(rawWord);
                    maph.put(rawWord,1);
                }else if (hamwords.contains(rawWord) == true){
                    int ct = maph.get(rawWord);
                    //int ctt = Integer.parseInt(ct.toString());
                    ct++;
                    maph.replace(rawWord,ct);

                }
                String word = rawWord.toLowerCase();
                for (String spook : spookwords) {
                    if (word.contains(spook)) {
                        boolean isException = false;
                        for (String ex : excep) {
                            if (word.contains(ex)) {
                                isException = true;
                                
                            }
                        }
                        if (!isException) {
                            spkham++;
                            
                        }
                    }
                }
                for (String l : links) {
                    if (word.contains(l)) {
                        urlh++;
                    }
                }
            }

            for (char c : email.toCharArray()) {
                charh++;
                if (c == '!') hexcl++;
                if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') numhct++;
            }
        }
        ArrayList<String> spbutnoth = new ArrayList<>();
        ArrayList<String> hbutnotsp = new ArrayList<>();
        for(String honk:spamwords){
            int h = 0;
            for(String deer: hamwords){
                if(deer.equals(honk)){
                    h++;
                }
            }
            if(h==0){
                spbutnoth.add(honk);
            }
        }
        for(String honk:hamwords){
            int h = 0;
            for(String deer: spamwords){
                if(deer.equals(honk)){
                    h++;
                }
            }
            if(h==0){
                hbutnotsp.add(honk);
            }
        }
        int spookcttt = 0;
        for(int i = 0;i<spbutnoth.size();i++){
            String banshee = (String) spbutnoth.get(i);
            //System.out.println(banshee);
            int occ = maps.get(banshee);
            spookcttt += occ;

            
        }
        

        
        double spkpct = 0;
        // Results (use double casts to avoid integer division)
        if (wctsp > 0) {
            System.out.println(spookcttt + " gyro jungle ");
            double totspookspam = (double) spkspam / (double) wctsp;
            double totspksphundred = totspookspam * 100;
            double urlpwordsp = (double) urlsp / (double) wctsp;
            double spex = (double) spexc / (double) charsp;
            double honkk = spex * 100;
            double numpchsp = (double) numspct/ (double)charsp;
            double nummm = numpchsp * 100;
            double spkpword = (double) spookcttt / (double) wctsp;


            double spkpemail = (double) spookcttt / (double) spamemails.size();
            System.out.println("spook words per email in spam is " + spkpemail);
            spkpct = spkpword;
            


            // System.out.println("decimal for spookword occurance in spam is " + totspookspam);
            // System.out.println("percent of spook in spam is " + totspksphundred);
            // System.out.println("urls per word in spam is " + urlpwordsp);
            // System.out.println("exclamation mark count divided by char count in spam " + spex);
            // System.out.println("percent of the exclamation mark count out of all chars in spam " + honkk);
            // System.out.println("numbers count divided by charct = " + numpchsp);
            // System.out.println("numbers count divided by charct *100 " + nummm);
            // System.out.println(numspct);
            // System.out.println("unique spam words that dont appear in ham divided by word count in spam " + spkpword);

        }
        

        if (wcth > 0) {
            double urlpwordh = (double) urlh / (double) wcth;
            double hamexcl = (double) hexcl / (double) charh;
            double totspookham = (double) spkham / (double) wcth;
            double urlpwordhpct = urlpwordh*100;
            double hamexclpct = hamexcl*100;
            double totspookhampct = totspookham*100;
            double numpchh = (double) numhct/ (double)charh;
            double nummmm = numpchh * 100;
            System.out.println();
            System.out.println();
            System.out.println("Ham");
            System.out.println();


            // System.out.println("url divided by wordct in ham is " + urlpwordh + "times a hundred = " + urlpwordhpct);
            
            // System.out.println("exclamation marks per character in ham is " + hamexcl + "times a hundred = " + hamexclpct);
            // System.out.println("spookwords out of all words in ham " + totspookham + "times a hundred = " + totspookhampct);
        
            // System.out.println("numbers count divided by charct = " + numpchh);
            // System.out.println("");
            // System.out.println("numbers count divided by charct *100 " + nummmm);
            // System.out.println(numhct);
        
        }
        
        ArrayList<String> t1spamemails = ARR.tspamem("C:\\Users\\clish\\github-classroom\\CSC-240\\CSC240project\\spam_or_not_spam(in).csv");
        ArrayList<String> t1hamemails = ARR.thamem("C:\\Users\\clish\\github-classroom\\CSC-240\\CSC240project\\spam_or_not_spam(in).csv");
        double t1s = t1spamemails.size();
        double t1h = t1hamemails.size();
        double spamc = 0;
        for(String email: t1spamemails){
            
            double spookct = 0;
            
            String[] words = email.split(" ");
            for(String word: words){
                for(String spook: spbutnoth){
                    String spkl = spook.toLowerCase();
                    if(word.toLowerCase().equals(spook)){
                        spookct++;
                    }
                }
                
            }
            if(words.length > 0){
                double spookpword = spookct/words.length;
                if(spookpword >= spkpct){
                    spamc += 1;
                }
            }
            
            
        }
        double spamacc = spamc/t1s;
        double spamaccpct = spamacc*100;
        System.out.println("Spam Accuracy: " + spamacc + " times a hundred = " + spamaccpct);
        
        for(String email: t1hamemails){
            System.out.println(email);
        }


        
    }
    


    
}








//END OF ENHANCED

// WORD COUNT 



// //1/5 = spam 1/400 = ham

// // TEST






// //         ArrayList<String> emailtest = new ArrayList<>();
// //         for(int t = 0; t<emailtest.size();t++){
// //             String[]wordstest = emailtest[i].split
// //         }





        
// //         for(int i = 0;i<hamemails.size();i++){
// //             String[] wordinh = hamemails.get(i).split(" ");
// //             for(int j = 0;j<wordinh.length;j++){
// //                 if(maph.containsKey(wordinh[j])){
// //                     int ct = maph.get(wordinh[j]);
// //                     maph.replace(wordinh[j],ct++);
// //                 }
// //                 else{
// //                     maph.put(wordinh[j],1);
// //                 }
// //             }
// //         }
        
// //         for(int i = 0;i<spamarray.size();i++){
            
// //             double emct = spamemails.size();
// //             double ct = maps.get(spamarray.get(i));
// //             double avg = ct/emct; 
// //             mapavgsp.put(spamarray.get(i),avg);
            
// //         }
// //         for(int i = 0;i<spamarray.size();i++){
            
// //             double emct = spamemails.size();
// //             double ct = maps.get(spamarray.get(i));
// //             double avg = ct/emct; 
// //             mapavgsp.put(spamarray.get(i),avg);
            
// //         }
// //         for(int i = 0;i<spamarray.size();i++){// this is the average char ct
            
// //             double emct = spamemails.size();
// //             double ct = 
// //             double avg = ct/emct; 
// //             mapavgsp.put(spamarray.get(i),avg);
            
// //         }


// //         for(int i = 0;i<hamarray.size();i++){
            
// //             double emct = hamemails.size();
// //             double ct = maph.get(hamarray.get(i));
// //             double avg = ct/emct;
// //             mapavgh.put(hamarray.get(i),avg);
            
// //         }
// //         ArrayList<String> testsett = new ArrayList<>();
// //         testsett.add("you have won a free iphone");
// //         for(int i = 0;i<testsett.size();i++){




// //             for(int i = 0;i<wordocc.size();i++){
// //                 int totsp = maps.get(wordocc.get(i));
// //                 int toth = maph.get(wordocc.get(i));
// //                 double avgsp = totsp/spamemails.size();
// //                 double avgh = toth/hamemails.size();
// //                 mapavgsp.put(wordocc.get(i),avgsp);
// //                 mapavgh.put(wordocc.get(i),avgh);
// //             }


// //         // for i in range {String[] honk = email[i].split(" "); forString se : honk) { emcomb.add honk[i]}
// //         // for(int i = 0;i < emcomb.length;i++){
// //         //     if map.containsemcomb[i] ? int ct = map.getemcomb[i] map.replace emcomb,ct++ : map.put(emcomb[i],1) wordocc.add(emcomb[i])}
// //         // hashmap str int avgmapsp = new hashmap; 


// //         // for(int i = 0;i<wordocc.length;i++){
// //         //     int tot = map.get(wordocc[i]), double avg = tot/emails.length avgmap.put(wordocc[i],avg)  
// //         //     }

// //         // hashmap testhm = new hashmap
// //         // array wordoccc
// //         // emailstest =  the email  String[] words = emailstest.split(" ") for words.len if thm.contains(words[i]) ? int ct = thm.getwords[i] thm.replace words[i],ct++: thm.put words[i],1
// //         // for wordocc.length{int hamppint int spampp sppavgmapsp.get wordoccc int hamm = if havgmap .contains havgmap.get wordoccc else hampp ++ } 

// //         // int spsc = 0
// //         // int hsc = 0 
// //         // for each email in emails String[]words = email.split(" ") String[]chars = email.split("") int exct = 0 int spookct = 0 for i in range chars.length: if chars[i] = "!" exct++ else continuefor i in range words.length: for j in range spookk.length if words[i].equals(spookk[j]) spookct++ else continue  
// //         //lets just say we have an integer exclct spamemails.append email and we have spam emails  and it is all in an array and String[] wias = spamemails.split("");  for i in range 0,wias.length :  if wias[i] == "!" exclct++ else continue  double avgexcl = spamemails.size()/exclct  
// //         //lets just say we have an integer tsp spamemails.append email and we have spam emails  and it is all in an array and String[] wias = spamemails.split(" "); spook[] = ["honk","at","the","deer"] for i in range 0,wias.length : for j in range 0,spook.length : if wias[i] == spook[j] tsp++ else continue  double avgspook = spamemails.size()/tsp  

// //     }
// // }


// test set = 