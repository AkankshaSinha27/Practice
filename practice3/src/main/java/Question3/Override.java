package Question3;

public class Override {

	int sub(int a, int b) {
		return a - b;

	}

	class first extends Override {

		int sub(int a, int b) {

			return a * 2 - b;
		}

		class Second extends Override {

			int sub(int a, int b) {

				return a * 4 - b;
			}
		}

		public void main(String args[]) {
			first obj = new first();
			Second ob = new Second();

			System.out.println(obj.sub(9, 7));
			System.out.println(ob.sub(8, 9));
		}
	}
}
