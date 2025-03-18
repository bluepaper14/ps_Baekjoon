#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
    int n;
    int k; //적정온도 k
    int T; //샤워기 온도 T
    int tem; //자연적 온도 변화
    int result = 0;

    int x;
    cin >> n >> k >> T; // 5 32 10 

    for (int i = 0; i < n; i++) {
        cin >> tem;
        
        if (T < k) {
            T = T + tem + abs(T - k);
            x = abs(T - k);
            result = result + abs(x);
        }
        else {
            T = T + tem - abs(T - k);
            x = abs(T - k);
            result = result + abs(x);
        }
    }
    cout << result;

    return 0;
}
