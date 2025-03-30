#include <iostream>
using namespace std;

int main() {
    int num;

    cin >> num;
    bool istrue = false;

    for (int i = 2024; i < 100000; i += 2024) {
        if (num == i) {
            istrue = true;
            break;
        }
    }

    if (istrue) {
        cout << "Yes";
    }
    else {
        cout << "No";
    }
    return 0;
}
