module FileSystem ( FileSystem, nuevoF, etiquetasF, temasF, agregarF, filtrarF )
    where

import Tipos ( insertar, Etiqueta )
import Tema ( aplicaT, etiquetasT, Tema )

data FileSystem = FS [Etiqueta] [Tema] deriving (Eq, Show) 



nuevoF :: FileSystem
-- Crea un nuevo FileSystem con sus listas vac´ıas.
nuevoF = FS [] []

-------------------------------------------------------------------

etiquetasF :: FileSystem -> [Etiqueta]
etiquetasF (FS etiquetas temas) = etiquetas

-------------------------------------------------------------------

temasF :: FileSystem -> [Tema]
temasF (FS etiquetas temas) = temas

-------------------------------------------------------------------


agregarF :: Tema -> FileSystem -> FileSystem
agregarF tema (FS etiquetas temas) = FS (foldr insertun (etiquetasT tema) etiquetas) (insertun tema temas)
  where
    insertun elemento lista
      | elemento `notElem` lista = insertar elemento lista
      | otherwise = lista

-------------------------------------------------------------------

filtrarF :: Etiqueta -> FileSystem -> [Tema]
filtrarF etiqueta (FS etiquetas temas) = [x | x <- temas, aplicaT etiqueta x]