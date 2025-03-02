#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;

	int a;
	int b;
	int x;
	int result = 0;

	for (int i = 0; i < n; i++) {
		cin >> a >> b;
		x = b % a; //52 % 24;

		result += x;
	}
	cout << result;

	return 0;

}
