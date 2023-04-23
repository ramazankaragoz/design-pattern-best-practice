Command tasarım deseni, bir işlem veya isteğin bir nesne içerisine paketlenmesi ve bu nesnenin daha sonra yürütülmesi
için kullanılması esasına dayanan bir tasarım desenidir. Bu desen, bir isteği çağıran nesne ile isteği yürüten nesne
arasındaki ilişkiyi zayıflatır ve birçok farklı istek türünün var olduğu durumlarda kod tekrarını en aza indirir.

Command tasarım deseni, dört temel öğeden oluşur:

1-)Command: Bir işlemi temsil eden arayüzü veya soyut sınıfı temsil eder.

2-)ConcreteCommand: Command arayüzünden türeyen ve gerçek bir işlemi temsil eden sınıftır.

3-)Invoker: Bir komutu çağıran nesneyi temsil eder.

4-)Receiver: Komutu yürüten nesneyi temsil eder.