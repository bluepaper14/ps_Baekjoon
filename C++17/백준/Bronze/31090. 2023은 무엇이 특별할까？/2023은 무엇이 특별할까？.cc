#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;


    int num = 0;
    int x = 0;

    for (int i = 0; i < T; i++) {
        cin >> num;
        x = num % 100;
        
        if ((num + 1) % x == 0) {
            cout << "Good" << endl;
        }
        else {
            cout << "Bye" << endl;
        }
    }
    return 0;
}
