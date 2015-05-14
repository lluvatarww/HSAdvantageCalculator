package it.derrik.Modello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class StringheSuggerimenti {
    
    // classe statica stringhe
    
    // suggerimenti salute
    public static String SALUTEBASSATU = "Hai pochi punti vita, attento a magie dirette. \n "
            + "Servitori con Provocazione possono aiutare";
    public static String SALUTEBASSAAVVERSARIO = "L'avversario ha pochi punti vita! Dagli il colpo di grazia!";
    public static String SALUTEALTATU = "Hai molti punti vita, cerca di non perderli";
    public static String SALUTEALTAAVVERSARIO = "L'avversario ha molti punti vita, tieni la board pulita";
    public static String SALUTEMINORE = "Hai meno punti vita dell'avversario, attento a non perderne altri. \n";
    public static String SALUTEMAGGIORE = "Hai più punti vita dell'avversario, cerca di mantenerli";
    
    // suggerimenti danni
    public static String DANNIMAGGIORI = "Puoi fare molti danni,colpisci il nemico";
    public static String DANNIMAGGIORIPROVOCAZIONE = "Distruggi quei servitori con provocazione, cosa aspetti? ";
    public static String DANNIMINORI ="Hai pochi danni in campo, usali per distruggere servitori nemici piuttosto che colpire direttamente il nemico";
    public static String DANNILETALI = "Finisci il nemico! Complimenti, hai vinto!";
    public static String DANNILETALINEMICO = "Il nemico potrebbe ucciderti al prossimo turno, ti servono servitori con provocazione /n"
            + "Oppure pulisci il campo";
    public static String DANNINEMICOPROVOCAZIONE = "Il nemico dovrà distruggere prima i tuoi Provocatori, ben fatto";
    
    //suggerimenti servitori in campo
    public static String NESSUNSERVITORE = "Dovresti avere sempre almeno un servitore in campo";
    public static String SERVITORIMAGGIORI = "Hai più servitori dell'avversario, ottimo";
    public static String SERVITORIMINORI = "Hai meno servitori dell'avversario, bilancia la situazione";
    public static String MOLTISERVITORI = "Hai molti servitori in campo, attento a magie che potrebbero ucciderli tutti";
    public static String SERVITORIPROVOCAZIONE = " Hai in campo dei servitori con provocazione, se puoi cerca di mantenerli in vita";
    public static String SERVITORIPROVOCAZIONEAVV = "L'avversario ha servitori con provocazione, attento a possibili buff";
    public static String NESSUNSERVITORENEMICO = "L'avversario non ha servitori in campo, bene non potrà fare molto, cerca di rimanere così";
    
    //suggerimenti carte in mano
    public static String MOLTECARTEINMANO = "Hai molte carte in mano, è buono perchè hai più opzioni di gioco";
    public static String POCHECARTEINMANO = "Hai poche carte in mano, non hai nulla per pescare?";
    public static String CARTEMAGGIORI = "Hai più carte in mano dell'avversario, bene";
    public static String CARTEMINORI = "Hai meno carte dell'avversario, fai attenzione, potresti non saper come rispondere";
    public static String NESSUNACARTAINMANO = "Non hai carte in mano, forse hai giocato troppe carte insieme";
    public static String NESSUNACARTAAVV = "L'avversario non ha carte in mano, mantieni il campo pulito e avrà poche scelte al prossimo turno";
   
    //suggerimenti carte nel mazzo
    public static String PIUCARTE = "Hai più carte nel mazzo del tuo avversario, se non le ha in mano o sul campo sei in vantaggio";
    public static String MENOCARTE = "Hai meno carte dell'avversario nel mazzo, gioca al meglio quelle che ti rimangono";
    public static String POCHECARTE = "Hai poche carte, fai attenzione a non pescarne troppe tutte insieme, usa con parsimonia quelle che hai in mano";
    public static String POCHECARTEAVV = "All'avversario rimangono poche carte, rendile inutilizzabili";
    public static String POCHISSIMECARTE = "Stai finendo le carte, fai attenzione";
    public static String NESSUNACARTA = "Hai finito le carte, hai abbastanza punti vita per sopravvivere?";
    public static String NESSUNACARTAAVVERSARIO = "L'avversario ha finito le carte, puniscilo";
    
    //suggerimenti turno
    public static String TURNO2 = "Hai un servitore con almeno 2pv? Mettilo in campo";
    public static String TURNO3NOSERVITORI = "forse dovresti giocare un servitore";
    public static String TURNO3NOSERVITORINEMICI ="Il nemico non ha ancora giocato servitori, sei in vantaggio";
    public static String TURNO6 = "Attenzione stai entrando nel mid-game, inizieranno a vedersi servitori di grande valore";
    public static String TURNO10 ="Benvenuto in late-game, fai buon uso di tutti i tuoi cristalli di mana";
    
    // suggerimenti per eroe 

    //suggerimenti cacciatore tu
    public static String POCAVITAAVVCACC = "L'avversario ha pochi punti vita, usa il tuo potere per finirlo, oppure un Ordine di Morte";
    public static String MOLTISERVITORICACC = "Hai molti servitori in campo, attento a non perderli tutti insieme. /n"
            + "Sei sicuro di non averne giocati troppi";
    public static String POCHECARTECACCPOCHISERVAVV = " Hai poche carte, non usarle tutte, potrebbero servirti";
    public static String MOLTISERVITORIAVVCACC = "Il nemico ha molti servitori in campo, potresti usare una trappola esplosiva o squinzaglia i segugi per pulire il campo ";
    public static String UNSERVITOREMOLTAPROVCACC = "Hai un marchio del cacciatore?";
    
    
    // suggerimenti cacciatore avversario
    public static String POCAVITATUCACC = "Attento a non perdere altri punti vita o il cacciatore vincerà col suo potere";
    public static String POCAVITACACCAVV = "Non dargli il tempo di controbbattere, finiscilo";
    public static String PROVOCAZIONECACC = "Distruggi il prima possibile i servitori con provocazione, più turni perdi più danni subirai dal potere del cacciatore";
    public static String TURNO5CACC = "Fai attenzione a possibili combo al prossimo turno";
    public static String POCHECARTECACCAVV = "Il cacciatore ha pochi modi per pescare altre carte, sei in vantaggio";
    
    // suggerimenti druido tu
        
    public static String MOLTISERVITORIAVVDRUIDO = "Pulisci il campo con Pioggia di Stelle o Spazzata";
    public static String POCAVITATUDRUIDO = "Un Tocco Curativo potrebbe aiutarti a sopravvivere";
    public static String POCAPROVOCAZIONEDRUIDO = "Un marchio della natura o un marchio selvaggio potrebbero essere d'aiuto";
    public static String MOLTAPROVOCAZIONEDRUIDO = "Avere molta provocazione ti pone in buona posizione, fai solo attenzione a magie che possono scavalcarla";
    public static String MOLTISERVITORIDRUIDOPOCAVITAAVV = "Un Ruggito Selvaggio o un Potere della Natura ti porteranno alla vittoria";
    
    //suggerimenti druido avversario
    public static String MOLTISERVITORIDRUIDOAVV = " Pulisci il campo il prima possibile, se l'avversario ha Ruggito Selvaggio e/o Potere della Natura potresti perdere ";
    public static String TURNO4DRUIDOAVV = "Proteggi i tuoi servitori da Custode del Bosco e Spazzata";
    public static String TURNO7DRUIDOAVV = "Fai attenzione, da adesso potrebbero entrare in campo servitori come Antico della Guerra, Antico del Sapere o Treant LegnoFerreo \n"
            + " Preparati qualcosa per neutralizzarli";
    public static String POCAVITADRUIDOAVV = "L'avversario ha poca vita, finiscilo il prima possibile oppure potresti pentirtene, i druidi hanno molte carte con provocazione";
    public static String TURNO2DRUIDOAVV = "Se l'avversario gioca crescita rigogliosa aspettati servitori molto forti al prossimo turno ";    
    
    // suggerimenti mago tu
    public static String MAGOTU = "Le tue magie sono un punto di forza, aumenta i danni giocando servitori con +danno magico";
    public static String TURNO2MAGOSERVITORIAVV = "Perchè non distruggere quel servitore con una bel dardo di gelo";
    public static String MOLTISERVITORIAVVMAGO = "Una Tormenta o una Colonna di Fuoco potrebbero ribaltare la situazione";
    public static String TURNO4MAGO = "Hai accesso a carte molto forti come Palla di Fuoco o Elementale dell'Acqua, usali con attenzione";
    public static String NEMICO10PVMAGO = "Ah se pescassi una pirosfera!";
    
    //suggerimenti mago avversario
    public static String MAGOAVV = "Distruggere servitori con +danno magico ti eviterà molti danni";
    public static String TURNO6MAGOAVV = "Non giocare troppi servitori tutti insieme o saranno il bersaglio di una Tempesta o Colonna di Fuoco";
    public static String SALUTE10MAGOAVV = "Speriamo non abbia una Pirosfera sennò sei fritto, è proprio il caso di dirlo";
    public static String TURNO3MAGOAVV = "Attento a magie che possono uccidere i tuoi servitori, giocati quelli con meno valore o con molta salute";
    public static String TURNO7MAGOAVV = "Se l'avversario gioca Antonidas cerca di eliminarlo il prima possibile";

    // suggerimenti ladro tu
    public static String LADROTURNO5 = "Assassinio e Spada dell'Assassino sono delle buone carte da giocare adesso";
    public static String LADROMOLTISERVITORAVV = "Ventaglio di lame e Vortice di lame potrebbero ribaltare la situazione";
    public static String LADROUNSERVITOREAVV = "E' il momento giusto per usare Assassinio o Sabotaggio (o anche Tramortimento)";
    public static String POCHECARTELADRO = "Scatto!";
    public static String POCAVITAAVVLADRO = "Un Assalto Funesto ed hai vinto!";
    
    // suggerimenti ladro avversario
    public static String SERVITORESUBITOLADROAVV = "Fai attenzione, il tuo servitore è un bersaglio ideale per Pugnalata alle Spalle o per un attacco diretto ";
    public static String TURNO3LADROAVV = "Attento a possibili combo Pugnalata alle Spalle, Agente dell'IR:7, Lama della Perdizione ";
    public static String LADROAVV = "Cerca di prevedere possibili combo, se le eviti riduci di molto le abilità dell'avversario";
    public static String SERVITOREMOLTAVITALADROAVVTURNO5 = "Quel servitore è un bersaglio ideale per Assassinio, evita di aumentargli le statistiche";
    public static String SERVITOREPOCAVITALADROAVV= "Quel servitore è un bersaglio ideale per Tramortimento, potresti rimetterci la pelle";

    // suggerimenti guerriero avversario
    public static String MOLTISSIMAVITAGUERRIEROAVV = "Fai attenzione a possibili colpi di scudo, evita quanto più possibile che il guerriero aumenti il suo scudo";
    public static String GUERRIERONOSERVITORIDANNOAVV = "Fai in modo che l'arma del nemico gli provochi più danni di quanti ne fa";
    public static String MOLTISERVITORIGUERRAVV = "Hai molti servitori in campo, aspettati una Rissa (o quantomeno un Turbine o un Fendente)";
    public static String ALTAPROVOCAZIONEGUERRAVV = "Distruggi prima possibile i servitori nemici con Provocazione. \n potrebbero fare molti danni in più con Rabbia Interiore o Comandante Crudele"; 
    public static String TURNO7GUERRAVV = "Fai molta attenzione, il Guerriero può fare molti danni da ora in poi";    
            
    //suggerimenti guerriero tu
    public static String MOLTAVITAGUERRIERO = "Più scudo riesci ad avere meglio è, continua così";
    public static String DUESERVITORIGUERR ="Quesi due servitori sono un bersaglio ideale per Fendente ";
            
            
}   



