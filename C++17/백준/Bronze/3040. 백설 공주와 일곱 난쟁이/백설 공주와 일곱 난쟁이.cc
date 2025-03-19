#include <iostream>
using namespace std;

int main() {
    int x[9] = { 0 };
    int total = 0; // 9명의 총합

    for (int i = 0; i < 9; i++) {
        cin >> x[i];
        total += x[i];
    }

    // 두 명을 제외했을 때 총합이 100이 되는 경우 찾기

    for (int i = 0; i < 8; i++) { // i는 0~7까지 (마지막 한 명 제외)
        for (int j = i + 1; j < 9; j++) { // j는 i 이후부터 탐색 (중복 방지)
            if (total - (x[i] + x[j]) == 100) {
                // 두 명 제외하고 출력
                for (int k = 0; k < 9; k++) {
                    if (k == i || k == j) continue; // 제외된 두 명 건너뛰기
                    cout << x[k] << endl;
                }
                return 0; // 정답을 찾으면 종료
            }
        }
    }

    return 0;
}
