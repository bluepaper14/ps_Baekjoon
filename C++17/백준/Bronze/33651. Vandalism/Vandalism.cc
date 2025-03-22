#include <iostream>
#include <string>

using namespace std;

void find_missing_letters(const string& s) {
    string original = "UAPC";
    string missing = "";

    for (char ch : original) {
        if (s.find(ch) == string::npos) { // s에 ch가 포함되지 않았으면
            missing += ch;
        }
    }

    cout << missing << endl;
}

int main() {
    string s;
    cin >> s;
    find_missing_letters(s);
    return 0;
}
