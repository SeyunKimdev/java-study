package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTask2 {
   public static void main(String[] args) {
//      10~1���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(0, 9).forEach(data -> datas.add(10 - data));
//      System.out.println(datas);
      
//      1~10���� ArrayList�� ��� ���
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF�� �� ���ں��� ���
//      "ABCDEF".chars().forEach(c -> System.out.print((char)c));
//      IntStream.rangeClosed('A', 'F').forEach(c -> System.out.print((char)c));
      
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);
      
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
      
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
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
      
//   	1~100���� �� Ȧ���� ArrayList�� ��� ���
      	ArrayList<Integer> data1 = new ArrayList<Integer>();
      	IntStream.rangeClosed(1, 100).filter(v -> v % 2 == 1).forEach(data1::add);
      	System.out.println(data1);
      
      
//     	Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ��� 	
      	ArrayList<String> data2 = new ArrayList<String>();
      	data2.add("Apple");
      	data2.add("banana");
      	data2.add("Melon");
      	data2.stream().filter(v -> v.charAt(0) <= 91 && v.charAt(0) >= 65).forEach(System.out::println);
      	
//      �ѱ��� ������ ����
//      	ArrayList<String> data3 = new ArrayList<String>();
      	String hangle = "�����̻�����ĥ�ȱ�";
      	String input = "�����ϻ��";
      	IntStream.range(0, input.length()).map(i -> hangle.indexOf(input.charAt(i))).forEach(System.out::print);
      	System.out.println();
      	
      	
//      ������ �ѱ۷� ����
      	String input2 = "8431";
      	IntStream.range(0, input2.length()).map(i -> hangle.charAt((input2.charAt(i))-48)).forEach(v -> System.out.print((char)v));
   }
}