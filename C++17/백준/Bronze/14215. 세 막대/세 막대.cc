#include <iostream>
using namespace std;

int main() {
    int a;
    int b;
    int c;

    cin >> a;
    cin >> b;
    cin >> c;

    int x = max(a, max(b, c)); //최대값 찾기 x로 설정
    int result = a + b + c; //전체 변의 길이
    int last = result - x; //나머지 두변의 합

    while (1) {
        if (last <= x) { //만약, 두변의 길이 보다 x의 값이 같거나 크다면,
            x--; //x의 값을 하나 줄이자.
        }
        else {
            break;
        }
    }

    int y = last + x;

    cout << y;

    return 0;
}
