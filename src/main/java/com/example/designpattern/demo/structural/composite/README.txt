Composite tasarım deseni, bir nesne hiyerarşisi oluşturmak için kullanılan bir yapısal tasarım desenidir.
Bu desenin amacı, bir nesne hiyerarşisini ağaç yapısına benzer bir şekilde organize etmek ve bu nesneleri tek tek veya gruplar halinde işlemek için kullanılabilen genel bir arayüz sağlamaktır.

Bu tasarım deseni, bir arayüz veya sınıf tarafından tanımlanan temel bileşenleri ve bu bileşenleri oluşturan diğer bileşenleri içerir.
Bu bileşenlerin hiyerarşisi, ana bileşenin aynı zamanda diğer bileşenleri de içeren bir yapıya sahip olduğu ve her bileşenin aynı arayüzü paylaştığı anlamına gelir.

Bir Java uygulamasında Composite tasarım deseni, özellikle nesne koleksiyonları işleme ve bu nesneleri ağaç yapısında organize etme ihtiyacı olduğunda kullanılabilir.
Örneğin, bir grafiksel kullanıcı arayüzünde, bir bileşenin içindeki alt bileşenleri ve bu alt bileşenlerin içindeki alt bileşenleri de dahil ederek bir bileşen ağacı oluşturmak için kullanılabilir.

Bu örnekte, Student arayüzü, her öğrencinin detaylarını göstermek için showDetails() metodunu sağlar.
StudentLeaf sınıfı, Student arayüzünden türetilen yaprak düğümdür ve her öğrenci nesnesi için bir isim ve yaş içerir.
StudentComposite sınıfı, bileşik düğümdür ve aynı zamanda Student arayüzünden türetilir.
Bu sınıf, öğrencilerin koleksiyonunu tutar ve add() ve remove() metodları ile öğrenciler eklenip veya kaldırılabilir.
showDetails() metodu, bileşik düğümün altındaki tüm öğrencilerin detaylarını gösterir.

CompositeExample sınıfında, bir StudentLeaf örneği oluşturulur ve StudentComposite öğrenci koleksiyonuna eklenir.
Başka bir StudentLeaf nesnesi oluşturulur ve bu da koleksiyona eklenir. Bir başka StudentLeaf örneği oluşturulur ve bir StudentComposite nesnesine yerleştirilir.
StudentComposite koleksiyonu, başka bir StudentComposite koleksiyonu içerebilir, böylece ağaç yapısı oluşturulabilir. showDetails() metodu, tüm öğrencilerin detaylarını görüntüler.