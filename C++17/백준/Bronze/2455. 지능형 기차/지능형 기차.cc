#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int first_up;
    int first_down;

    int second_up;
    int second_down;

    int third_up;
    int third_down;

    int last_up;
    int last_down;

    cin >> first_up;  //0
    cin >> first_down; //32
    
    cin >> second_up; //3
    cin >> second_down; //13

    cin >> third_up; //28
    cin >> third_down; //25

    cin >> last_up; //39
    cin >> last_down; //0

    int x = first_down; //32
    int y = first_down - second_up + second_down; //32-3+13 = 42;
    int z = y - third_up + third_down; //42-28+25 = 39;

    int result = max(x, max(y, z));

    cout << result;

    return 0;
}
