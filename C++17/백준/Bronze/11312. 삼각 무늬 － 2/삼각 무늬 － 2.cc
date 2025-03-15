#include <iostream>
#include <cmath>
using namespace std;

int main() {
    long long T;
    cin >> T;
    long long x;

    long long a, b;

    for (int i = 0; i < T; i++) {
        cin >> a >> b;
        x = (a / b) * (a / b);
        cout << x << endl;
    }

    

    return 0;
}
