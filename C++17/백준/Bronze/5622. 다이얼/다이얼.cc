#include <iostream>
#include <string>

using namespace std;

int main() {
    string name;

    cin >> name;
    int max = 0;


    for (int i = 0; i < name.length(); i++) {
        if (name[i] == 'A' || name[i] == 'B' || name[i] == 'C') {
            max = max + 3;
        }
        if (name[i] == 'D' || name[i] == 'E' || name[i] == 'F') {
            max = max + 4;
        }
        if (name[i] == 'G' || name[i] == 'H' || name[i] == 'I') {
            max = max + 5;
        }
        if (name[i] == 'J' || name[i] == 'K' || name[i] == 'L') {
            max = max + 6;
        }
        if (name[i] == 'M' || name[i] == 'N' || name[i] == 'O') {
            max = max + 7;
        }
        if (name[i] == 'P' || name[i] == 'Q' || name[i] == 'R' || name[i] == 'S') {
            max = max + 8;
        }
        if (name[i] == 'T' || name[i] == 'U' || name[i] == 'V') {
            max = max + 9;
        }
        if (name[i] == 'W' || name[i] == 'X' || name[i] == 'Y' || name[i] == 'Z') {
            max = max + 10;
        }
    }
    cout << max;


    return 0;
}