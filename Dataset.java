//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.nio.file.*;
//import java.util.*;
//import java.io.*;
//import java.util.stream.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//public class Dataset {

////    public static void main(String[]args){
////        String[] honk = {};
////
////
////        //DSEntry dsetent = new DSEntry(honk.csv)
////        DSEntry dsetent = new DSEntry("honk",true,"honk.csv", honk);
////
////    }
//    public static void main(String[]args){
//        String[] mesage = {};
//        long count = 0;
//        int current = 0;
//        int spamct = 0;
//        int nonspamct = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv"))) {
//            String line;
//            String s = "honk at the deer\t1\n" +
//                    "sue the deer\t1\n" +
//                    "sogwood forest from starfy\t0\n" +
//                    "floating water\t0\n" +
//                    "geysers that can spring people up\t0";
//            for (String der : s.split("\\R")){
//                String[] fields = der.split("\\t", -1);
//                System.out.println(fields.length > 1 ? fields[1].trim() : "");
//                if ((fields.length > 1 ? fields[1].trim() : "").equals("1")){
//                    spamct++;
//                }
//                if ((fields.length > 1 ? fields[1].trim() : "").equals("0")){
//                    nonspamct++;
//                }
//
//            }
//            System.out.println("Spam count = " + spamct);
//            System.out.println("NONspam = " + nonspamct);
//            String linee = br.readLine();
//            while ((br.readLine()) != null) {
//                line = br.readLine();
//                System.out.println(line);
//            }
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        DSEntry dsetent = new DSEntry("honk",true,"honk.csv", mesage );
//
//
//
//
//    }
//    public static void spamct(){
//
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\142\\ICTtrainer\\src\\untitle\\src\\honk.csv"))) {
//            String line;
//            String s = "honk at the deer\t1\n" +
//                    "sue the deer\t1\n" +
//                    "sogwood forest from starfy\t0\n" +
//                    "floating water\t0\n" +
//                    "geysers that can spring people up\t0";
//            for (String der : s.split("\\R")){
//                String[] fields = der.split("\\t", -1);
//                System.out.println(fields.length > 1 ? fields[1].trim() : "");
//                if ((fields.length > 1 ? fields[1].trim() : "").equals("1")){
//                    spamct++;
//                }
//                if ((fields.length > 1 ? fields[1].trim() : "").equals("0")){
//                    nonspamct++;
//                }
//
//            }
//            System.out.println("Spam count = " + spamct);
//            System.out.println("NONspam = " + nonspamct);
//            String linee = br.readLine();
//            while ((br.readLine()) != null) {
//                line = br.readLine();
//                System.out.println(line);
//            }
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        DSEntry dsetent = new DSEntry("honk",true,"honk.csv", mesage );
//
//
//    }
//
//}import java.nio.file.*;
//import java.io.IOException;
//
//public class CountSpam {
//    public static void main(String[] args) {
//        Path path = Paths.get("filll.csv");
//        int spamct = 0;
//        int nonspamct = 0;
//
//        try {
//            for (String line : Files.readAllLines(path)) {
//                // skip empty lines
//                if (line == null || line.trim().isEmpty()) continue;
//
//                // simple CSV split (won't handle quoted commas)
//                String[] cols = line.split(",", -1);
//                if (cols.length <= 1) continue; // no second column
//
//                String label = cols[1].trim();
//                if ("1".equals(label)) {
//                    spamct++;
//                } else if ("0".equals(label)) {
//                    nonspamct++;
//                }
//            }
//            System.out.println("spam: " + spamct + ", nonspam: " + nonspamct);
//        } catch (IOException e) {
//            System.err.println("Error reading file: " + e.getMessage());
//        }
//    }
//}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dataset {

    public String mc;
    public ArrayList<DSEntry> entries = new ArrayList<>();

    public Dataset(String mc) {
        this.mc = mc;
        this.entries = parseCSV();
    }
    public Dataset(String mc, ArrayList<DSEntry> entries){
        this.mc = mc;
        this.entries = entries;

    }
    

    public static void main(String[] args) throws IOException {

    }

    public void av() {
        for (DSEntry entry : this.entries) {
            System.out.println("Average word length: " + entry.getAverageWordLength());
        }

        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                String lm = ccb[0];
                String dh = ccb[1];
                System.out.println(ccb[1]);
                String[] ds = lm.split(" ");
                int sr = 0;
                for (String wps : ds) {
                    sr += wps.length();
                }
                int dkp = sr / ds.length;
                //System.out.println("spamct" + spam);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ws() {
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                String lm = ccb[0];
                String dh = ccb[1];
                System.out.println(ccb[1]);
                String[] ds = lm.split(" ");
                int sr = 0;
                for (String wps : ds) {
                    sr += wps.length();
                }
                int dkp = sr / ds.length;
                System.out.println("Average word length: " + dkp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ttc() {
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            int spamct = 0;
            int nonspamct = 0;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                String lm = ccb[0];
                String dh = ccb[1];
                System.out.println(ccb[1]);
                String[] ds = lm.split(" ");
                int sr = 0;
                for (String wps : ds) {
                    sr += wps.length();
                }
                int dkp = sr / ds.length;
                System.out.println("Average word length: " + dkp);
                System.out.println("totalchar " + sr);
                if ((dh.contains("1")) == true) {
                    spamct++;
                }
                if (dh.contains("0") == true) {
                    System.out.println("nonspam");
                    nonspamct++;
                }
                System.out.println("Non-spam count: " + nonspamct);
                System.out.println("Spam count: " + spamct);
            }
            System.out.print("Spam count: " + spamct);
            System.out.print("Non-spam count: " + nonspamct);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> oct() {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                if (ccb.length < 2) {
                    continue;
                }
                String lm = ccb[0];
                String dh = ccb[1];
                String[] ds = lm.split(" ");
                for (String word : ds) {
                    if (map.containsKey(word)) {
                        int ct = map.get(word);
                        ct++;
                        map.put(word, ct);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
    private ArrayList<String> getarr() {
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                if (ccb.length < 2) {
                    continue;
                }

                
                arr.add(ccb[0]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    private ArrayList<DSEntry> parseCSV() {
        ArrayList<DSEntry> arr = new ArrayList<>();
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;

            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                if (ccb.length < 2 || ccb.length > 2) {
                    continue;
                } 

                String messa = ccb[0];
                boolean label = Integer.parseInt(ccb[1]) == 1;// if label == true spam++ else nonspam++
                DSEntry entry = new DSEntry(messa, label);
                arr.add(entry);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public ArrayList<Integer> avre() {
        int totalLength = 0;
        int wordCount = 0;
        int dkp = 0;
        ArrayList<Integer> aver = new ArrayList<>();
        try (BufferedReader fec = new BufferedReader(new FileReader(this.mc))) {
            String line;
            int spamct = 0;
            int nonspamct = 0;
            while ((line = fec.readLine()) != null) {
                String[] ccb = line.split(",");
                if (ccb.length < 2) {
                    continue;
                }
                String lm = ccb[0];
                String dh = ccb[1];
                //System.out.println(ccb[1]);
                String[] rr = lm.split("s");
                int mcsnes = rr.length;

                String[] ds = lm.split(" ");
                int sr = 0;
                for (String wps : ds) {
                    sr += wps.length();
                }
                dkp = sr / ds.length;
                aver.add(dkp);

                //System.out.println("Average word length: " + dkp);
                //System.out.println("totalchar " + sr);
                // if ((dh.contains("1")) == true){
                //     spamct++;
                // }
                // if (dh.contains("0") == true){
                //     //System.out.println("nonspam");
                //     nonspamct++;
                // }
                // System.out.println("Non-spam count: " + nonspamct);
                // System.out.println("Spam count: " + spamct);
                // System.out.print("Spam count: " + spamct);
                // System.out.print("Non-spam count: " + nonspamct);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return aver;
    }
}
