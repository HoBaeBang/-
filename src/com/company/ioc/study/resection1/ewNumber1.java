package com.company.ioc.study.resection1;

import java.io.*;
import java.util.*;

public class ewNumber1 {

    FileReader fr = new FileReader("input.txt");
    BufferedReader br = new BufferedReader(fr);

    int[] list = new int[100];	//한줄씩 읽은 정수를 저장하기 위해 정수형 배열 List를 선언

    int cnt = 0;
    String line = null;

		while((line = br.readLine())!=null) {		//파일 읽어오는 반복문
        System.out.println(line);
        int value = Integer.parseInt(line);	//문자열을 정수 값으로 변환
        list[cnt++] = value;
//		System.out.println(list);  //로그
    }

		System.out.println();
    int[] list2 = new int[cnt];
		for(int i=0;i<list.length;i++) {
        list2[i] = list[i];
    }
		Arrays.sort(list2);

    FileWriter fr1 = new FileWriter("D:\\학교관련\\3학년2학기\\웹플밍 김석동 실ㄹ행코드\\week01");
    BufferedWriter br1 = new BufferedWriter(fr1);

		for (int k = 0; k < list.length; k++) {
        String bb = Integer.toString(list[k]);
        br1.write((k+1) +" : " +bb);
        br1.newLine();
    }

    public ewNumber1() throws FileNotFoundException {
    }
}
