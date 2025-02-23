#include <iostream>
#include <cmath> // 거듭제곱 pow 사용

using namespace std;

int main() {
    while (1) {
        double a, b, c;
        cin >> a;
        cin >> b;
        cin >> c;

        if (a == 0 && b == 0 && c == 0) {
            break;  // 모든 값이 0이면 종료
        }

        double max = a;
        double min1 = b;
        double min2 = c;

        if (a > b && a > c) {
            max = a; // 가장 큰 수는 a
            min1 = b;
            min2 = c;
        }

        if (b > a && b > c) {
            max = b;
            min1 = a;
            min2 = c;
        }

        if (c > a && c > b) {
            max = c;
            min1 = a;
            min2 = b;
        }

        if (pow(max, 2) == pow(min1, 2) + pow(min2, 2)) {
            cout << "right" << endl;
        }
        else {
            cout << "wrong" << endl;
        }
    }
    return 0;
}

