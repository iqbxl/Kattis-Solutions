#include <iostream>

int main() {
  std::string word;
  std::cin >> word;
  int len = word.length();

  int firstHalf = 0;
  for (int i = 0; i < len / 2; i++) {
    if (word[i] == '(') {
      break;
    }
    firstHalf++;
  }

  int secondHalf = 0;
  for (int i = len / 2 + 1; i < len; i++) {
    if (word[i] == ')') {
      break;
    }
    secondHalf++;
  }
  
  if (firstHalf == secondHalf) {
    std::cout << "correct" << std::endl;
  } else {
    std::cout << "fix" << std::endl;
  }
}