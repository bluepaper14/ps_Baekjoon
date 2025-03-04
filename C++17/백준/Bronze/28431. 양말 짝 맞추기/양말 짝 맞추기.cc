#include <iostream>
using namespace std;

int main() {

	int arr[10] = { 0 };
	int a;
	int cnt = 0;

	for (int i = 0; i < 5; i++) {
		cin >> a;
		arr[a]++;
	}

	for (int j = 0; j < 10; j++) {
		if (arr[j] % 2 == 1) {
			cout << j;
		}
	}


	return 0;
}