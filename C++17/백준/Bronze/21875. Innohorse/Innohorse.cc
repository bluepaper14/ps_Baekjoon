#include <iostream>
#include <cmath>
using namespace std;

pair<int, int> findInnohorseType(string A, string B) {
    int x1 = A[0] - 'a' + 1;
    int y1 = A[1] - '1' + 1;
    int x2 = B[0] - 'a' + 1;
    int y2 = B[1] - '1' + 1;
    
    int dx = abs(x2 - x1);
    int dy = abs(y2 - y1);
    
    if (dx > dy) swap(dx, dy);
    
    return {dx, dy};
}

int main() {
    string A, B;
    cin >> A >> B;
    
    pair<int, int> result = findInnohorseType(A, B);
    cout << result.first << " " << result.second << endl;
    
    return 0;
}