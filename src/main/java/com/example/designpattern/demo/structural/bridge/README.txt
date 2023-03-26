Bridge tasarım deseni, bir nesnenin arayüzünü (interface) veya soyutlamasını, birbirinden bağımsız şekilde kullanabileceğimiz
somut uygulamaların arasında bağlantı oluşturarak, değişimli kullanım sağlayan bir yapısal tasarım desenidir.

Bu desen, nesneler arasındaki bağımlılıkları azaltarak sistemdeki sınıf sayısını ve karmaşıklığı azaltmaya yardımcı olur.
Bridge tasarım deseni, birçok farklı platform veya uygulama arasında seçim yaparken de kullanılabilir.
Bu desen, özellikle Java gibi nesne yönelimli programlama dillerinde kullanılan arayüzlerle birlikte kullanıldığında, genişletilebilirlik ve bakım kolaylığı sağlar.

Bridge tasarım deseninde, soyutlanan nesne ve soyutlama gerçekleştiren sınıflar ayrı ayrı oluşturulur ve birbirleriyle arayüzler üzerinden etkileşime girerler.
Bu sayede, bir değişiklik yapıldığında sadece ilgili sınıfların etkilenmesi sağlanır ve diğer sınıflar bundan etkilenmez.