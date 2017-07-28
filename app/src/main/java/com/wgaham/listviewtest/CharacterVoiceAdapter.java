package com.wgaham.listviewtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zh on 2017/7/28.
 */

public class CharacterVoiceAdapter extends ArrayAdapter<CharacterVoice> {

    private int resourceId;

    public CharacterVoiceAdapter(Context context, int textViewResourceId, List<CharacterVoice> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        CharacterVoice characterVoice = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.characterVoiceImage = (ImageView) view.findViewById(R.id.character_voice_image);
            viewHolder.characterVoiceName = (TextView) view.findViewById(R.id.character_voice_name);
            view.setTag(viewHolder);    //将ViewHloder储存在View中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();   //重新获取ViewHolder
        }
        viewHolder.characterVoiceImage.setImageResource(characterVoice.getImageId());
        viewHolder.characterVoiceName.setText(characterVoice.getName());
        return view;
    }

    class ViewHolder {

        ImageView characterVoiceImage;

        TextView characterVoiceName;

    }
}