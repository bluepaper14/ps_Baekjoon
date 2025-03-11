#include <iostream>

using namespace std;

int main() {
    int T;
    string name;
    int a;

    cin >> T;
    int max = 10;
    string max_name;

    for (int i = 0; i < T; i++) {
        cin >> name >> a;

        if (a < max) {
            max = a;
            max_name = name;
        }
    }
    cout << max_name;
    return 0;
}