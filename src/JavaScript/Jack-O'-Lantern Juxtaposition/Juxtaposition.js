const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
    [n, t, m] = line.split(' ');
    console.log(n * t * m);
    rl.close();
});