# 目次

- [まとめ](#まとめ)
- [章末問題](#章末問題)

## まとめ

### 再帰と分割統治法

#### 再帰
- 自分自身を呼び出す
- stackoverflowとの戦い

#### メモ化
- 計算結果をキャッシュする

#### 分割統治法
- 与えられた問題をいくつかの部分問題に分割し、各部分問題を再帰的に解き、それらの解を組み合わせて元の問題を構成する

## 章末問題

### 4.1
```
#STDIN
5

#STDOUT
4
```
再帰は数式と直結してみえるから分かりやすい

※ソースコードあり

### 4.2
```
#STDIN
7

#STDOUT
13
```
O(n)

※ソースコードあり

### 4.3
<a href="https://www.codecogs.com/eqnedit.php?latex=x^{2}=x&plus;1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?x^{2}=x&plus;1" title="x^{2}=x+1" /></a>の解を<a href="https://www.codecogs.com/eqnedit.php?latex=\alpha&space;=\frac{1&plus;\sqrt{5}}{2}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\alpha&space;=\frac{1&plus;\sqrt{5}}{2}" title="\alpha =\frac{1+\sqrt{5}}{2}" /></a>,<a href="https://www.codecogs.com/eqnedit.php?latex=\beta&space;=\frac{1-\sqrt{5}}{2}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\beta&space;=\frac{1-\sqrt{5}}{2}" title="\beta =\frac{1-\sqrt{5}}{2}" /></a>とおくと、<a href="https://www.codecogs.com/eqnedit.php?latex=\alpha&space;&plus;\beta&space;=1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\alpha&space;&plus;\beta&space;=1" title="\alpha +\beta =1" /></a>,<a href="https://www.codecogs.com/eqnedit.php?latex=\alpha&space;\beta&space;=-1" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\alpha&space;\beta&space;=-1" title="\alpha \beta =-1" /></a>より、

<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}=\left&space;(&space;\alpha&space;&plus;\beta&space;\right&space;)a_{n-1}-\alpha&space;\beta&space;a_{n-2}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}=\left&space;(&space;\alpha&space;&plus;\beta&space;\right&space;)a_{n-1}-\alpha&space;\beta&space;a_{n-2}" title="a_{n}=\left ( \alpha +\beta \right )a_{n-1}-\alpha \beta a_{n-2}" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}&space;-&space;\alpha&space;a_{n-1}&space;=&space;\beta&space;\left&space;(&space;a_{n-1}-\alpha&space;a_{n-2}&space;\right&space;)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}&space;-&space;\alpha&space;a_{n-1}&space;=&space;\beta&space;\left&space;(&space;a_{n-1}-\alpha&space;a_{n-2}&space;\right&space;)" title="a_{n} - \alpha a_{n-1} = \beta \left ( a_{n-1}-\alpha a_{n-2} \right )" /></a>

よって、<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}&space;-&space;\alpha&space;a_{n-1}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}&space;-&space;\alpha&space;a_{n-1}" title="a_{n} - \alpha a_{n-1}" /></a>は公比<a href="https://www.codecogs.com/eqnedit.php?latex=\beta" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\beta" title="\beta" /></a>の等比級数となる

<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}-\alpha&space;a_{n-1}=\beta&space;^{n-2}\left&space;(&space;a_{2}-\alpha&space;a_{1}&space;\right&space;)=\beta&space;^{n-1}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}-\alpha&space;a_{n-1}=\beta&space;^{n-2}\left&space;(&space;a_{2}-\alpha&space;a_{1}&space;\right&space;)=\beta&space;^{n-1}" title="a_{n}-\alpha a_{n-1}=\beta ^{n-2}\left ( a_{2}-\alpha a_{1} \right )=\beta ^{n-1}" /></a>

同様にして

<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}-\beta&space;a_{n-1}=\alpha&space;^{n-2}\left&space;(&space;a_{2}-\beta&space;a_{1}&space;\right&space;)=\alpha&space;^{n-1}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}-\beta&space;a_{n-1}=\alpha&space;^{n-2}\left&space;(&space;a_{2}-\beta&space;a_{1}&space;\right&space;)=\alpha&space;^{n-1}" title="a_{n}-\beta a_{n-1}=\alpha ^{n-2}\left ( a_{2}-\beta a_{1} \right )=\alpha ^{n-1}" /></a>

この2式から<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n-1}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n-1}" title="a_{n-1}" /></a>を消去して<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n-1}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}" title="a_{n}" /></a>についてとく

<a href="https://www.codecogs.com/eqnedit.php?latex=a_{n}=\frac{\alpha&space;^{n}-\beta&space;^{n}}{\alpha&space;-\beta}&space;=\frac{1}{\sqrt{5}}\left&space;(&space;\left&space;(&space;\frac{1&plus;\sqrt{5}}{2}&space;\right&space;)^{n}-&space;\left&space;(&space;\frac{1-\sqrt{5}}{2}&space;\right&space;)^{n}\right&space;)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a_{n}=\frac{\alpha&space;^{n}-\beta&space;^{n}}{\alpha&space;-\beta}&space;=\frac{1}{\sqrt{5}}\left&space;(&space;\left&space;(&space;\frac{1&plus;\sqrt{5}}{2}&space;\right&space;)^{n}-&space;\left&space;(&space;\frac{1-\sqrt{5}}{2}&space;\right&space;)^{n}\right&space;)" title="a_{n}=\frac{\alpha ^{n}-\beta ^{n}}{\alpha -\beta} =\frac{1}{\sqrt{5}}\left ( \left ( \frac{1+\sqrt{5}}{2} \right )^{n}- \left ( \frac{1-\sqrt{5}}{2} \right )^{n}\right )" /></a>

### 4.4

<a href="https://www.codecogs.com/eqnedit.php?latex=\lim_{n&space;\to&space;\infty}\left&space;(&space;\frac{1-\sqrt{5}}{2}&space;\right&space;)^{n}=0" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\lim_{n&space;\to&space;\infty}\left&space;(&space;\frac{1-\sqrt{5}}{2}&space;\right&space;)^{n}=0" title="\lim_{n \to \infty}\left ( \frac{1-\sqrt{5}}{2} \right )^{n}=0" /></a>

よって、<a href="https://www.codecogs.com/eqnedit.php?latex=O\left&space;(&space;\left&space;(&space;\frac{1&plus;\sqrt{5}}{2}&space;\right&space;)^{n}&space;\right&space;)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?O\left&space;(&space;\left&space;(&space;\frac{1&plus;\sqrt{5}}{2}&space;\right&space;)^{n}&space;\right&space;)" title="O\left ( \left ( \frac{1+\sqrt{5}}{2} \right )^{n} \right )" /></a>

### 4.5
```
#STDIN
7777

#STDOUT
42
```

※ソースコードあり

### 4.6
```
#STDIN
5
10
1
2
3
4
5

#STDOUT
true
```

※ソースコードあり