#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n; // 데이터 세트 개수
    cin.ignore(); // 개행 문자 제거

    while (n--) {
        string s;
        getline(cin, s); // 문자열 입력
        string result = "";

        result += s[0]; // 첫 문자 무조건 추가
        for (int i = 1; i < s.length(); ++i) {
            if (s[i] != s[i - 1]) { // 이전 문자와 다르면 추가
                result += s[i];
            }
        }

        cout << result << '\n';
    }

    return 0;
}
