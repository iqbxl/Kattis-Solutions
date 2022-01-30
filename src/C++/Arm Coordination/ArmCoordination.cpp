#include <iostream>

using namespace std;

int main() {
  int x, y, n;
  cin >> x >> y >> n;
  cout << x - n << " " << y - n << "\n";
  cout << x - n << " " << y + n << "\n";
  cout << x + n << " " << y + n << "\n";
  cout << x + n << " " << y - n << endl;
  return 0;
}