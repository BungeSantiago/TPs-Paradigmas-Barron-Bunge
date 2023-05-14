module Playlist ( Playlist, nuevaP, actualP, skipP, backP, resetP ) 
    where

import Tipos
import Tema

data Playlist = Play Int [Tema] deriving (Eq, Show)


-- Implementaciones:


nuevaP :: [Tema] -> Playlist
-- A partir de una lista de temas crea una nueva Playlist con su ´ındice en cero.
nuevaP (x:xs) = Play 0 (x:xs)
nuevaP [] = Play 0 []

-------------------------------------------------------------------

actualP :: Playlist -> Tema
-- Dada una Playlist devuelve el tema en la posici´on indicada por el ´ındice.
actualP (Play index list) = list !! index

-------------------------------------------------------------------

backP :: Playlist -> Playlist
-- Idem anterior pero con el ´ındice decrementado en uno.
backP (Play index list) = Play (index - 1) list

-------------------------------------------------------------------

resetP :: Playlist -> Playlist
-- Dada una Playlist crea una nueva con la lista de temas de la original.
resetP (Play int lista) = nuevaP lista

-------------------------------------------------------------------

skipP :: Playlist -> Playlist
skipP (Play index list) = Play (index + 1) list

