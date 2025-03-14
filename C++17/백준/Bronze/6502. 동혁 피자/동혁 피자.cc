#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int r; //식탁 반지름
    int w;
    int l;
    int cnt = 0;

    while (1) {
        cin >> r;
        if (r == 0) {
            break;
        }
        cin >> w >> l;
        cnt++;


        int num = (w * w) + (l * l);

        double result = sqrt(num); //빗변을 구하고 루트

        if (result > 2 * r) {
            cout << "Pizza " << cnt << " does not fit on the table." << endl;
        }
        else {
            cout << "Pizza " << cnt << " fits on the table." << endl;
        }

    }


    return 0;
}
