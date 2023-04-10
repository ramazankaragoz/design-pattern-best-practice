Proxy design pattern (Vekil Tasarım Deseni), bir başka nesneye erişimi kontrol etmek ve yönlendirmek için kullanılan bir tasarım desenidir.
Bu tasarım deseni, gerçek nesneyle aynı arayüze sahip bir vekil nesne yaratır ve istemci nesneler gerçek nesne yerine vekil nesneyle iletişim kurar.
Vekil nesne, istemcinin nesneye erişimini kontrol eder ve istekleri gerçek nesneye iletir.

Bu tasarım deseni, erişim kontrolü, gecikmeli yükleme (lazy loading), nesne oluşturma maliyetlerini azaltma,
önbellekleme (caching) ve nesne erişimindeki uzaklıkları yönetme gibi durumlarda kullanılabilir.