#include <iostream>
#include <cstdlib> //절댓값 abs()

using namespace std;

int main() {

    while (1) {
        int a, b, c, d;

        cin >> a >> b >> c >> d;
        
        if (a == 0 && b == 0 && c == 0 && d == 0) {
            break;
            return 0;
        }
        
        int min = b - c;
        int max = d - a;

        cout << abs(min) << " " << abs(max) << endl;
    }

    return 0;
}
