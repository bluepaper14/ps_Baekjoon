#include <iostream>
using namespace std;

int main() {
    int arr[9][9]; // 9x9 배열
    int max = -1e9; // 매우 작은 값으로 초기화
    int x = 0, y = 0;

    // 입력 받기
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            cin >> arr[i][j];
            if (arr[i][j] > max) {
                max = arr[i][j]; 
                x = i + 1;
                y = j + 1;
            }
        }
    }

    // 최댓값 및 위치 출력
    cout << max << endl;
    cout << x << ' ' << y << endl;

    return 0;
}
