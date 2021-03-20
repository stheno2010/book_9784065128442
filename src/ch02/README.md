# 目次

- [まとめ](#まとめ)
- [章末問題](#章末問題)

## まとめ
### 入力サイズNと計算ステップ回数との関係
|N|log N|N log N|N<sup>2</sup>|N^<sup>3</sup>|2<sup>N</sup>|N!|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|5|2|12|25|130|30|120|
|10|3|33|100|1,000|1,024|3,628,800|
|15|4|59|225|3,375|32,768|-|
|20|4|86|400|8,000|1,048,576|-|
|25|5|116|625|15,625|-|-|
|30|5|147|900|27,000|-|-|
|100|7|664|10,000|1,000,000|-|-|
|300|8|2,468|90,000|27,000,000|-|-|
|1,000|10|9,966|1,000,000|-|-|-|
|10,000|13|132,877|100,000,000|-|-|-|
|100,000|17|1,660,964|-|-|-|-|
|1,000,000|20|19,931,568|-|-|-|-|
|10,000,000|23|232,534,967|-|-|-|-|
|100,000,000|27|-|-|-|-|-|
|1,000,000,000(-)|30|-|-|-|-|-|

<sup>*</sup>対数logの低は2とするが、底を変更してもオーダー気泡においては定数倍の違いしかないので無視しできる。

### ランダウのO記法
T(N)とP(N)をそれぞれ0以上の整数全体のなす集合の上で定義された関数とします。このとき、T(N)=O(P(N))であるとは、ある正の実数cと0以上の整数N<sub>0</sub>が存在して、N<sub>0</sub>以上の任意の整数Nに対して

<a href="https://www.codecogs.com/eqnedit.php?latex=\left&space;|\frac{T(N)}{P(N)}&space;\right&space;|\leq&space;c" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left&space;|\frac{T(N)}{P(N)}&space;\right&space;|\leq&space;c" title="\left |\frac{T(N)}{P(N)} \right |\leq c" /></a>

が成り立つことをいいます。

### Ω記法
T(N)とP(N)をそれぞれ0以上の整数全体のなす集合の上で定義された関数とします。このとき、T(N)=Ω(P(N))であるとは、ある正の実数cと0以上の整数N<sub>0</sub>が存在して、N<sub>0</sub>以上の任意の整数Nに対して

<a href="https://www.codecogs.com/eqnedit.php?latex=\left&space;|\frac{T(N)}{P(N)}&space;\right&space;|\leq&space;c" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left&space;|\frac{T(N)}{P(N)}&space;\right&space;|\geq&space;c" title="\left |\frac{T(N)}{P(N)} \right |\leq c" /></a>

が成り立つことをいいます。

### Θ記法
T(N)=O(P(N))かつT(N)=Ω(P(N))であることをT(N)=Θ(P(N))と書きます。

## 章末問題

### 2.1

<a href="https://www.codecogs.com/eqnedit.php?latex=T_{1}(N)=1000N" target="_blank"><img src="https://latex.codecogs.com/gif.latex?T_{1}(N)=1000N" title="T_{1}(N)=1000N" /></a>
 -> O(N)

<a href="https://www.codecogs.com/eqnedit.php?latex=T_{2}(N)=5N^{2}&plus;10N&plus;7" target="_blank"><img src="https://latex.codecogs.com/gif.latex?T_{2}(N)=5N^{2}&plus;10N&plus;7" title="T_{2}(N)=5N^{2}+10N+7" /></a>
 -> O(N^2)

<a href="https://www.codecogs.com/eqnedit.php?latex=T_{3}(N)=4N^{2}&plus;3N\sqrt{N}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?T_{3}(N)=4N^{2}&plus;3N\sqrt{N}" title="T_{3}(N)=4N^{2}+3N\sqrt{N}" /></a>
 -> O(N^2)

<a href="https://www.codecogs.com/eqnedit.php?latex=T_{4}(N)=N\sqrt{N}&plus;5NlogN" target="_blank"><img src="https://latex.codecogs.com/gif.latex?T_{4}(N)=N\sqrt{N}&plus;5NlogN" title="T_{4}(N)=N\sqrt{N}+5NlogN" /></a>
 -> O(<a href="https://www.codecogs.com/eqnedit.php?latex=N\sqrt{N}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?N\sqrt{N}" title="N\sqrt{N}" /></a>)

<a href="https://www.codecogs.com/eqnedit.php?latex=T_{5}(N)=2^{N}&plus;N^{2019}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?T_{5}(N)=2^{N}&plus;N^{2019}" title="T_{5}(N)=2^{N}+N^{2019}" /></a>
 -> O(2^N)

### 2.2
<a href="https://www.codecogs.com/eqnedit.php?latex=_{n}C_{3}=\frac{1}{6}N(N-1)(N-2)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?_{n}C_{3}=\frac{1}{6}N(N-1)(N-2)" title="_{n}C_{3}=\frac{1}{6}N(N-1)(N-2)" /></a>
 -> O(N^3)

### 2.3
p*p=N -> 
<a href="https://www.codecogs.com/eqnedit.php?latex=\sqrt{N}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\sqrt{N}" title="\sqrt{N}" /></a>

### 2.4
k=0の場合、0歳以上1歳未満は1通り、0回の質問

k=1の場合、0歳以上2歳未満は2通り、1回の質問

k=nの場合、0歳以上2^n歳未満は2^n通り、n回の質問

よって、質問回数はk

### 2.5
k=1の場合、0歳以上1歳未満は1通り、0回の質問

k=2の場合、0歳以上2歳未満は2通り、1回の質問

k=3の場合、0歳以上3歳未満は3通り、1 or 2回の質問

k=4の場合、0歳以上4歳未満は4通り、2回の質問

k=8の場合、0歳以上8歳未満は8通り、3回の質問

k=nの場合、0歳以上n歳未満はn通り、2^k=n -> k=log<sub>2</sub>n -> k=logN回の質問

よって、質問回数はlogN回 -> O(logN)

### 2.6
<a href="https://www.codecogs.com/eqnedit.php?latex=e^{x}\geq&space;1&plus;x" target="_blank"><img src="https://latex.codecogs.com/gif.latex?e^{x}\geq&space;1&plus;x" title="e^{x}\geq 1+x" /></a>より

<a href="https://www.codecogs.com/eqnedit.php?latex=e(1&plus;\frac{1}{2}&plus;\frac{1}{3}&plus;...&plus;\frac{1}{n})" target="_blank"><img src="https://latex.codecogs.com/gif.latex?e(1&plus;\frac{1}{2}&plus;\frac{1}{3}&plus;...&plus;\frac{1}{n})" title="e(1+\frac{1}{2}+\frac{1}{3}+...+\frac{1}{n})" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex==e(1)e(\frac{1}{2})e(\frac{1}{3})...e(\frac{1}{n})" target="_blank"><img src="https://latex.codecogs.com/gif.latex?=e(1)e(\frac{1}{2})e(\frac{1}{3})...e(\frac{1}{n})" title="=e(1)e(\frac{1}{2})e(\frac{1}{3})...e(\frac{1}{n})" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\geq&space;(1&plus;1)(1&plus;\frac{1}{2})(1&plus;\frac{1}{3})...(1&plus;\frac{1}{n})" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\geq&space;(1&plus;1)(1&plus;\frac{1}{2})(1&plus;\frac{1}{3})...(1&plus;\frac{1}{n})" title="\geq (1+1)(1+\frac{1}{2})(1+\frac{1}{3})...(1+\frac{1}{n})" /></a>

=n+1

 ->

<a href="https://www.codecogs.com/eqnedit.php?latex=\sum_{k=1}^{n}\frac{1}{k}\geq&space;log(n&plus;1)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\sum_{k=1}^{n}\frac{1}{k}\geq&space;log(n&plus;1)" title="\sum_{k=1}^{n}\frac{1}{k}\geq log(n+1)" /></a>

-> O(logN)

