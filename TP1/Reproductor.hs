module Reproductor (Reproductor, nuevoR, archivosR, listaParaR, temasR, playR, actualR, avanzarR, retrocederR, 
reiniciarR)
    where

import Tipos (Etiqueta)
import Tema (Tema, agregarT, nuevoT)
import Playlist (Playlist, actualP, backP, nuevaP, resetP, skipP)
import FileSystem (FileSystem, agregarF, filtrarF, nuevoF, temasF)
data Reproductor = RP FileSystem Playlist deriving (Eq, Show)





-------------------------------------------------------------------

nuevoR :: FileSystem -> Reproductor
-- Crea un nuevo reproductor a partir de un FileSystem y una nueva Playlist con su lista de temas vacıa.
nuevoR fsys = RP fsys (nuevaP [])

-------------------------------------------------------------------

archivosR :: Reproductor -> FileSystem
archivosR (RP fsys _) = fsys

-------------------------------------------------------------------

listaParaR :: Etiqueta -> Reproductor -> [Tema]
listaParaR etiqueta (RP fsys _) = filtrarF etiqueta fsys

-------------------------------------------------------------------

temasR :: Reproductor -> [Tema]
temasR (RP fsys _) = temasF fsys

-------------------------------------------------------------------

playR :: Reproductor -> Etiqueta -> Reproductor
playR (RP fsys p) etiqueta = RP fsys (nuevaP (listaParaR etiqueta (RP fsys p)))

-------------------------------------------------------------------

actualR :: Reproductor -> Tema
actualR (RP _ playlist) = actualP  playlist

-------------------------------------------------------------------

avanzarR :: Reproductor -> Reproductor
avanzarR (RP fsys playlist) = RP fsys (skipP playlist)

-------------------------------------------------------------------

retrocederR :: Reproductor -> Reproductor
retrocederR (RP fsys playlist) = RP fsys (backP playlist)

-------------------------------------------------------------------

reiniciarR :: Reproductor -> Reproductor
reiniciarR (RP fsys playlist) = RP fsys (resetP playlist)
