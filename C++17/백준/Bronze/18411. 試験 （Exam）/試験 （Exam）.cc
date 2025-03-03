#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;

    int result = A + B + C - min({A, B, C});
    
    cout << result << endl;

    return 0;
}
