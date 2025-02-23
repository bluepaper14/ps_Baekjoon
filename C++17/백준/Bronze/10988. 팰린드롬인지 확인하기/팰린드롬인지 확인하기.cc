#include <iostream>
using namespace std;

int main() {
    string word;
    cin >> word; // string 입력

    char arr[100];  // 한 글자씩 저장할 배열
    int len = word.length();

    for (int i = 0; i < len; i++) {
        arr[i] = word[len - 1 - i];  // 한 글자씩 저장
    }

    arr[len] = '\0'; // 문자열의 끝을 표시하는 널 문자 추가

    if (arr == word) {
        cout << "1" << endl;
    }
    else {
        cout << "0" << endl;
    }

    return 0;
}
