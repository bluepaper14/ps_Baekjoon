#include <iostream>
using namespace std;

int main() {
    int n;
    int a, b, c;
    int count = 0;

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a >> b >> c;
        
        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                for (int z = 1; z <= c; z++) {
                    if ((x % y == y % z) && (y % z == z % x)) {
                        count++;
                    }
                }
            }
        }
        cout << count << endl;
        count = 0;
    }
    


    return 0;
}