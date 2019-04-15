# simple-convert
简单易用的Java各类文档转换项目，正在开发中，请勿使用

## 如何使用

* 使用Maven下载依赖
    
    ````mxml
        <dependency>
          <groupId>com.liumapp.simple.convert</groupId>
          <artifactId>simple-convert</artifactId>
          <version>v1.0.0</version>
        </dependency>
    ````
    
* 拷贝repo目录到本地项目中，否则会提示找不到aspose的jar包

    当然，您也可以自行将libs目录下的aspose这个jar包部署到自己的nexus私服或者导入maven的本地仓库中

* html转doc

    * 通过文件目录转换
    
    ````java
        Converter converter = new HtmlToPdfConverterFactory().getInstance();
        String htmlFilePath = HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath();
        String pdfResultPath = "./result.pdf";
        converter.convertByFilePath(htmlFilePath, pdfResultPath);
    ````
    
        执行后将htmlFilePath所指向的html文件转换为pdf文件，并保存在pdfResultPath路径下
        
    * 通过输入流转换
    
        
    
    * 通过base64转换
    
* doc转pdf

    * 通过文件目录转换           
    
    * 通过输入流转换  

        

## 注意事项

* 在pom.xml中，不要使用system scope引入jar包，而要通过在项目设立一个maven本地仓库：repo目录，将所需要的第三方jar包deploy进去（不能直接从maven下载，原因你懂的）

    * system scope引入的包，在使用jar-with-dependencies打包时将不会被包含，可以使用resources将本地包打进jar-with-dependencies
    
    * 关于本地repositor的创建和使用，可以参考 [这里](http://www.liumapp.com/articles/2019/04/12/1555053553824.html)
    



    
    
