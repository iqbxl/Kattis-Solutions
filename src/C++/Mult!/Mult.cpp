#include <iostream>

using namespace std;

int main() {
  int n, first, num;
  bool reset = false;
  cin >> n;
  cin >> first;
  for (int i = 0; i < n - 1; i++) {
    if (reset) {
      cin >> first;
      reset = false;
    } else {
      cin >> num;
      if (num % first == 0) {
        cout << num << "\n";
        reset = true;
      }
    }
  }
  return 0;
}