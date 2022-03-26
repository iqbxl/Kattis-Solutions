#include <iostream>
using namespace std;

int main() {
  int n, volume = 7;
  string request, first, second;
  cin >> n;
  for (int i = 0; i < n; i++) {
    cin >> first >> second;
    if (second == "op!" && volume < 10) {
      volume++;
    } else if (second == "ned!" && volume > 0) {
      volume--;
    }
  }
  cout << volume << endl;
  return 0;
}