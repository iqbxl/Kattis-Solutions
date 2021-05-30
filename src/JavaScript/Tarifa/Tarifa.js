const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').split('\n');

let current = 0;
function rl() {
    return input[current++];
}

let x = rl();
let n = +rl(); // changes string to int
let rem = x * (n + 1);
while (n-- > 0) {
    rem -= rl();
}
console.log(rem);