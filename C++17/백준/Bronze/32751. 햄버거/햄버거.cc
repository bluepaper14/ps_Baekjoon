#include <iostream>
using namespace std;

int main() {
    int N; // 햄버거의 재료 길이
    cin >> N;

    int A, B, C, D; // 빵, 패티, 양상추, 토마토의 개수
    cin >> A >> B >> C >> D;

    string S; // 햄버거 문자열
    cin >> S;

    // 1. 첫 번째와 마지막 재료가 빵이어야 한다.
    if (S[0] != 'a' || S[N - 1] != 'a') {
        cout << "No";
        return 0;
    }

    // 2. 인접한 재료가 같으면 안된다.
    for (int i = 1; i < N; i++) {
        if (S[i] == S[i - 1]) {
            cout << "No";
            return 0;
        }
    }

    // 3. 재료 개수가 주어진 개수를 초과하면 안된다.
    int countA = 0, countB = 0, countC = 0, countD = 0;

    for (char ch : S) {
        if (ch == 'a') countA++;
        else if (ch == 'b') countB++;
        else if (ch == 'c') countC++;
        else if (ch == 'd') countD++;
    }

    // 각 재료가 주어진 개수를 초과하는지 검사
    if (countA > A || countB > B || countC > C || countD > D) {
        cout << "No";
        return 0;
    }

    // 모든 조건을 만족하면 Yes
    cout << "Yes";
    return 0;
}
