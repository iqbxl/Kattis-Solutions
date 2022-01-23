#include <iostream>

int main() {
  int n ;
  std::cin >> n;
  for (int i = 0; i < n; i++) {
    std::string word;
    std::cin >> word;
    if (i % 2 == 0) {
      std::cout << word << "\n";
    }
  }
  return 0;
}