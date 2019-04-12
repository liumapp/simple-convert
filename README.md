# simple-convert
简单易用的Java各类文档转换项目

## 注意事项

* 在pom.xml中，不要使用system scope引入jar包

    system scope引入的包，在使用jar-with-dependencies打包时将不会被包含，可以使用resources将本地包打进jar-with-dependencies
    
    
