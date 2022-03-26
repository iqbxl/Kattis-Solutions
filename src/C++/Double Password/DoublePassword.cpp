#include <iostream>
#include <unordered_set>
using namespace std;

int main() {
  string p1, p2;
  unordered_set<string> passwords;
  cin >> p1 >> p2;
  passwords.insert(p1);
  passwords.insert(p2);
  string temp1 = p1;
  string temp2 = p2;
  for (int i = 0; i < 4; i++) {
    string tempInner = p1.replace(i, 1, string(1, p2[i]));
    passwords.insert(tempInner);
    for (int j = i + 1; j < 4; j++) {
      passwords.insert(p1.replace(j, 1, string(1, p2[j])));
      p1 = tempInner;
    }
    p1 = temp1;
  }
  for (int i = 0; i < 4; i++) {
    passwords.insert(p2.replace(i, 1, string(1, p1[i])));
    p2 = temp2;
  }
  cout << passwords.size() << endl;
  return 0;
}