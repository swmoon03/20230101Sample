public class Practice20230102 {
	
	public static void main(String[] arg) {
		
		Addition oper = new Addition();
		
		Value first = new Value();
		Value second = new Value();
		Value carry = new Value();
		Value result = new Value();
		
		int print =0;
		int extract =1;
		
		first.value =203;
		second.value =1298; 				//덧셈연산할 두 숫자 입력 (각 1000 이하)
		
		first.Transform();
		second.Transform(); 					//정수 -> 이진수 변환
		
		for(int i=0; i<11; i++) {
			
			oper.first = first.sequence[i]; 
			oper.second = second.sequence[i]; 			//할당
			
			if (carry.sequence[i] == false) {			//연산
				if (i <10) {
					carry.sequence[i+1] = oper.AND();
				}
				result.sequence[i] = oper.XOR();
				}
			else {
				if (i <10) {
					carry.sequence[i+1] = oper.OR();
				}
				result.sequence[i] = !oper.XOR();
				}
			}
		
		for(int o=0; o<11; o++) {						//출력
			System.out.print(" " + carry.sequence[o]);
		}
		System.out.println("");
		for(int o=0; o<11; o++) {
			System.out.print(" " + first.sequence[o]);
		}
		System.out.println("");
		for(int o=0; o<11; o++) {
			System.out.print(" " + second.sequence[o]);
		}
		System.out.println("");
		for(int o=0; o<11; o++) {
			System.out.print(" " + result.sequence[o]);
		}
		
		for(int m=0; m<11; m++) {
			if (result.sequence[m] == true) {
				print = print + extract;
			}
			extract = extract * 2;
		}
		System.out.println(" ");
		System.out.println(print);
		
		}
	public static class Value {
		
		int value;
		private int binary;
		private int slot;
		
		boolean sequence[] = {false,false,false,false,false,false,false,false,false,false,false};
		
		void Transform() {
			
			slot = 0;
			
			while (value > 0) {
				
				binary = value % 2;
				value = value >> 1; 			//이진수 추출
				
				if (binary == 1) {
					sequence[slot] = true;
				}
				else {
					sequence[slot] = false;
				}
				
				slot++;
				
			}
		}
	}
	public static class Addition {				//논리연산
		
		boolean first;
		boolean second;
		
		private boolean OR;
		private boolean AND;
		
		boolean XOR() {
			OR = first | second;
			AND = first & second;
			return AND = OR & !AND;
		}
		
		boolean AND() {
			return first & second;
		}
		
		boolean OR( ) {
			return first | second;
		}
	}
}
