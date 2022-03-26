#include <iostream>

using namespace std;

int main() {
  string s;
  cin >> s;
  int aFirstIdx = s.find_first_of('a');
  cout << s.substr(aFirstIdx) << endl;
  return 0;
}