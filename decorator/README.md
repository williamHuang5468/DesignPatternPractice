# Compare the Decorator with Java and Python

Python 的 Decorator 和 Design Pattern 的 Decorator 是不同的東西

Python 的 Decorator 是將已有的 Method 在外層包裝的方法(例如 Log 訊息，可以包在已有的 Method 中)

Design Pattern 的 Decorator 則是動態的去增加方法的屬性(例如：漢堡的套餐或是咖啡的配料)

## 以良葛葛的漢堡做為例子

當我新增一個和風漢堡，要搭配套餐，

### 使用 Design Pattern Decorator

在 MEAL 下新增一個和風漢堡的 Class ，實作 Content 和 Price 的函式

### 使用 Python Decorator

必須要新增和風漢堡的價格 + N 種套餐的數量的函式

也就是，如果有三種套餐，需要加入4個函式，一個單點和3個搭配各自套餐。

當套餐的數量變龐大，每次新增一樣主餐就要新增 1 + N 個餐點；反觀 Design Pattern 則是不用

而且當情境的階層變多，將會非常不適用，需要將每個情況都寫成 Method 並沒有比較輕鬆。反而是 Design Pattern 能夠很彈性的處理這件事。

## Reference

- [Example from ](https://openhome.cc/Gossip/DesignPattern/DecoratorPattern.html)
- [Stackoverflow](https://stackoverflow.com/questions/8328824/what-is-the-difference-between-python-decorators-and-the-decorator-pattern)
- [More python Decorator example](https://www.ibm.com/developerworks/linux/library/l-cpdecor/index.html)
