#include <iostream>
using namespace std;

int main() {
	int n;
	int x = 2; //초기값
	int result = 0;

	cin >> n;

	for (int i = 0; i < n; i++) {
		x = x + (x - 1);
	
	}
	cout << x * x;

	return 0;

}
