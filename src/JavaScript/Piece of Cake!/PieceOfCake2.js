const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
    [n, h, v] = line.split(' ');
    let maxh = Math.max(h, n - h);
    let maxv = Math.max(v, n - v);
    console.log(maxh * maxv * 4);
    rl.close();
});