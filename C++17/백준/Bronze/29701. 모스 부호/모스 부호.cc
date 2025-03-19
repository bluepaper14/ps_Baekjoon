#include <iostream>
#include <unordered_map>
#include <sstream>

using namespace std;

unordered_map<string, char> morseMap = {
    {".-", 'A'},    {"-...", 'B'},  {"-.-.", 'C'},  {"-..", 'D'},   {".", 'E'},
    {"..-.", 'F'}, {"--.", 'G'},   {"....", 'H'},  {"..", 'I'},   {".---", 'J'},
    {"-.-", 'K'},  {".-..", 'L'},  {"--", 'M'},    {"-.", 'N'},   {"---", 'O'},
    {".--.", 'P'}, {"--.-", 'Q'},  {".-.", 'R'},   {"...", 'S'},  {"-", 'T'},
    {"..-", 'U'},  {"...-", 'V'},  {".--", 'W'},   {"-..-", 'X'}, {"-.--", 'Y'},
    {"--..", 'Z'}, {".----", '1'}, {"..---", '2'}, {"...--", '3'}, {"....-", '4'},
    {".....", '5'}, {"-....", '6'}, {"--...", '7'}, {"---..", '8'}, {"----.", '9'},
    {"-----", '0'}, {"--..--", ','}, {".-.-.-", '.'}, {"..--..", '?'}, {"---...", ':'},
    {"-....-", '-'}, {".--.-.", '@'}
};

int main() {
    int N;
    string line;
    
    cin >> N;
    cin.ignore(); // 개행 문자 제거
    getline(cin, line);
    
    stringstream ss(line);
    string morse, result = "";
    
    while (ss >> morse) {
        result += morseMap[morse];
    }
    
    cout << result << endl;
    return 0;
}
