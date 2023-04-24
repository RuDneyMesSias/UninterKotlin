/**
 * 1. Declaração do pacote
 */

package com.example.applicationuninter

/**
 * 2. Todas as classes que vamos utilizar. Nesse caso, estamos importando a classe AppCompatActivity,
 * que será a classe-mãe da classe MainActivity, criada no projeto.
 */
/**
 * A classe Bundle, também importada, é usada dentro do método onCreate(bundle). É como se ela fosse
 * uma HashTable que tem uma estrutura de dados de chave e valor, utilizanda para passar parâmetros
 * para a activity.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * 3. Criada a classe MainActivity. Os dois-pontos configuram o sinal de herança do kotlin.
 */
class MainActivity : AppCompatActivity() {
    /**
     * 4. declarando o método onCreate(bundle). Veja que o método foi anotado como a palavra
     * reservada override, pois estamos sobreescrevendo esse método da classe-mãe. Na verdade,
     * somos obrigados a fazer isso.
     */

    /**
     * Saiba , desde já, que uma activity é uma tela do seu aplicativo, e o on Create(bundle) é
     * o método chamado para inicializar a tela com algum layout EXL. Esse método será chamado
     * apenas uma vez, mas vamos estudar esse e todos os métodos que fazem parte do ciclo de
     * vida de uma activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        /**
         * 5. A linha setContentView(R.layout.activity_main) faz a mágica de mostrar um layout na
         * tela. O arquivo de layout pode ser encontrado na pasta src/main/res/layout/activity_main.xml
         */

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/**
 * Para construir uma tela no Android, sempre temos essa dupla formada pela classe da
 * Activity (onde fica o código e a lógica) e o seu arquivo XML de layout (onde fica o design da tela)
 */