package course.examples.MapLocation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class DetailsActivity extends Activity {

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Integer> myImageList = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        list.add("El Perú (en quechua y en aimara: Piruw), oficialmente la República del Perú, es un país soberano del oeste de América del Sur. El océano Pacífico bordea su costa y limita con Ecuador y Colombia al norte, Brasil al este, y Bolivia y Chile al sureste. Su territorio se compone de diversos paisajes: los valles, las mesetas y las altas cumbres de los Andes se despliegan al oeste hacia la costa desértica y al este hacia la Amazonia. Es uno de los países de mayor diversidad biológica del mundo y de mayores recursos minerales.");
        list.add("Brasil, oficialmente República Federativa del Brasil6 7 8 (en portugués: República Federativa do Brasil), es un país soberano de América del Sur que comprende la mitad oriental del subcontinente y algunos grupos de pequeñas islas en el océano Atlántico.\n" +
                "\n" +
                "Con una superficie estimada en más de 8,5 millones de km², es el quinto país más grande del mundo en área total (equivalente a 47 % del territorio sudamericano).9 Delimitado por el océano Atlántico al este, Brasil tiene una línea costera de 7491 km.10 Al norte limita con el departamento ultramarino francés de la Guayana Francesa, Surinam, Guyana y Venezuela; al noroeste con Colombia; al oeste con Perú y Bolivia; al sureste con Paraguay y Argentina, y al sur con Uruguay. De este modo tiene frontera con todos los países de América del Sur, excepto Ecuador y Chile.10 En su mayor parte, el país está comprendido entre los trópicos terrestres, por lo que las estaciones climáticas no se sienten de una manera radical en gran parte del mismo. La selva amazónica cubre 3,6 millones de km² de su territorio. Gracias a su vegetación y a su clima, es uno de los países con más especies de animales en el mundo.");
        list.add("La República Popular de China (chino simplificado: 中华人民共和国, pinyin: Zhōnghuá Rénmín Gònghéguó), o simplemente China (中国, Zhōngguó), es un Estado soberano situado en Asia Oriental. Es el país más poblado del mundo, con más de mil trescientos millones de habitantes y la primera potencia económica mundial por PIB en términos de paridad de poder adquisitivo.7 16 17 La República Popular de China es un Estado unipartidista gobernado por el Partido Comunista y tiene la sede de su gobierno en la capital, Pekín.18 Está dividida en veintidós provincias, cinco regiones autónomas, cuatro municipios bajo jurisdicción central —Pekín, Tianjin, Shanghái y Chongqing— y dos regiones administrativas especiales —Hong Kong y Macao—.19 Asimismo, China reclama la que considera provincia de Taiwán, que es controlada por la República de China con un estatus político de la isla controvertido.");
        list.add("Chile es un país de América ubicado en el extremo sudoeste de América del Sur. Su nombre oficial es República de Chile27 y su capital es la ciudad de Santiago.");
        list.add("España, también denominado Reino de España,nota 1 es un país soberano, miembro de la Unión Europea, constituido en Estado social y democrático de derecho y cuya forma de gobierno es la monarquía parlamentaria. Su territorio, con capital en Madrid, está organizado en diecisiete comunidades autónomas y dos ciudades autónomas, además de cincuenta provincias.15\n" +
                "\n" +
                "Es un país transcontinental que se encuentra situado tanto en Europa Occidental como en el norte de África. En Europa ocupa la mayor parte de la península ibérica, conocida como España peninsular, y el archipiélago de las islas Baleares (en el mar Mediterráneo occidental); en África se hallan las ciudades de Ceuta (en la península Tingitana) y Melilla (en el cabo de Tres Forcas), las islas Canarias (en el océano Atlántico nororiental), las islas Chafarinas (mar Mediterráneo), el peñón de Vélez de la Gomera (mar Mediterráneo), las islas Alhucemas (golfo de las islas Alhucemas), y la isla de Alborán (mar de Alborán). El municipio de Llivia, en los Pirineos, constituye un enclave rodeado totalmente por territorio francés. Completa el conjunto de territorios una serie de islas e islotes frente a las propias costas peninsulares.");
        list.add("Estados Unidos (en inglés United States), oficialmente Estados Unidos de América (United States of America), es un país soberano constituido en república federal constitucional compuesta por 50 estados y un distrito federal. La mayor parte del país se ubica en el centro de América del Norte —donde se encuentran sus 48 estados contiguos y Washington D. C., el distrito de la capital—, entre los océanos Pacífico y el Atlántico, limita con Canadá al norte y con México al sur. El estado de Alaska está en el noroeste del continente, limitando con Canadá al este y separado de Rusia al oeste por el estrecho de Bering. El estado de Hawái es un archipiélago polinesio en medio del océano Pacífico, y es el único estado estadounidense que no se encuentra en América. El país también posee varios territorios en el mar Caribe y en el Pacífico.");




        myImageList.add(R.drawable.peru2);
        myImageList.add(R.drawable.brasil2);
        myImageList.add(R.drawable.china2);
        myImageList.add(R.drawable.chile2);
        myImageList.add(R.drawable.espana2);
        myImageList.add(R.drawable.usa2);
// later...

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        String position = getIntent().getStringExtra("position");
        String titulo = getIntent().getStringExtra("titulo");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        ImageView foto = (ImageView) findViewById(R.id.foto);
        TextView descripcionTextView = (TextView) findViewById(R.id.descripcion);


        titleTextView.setText(titulo);
        foto.setImageResource(myImageList.get(Integer.parseInt((position))));
        descripcionTextView.setText(list.get(Integer.parseInt((position))));

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapLocation.class);
                startActivity(i);
            }
        });

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.uno:
                if (checked){
                    Toast toast = Toast.makeText(context, "1", duration);
                    toast.show();
                }
                    break;
            case R.id.dos:
                if (checked){
                    Toast toast = Toast.makeText(context, "2", duration);
                    toast.show();
                }
                    // Pirates are the best
                    break;
            case R.id.tres:
                if (checked){
                    Toast toast = Toast.makeText(context, "3", duration);
                    toast.show();
                }
                    // Pirates are the best
                    break;
            case R.id.cuatro:
                if (checked){
                    Toast toast = Toast.makeText(context, "4", duration);
                    toast.show();
                }

                    // Pirates are the best
                    break;
            case R.id.cinco:
                if (checked){
                    Toast toast = Toast.makeText(context, "5", duration);
                    toast.show();
                }
                    // Pirates are the best
                    break;

        }
    }
}
