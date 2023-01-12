package Practice;

import java.util.HashMap;
import java.util.ArrayList;

public class Central {
	
	public static void main(String[] args) {
		
		
		
	}
}

/*
String A = "Your Cerebral Cortex Has Been Atrophied";
System.out.println(A);

float pi = 3.1415926535897932f;
System.out.printf("%.7f\n", pi);

StringBuffer B = new StringBuffer();
B.append(true);
B.append(1);
B.append("ROUGH");
B.insert(3, false);
System.out.println(B.substring(1, 14));
*/
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

String[] array = new String[3];
array[0] = "story";
System.out.println(array[1] + array[0]);
System.out.println(array.length);

ArrayList numbers = new ArrayList();
numbers.add(3);
numbers.add(0);
numbers.add(5);
numbers.add(9);
numbers.add(4);
numbers.add(7);
numbers.remove(2);
System.out.println(numbers);
boolean Compare;
System.out.println(Compare = numbers.get(0) == numbers.get(1));
// System.out.println(numbers.size());

ArrayList test = new ArrayList(Arrays.asList(array));
System.out.println(test);

String Synthesis = String.join(" + ", array);
System.out.println(Synthesis);

numbers.sort(Comparator.naturalOrder());
System.out.println(numbers);
*/
/*
HashMap<String, Integer> score = new HashMap<>();
score.put("국어", 93);
score.put("수학", 96);
score.put("영어", 97);
score.put("한국사", 45);
score.put("화학I", 50);
score.put("생명과학II", 44);
System.out.println(score.getOrDefault("화학I", 0) + " " + score.get("영어"));
ArrayList<String> subjects = new ArrayList<>(score.keySet());
int l = score.size();

ArrayList<Integer> sum = new ArrayList<>();
while(l > 0) {
	sum.add(score.get(String.format("%s", subjects.get(l-1))));
	l--;
}
System.out.println(sum);

l = score.size();
int total = 0;
while(l > 0) {
	total = total + score.get(String.format("%s", subjects.get(l-1)));
	l--;
}
System.out.println(total);
*/