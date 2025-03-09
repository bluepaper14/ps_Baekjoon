#include <iostream>
using namespace std;

int main()
{
	int a_attack, a_life;
	int b_attack, b_life;

	cin >> a_attack >> a_life;
	cin >> b_attack >> b_life;


	int x = a_life / b_attack;
	int y = b_life / a_attack;

	if (a_life % b_attack != 0) {
		x = x + 1;
	}

	if (b_life % a_attack != 0) {
		y = y + 1;
	}

	if (x > y) {
		cout << "PLAYER A";
	}
	else if (x < y) {
		cout << "PLAYER B";
	}
	else {
		cout << "DRAW";
	}

	return 0;
}
