package Example;

import java.io.*;


public class Weight {
	public static void main(String[] args) throws IOException {
		File fl = new File("D:\\Sample.txt");
		FileReader fr2 = new FileReader(fl);
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		int b = 0;
		String str;
		while ((fr2.read()) != -1) {//抓字元
			b=b+1;
		}
		while ((str = br.readLine()) != null) {// 抓行列
			if(str.length()>0) {
			i++;
			}
		}	
		System.out.println("----------");
		System.out.println("一共有幾" + fl.length() + "位元");//算位元
		System.out.println("----------");
		System.out.println("一共有幾" + b + "字元");
		System.out.println("----------");
		System.out.println("一共有幾" + i + "列");
		br.close();
		fr.close();
	}
}
