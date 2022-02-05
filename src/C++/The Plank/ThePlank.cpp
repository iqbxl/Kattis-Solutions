#include <iostream>

using namespace std;

int numWays(int n) {
  if (n < 0) {
    return 0;
  } else if (n == 0) {
    return 1;
  } else {
    return numWays(n - 1) + numWays(n - 2) + numWays(n - 3);
  }
}

int main() {
  int n;
  cin >> n;
  int res = numWays(n);
  cout << res << endl;
  return 0;
}
