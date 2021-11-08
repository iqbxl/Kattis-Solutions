const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', line => {
  const [h, b] = line.split(' ').map(Number);
  console.log(0.5 * h * b);
  rl.close();
})