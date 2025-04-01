#include <iostream>
using namespace std;

int main() {
	long long x;
	long long a;

	long long top = 0;
	long long max = 0;

	cin >> x;
	for (int i = 0; i < x; i++) {
		cin >> a;
		if (a == 1) {
			top++;
		}
		if (a == 0) {
			top--;
		}

		max = max + top;
	}
	cout << max;

}