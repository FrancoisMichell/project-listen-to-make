package com.grupoA.listentomake;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
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
	
	Button btEntrar, btCriarLogin, btEntrarSemLogin;
	EditText etLogin, etSenha;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        btEntrar = (Button)findViewById(R.id.btEntrar);
        btEntrarSemLogin = (Button)findViewById(R.id.btEntrarSemLogin);
        btCriarLogin = (Button)findViewById(R.id.btCriarLogin);
        etLogin = (EditText)findViewById(R.id.etlogin);
        etSenha = (EditText)findViewById(R.id.etSenha);
        
        btEntrar.setOnClickListener(new View.OnClickListener() {
			
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
        btEntrarSemLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder entrou = new AlertDialog.Builder(MainActivity.this);
				entrou.setTitle("Entrou");
				entrou.setMessage("Vai pra tela principal");
				entrou.setNeutralButton("Fechar", null);
				entrou.show();
			}
		});
		
		btCriarLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder entrou = new AlertDialog.Builder(MainActivity.this);
				entrou.setMessage("Vai pra tela de criação de login");
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
