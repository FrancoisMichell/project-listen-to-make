package com.francois.teste2;

import org.w3c.dom.Text;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	Button entar, entrarSemLogin, criarLogin;
	EditText login, senha;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        entar = (Button)findViewById(R.id.btEntrar);
        entrarSemLogin = (Button)findViewById(R.id.btEntrarSemLogin);
        criarLogin = (Button)findViewById(R.id.btCriarLogin);
        login = (EditText)findViewById(R.id.digitaLogin);
        senha = (EditText)findViewById(R.id.digitaSenha);
        
        entar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Função que verificaria o login e a senha
				//no banco de dados...
				
				//Se estiver certo:
				AlertDialog.Builder entrou = new AlertDialog.Builder(MainActivity.this);
				entrou.setTitle("Entrou");
				entrou.setMessage("Login efetuado com sucesso");
				entrou.setNeutralButton("Fechar", null);
				entrou.show();
				
			}
		});
		entrarSemLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder entrou = new AlertDialog.Builder(MainActivity.this);
				entrou.setTitle("Entrou");
				entrou.setMessage("Vai pra tela principal");
				entrou.setNeutralButton("Fechar", null);
				entrou.show();
			}
		});
		
		criarLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder entrou = new AlertDialog.Builder(MainActivity.this);
				entrou.setMessage("Vai pra tela de criação de lo");
				entrou.setNeutralButton("Fechar", null);
				entrou.show();
				
			}
		});
			
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
