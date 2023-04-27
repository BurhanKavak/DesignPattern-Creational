## :heavy_check_mark: Singleton Method

**Singleton Tasarım Deseni, Creational (Yaratımsal) Tasarım Desenleri kategorisinde yer alan bir tasarım desenidir.**

***Bir sınıfın sadece bir tane nesnesinin olduğundan emin ol ve ona global bir erişim noktası sağla.***

**Singleton, yazılımlarda sıklıkla karşımıza çıkan ve bir sınıftan sadece ve sadece bir tane nesnenin bulunması gereken durumlara bir çözümdür. Bir sınıftan bir tane nesne olmasından kasıt ise, herkesin istediği zaman bu sınıfın bir nesnesini oluşturmaya çalışmamasıdır, oluşturamamasıdır. “*Bir sınıfın sadece bir tane nesnesinin olduğundan emin ol”*
ile kastedilen budur.**

**Daha genel bir tanım yapacak olursak; bu tasarım deseni, bir sınıfın yalnızca bir örneğinin bulunmasını sağlamak için kullanılır. Bu sayede, uygulamanın farklı yerlerinde aynı örneği kullanarak, hafıza kullanımını azaltır ve performansı artırır.**

**Singleton Tasarım Deseni, bir örneğin yalnızca bir kez yaratılmasını ve bu örneğin her yerden erişilebilir olmasını sağlar. Bu örneğin yaratılması ilk istekle gerçekleşir ve daha sonra bu örnek her yerden erişilebilir hale gelir.**