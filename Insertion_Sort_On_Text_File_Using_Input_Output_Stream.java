package src;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

        public class Insertion_Sort_On_Text_File_Using_Input_Output_Stream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis= new FileInputStream("I:\\unique.txt");
        File f = new File("I\\Unique_Sorted.txt");
        ArrayList<Integer> s = new ArrayList<Integer>();
        String[] stringarr = (String[]) s.toArray(new String[s.size()]);
        insertionSort(stringarr);
        for (String words: stringarr) {
            System.out.println(words);
        }
    }


            public static void insertionSort(String[] s){
                for(int i=1;i<s.length;i++){
                    String key = s[i];
                    int j = i-1;
                    while(j>=0 && doesKeyStringOccursEarlyInDict(s[j], key)){
                        s[j+1] = s[j];
                        j--;
                    }
                    s[j+1]=key;
                }
            }

            public static boolean doesKeyStringOccursEarlyInDict(String string, String key) {
                int i = Math.min(string.length(), key.length());
                int j = 0;
                while (j < i) {
                    if (string.charAt(j) > key.charAt(j)) {
                        return true;
                    }
                    j++;
                }
                return false;
            }
        }
