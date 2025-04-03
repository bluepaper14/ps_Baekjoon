#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int count[26] = { 0 };  // 알파벳 소문자 26개 빈도 배열 (초기값 0)
    string name;

    for (int i = 0; i < N; i++) {
        cin >> name;
        count[name[0] - 'a']++;  // 성의 첫 글자 개수 증가
    }

    bool found = false;
    for (int i = 0; i < 26; i++) {
        if (count[i] >= 5) {  // 5명 이상이면 출력
            cout << (char)(i + 'a');
            found = true;
        }
    }

    if (!found) cout << "PREDAJA";  // 5명 이상인 성이 없으면 "PREDAJA"
    return 0;
}
