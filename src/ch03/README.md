# 目次

- [まとめ](#まとめ)
- [章末問題](#章末問題)

## まとめ

### 全探索

#### 線形探索法
- 多量のデータの中から特定のデータを探し出す

#### ペアの全探索
- 与えられたデータの中から最適なペアを探索する問題
- 与えられた2組のデータの中からそれぞれ要素を抜き出す方法を最適化する問題

#### 組み合わせの全探索
- 与えられたデータの中から任意の組み合わせについて特定の条件を満たすデータを探し出す

## 章末問題

### 3.1
```
#STDIN
5 //探す数字
5 //サイズ
11 //1個め
16 //2個め
3 //3個め
5 //4個め
5 //5個め

#STDOUT
4
```
iが常にカウントアップされるので、探す数字に一致する一番最後のインデックスが格納される。

※ソースコードあり

### 3.2
```
#STDIN
5 //探す数字
5 //サイズ
11 //1個め
16 //2個め
3 //3個め
5 //4個め
5 //5個め

#STDOUT
2
```
3.1とほぼ同じロジック。

※ソースコードあり

### 3.3
```
#STDIN
5 //サイズ
1 //1個め
2 //2個め
3 //3個め
4 //4個め
5 //5個め

#STDOUT
2
```
UT必須なロジック。

※ソースコードあり

### 3.4
```
#STDIN
5 //サイズ
5 //1個め
4 //2個め
3 //3個め
2 //4個め
1 //5個め

#STDOUT
1 //最小値
5 //最大値
```
1回のループで両方求める。

※ソースコードあり

### 3.5
```
#STDIN
5 //サイズ
2 //1個め
4 //2個め
8 //3個め
16 //4個め
32 //5個め

#STDOUT
1 //最小値
```

※ソースコードあり

### 3.6
```
#STDIN
2 //最大値
4 //和

#STDOUT
6
```

※ソースコードあり

### 3.7
```
#STDIN
123

#STDOUT
168
```
charか。。あんま使わんよな。

※ソースコードあり