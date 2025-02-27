#include <iostream>
using namespace std;

int main() {

    int arr[5]; //4개의 점수를 배열로 저장
    
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    int sum = 0;
    int max = 0;
    int number = 0;

    for (int i = 0; i < 5; i++) {
        cin >> a;
        cin >> b;
        cin >> c;
        cin >> d;
        sum = a + b + c + d; 

        if (sum > max) {
            max = sum;
            number = i + 1;
        }

    }

    cout << number << ' ' << max; 
    
    return 0;
}
