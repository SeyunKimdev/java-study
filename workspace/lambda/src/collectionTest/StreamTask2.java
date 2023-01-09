package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTask2 {
   public static void main(String[] args) {
//      10~1까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(0, 9).forEach(data -> datas.add(10 - data));
//      System.out.println(datas);
      
//      1~10까지 ArrayList에 담고 출력
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF를 각 문자별로 출력
//      "ABCDEF".chars().forEach(c -> System.out.print((char)c));
//      IntStream.rangeClosed('A', 'F').forEach(c -> System.out.print((char)c));
      
//      1~100까지 중 홀수만 ArrayList에 담고 출력
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);
      
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
      
//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//      	System.out.println("ABC".toLowerCase());
      	ArrayList<String> data = new ArrayList<String>();
      	data.add("Black");
      	data.add("WHITE");
      	data.add("reD");
      	data.add("yeLLow");
      	data.add("PINk");
      	System.out.println(data);
//      	data.stream().map(v -> v.toLowerCase()).forEach(System.out::println);
      	data.stream().map(String::toLowerCase).forEach(System.out::println);
      
//   	1~100까지 중 홀수만 ArrayList에 담고 출력
      	ArrayList<Integer> data1 = new ArrayList<Integer>();
      	IntStream.rangeClosed(1, 100).filter(v -> v % 2 == 1).forEach(data1::add);
      	System.out.println(data1);
      
      
//     	Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력 	
      	ArrayList<String> data2 = new ArrayList<String>();
      	data2.add("Apple");
      	data2.add("banana");
      	data2.add("Melon");
      	data2.stream().filter(v -> v.charAt(0) <= 91 && v.charAt(0) >= 65).forEach(System.out::println);
      	
//      한글을 정수로 변경
//      	ArrayList<String> data3 = new ArrayList<String>();
      	String hangle = "공일이삼사오육칠팔구";
      	String input = "삼육일사오";
      	IntStream.range(0, input.length()).map(i -> hangle.indexOf(input.charAt(i))).forEach(System.out::print);
      	System.out.println();
      	
      	
//      정수를 한글로 변경
      	String input2 = "8431";
      	IntStream.range(0, input2.length()).map(i -> hangle.charAt((input2.charAt(i))-48)).forEach(v -> System.out.print((char)v));
   }
}