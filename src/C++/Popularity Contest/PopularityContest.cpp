#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
  int n, m, first, second;
  cin >> n >> m;
  unordered_map<int, int> um;
  for (int i = 0; i < m; i++) {
    cin >> first >> second;
    if (um.count(first)) {
      um[first]++;
    } else {
      um[first] = 1;
    }
    if (um.count(second)) {
      um[second]++;
    } else {
      um[second] = 1;
    }
  }
  for (int i = 1; i <= n; i++) {
    cout << um[i] - i << " ";
  }
  return 0;
}