#include <iostream>
using namespace std;

int main() {
    int N;  // 피갤컵의 번째 수

    cin >> N;

    int year = 2024;  // 시작 연도
    int month = 8;    // 시작 월

    // N번째 피갤컵이 열릴 때까지 7개월씩 더해준다.
    month += (N - 1) * 7;

    // 월이 12 이상이면 연도 계산
    year += (month - 1) / 12;  // 연도 계산
    month = (month - 1) % 12 + 1; // 월을 1~12로 맞춘다.

    cout << year << " " << month;
    return 0;
}
