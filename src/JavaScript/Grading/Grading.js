const readline = require('readline');
const rl = readline.createInterface(process.stdin);

rl.on('line', line => {
  const [a, b, c, d, e] = line.split(' ').map(Number);
  rl.on('line', line => {
    const score = +line;
    if (score >= a) console.log('A');
    else if (score >= b) console.log('B');
    else if (score >= c) console.log('C');
    else if (score >= d) console.log('D');
    else if (score >= e) console.log('E');
    else console.log('F');
    rl.close();
  });
});