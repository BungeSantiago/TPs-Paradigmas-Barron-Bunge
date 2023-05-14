module Tipos where
import Data.List
type Datos = String
type Etiqueta = String
type Nombre = String

insertar :: Ord a => a -> [a] -> [a]
insertar nuevo lista = sort (nuevo:lista)

