#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    string word;
    int cnt = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
        cin >> word; 
        
        for (int x = 0; x < word.length(); x++) {
                if (word[x] == 'O') {
                max++;
                cnt = cnt + max;
            }
            else {
                max = 0;
            }
        }

        cout << cnt << endl;
        cnt = 0;
        max = 0;
    }

    return 0;
}
