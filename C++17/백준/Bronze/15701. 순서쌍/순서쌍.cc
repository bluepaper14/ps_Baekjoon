#include <iostream>
using namespace std;

int main() {

	long long N; cin >> N;
	long long i = 1;
	int ans = 0;


	while (i * i <= N) {
		if (N % i == 0) {
			if (i * i == N) ans++;
			else ans += 2;
		}
		i++;
	}

	cout << ans;
}