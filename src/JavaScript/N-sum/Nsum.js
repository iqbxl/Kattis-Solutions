const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.once('line', line => {
  const n = +line;
  rl.on('line', line => {
    const num = line.split(' ').map(Number);
    console.log(num.reduce((acc, val) => acc + val, 0));
    rl.close();
  });
});