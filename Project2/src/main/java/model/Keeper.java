package main.java.model;

import java.util.*;

import main.java.view.View;


/**
 * Created by Dyvak on 03.12.2016.
 */
public class Keeper {
    private View view;
    private static List<String> words = new ArrayList<>();
    private static List<String> code = new ArrayList<>();

    public Keeper(){
        view = new View();
    }

    public void addWords(String word) {
        words.add(word);
    }

    public void addCode(String word) {
        code.add(word);
    }

    public List<String> getWords() {
        return words;
    }

    public List<String> getCode() {
        return code;
    }

    public void outputSortedWords(){

        view.printMsg(view.SORTING);
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        System.out.println(words);
    }

    public void repeatWords() {
        view.printMsg(view.REPEATS);
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            Integer val;
            if ((val = map.get(s)) == null) {
                map.put(s, 1);
            } else {
                map.put(s, val + 1);
            }
        }
        //TreeMap<Integer, List<Integer>>
        System.out.println(map);
    }

    public void deleteTegs() {
        view.printMsg(view.TAGS_DEL);
        for (int i = 0; i<words.size();i++){

            for (String tag : Words.TAGS.getSymbols()) {
                String val = words.get(i);
                if (val.equals(tag)) {
                    words.remove(val);
                    i--;
                }
            }
        }
        System.out.println(words);
    }

    public void codeList() {
        view.printMsg(view.CODE);
        for (int i = 0; i<words.size();i++){
            for (String co : Words.RESERVED.getSymbols()) {
                String val = words.get(i);
                if (val.equals(co)) {
                    words.remove(val);
                    code.add(co);
                    i--;
                }
            }
        }
        System.out.println(code);
    }
}


