const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);

rl.on('line', code => {
  console.log(code.split('').reverse().join(''));
  rl.close();
});