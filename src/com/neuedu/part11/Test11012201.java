package com.neuedu.part11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.security.auth.login.FailedLoginException;

/**
 * 文件与流
 * java.io包
 * 1.文件
 * File类 提供了一个指定文件全路径的构造方法，用来创建对应文件引用，用来操作文件内容
 * new File(String pathname) 全路径
 * new File(URI url) 文件url
 * new File(String parent,String child) 根据路径的关系定义
 * createNewFile()创建文件
 * exists()判断文件是否存在
 * delete()删除文件
 * mkdirs()创建文件夹
 * \ 反斜杠和 / 正斜杠的区别？
 * \ windows系统的文件路径
 * / linux系统的文件路径
 * 
 * 不同系统的斜杠适配问题
 * 
 * 流
 * 根据传输方向的不同 分为：输入流，输出流
 * 根据传输类型的不同 分为：字符流，字节流
 * 根据传输功能的不同 分为：节点流，处理流
 * 
 * 类型→功能→方向
 * 
 * 字节流
 *     节点流
 *         输入流 FileInputStream in  available()获取文件的大小
 *         read()一次读一个字节，没有东西可读返回-1
 *         read(byte[])一次读多个字节
 *         read(byte[in.available()])一次读全部内容
 *         输出流 FileOutputStream
 *     处理流
 *         输入流
 *         输出流
 * 字节流
 *     节点流
 *         输入流 
 *         输出流
 *     处理流
 *         输入流
 *         输出流
 *         
 * 对象序列化
 *      objectInputStream
 *      objectOutputStream
 * 
 *
 */

public class Test11012201 {

	public static void main(String[] args) {
		
	}
}