Chain of Responsibility design pattern (Sorumluluk Zinciri Tasarım Deseni),
bir isteği işleyecek olan nesnelerin zincirleme olarak düzenlenmesi ile oluşan bir tasarım desenidir.
Bu desen, bir isteğin hangi nesne tarafından işleneceğini belirlemede kullanılır ve her nesne sadece kendisine verilen
işi yapar ve zincirin sonuna gelindiğinde istek işlenemezse hata döndürür.

Bu tasarım deseni, bir isteğin işlenmesi için birden fazla nesneye ihtiyaç duyulan durumlarda kullanılabilir.
Her bir nesne, isteği işlemede bir adımı gerçekleştirir ve zincirin sonuna gelindiğinde istek işlenmezse, hata döndürür.

Java'da Chain of Responsibility tasarım deseni, java.util.logging.
Logger sınıfı gibi bazı standart sınıflarda kullanılmaktadır. Ayrıca,
Spring Framework gibi bazı çerçeveler de bu tasarım desenini kullanmaktadır.