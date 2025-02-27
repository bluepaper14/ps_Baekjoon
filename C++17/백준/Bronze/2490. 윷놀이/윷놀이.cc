#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int arr[4];
  

    for (int i = 0; i < 3; i++) { //3번 반복

        int ding = 0; //등(1)
        int bae = 0; //배(0)

        for (int j = 0; j < 4; j++) {
            cin >> arr[j];
        }
        for (int x = 0; x < 4; x++) {
            if (arr[x] == 0) {
                bae++;
            }
            if (arr[x] == 1) {
                ding++;
            }
        }
        if (bae == 1 && ding == 3) {
            cout << 'A' << endl;
        }
        if (bae == 2 && ding == 2) {
            cout << 'B' << endl;
        }
        if (bae == 3 && ding == 1) {
            cout << 'C' << endl;
        }
        if (bae == 4 && ding == 0) {
            cout << 'D' << endl;
        }
        if (bae == 0 && ding == 4) {
            cout << 'E'<< endl;
        }

    }
    return 0;
}
