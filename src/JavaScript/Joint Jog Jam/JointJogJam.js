const readline = require('readline');
const rl = readline.createInterface(process.stdin);

rl.on('line', line => {
  const [x1, y1, x2, y2, k1, o1, k2, o2] = line.split(' ').map(Number);
  dist1 = Math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2);
  dist2 = Math.sqrt((k1 - k2) ** 2 + (o1 - o2) ** 2);
  console.log(dist1 > dist2 ? dist1 : dist2);
  rl.close();
})