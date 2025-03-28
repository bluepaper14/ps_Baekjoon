#include <iostream>
using namespace std;

int main() {
    int N;
    int a_set;
    int a_price;

    int b_set;
    int b_price;

    int x = 0;
    int y = 0;

    cin >> N >> a_set >> a_price >> b_set >> b_price;

    if (N % a_set == 0) {
        x = N / a_set;
    }
    else {
        x = (N / a_set) + 1;
    }

    if (N % b_set == 0) {
        y = N / b_set;
    }
    else {
        y = (N / b_set) + 1;
    }

    int result_a = x * a_price;
    int result_b = y * b_price;

    if (result_a > result_b) {
        cout << result_b;
    }
    else {
        cout << result_a;
    }

    return 0;
}
