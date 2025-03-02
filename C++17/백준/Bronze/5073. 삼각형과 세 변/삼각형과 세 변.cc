#include <iostream>
using namespace std;

int main() {
	int a;
	int b;
	int c;

	while (1) {
		cin >> a >> b >> c;
		if (a == 0 && b == 0 && c == 0) {
			break;
		}

		int total = a + b + c;
		int x = max(a, max(b, c)); //가장 큰 변
		int re = total - x; //나머지 두변


		if (x < re) { //삼각형의 조건
			if (a == b && b == c && c == a) {
				cout << "Equilateral" << endl;
			}
			else if (a == b || b == c || a == c) {
				cout << "Isosceles" << endl;
			}
			else {
				cout << "Scalene" << endl;
			}
		}

		else{ //삼각형 조건 부합x
			cout << "Invalid" << endl;
		}
	}
	return 0;

}