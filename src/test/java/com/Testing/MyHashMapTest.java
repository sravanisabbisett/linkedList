package com.Testing;

import linkedList.MyHashMap;
import linkedList.MyLinkedHaspMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void givenSentence_whenAddedToList_shouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2, frequency);

    }
    @Test
    public void givenSentenceWhenWords_AreAddedToListShouldReturnWordFrequency(){
        String sentence="Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into avoidable situations";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for (String word: words){
            Integer value = myHashMap.get(word);
            if(value==null) {
                value=1;
            }
            else {
                value=value+1;
            }
            myHashMap.add(word,value);
        }
        String result=myHashMap.searchAndRemoveNextElement("into");
        System.out.println(myHashMap);
        Assert.assertEquals("into",result);

    }

}
