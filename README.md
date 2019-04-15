# simple-convert
简单易用的Java各类文档转换项目，正在开发中，请勿使用

## 如何使用

* 

## 注意事项

* 在pom.xml中，不要使用system scope引入jar包，而要通过在项目设立一个maven本地仓库：repo目录，将所需要的第三方jar包deploy进去（不能直接从maven下载，原因你懂的）

    * system scope引入的包，在使用jar-with-dependencies打包时将不会被包含，可以使用resources将本地包打进jar-with-dependencies
    
    * 关于本地repositor的创建和使用，可以参考 [这里](http://www.liumapp.com/articles/2019/04/12/1555053553824.html)
    



    
    
