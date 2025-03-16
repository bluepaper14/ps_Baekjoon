#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int T;

    cin >> T;
    string name;
    string arr[1000];
    for (int i = 0; i < T; i++) {
        cin >> name;
        arr[i] = name;
    }

    string x;

    for (int j = 0; j < T - 1; j++) {
        cin >> x;
        for (int q = 0; q < T; q++) {
            if (arr[q] == x) {
                arr[q] = " ";
            }
        }
    }
    for (int i = 0; i < T; i++) {
        if (arr[i] != " ") {
            cout << arr[i];
            
        }
    }

    return 0;
}
