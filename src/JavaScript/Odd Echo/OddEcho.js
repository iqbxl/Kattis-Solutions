const fs = require('fs');
const read = fs.readFileSync(0, 'utf8').split('\n');

let count = 0;
function input() {
  return read[count++];
}

let n = +input();
for (var i = 0; i < n; i++) {
  word = input();
  if (i % 2 == 0) {
    console.log(word);
  }
}