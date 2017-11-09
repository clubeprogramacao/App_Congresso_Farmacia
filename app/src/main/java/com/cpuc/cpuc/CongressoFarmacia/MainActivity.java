package com.cpuc.cpuc.CongressoFarmacia;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    ListView simpleList2;

    String countryList[] = {"Credenciação", "Cerimónia Oficial de Abertura", "PAINEL I - Anticorpos Monoclonais e Medicamentos Biossimilares",
            "Coffee-break", "PAINEL II - Desenvolvimento e Produção", "Almoço", "PAINEL III - Medicamentos Biológicos na Prática Clínica",
            "Coffee-break ","PAINEL IV - Casos de Sucesso " };
    String horasList[]={"8:30","9:00","9:30","11:00","11:30","13:00","14:30","16:00", "16:30"};
    String desc[]={" ","-João Gabriel Silva (Reitor da UC)* \n-Francisco Veiga (Diretor da FFUC) \n-Ana Cristina Rama (Presidente da Secção Regional do Centro da OF) \n-Alexandre Amado (Presidente da Direção Geral da AAC) \n-Mariana Oliveira (Presidente da Direção do NEF/AAC) \n \n"
            ,"Moderadora: Isabel Vitória Figueiredo\n\n" + "Anticorpos Monoclonais em Imunoterapia \n" +"-João Gonçalves (FFUL)\n \n " + "Biossimilares, o que são?\n" + "-Sérgio Simões (CNC e FFUC) \n \n"
            + "Mecanismos de Resistência à Imunoterapia \n" + "-Ana Bela Sarmento (FMUC) \n \n"
            ," "
            , "Moderadora: Eliana Souto\n\n" +"Importância da Formulação na Atividade de Medicamentos Biológicos \n-João Nuno Moreira (FFUC) \n \n" +
            "Produção e Controlo de Qualidade de Medicamentos Biológicos \n-Maria Henriques Ribeiro (FFUL) \n \n"
            ," "
            , "Moderadoras: Margarida Caramona e Cristina Luxo \n\n"+ "Anticorpos Monoclonais e suas Aplicações Terapêuticas- Visão Geral \n-Carlos Sinogas (Universidade de Évora) \n \n" +
            "Imunoterapia - Uma Revolução na Oncologia\n" + "-Luís Castelo-Branco(Centro Hospitalar e Universitário do Algarve)\n \n" +
            "Imunoterapia com Alergénios \n-Celso Pereira (FMUC) \n \n"
            ," "
            ,"Moderadora:  Alexandrina Mendes\n \n" + "Artrite Reumatóide - Visão do Terapeuta\n" + "-Mary Marques (Reumatologista)\n \n" +
            "Lupus – Visão da Associação\n" + "-A definir\n \n" +
            "Imunoterapia em gastroenterologia\n" + "-Francisco Portela\n \n" };

    String paineis2[] = {"PAINEL V - Medicamentos Biológicos", "Coffee-break" , "PAINEL VI - Investigação, Futuro e Inovação "," Almoço ", "PAINEL VII  -  Terapias Biológicas Para Todos? ", "Sessão de Encerramento" };
    String horasList2 [] = {"9:30","11:00","11:30","13:00","14:30","16:00"};
    String desc2 [] = {"Moderadora: Carla Vitorino\n\n" + "Regulamentação Portuguesa de Medicamentos Biológicos \n-Margarida Menezes (Infarmed, Comité Europeu)* \n \n" +
            "Visão Empresarial  \n-Sofia Corte-Real (Technophage) \n \n"
            ," "
            ,"Moderadora: Cláudia Cavadas\n \n" + "Ensaios Clínicos em Medicamentos Biológicos - Visão do Hospital \n-Sebastião Ferreira da Silva (CHUC)  \n \n" +
            "Desenvolvimento de novas imunoterapias contra infecções bacterianas  \n-Pedro Madureira (Imunethep)\n \n"
            ," "
            ,"Moderadora: Dulce Salzedas* \n \n" + "Economia \n-Margarida Oliveira (Infarmed, I.P.)\n \n" +
            "Painel de discussão \n-Margarida Oliveira (Infarmed, I.P.) \n-Carlos Maurício Barbosa (FFUP)  \n-Catarina Coelho (ARS Centro) \n-Rita Torres Lopes (IPO Coimbra) \n \n "
            , "Atuação de Grupo de Fados Ad aeternum e Porto-Honra "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, horasList,desc);
        simpleList.setAdapter(customAdapter);

        simpleList2 = (ListView) findViewById(R.id.simpleListView2);
        CustomAdapter customAdapter2 = new CustomAdapter(getApplicationContext(), paineis2, horasList2,desc2);
        simpleList2.setAdapter(customAdapter2);
    }
}