#include <iostream>
#include <vector>
using namespace std;

int main() {
  string cpr;
  int sum = 0;
  vector<int> coeff = {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};
  cin >> cpr;
  cpr.erase(6, 1);
  for (int i = 0; i < cpr.size(); i++) {
    sum += coeff[i] * stoi(string(1, cpr[i]));
  }
  if (sum % 11 == 0) {
    cout << 1;
  } else {
    cout << 0;
  }
  cout << endl;
  return 0;
}