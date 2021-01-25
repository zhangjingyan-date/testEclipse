package com.neuedu.part06;

import java.util.Random;
import java.util.Scanner;

public class Game {

    //1һ���������飨�ַ������飩
    //2�����ȡһ�����ʣ����һ���±�(�±�ֵ��0���������鳤��֮��)
    //3�õ����ʳ���len������һ������Ϊlen���ַ�����word������Ԫ�س�ֵ��Ϊ-
    //4ѭ�����²��裨�˳�ѭ��������Ϊ���û�����´�Ĵ���<=0��word�ַ��������в��ٰ���-�ַ���
    //5���word����Ļ
    //6��ȡ�ͻ����룬�ж����ѡ���ĵ������Ƿ�����û�������ַ�
    //7���������õ��ַ��ڵ����г��ֵ�λ�ã�������λ�õ��ַ��滻���û�������ַ������ص�4
    //8�����������û����Բ´�Ĵ�����һ�����ص�4
    //9.�ó������ۣ��ж��û�����´�Ĵ����Ƿ����0���������0������û�ʤ������������û�ʧ��


    public static boolean isContaisChar(char[] array, char c)
    {
        boolean bFind = false;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == c)
            {
                bFind = true;
                break;
            }
        }
        return bFind;
    }

    public static void main(String[] args) {
	// write your code here
        //1����һ���������飨�ַ������飩
        String[] words = {"picture", "chinese", "school", "question", "include", "simple", "difficult", "understand", "necessary", "support" };
        //2�����ȡһ�����ʣ����һ���±�(�±�ֵ��0���������鳤��֮��)
        Random random = new Random();
        int nRandomIndex = random.nextInt(words.length);
        String strWordChoose = words[nRandomIndex];
        //3�õ����ʳ���len������һ������Ϊlen���ַ�����word������Ԫ�س�ֵ��Ϊ-
        int nLen = strWordChoose.length();
        char[] wordShow = new char[nLen];
        for(int i = 0 ; i < nLen; i++)
        {
            wordShow[i] = '-';
        }
        //4ѭ�����²��裨�˳�ѭ��������Ϊ���û�����´�Ĵ���<=0��word�ַ��������в��ٰ���-�ַ���
        int nGuessTimes = 3;

        while(nGuessTimes > 0 && isContaisChar(wordShow,'-'))
        {
            //5���word����Ļ
            System.out.println(wordShow);
            //6��ȡ�ͻ����룬�ж����ѡ���ĵ������Ƿ�����û�������ַ�
            Scanner sc = new Scanner(System.in);
            String c = sc.nextLine();
            //7���������õ��ַ��ڵ����г��ֵ�λ�ã�������λ�õ��ַ��滻���û�������ַ������ص�4
            boolean bFind = false;
            for(int i = 0; i < wordShow.length; i++)
            {
                if(strWordChoose.charAt(i) == c.toCharArray()[0])
                {
                    wordShow[i] = c.toCharArray()[0];
                    bFind = true;
                }
            }
            //8�����������û����Բ´�Ĵ�����һ�����ص�4

            if(!bFind)
            {
                nGuessTimes--;
                System.out.println("������"+nGuessTimes+"�λ���");
            }
        }

        //9.�ó������ۣ��ж��û�����´�Ĵ����Ƿ����0���������0������û�ʤ������������û�ʧ��
        if(nGuessTimes > 0)
        {
            System.out.println("you win");
        }
        else
        {
            System.out.println("you lose");
        }
    }
}

