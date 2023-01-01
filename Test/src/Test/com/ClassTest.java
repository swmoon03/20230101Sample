package Test.com;

public class ClassTest {

	public static void main(String[] args) {
		
		Test moon = new Test();
		moon.SetMath(98);
		moon.SetName("문상우");
		moon.SetLanguage(90);
		moon.TestPrint();
		
		Test jinuk = new Test();
		jinuk.SetMath(97);
		jinuk.SetLanguage(90);
		jinuk.SetName("김진욱");
		jinuk.TestPrint();

	}
	public static class Test {
		int Math;
		int Language;
		String Name;
		
		void SetMath (int Math) {
			this.Math = Math;
		}
		
		void SetLanguage (int Language) {
			this.Language = Language;
		}
		
		void SetName (String Name) {
			this.Name = Name;
		}
		
		int GetMath () {
			return Math;
		}
		
		int GetLanguage () {
			return Language;
		}
		
		String GetName () {
			return Name;
		}
		
		void TestPrint () {
			System.out.println("이름 : " + GetName());
			System.out.println("수학 점수 : " + GetMath());
			System.out.println("국어 점수 : " + GetLanguage());
		}
		
	}

}