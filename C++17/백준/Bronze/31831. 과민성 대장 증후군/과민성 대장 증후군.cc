#include <iostream>
using namespace std;

int main() {
    int T; // 복통 일수
    int M; // 스트레스 양 기준

    cin >> T >> M;

    int* arr = new int[T]; // 동적 배열 할당
    int result = 0;
    int cnt = 0;

    for (int i = 0; i < T; i++) {
        cin >> arr[i];

        result += arr[i];
        if (result < 0) {
            result = 0;
        }
        if (result >= M) {
            cnt++;
        }
    }

    cout << cnt << endl;

    delete[] arr; // 동적 배열 해제 (메모리 누수 방지)
    return 0;
}
