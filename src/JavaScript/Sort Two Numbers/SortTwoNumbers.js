const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
  [a, b] = line.split(' ');
  console.log(+a < +b ? a + ' ' + b : b + ' ' + a);
  rl.close();
});