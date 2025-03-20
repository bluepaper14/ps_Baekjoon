#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    string name;
    cin >> name;

    // 무지개 대소문자 배열
    string uppercase = "ROYGBIV";
    string lowercase = "roygbiv";

    bool hasUpper[7] = { false }; // 대문자 존재 여부
    bool hasLower[7] = { false }; // 소문자 존재 여부

    // 입력된 문자열에서 각 문자가 있는지 확인
    for (char c : name) {
        for (int i = 0; i < 7; i++) {
            if (c == uppercase[i]) hasUpper[i] = true;
            if (c == lowercase[i]) hasLower[i] = true;
        }
    }

    // 모든 문자가 있는지 확인
    bool isUpper = true, isLower = true;
    for (int i = 0; i < 7; i++) {
        if (!hasUpper[i]) isUpper = false;
        if (!hasLower[i]) isLower = false;
    }

    // 출력
    if (isUpper && isLower) {
        cout << "YeS";
    }
    else if (isUpper) {
        cout << "YES";
    }
    else if (isLower) {
        cout << "yes";
    }
    else {
        cout << "NO!";
    }

    return 0;
}
