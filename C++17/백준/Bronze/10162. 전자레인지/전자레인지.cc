#include <iostream>
using namespace std;

int main() {
	long long T;
	cin >> T;

	long long A = T / 300;
	long long a = T % 300;

	long long B = a / 60;
	long long b = a % 60;

	long long C = b / 10;
	long long c = b % 10;

	if (c != 0) {
		cout << "-1";
	}
	else {
		cout << A << " " << B << " " << C << endl;
	}

	return 0;
}
