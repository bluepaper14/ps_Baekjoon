#include <iostream>
#include <cmath> // 거듭제곱 pow 사용

using namespace std;

int main() {
    /*
    쿼터 0.25
    다임 0.10
    니켈 0.05
    페니 0.01
    */
    int n;
    cin >> n;

    int cent;

    for (int i = 0; i < n; i++) {
        cin >> cent; //달러 입력(124$ -> 1.24)

        int quarter = cent / 25;  // 25센트로 나눈 몫
        int quarter_s = cent % 25; // 나머지 센트(0.24)

        int Dime = quarter_s / 10;  // 10센트로 나눈 몫
        int Dime_s = quarter_s % 10; // 나머지 센트(0.04)

        int Nickel = Dime_s / 5;    // 5센트로 나눈 몫
        int Nickel_s = Dime_s % 5;  // 페니 나머지 1센트 이하

        // 결과 출력
        cout << quarter << " " << Dime << " " << Nickel << " " << Nickel_s << endl;
    }

    return 0;
}
