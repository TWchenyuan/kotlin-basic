# Practice A-ZZZ
## Problem
要求用代码实现这样一个函数：完成从数字到列序号的转换，
函数参数有2个，一个是起始序列，一个是结果个数，参数均大于零
函数返回值是一个字符串数组，代表从起始序列开始，生成要求个数的字母序号序列

如：
参数：(1, 1) 返回值 [A]
参数：(1, 2) 返回值 [A, B]
...
参数：(26, 3) 返回值 [Z, AA, AB]
...
最多到 ZZZ 即可

若超出ZZZ，可抛出错误。

## Test
`./gradlew clean test`

## Solution
tasks:
- (1, 2)->[A,B]
- (2, 2)->[B,C]
- (1, 1)->[A]
- (26, 1)->[Z]
- (27,1)-> [AA]
- (28,1)-> [AB]
- (29,1)-> [AC]
- (26*26+26,1)-> [ZZ]
- (26*26*26+26*26+26,1)-> [ZZZ]

### Samples
```text

1 A
...
26 Z
26*1+1 AA
26*1+2 AB
26*1+26 AZ
26*2+1 BA
26*2+26 BZ
26*3+1 CA
26*26+1 ZA
...
26*26+26 ZZ
26*26+26+1 AAA

26*26+26*2+1 ABA
26*26+26*3+1 ACA
26*26+26*3+26 ACZ
26*26+26*26+1 AZA
26*26+26*26+26 AZZ
26*26*2+26*1+1 BAA
...
26*26*26+26*1+1 ZAA
26*26*26+26*1+26 ZAZ
26*26*26+26*26+26 ZZZ

```
