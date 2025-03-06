#include <iostream>
using namespace std;

int main() {
	char T;
	int wnt = 0;
	int bnt = 0;
	int gnt = 0;

	for (int i = 0; i < 15; i++) {
		for (int j = 0; j < 15; j++) {
			cin >> T;
			if (T == 'w') {
				wnt++;
			}
			if (T == 'b') {
				bnt++;
			}
			if (T == 'g') {
				gnt++;
			}
		}
	}

	int result = max(wnt, max(bnt, gnt));

	if (result == wnt) {
		cout << "chunbae";
	}

	if (result == bnt) {
		cout << "nabi";
	}

	if (result == gnt) {
		cout << "yeongcheol";
	}
	return 0;
}


// w -> 춘배 b -> 나비 g -> 영철
