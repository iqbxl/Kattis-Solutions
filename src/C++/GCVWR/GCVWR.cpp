#include <iostream>

using namespace std;

int main() {
  int G, T, N, item, weightOfItems = 0;
  cin >> G >> T >> N;
  for (int i = 0; i < N; i++) {
    cin >> item;
    weightOfItems += item;
  }
  cout << 0.9 * (G - T) - weightOfItems << endl;
  return 0;
}