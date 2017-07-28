package com.wgaham.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<CharacterVoice> characterVoiceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCharacterVoices();//    初始化声优列表
        CharacterVoiceAdapter adapter = new CharacterVoiceAdapter(MainActivity.this, R.layout.character_voice_item, characterVoiceList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CharacterVoice characterVoice = characterVoiceList.get(i);
                Toast.makeText(MainActivity.this,characterVoice.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initCharacterVoices() {
        CharacterVoice hzxc = new CharacterVoice("花泽香菜", R.drawable.hzxc);
        characterVoiceList.add(hzxc);
        CharacterVoice zjsz = new CharacterVoice("早见沙织", R.drawable.zjsz);
        characterVoiceList.add(zjsz);
        CharacterVoice dsny = new CharacterVoice("东山奈央", R.drawable.dsny);
        characterVoiceList.add(dsny);
        CharacterVoice myay = new CharacterVoice("茅野爱衣", R.drawable.myay);
        characterVoiceList.add(myay);
        CharacterVoice zcly = new CharacterVoice("佐仓绫音", R.drawable.zcly);
        characterVoiceList.add(zcly);
        CharacterVoice rlyz = new CharacterVoice("日笠阳子", R.drawable.rlyz);
        characterVoiceList.add(rlyz);
        CharacterVoice ndmmz = new CharacterVoice("能登麻美子", R.drawable.ndmmz);
        characterVoiceList.add(ndmmz);
        CharacterVoice sbxw = new CharacterVoice("山本希望", R.drawable.sbxw);
        characterVoiceList.add(sbxw);
        CharacterVoice slq = new CharacterVoice("水濑祈", R.drawable.slq);
        characterVoiceList.add(slq);
        CharacterVoice cqqx = new CharacterVoice("赤崎千夏", R.drawable.cqqx);
        characterVoiceList.add(cqqx);
        CharacterVoice sbj = new CharacterVoice("上坂堇", R.drawable.sbj);
        characterVoiceList.add(sbj);
        CharacterVoice jkyx = new CharacterVoice("井口裕香", R.drawable.jkyx);
        characterVoiceList.add(jkyx);
        CharacterVoice ztls = new CharacterVoice("种田梨沙", R.drawable.ztls);
        characterVoiceList.add(ztls);
        CharacterVoice ccly = new CharacterVoice("村川梨衣", R.drawable.ccly);
        characterVoiceList.add(ccly);
        CharacterVoice ygt = new CharacterVoice("雨宫天", R.drawable.ygt);
        characterVoiceList.add(ygt);
        CharacterVoice acjn = new CharacterVoice("阿澄佳奈", R.drawable.acjn);
        characterVoiceList.add(acjn);
        CharacterVoice ayxsn = new CharacterVoice("安野希世乃", R.drawable.ayxsn);
        characterVoiceList.add(ayxsn);
        CharacterVoice xdcyl = new CharacterVoice("喜多村英梨", R.drawable.xdcyl);
        characterVoiceList.add(xdcyl);
        CharacterVoice fyml = new CharacterVoice("福圆美里", R.drawable.fyml);
        characterVoiceList.add(fyml);
        CharacterVoice ztcm = new CharacterVoice("佐藤聪美", R.drawable.ztcm);
        characterVoiceList.add(ztcm);
    }
/*private String[] character_voice = {"花泽香菜", "早见沙织", "东山奈央", "茅野爱衣", "佐仓绫音", "日笠阳子",
            "能登麻美子", "山本希望", "水濑祈", "赤崎千夏", "上坂堇", "井口裕香", "种田梨沙", "村川梨衣", "雨宫天",
            "阿澄佳奈", "安野希世乃", "喜多村英梨", "福圆美里", "佐藤聪美"};*/
}
