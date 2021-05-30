const fs = require('fs');
const read = fs.readFileSync(0, 'utf8').split('\n');

let current = 0;
function input() {
    return read[current++];
}

const n = input();
if (n % 2 != 0) {
    console.log('still running');
} else {
    let sum = 0;
    for (let i = 0; i < n; i++) {
        let line = +input();
        if (i % 2 == 0) {
            sum -= line;
        } else {
            sum += line;
        }
    }
    console.log(sum);
}