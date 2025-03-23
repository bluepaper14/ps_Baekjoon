#include <iostream>
using namespace std;

int main() {
    int N;

    cin >> N;

    int a, b;
    int ant = 0;
    int bnt = 0;

    for (int i = 0; i < N; i++) {
        cin >> a >> b;

        if (a > b) {
            ant++;
        }
        else if (a < b) {
            bnt++;
        }
    }
    cout << ant << " " << bnt;

    return 0;
}
