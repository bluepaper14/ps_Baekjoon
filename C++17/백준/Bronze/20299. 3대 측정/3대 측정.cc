#include <iostream>
using namespace std;

int main() {
    int N; // 팀의 인원수
    int K; // 팀의 레이팅
    int L; // 개인 레이팅

    int cnt = 0;

    cin >> N >> K >> L;

    int size = N * 3; // 배열 크기 설정
    int* arr = new int[size](); // 동적 할당 및 0 초기화
    int* result = new int[size](); // 동적 할당 및 0 초기화

    // 데이터 입력
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < 3; j++) {
            cin >> arr[i * 3 + j];
        }
    }

    // 조건 검사
    for (int x = 0; x < size; x += 3) {
        if (arr[x] >= L && arr[x + 1] >= L && arr[x + 2] >= L) {
            if (arr[x] + arr[x + 1] + arr[x + 2] >= K) {
                result[cnt * 3] = arr[x];
                result[cnt * 3 + 1] = arr[x + 1];
                result[cnt * 3 + 2] = arr[x + 2];
                cnt++;
            }
        }
    }

    // 출력
    cout << cnt << endl;
    for (int y = 0; y < cnt * 3; y++) {
        cout << result[y] << " ";
    }

    // 동적 메모리 해제
    delete[] arr;
    delete[] result;

    return 0;
}
