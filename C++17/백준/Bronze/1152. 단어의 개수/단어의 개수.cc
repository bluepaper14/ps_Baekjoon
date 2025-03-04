#include <iostream>
#include <sstream>
#include <string>

using namespace std;

int main() {
    string str;
    getline(cin, str);  // 한 줄 입력 받기

    stringstream ss(str);  // 문자열 스트림 사용
    string word;
    int cnt = 0;

    // 공백을 기준으로 단어를 하나씩 분리하면서 단어 개수 카운트
    while (ss >> word) {
        cnt++;
    }

    cout << cnt;  // 단어 개수 출력

    return 0;
}
