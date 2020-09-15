public  class  App {
    public  static  void  main ( String [] args ) {
        Relogio relogio1 =  novo  Relogio ( 8 , 59 , 56 );
        Relogio relogio2 =  novo  Relogio ( 18 , 30 , 11 );

        Sistema . para fora . println (relogio1 . exibirHoraUniversal ());
        Sistema . para fora . println (relogio1 . exibirHoraAmPm ());
        Sistema . para fora . println (relogio2 . exibirHoraUniversal ());
        Sistema . para fora . println (relogio2 . exibirHoraAmPm ());

        para ( int i =  0 ; i <  10 ; i ++ ) {
            relogio1 . avancarHora ();
            Sistema . para fora . println (relogio1 . exibirHoraUniversal ());
        }

        Sistema . para fora . printf ( " \ n % d.% d.% d \ n " , relogio1 . getHora (), relogio1 . getMinuto (), relogio1 . getSegundo ());
    }
}