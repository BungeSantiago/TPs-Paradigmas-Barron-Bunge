module Tema (Tema, nuevoT, nombreT, datosT, etiquetasT, agregarT, aplicaT) 
where
import Tipos

data Tema = Tem Nombre [Etiqueta] Datos deriving (Eq, Show, Ord)

nuevoT :: Nombre -> Datos -> Tema
nuevoT nombre  = Tem nombre [] 

nombreT :: Tema -> Nombre
nombreT (Tem nombre _ _) = nombre

datosT :: Tema -> Datos
datosT (Tem _ _ datos) = datos

etiquetasT :: Tema -> [Etiqueta]
etiquetasT (Tem _ etiquetas _) = etiquetas

agregarT :: Etiqueta -> Tema -> Tema
agregarT etiqueta (Tem nombre etiquetas datos) = Tem nombre (etiqueta:etiquetas) datos

aplicaT :: Etiqueta -> Tema -> Bool
aplicaT etiqueta (Tem _ etiquetas _) = elem etiqueta etiquetas
