package app.ito.akki.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    val people = arrayOf("おっちー","まっすー","しんぺー","おんじ")
    val food = arrayOf("カレー","味噌汁","チャーハン","エビチリ")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(View:View?){
        val randomName = Random//Randomクラスの新しいインスタンスを初期化
        val index = randomName.nextInt(4) //０−３までの乱数を生成
        val name = people[index] //index番目の配列要素をnameに代入
        nameTextView.text = name + "に" //nameをnameTextViewに表示

        foodTextView.text = food[Random.nextInt(4)]+"を"

        if(Random.nextInt(100)<50){
            verbTextView.text= "よそえました"
        }else{
            verbTextView.text="よそえませんでした"
        }
    }
}