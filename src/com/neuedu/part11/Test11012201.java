package com.neuedu.part11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.security.auth.login.FailedLoginException;

/**
 * �ļ�����
 * java.io��
 * 1.�ļ�
 * File�� �ṩ��һ��ָ���ļ�ȫ·���Ĺ��췽��������������Ӧ�ļ����ã����������ļ�����
 * new File(String pathname) ȫ·��
 * new File(URI url) �ļ�url
 * new File(String parent,String child) ����·���Ĺ�ϵ����
 * createNewFile()�����ļ�
 * exists()�ж��ļ��Ƿ����
 * delete()ɾ���ļ�
 * mkdirs()�����ļ���
 * \ ��б�ܺ� / ��б�ܵ�����
 * \ windowsϵͳ���ļ�·��
 * / linuxϵͳ���ļ�·��
 * 
 * ��ͬϵͳ��б����������
 * 
 * ��
 * ���ݴ��䷽��Ĳ�ͬ ��Ϊ���������������
 * ���ݴ������͵Ĳ�ͬ ��Ϊ���ַ������ֽ���
 * ���ݴ��书�ܵĲ�ͬ ��Ϊ���ڵ�����������
 * 
 * ���͡����ܡ�����
 * 
 * �ֽ���
 *     �ڵ���
 *         ������ FileInputStream in  available()��ȡ�ļ��Ĵ�С
 *         read()һ�ζ�һ���ֽڣ�û�ж����ɶ�����-1
 *         read(byte[])һ�ζ�����ֽ�
 *         read(byte[in.available()])һ�ζ�ȫ������
 *         ����� FileOutputStream
 *     ������
 *         ������
 *         �����
 * �ֽ���
 *     �ڵ���
 *         ������ 
 *         �����
 *     ������
 *         ������
 *         �����
 *         
 * �������л�
 *      objectInputStream
 *      objectOutputStream
 * 
 *
 */

public class Test11012201 {

	public static void main(String[] args) {
		
	}
}