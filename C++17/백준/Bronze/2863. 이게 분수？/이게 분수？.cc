#include <iostream>
using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b;
    cin >> c >> d;

    // 4가지 회전 경우의 값을 계산 (정수 나눗셈 방지 위해 double 변환)
    double arr[4];
    arr[0] = (double)a / c + (double)b / d;
    arr[1] = (double)c / d + (double)a / b;
    arr[2] = (double)d / b + (double)c / a;
    arr[3] = (double)b / a + (double)d / c;

    // 최댓값 찾기
    int maxIndex = 0;
    double maxValue = arr[0];

    for (int i = 1; i < 4; i++) {
        if (arr[i] > maxValue) {  // 가장 큰 값을 찾는다.
            maxValue = arr[i];
            maxIndex = i;
        }
    }

    cout << maxIndex << endl;  // 최댓값이 있는 인덱스 출력
    return 0;
}
