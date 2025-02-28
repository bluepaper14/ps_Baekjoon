#include <iostream>
using namespace std;

int main() {
	int x;
	int arr;
	int result = 0;
	int a;

	cin >> x;
	for (int i = 0; i < 9; i++) {
		cin >> arr;
		result += arr;
	}
	a = x - result;

	cout << a;
}