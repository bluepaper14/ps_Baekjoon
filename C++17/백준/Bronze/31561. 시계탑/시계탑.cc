#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int M;
    cin >> M;
    double x = 0;

    if (M < 30) { //분침이 30분 이전일때, -> 15분
        x = M * 0.5;
    }
    else {
        x = 15 + ((M - 30)  * 1.5);
    }
    cout << fixed << setprecision(1) << x;


    return 0;
}
