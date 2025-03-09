#include <iostream>
using namespace std;

int main() {
    int N;
    string name;
    int x;

    cin >> N; //전체 층수

    cin >> name; //동물 이름

    cin >> x; //현재 층수

    if (name == "annyong") { //큰 동물일때, => 홀수
        if (x % 2 != 0) { //현재 층이 짝수라 아니라면
            cout << x; //바로 출력
        }
        else { //만약 홀수라면? 바로 출력
            if (x + 1 > N) { //만약 +1을 할때, 현재 층수를 벗어나게 되면 -1
                cout << x - 1;
            }
            else {
                cout << x + 1;
            }
        }
    }
    if (name == "induck") { //작은 동물일때, => 짝수
        if (x % 2 == 0) {  //현재 층이 짝수라면
            cout << x; //바로 출력
        }
        else { //x가 홀수 일때,
            if (x + 1 > N) {
                cout << x - 1;
            }
            else {
                cout << x + 1;
            }
        }
    }

    return 0;
}
