#include <iostream>
using namespace std;

int main() {
    int cho[6], han[6];
    int cho_score = 0, han_score = 0;
    int values[] = {13, 7, 5, 3, 3, 2}; // 각 기물의 점수

    // 초나라 기물 입력
    for (int i = 0; i < 6; i++) {
        cin >> cho[i];
        cho_score += cho[i] * values[i];
    }

    // 한나라 기물 입력
    for (int i = 0; i < 6; i++) {
        cin >> han[i];
        han_score += han[i] * values[i];
    }

    han_score += 1.5; // 한나라는 초기 점수에 1.5 추가

    // 결과 출력
    if (cho_score > han_score) {
        cout << "cocjr0208" << endl;
    } else {
        cout << "ekwoo" << endl;
    }

    return 0;
}
