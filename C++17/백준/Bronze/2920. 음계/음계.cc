#include <iostream>
using namespace std;

int main() {
    int arr[8];

    // 입력 받기
    for (int i = 0; i < 8; i++) {
        cin >> arr[i];
    }

    // ascending, descending 여부 체크
    bool isAscending = true, isDescending = true;

    for (int i = 1; i < 8; i++) {
        if (arr[i] > arr[i - 1]) { // 증가하면 내림차순이 아님
            isDescending = false;
        } 
        else if (arr[i] < arr[i - 1]) { // 감소하면 오름차순이 아님
            isAscending = false;
        }
    }

    // 결과 출력
    if (isAscending) {
        cout << "ascending";
    } 
    else if (isDescending) {
        cout << "descending";
    } 
    else {
        cout << "mixed";
    }

    return 0;
}
