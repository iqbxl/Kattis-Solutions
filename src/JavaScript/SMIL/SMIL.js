const readline = require('readline');
const rl = readline.createInterface(process.stdin);

rl.on('line', line => {
  var input = line;
  var smile1 = /:\)/g, res1;
  var smile2 = /;\)/g, res2;
  var smile3 = /:-\)/g, res3;
  var smile4 = /;-\)/g, res4;

  while (res1 = smile1.exec(input)) {
    console.log(res1.index);
  }

  while (res2 = smile2.exec(input)) {
    console.log(res2.index);
  }

  while (res3 = smile3.exec(input)) {
    console.log(res3.index);
  }

  while (res4 = smile4.exec(input)) {
    console.log(res4.index);
  }

  rl.close();
})