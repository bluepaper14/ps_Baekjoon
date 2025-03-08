#include <iostream>
using namespace std;

int main()
{
	int T;
	int x;
	int max = 0;
	int min = 100;
	cin >> T;

	for (int i = 0; i < T; i++) {
		for (int j = 0; j < 7; j++) {
			cin >> x;
			if (x % 2 == 0) { //x가 짝수라면
				max = max + x;
				if (x < min) {
					min = x;
				}
			}
		}
		cout << max << " " << min << endl;
		max = 0;
		min = 100;
	}
}
