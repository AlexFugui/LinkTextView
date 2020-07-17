# LinkTextView
```
QMUI是个好库但是配置麻烦,但是为了使用其中一个功能而依赖整个项目不值得.
所以单独抽出了QMUI中的LinkTextView,支持点击文本中的电话号,邮箱,链接
因为功能单一所以短期内应该都不会再更新了,我也只是把源码扣出来用,去掉了其他没用的代码而已
共有10个java类和5个接口类
```

# 效果图

![](https://github.com/AlexFugui/LinkTextView/blob/master/image/微信截图_20200717144616.png)
  
![](https://github.com/AlexFugui/LinkTextView/blob/master/image/微信截图_20200717144622.png)
  
![](https://github.com/AlexFugui/LinkTextView/blob/masterimage/微信截图_20200717144616.png)

# 依赖
```java
implementation 'com.alex:textView:1.0.0'
```

# 使用
 xml中
 ```
<com.alex.textview.view.LinkTextView
        android:id="@+id/text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="可以自动识别网页链接，例如 http://www.qmuiteam.com。\n可以自动识别电话号码，例如 13600000000。\n也可以识别邮件地址，例如 qmuiteam@gmail.com。\n我们可以为其添加自定义的点击事件。" />
 ```

 Activity中
 ```java
LinkTextView textView = findViewById(R.id.text);
textView.setOnLinkClickListener(new LinkTextView.OnLinkClickListener() {
    @Override
    public void onTelLinkClick(String phoneNumber) {
        Toast.makeText(MainActivity.this, "识别到电话号码是：" + phoneNumber, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMailLinkClick(String mailAddress) {
        Toast.makeText(MainActivity.this, "识别到邮件地址是：" + mailAddress, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onWebUrlLinkClick(String url) {
        Toast.makeText(MainActivity.this, "识别到网页链接是：" + url, Toast.LENGTH_SHORT).show();
    }
});
 ```
