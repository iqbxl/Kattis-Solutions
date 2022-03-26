#include <iostream>
#include <unordered_set>
using namespace std;

int main() {
  string s;
  int numOfVowels = 0;
  getline(cin, s);
  unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
  for (char c : s) {
    if (vowels.find(c) != vowels.end()) {
      numOfVowels++;
    }
  }
  cout << numOfVowels << endl;
  return 0;
}