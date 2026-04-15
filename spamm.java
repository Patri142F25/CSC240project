// exlmct > 2? isSpam = true : false
// exlmct <= 2? isSpam = false : true

public class spamm {
    public static void main(String[] args) {
        double spamchce = 0.0;
        boolean label;
        String email = "YOU HAVE WON The new Ninja Foodi Deluxe ";

        int exlmct = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '!') {
                exlmct++;
            }
        }
        if (exlmct < 3) {
            switch (exlmct) {
                case 0:
                    break;
                case 1:
                    spamchce += 0.5;
                    break;
                case 2:
                    spamchce += 0.8;
                    break;
            }
        }
        if (exlmct >= 3) {
            spamchce += 0.9;
        }
       
       
        String[] words = email.split(" ");
        for(int i = 0; i < words.length; i++){
            if (words[i].equals(words[i].toUpperCase())) {
                spamchce += 0.1;
                System.out.println("The email is likely spam");
            }
        }
        int totalLength = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals("you")) {
                int uind = i;
                for(int j = uind; j < words.length; j++){
                    if(words[j].toLowerCase().equals("won")){// YOU REALLY HAVE JUST WON
                        int wond = j;
                        
                        if(wond - uind <6){
                            if(wond - uind <4){
                                spamchce += 0.8;
                                System.out.println("The email is likely spam");
                            }
                            else{
                                System.out.println("lets check the rest of the email for more spam indicators");
                                spamchce += 0.2;
                            }
                        }
                    }
                    if(words[j].toLowerCase().equals("win")){// YOU REALLY HAVE JUST WON
                        int wind = j;
                        
                        if(wind - uind <6){
                            if(wind - uind <4){
                                spamchce += 0.8;
                                System.out.println("The email is likely spam");
                            }
                            else{
                                System.out.println("lets check the rest of the email for more spam indicators");
                                spamchce += 0.2;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0;i<words.length; i++){
            if(words[i].toLowerCase().equals("claim")){
                int claimind = i;
                for(int j = i; j < words.length; j++){
                    if(words[j].toLowerCase().equals("now")){// claim this hdtv h h h h  200 sentences now
                        int prind = j;
                        if(prind - i < 9){
                            if(prind - i < 5){
                                spamchce += 1.0;
                                System.out.println("The email is likely spam");
                            }
                            else{
                                System.out.println("lets check the rest of the email for more spam indicators");
                                spamchce += 0.2;
                            }
                        }
                    }
                }
                for(int j = i; j < words.length; j++){
                    if(words[j].toLowerCase().equals("your")){// claim this now
                        int yrind = j;
                        if(yrind - i < 9){
                            if(yrind - i < 5){
                                spamchce += 1.0;
                                System.out.println("The email is likely spam");
                            }
                            else{
                                System.out.println("lets check the rest of the email for more spam indicators");
                                spamchce += 0.2;
                            }
                        }
                    }
                }
            }
        }
        if(spamchce >= 1.0){
            label = true;
        }
        else{
            label = false;
        }
        System.out.println("The email has a spam score of " + spamchce);
        
    }
}

