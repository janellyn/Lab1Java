# Lab1Java
## Опис

Цей код обчислює значення S з використанням вкладених циклів та формули, що включає поділ чисел.

## Вхідні дані

- `a` - початкове значення `a`.
- `b` - початкове значення `b`.
- `n` - верхня межа для `a`.
- `m` - верхня межа для `b`.
- `C` - константа.

## Результат

Якщо введені значення не задовольняють певним умовам, то виводиться повідомлення про помилку або S = 0, в іншому випадку виводиться обчислене значення S.

## Умови

1. Якщо `a` більше ніж `n` або `b` більше ніж `m`, то виводиться повідомлення "S = 0", і програма завершується.

2. Якщо -C більше або дорівнює `a` і -C менше або дорівнює `n`, виводиться повідомлення "Error", і програма завершується.

3. В іншому випадку обчислюється значення S, використовуючи вкладені цикли для перебору значень `i` від `a` до `n` і `j` від `b` до `m`, і обчислюється сума згідно формули.

4. Результат обчислення виводиться на консоль разом зі значенням "S = ".
