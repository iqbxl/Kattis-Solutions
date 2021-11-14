const readline = require('readline');
const rl = readline.createInterface(process.stdin);

rl.once('line', line => {
  n = parseInt(line);
  const intervals = [];
  rl.on('line', line => {
    const pair = line.split(' ').map(Number);
    intervals.push(pair);
    if (intervals.length !== n) {
      return;
    }
    intervals.sort((firstPair, secondPair) => firstPair[1] - secondPair[1]);

    let res = 1;
    let f0 = intervals[0][1];
    for (var i = 0; i < n; i++) {
      s1 = intervals[i][0];
      f1 = intervals[i][1];
      if (s1 >= f0) {
        res++;
        f0 = f1;
      }
    }
    console.log(res);
    rl.close();
  });
});