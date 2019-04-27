const n = parseInt(prompt("Введіть n"));
const c = parseInt(prompt("Введіть C"));
let array = [];
let countGreaterThanC = 0;
let maxAbsElementIndex = 0;

for (let i = 0; i < n; i++) {
  array.push(parseInt(prompt(`Введіть ${i} елемент масива`)));
  if (array[i] > c) {
    countGreaterThanC++;
  }
  if (Math.abs(array[i]) > Math.abs(array[maxAbsElementIndex])) {
    maxAbsElementIndex = i;
  }
}

let timesAfterMax = 1;

for (let i = maxAbsElementIndex + 1; i < n; i++) {
  timesAfterMax *= array[i];
}

array.sort((a, b) => {
  if (a < 0) {
    return -1;
  } else {
    return 1;
  }
});

alert(`Кількість елементів більших за C = ${countGreaterThanC}`);
alert(
  `Добуток елементів масива, розміщених після максимального по модулю елемента = ${timesAfterMax}`
);
alert(`Відсортований масив: ${array}`);