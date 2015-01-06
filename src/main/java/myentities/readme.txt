Aim is the following
--------------------

Taart    >-------<  Soort
                   (owner)
         BIDIRECTIONAL
         
Taart kan tot meerdere soorten behoren (vb marsepein, chocolade.. ) 
Een soort kan ook natuurlijk behoren tot meerdere Taarten

==> implemented

Bestelling   >-----< Taart 
ordernummer     
(owner)                     
             UNIDIRECTIONAL
             van bestelling nr taart (ik moet niet van taart nr bestelling kunnen gaan)
                               
Een bestelling kan 1 of meerdere taarten bevatten
een taart kan tot meerdere bestellingen horen



klant ----<  bestelling
              (owner)
       BIDIRECTIONAL
       
een klant kan meerdere bestellingen doen
een bestelling kan maar tot 1 klant behoren

Klant is abstract, er zijn 2 soorten
 - FamilieKlant: de familie
 - VriendelijkeKlant: ne vriendelijke mens die is een taartje wil