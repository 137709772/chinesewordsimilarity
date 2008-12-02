/*
 * Copyright (C) 2008 SKLSDE(State Key Laboratory of Software Development and Environment, Beihang University)., All Rights Reserved.
 */
package edu.buaa.sklsde.wordsimilarity;

import edu.buaa.sklsde.wordsimilarity.WordSimilarity;
import junit.framework.TestCase;


/**
 * DOCUMENT ME!
 *
 * @author Yingqiang Wu
 * @version 1.0
 */
public class WordSimilarityTests extends TestCase {
    /**
     * test the method {@link WordSimilarity#disPrimitive(String, String)}.
     */
    public void test_disPrimitive() {
        int dis = WordSimilarity.disPrimitive("����", "����");
        System.out.println("���� and ���� dis : " + dis);
    }

    /**
     * DOCUMENT ME!
     */
    public void test_simPrimitive() {
        double simP = WordSimilarity.simPrimitive("����", "����");
        System.out.println("���� and ���� sim : " + simP);
    }

    /**
     * DOCUMENT ME!
     */
    public void test_simWord() {
        String word1 = "Ƣ��";
        String word2 = "Ƣ��";
        double sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
         word1 = "���";
         word2 = "��Ƣ��";
         sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
        word1 = "����";
        word2 = "����";
        sim = WordSimilarity.simWord(word2, word1);
       System.out.println(word1 + " " + word2 + " sim = " + sim);
    }
    public void test_simWordCilin(){
        String word1 = "��̥";
        String word2 = "����";
        double sim1 = WordSimilarity.simWordCiLin(word1, word2);
        double sim2 = WordSimilarity.simWordHowNet(word1, word2);
        System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
        System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
        //==================
         word1 = "��̸";
         word2 = "����";
         sim1 = WordSimilarity.simWordCiLin(word1, word2);
         sim2 = WordSimilarity.simWordHowNet(word1, word2);
        System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
        System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
        word1 = "����";
        word2 = "����";
        sim1 = WordSimilarity.simWordCiLin(word1, word2);
        sim2 = WordSimilarity.simWordHowNet(word1, word2);
       System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
       System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
       word1 = "ʧ��";
       word2 = "ʧԼ";
       sim1 = WordSimilarity.simWordCiLin(word1, word2);
       sim2 = WordSimilarity.simWordHowNet(word1, word2);
      System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
      System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
      word1 = "����";
      word2 = "çײ";
      sim1 = WordSimilarity.simWordCiLin(word1, word2);
      sim2 = WordSimilarity.simWordHowNet(word1, word2);
     System.out.println(word1 + " " + word2 + " sim1 = " + sim1);
     System.out.println(word1 + " " + word2 + " sim2 = " + sim2);
    }
    /**
     * DOCUMENT ME!
     */
    public void test_simWord_1() {
        String word1 = "��";
        String word2 = "��";
        double sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
         word1 = "��";
         word2 = "ϲ��";
         sim = WordSimilarity.simWord(word2, word1);
        System.out.println(word1 + " " + word2 + " sim = " + sim);
        word1 = "��";
        word2 = "��";
        sim = WordSimilarity.simWord(word2, word1);
       System.out.println(word1 + " " + word2 + " sim = " + sim);
    }
}
