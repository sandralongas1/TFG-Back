------------------------------------------PERFILES--------------------------------------------------------------------------------------------------------------------------------
INSERT INTO perfiles (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Administrador', 'ADMIN');
INSERT INTO perfiles (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Usuario', 'USER');

------------------------------------------USUARIOS--------------------------------------------------------------------------------------------------------------------------------
INSERT INTO usuarios (quien, cuando, quien_edita, cuando_edita, activo, nombre, apellidos, dni, telf, direccion, email, usuario, clave, imagen, perfiles_id) VALUES ('system','20250525','system','20250525',1,'Sandra', 'Longas', '49635587m', '693284463','c/lucio','adminsl@gmail.com', 'sandralongas1', '1234', null, 1);

------------------------------------------CATEGORIAS--------------------------------------------------------------------------------------------------------------------------------
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Plantas de interior', 'Plantas');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Plantas de exterior', 'Plantas');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Cactus y suculentas', 'Plantas');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Orquídeas', 'Plantas');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Fertilizantes', 'Productos');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Tratamientos', 'Productos');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Macetas', 'Productos');
INSERT INTO categorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, grupo) VALUES ('system','20250525','system','20250525',1,'Utensilios', 'Productos');

------------------------------------------SUBCATEGORIAS--------------------------------------------------------------------------------------------------------------------------------
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Hoya', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Maranta', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Monstera', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Tillandsia', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Begonia', 1);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Aromáticas', 2);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Frutales', 2);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Camellias', 2);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Rosales', 2);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Bonsái', 2);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Echeverias', 3);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Senecio', 3);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Cactáceas', 3);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Cymbidium', 4);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Phalaenopsis', 4);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Vandas', 4);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Universal', 5);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'De orquídeas', 5);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Mineral', 5);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Bálsamo cicatrizante', 6);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Enraizante', 6);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Insecticida', 6);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Fungicidas sistémicos', 6);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'10 cm', 7);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'20 cm', 7);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'30 cm', 7);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'40 cm', 7);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'50 cm', 7);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Tutores', 8);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Herramientas manuales', 8);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Macramé', 8);
INSERT INTO subcategorias (quien, cuando, quien_edita, cuando_edita, activo, descripcion, categorias_id) VALUES ('system','20250525','system','20250525',1,'Invernaderos de mesa', 8);

------------------------------------------PRODUCTOS--------------------------------------------------------------------------------------------------------------------------------
-- Interior - Hoya (id=1)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hoya Carnosa','Planta trepadora con hojas cerosas y flores aromáticas.',15.50,8,NULL,1);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hoya Kerrii','Conocida como planta corazón, ideal para interiores.',18.00,5,NULL,1);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hoya Pubicalyx','Planta colgante con hojas moradas y rosadas.',20.00,3,NULL,1);

-- Interior - Maranta (id=2)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maranta Leuconeura','Planta con hojas decorativas que se pliegan por la noche.',12.00,10,NULL,2);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maranta lime','Variedad con hojas verdes y marcas rojas.',14.00,6,NULL,2);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maranta Kerchoveana','Follaje colorido ideal para ambientes con poca luz.',13.50,7,NULL,2);

-- Interior - Monstera (id=3)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Monstera Deliciosa','Planta tropical con hojas grandes y perforadas.',18.99,10,NULL,3);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Monstera Adansonii','Planta colgante con hojas perforadas pequeñas.',22.50,4,NULL,3);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Mini Monstera','Variedad compacta y rápida de crecer.',20.00,8,NULL,3);

-- Interior - Tillansia (id=4)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tillandsia Ionantha','Planta aérea fácil de cuidar y decorar.',12.50,9,NULL,4);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tillandsia Xerographica','Planta grande con hojas enrolladas y rígidas.',30.00,2,NULL,4);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tillandsia Bulbosa','Con hojas en forma de bulbo que retienen humedad.',14.00,7,NULL,4);

-- Interior - Alocasia (id=5)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Jakelyn','Alocasia de hojas grandes con patrón oscuro.',25.00,7,NULL,5);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Cuprea','Planta con hojas metálicas de color cobre.',28.50,5,NULL,5);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Escama de Dragón','Hojas escamosas y decorativas.',30.00,3,NULL,5);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Escama de Dragón Silver','Variedad plateada y elegante.',33.00,4,NULL,5);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Polly','Compacta con patrón verde y morado.',22.00,8,NULL,5);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Alocasia Zebrina','Pecíolos rayados similares a piel de cebra.',27.00,6,NULL,5);

-- Interior - Begonia (id=6)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Begonia Rex','Hojas coloridas y texturizadas.',16.00,9,NULL,6);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Begonia Maculata','Famosa por sus hojas con manchas blancas.',18.00,7,NULL,6);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Begonia Elatior','Flores rosas y follaje ornamental.',14.00,8,NULL,6);

-- Exterior - Aromáticas (id=7)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Albahaca','Hierba aromática común en cocina.',5.00,20,NULL,7);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Romero','Planta aromática resistente.',6.50,15,NULL,7);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tomillo','Hierba de aroma fuerte y sabor intenso.',4.50,12,NULL,7);

-- Exterior - Frutales (id=8)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fresa','Planta frutal fácil de cultivar.',8.00,14,NULL,8);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Frambuesa','Frutal con frutos rojos dulces.',9.00,10,NULL,8);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Arándano','Frutal de bayas azules.',10.00,7,NULL,8);

-- Exterior - Camellias (id=9)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Camellia Japonica','Flor de invierno, hojas brillantes.',12.00,10,NULL,9);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Camellia Sinensis','Planta de té, hojas para infusiones.',15.00,8,NULL,9);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Camellia Reticulata','Flor grande y vistosa.',13.00,6,NULL,9);

-- Exterior - Rosales (id=10)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Rosal Clásico','Rosas rojas clásicas.',10.00,20,NULL,10);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Rosal Miniatura','Rosas pequeñas para interiores.',9.50,15,NULL,10);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Rosal Ingles','Variedad antigua con flores aromáticas.',11.00,8,NULL,10);

-- Exterior - Bonsay (id=11)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bonsai Ficus','Pequeño árbol ornamental.',30.00,5,NULL,11);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bonsai Pino','Pino en miniatura para decoración.',35.00,3,NULL,11);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bonsai Arce','Arce japonés en miniatura.',40.00,2,NULL,11);

-- Cactus y Suculentas - Echeverias (id=12)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Echeveria Elegans','Suculenta con hojas en forma de rosa.',12.00,10,NULL,12);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Echeveria Lola','Variedad con tonos rosados.',14.00,7,NULL,12);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Echeveria Black Prince','Hojas oscuras y puntiagudas.',15.50,5,NULL,12);

-- Cactus y Suculentas - Senecio (id=13)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Senecio Rowleyanus','Planta colgante con hojas en forma de perlas.',13.00,8,NULL,13);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Senecio Mandraliscae','Hojas largas y planas.',12.00,6,NULL,13);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Senecio Vitalis','Suculenta con hojas verdes.',14.00,4,NULL,13);

-- Cactus y Suculentas - Cactáceas (id=14)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Cactus Echinopsis','Cactus redondo con flores coloridas.',10.00,10,NULL,14);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Cactus Mammillaria','Pequeño cactus con espinas cortas.',8.50,14,NULL,14);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Cactus Ferocactus','Cactus grande con espinas robustas.',15.00,5,NULL,14);

-- Orquídeas - Cymbidium (id=15)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Orquídea Cymbidium Verde','Flores grandes y fragantes.',20.00,6,NULL,15);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Orquídea Cymbidium Amarilla','Floración intensa y duradera.',22.50,4,NULL,15);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Orquídea Cymbidium Rosa','Variedad de flores rosadas.',21.00,5,NULL,15);

-- Orquídeas - Phalaenopsis (id=16)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Phalaenopsis Blanca','Orquídea clásica de flores blancas.',18.00,10,NULL,16);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Phalaenopsis Morada','Flores moradas intensas.',19.50,8,NULL,16);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Phalaenopsis Amarilla','Color vibrante y cuidado sencillo.',17.00,7,NULL,16);

-- Orquídeas - Vandas (id=17)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Vanda Azul','Orquídea de flores azules.',25.00,3,NULL,17);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Vanda Morada','Flores vistosas y duraderas.',27.00,2,NULL,17);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Vanda Blanca','Variedad elegante y delicada.',24.00,4,NULL,17);

-- Fertilizantes - Universal (id=18)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Universal 1L','Mezcla equilibrada para todo tipo de plantas.',10.00,15,NULL,18);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Universal 500ml','Rápida absorción y resultados visibles.',6.00,20,NULL,18);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Universal Orgánico','Fertilizante natural y respetuoso.',12.00,10,NULL,18);

-- Fertilizantes - De Orquídeas (id=19)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Orquídeas 1L','Nutrición especial para orquídeas.',15.00,12,NULL,19);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Orquídeas 500ml','Con microelementos esenciales.',9.00,10,NULL,19);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Orquídeas Orgánico','Ecológico y seguro para orquídeas.',18.00,5,NULL,19);

-- Fertilizantes - Mineral (id=20)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Mineral 1kg','Mezcla concentrada de minerales.',8.00,20,NULL,20);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Mineral 500g','Alta concentración mineral.',5.00,25,NULL,20);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fertilizante Mineral Líquido','Fácil absorción y aplicación.',9.50,15,NULL,20);

-- Tratamientos - Bálsamo cicatrizante (id=21)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bálsamo Cicatrizante 50ml','Cuidado para plantas heridas y cortes.',7.00,30,NULL,21);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bálsamo Cicatrizante 100ml','Protección rápida y duradera.',12.00,20,NULL,21);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Bálsamo Cicatrizante Orgánico','Natural y seguro para plantas.',15.00,15,NULL,21);

-- Tratamientos - Enraizamiento (id=22)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hormona Enraizante 50ml','Estimula raíces fuertes y sanas.',9.00,25,NULL,22);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hormona Enraizante 100ml','Para esquejes y trasplantes.',14.00,15,NULL,22);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Hormona Enraizante Orgánica','Fórmula natural y efectiva.',18.00,10,NULL,22);

-- Tratamientos - Insecticida (id=23)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Insecticida Natural 250ml','Elimina plagas sin dañar plantas.',12.00,20,NULL,23);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Insecticida Concentrado 500ml','Fuerte acción contra insectos.',18.00,10,NULL,23);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Insecticida Orgánico 100ml','Seguro para cultivos ecológicos.',15.00,15,NULL,23);

-- Tratamientos - Fungicidas sistémicos (id=24)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fungicida Sistémico 250ml','Protección total contra hongos.',14.00,12,NULL,24);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fungicida Sistémico 500ml','Alta efectividad y duración.',20.00,8,NULL,24);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Fungicida Orgánico 100ml','Alternativa ecológica para hongos.',18.00,10,NULL,24);

-- Macetas - 10 cm (id=25)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 10 cm Plástico','Maceta pequeña para plantas jóvenes.',3.00,50,NULL,25);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 10 cm Barro','Maceta de barro tradicional.',5.00,40,NULL,25);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 10 cm Cerámica','Decorativa y resistente.',8.00,30,NULL,25);

-- Macetas - 20 cm (id=26)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 20 cm Plástico','Ideal para plantas medianas.',5.50,35,NULL,26);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 20 cm Barro','Material natural y poroso.',7.50,25,NULL,26);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 20 cm Cerámica','Acabado esmaltado y decorativo.',10.00,20,NULL,26);

-- Macetas - 30 cm (id=27)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 30 cm Plástico','Para plantas grandes.',8.00,25,NULL,27);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 30 cm Barro','Clásica y resistente.',10.50,15,NULL,27);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 30 cm Cerámica','Perfecta para interiores.',13.00,10,NULL,27);

-- Macetas - 40 cm (id=28)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 40 cm Plástico','Ideal para arbustos pequeños.',12.00,15,NULL,28);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 40 cm Barro','Resistente y elegante.',15.00,10,NULL,28);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 40 cm Cerámica','Acabado esmaltado.',18.00,8,NULL,28);

-- Macetas - 50 cm (id=29)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 50 cm Plástico','Gran tamaño para plantas grandes.',15.00,10,NULL,29);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 50 cm Barro','Ideal para exteriores.',18.00,8,NULL,29);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Maceta 50 cm Cerámica','Estética y funcional.',20.00,6,NULL,29);

-- Utensilios - Tutores (id=30)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tutores de Bambú 50cm','Soporte natural para plantas.',3.50,60,NULL,30);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tutores de Metal 70cm','Resistentes y duraderos.',5.00,40,NULL,30);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tutores Plásticos 40cm','Flexibles y fáciles de usar.',4.00,50,NULL,30);

-- Utensilios - Herramientas manuales (id=31)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Tijeras de Podar','Perfectas para ramas pequeñas.',12.00,25,NULL,31);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Paleta de Jardinería','Ideal para trasplantes.',8.00,30,NULL,31);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Rastrillo Manual','Para limpiar tierra.',10.00,20,NULL,31);

-- Utensilios - Macramé (id=32)
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Colgante Macramé Pequeño','Decorativo para plantas colgantes.',14.00,15,NULL,32);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Colgante Macramé Mediano','Ideal para plantas medianas.',20.00,10,NULL,32);
INSERT INTO productos (quien, cuando, quien_edita, cuando_edita, activo, titulo, descripcion, precio, stock, imagen, subcategorias_id) VALUES ('system','20250525','system','20250525',1,'Colgante Macramé Grande','Perfecto para plantas grandes.',25.00,8,NULL,32);

------------------------------------------ESTADOS--------------------------------------------------------------------------------------------------------------------------------
INSERT INTO estados (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Confirmado', 'CHECK');
INSERT INTO estados (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Preparando', 'PRE');
INSERT INTO estados (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Enviado', 'ENV');
INSERT INTO estados (quien, cuando, quien_edita, cuando_edita, activo, descripcion, valor) VALUES ('system','20250525','system','20250525',1,'Entregado', 'FIN');


------------------------------------------NOTICIAS--------------------------------------------------------------------------------------------------------------------------------
