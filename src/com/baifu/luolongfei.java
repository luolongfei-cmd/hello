package com.baifu;

public class luolongfei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = '飞';
		System.out.println(Integer.toHexString((int)a));
		
		String n = "0xff";
		System.out.println(n);
		
		String name = "HI!龙飞！"; 
		char[] name_1 = new char[name.length()];
		//将name的值存入到数组中
		name.getChars(0, name.length(), name_1, 0);
		String sum_name = ""; 
		for(char c : name_1) {
			String name1 = Integer.toHexString(c);
			if(name1.length() == 2) {
				name1 = "00" + name1;
			}
			System.out.println(name1);
			//将打印出的十六进制数组成一个字符串
			sum_name += name1;
		}
		System.out.println(sum_name);
		
		char[] temps = new char[4];
		int count = 1;
		for(char c : sum_name.toCharArray()) {
			if(count % 4 == 0) {
				temps[3] = c;
				String temp_s = new String(temps);
				System.out.print((char)Integer.parseInt(temp_s, 16));
			}
			else {
				temps[count%4-1] = c;
			}
			count++;
			//System.out.println(c);
		}
		
	}

}
