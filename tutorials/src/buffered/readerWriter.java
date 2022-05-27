package buffered;

import java.util.*;
import java.io.*;

public class readerWriter {

	public static void main(String[] args)throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
/*
		String input = bf.readLine();
		int i = Integer.parseInt(bf.readLine());
*/
		String s = bf.readLine();

//		StringTokenizer st = new StringTokenizer(s);
/*		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
*/
//		System.out.println(input + "\n" + i);
		String array[] = s.split(" ");
//		System.out.println(s + "\n" + array);
		for(int i = 0; i < array.length; i++) {
			bw.write(array[i]);
		}
		bw.flush();
		bw.close();
	}

}
