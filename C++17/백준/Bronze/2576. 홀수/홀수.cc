#include <iostream>
using namespace std;

int main() {
	int a;
	int result = 0;
	int min = 100;
	int cnt = 0;

	for (int i = 0; i < 7; i++) {
		cin >> a;
		if (a % 2 != 0) {
			result = result + a;
			if (a < min) {
				min = a;
			}
		}
		else {
			cnt++;
		}
	}
	if (cnt == 7) {
		cout << "-1";
	}
	else {
		cout << result << endl;
		cout << min;
	}
	return 0;

}
