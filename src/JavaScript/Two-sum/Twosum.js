const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
  const [a, b] = line.split(' ').map(Number);
  console.log(a + b);
  rl.close();
})