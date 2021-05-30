const fs = require('fs');
const read = fs.readFileSync(0, 'utf8').split('\n');

let count = 0;
function input() {
    return read[count++];
}

let n = input();
let x = 0;
while (n-- > 0) {
    let line = input();
    x += line.substring(0, line.length - 1) ** line.substring(line.length - 1, line.length);
}
console.log(x);