package com.example.a2022realproject_pmplusapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mShipAdapter extends RecyclerView.Adapter <mShipAdapter.ViewHolder>{

    ArrayList<mshipdata_Item> items = new ArrayList<mshipdata_Item>();

    public void setItems(ArrayList<mshipdata_Item> items){
        this.items = items;
    }

    public void clearItems(){
        items.clear();
    }
    public void addItem(mshipdata_Item item) {
        items.add(item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.mshipdata_adapter, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        mshipdata_Item item =items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView a_m_prtAgCd;
        TextView a_m_prtAgNm;
        TextView a_m_clsgn;
        TextView a_m_vsslNm;
        TextView a_m_vsslNltyNm;
        TextView a_m_vsslKndNm;
        TextView a_m_vsslGrtg;
        TextView a_m_aprtfEtryptDt;

        TextView a_m_harborEntrpsNm;
        TextView a_m_cntrlNm;
        TextView a_m_cntrlOpertDt;
        TextView a_m_fcltyCd;
        TextView a_m_fcltySubCd;
        TextView a_m_fcltyNm;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            a_m_prtAgCd = itemView.findViewById(R.id.mshipdata_adapter_m_prtAgCd);
            a_m_prtAgNm = itemView.findViewById(R.id.mshipdata_adapter_m_prtAgNm);
            a_m_clsgn = itemView.findViewById(R.id.mshipdata_adapter_m_clsgn);
            a_m_vsslNm = itemView.findViewById(R.id.mshipdata_adapter_m_vsslNm);
            a_m_vsslNltyNm = itemView.findViewById(R.id.mshipdata_adapter_m_vsslNltyNm);
            a_m_vsslKndNm = itemView.findViewById(R.id.mshipdata_adapter_m_vsslKndNm);
            a_m_vsslGrtg = itemView.findViewById(R.id.mshipdata_adapter_m_vsslGrtg);
            a_m_aprtfEtryptDt = itemView.findViewById(R.id.mshipdata_adapter_m_aprtfEtryptDt);

            a_m_harborEntrpsNm = itemView.findViewById(R.id.mshipdata_adapter_m_harborEntrpsNm);
            a_m_cntrlNm = itemView.findViewById(R.id.mshipdata_adapter_m_cntrlNm);
            a_m_cntrlOpertDt = itemView.findViewById(R.id.mshipdata_adapter_m_cntrlOpertDt);
            a_m_fcltyCd = itemView.findViewById(R.id.mshipdata_adapter_m_fcltyCd);
            a_m_fcltySubCd = itemView.findViewById(R.id.mshipdata_adapter_m_fcltySubCd);
            a_m_fcltyNm = itemView.findViewById(R.id.mshipdata_adapter_m_fcltyNm);

        }

        public void setItem(mshipdata_Item item){
            a_m_prtAgCd.setText(item.m_prtAgCd);
            a_m_prtAgNm.setText(item.m_prtAgNm);
            a_m_clsgn.setText(item.m_clsgn);
            a_m_vsslNm.setText(item.m_vsslNm);
            a_m_vsslNltyNm.setText(item.m_vsslNltyNm);
            a_m_vsslKndNm.setText(item.m_vsslKndNm);
            a_m_vsslGrtg.setText(item.m_vsslGrtg);
            a_m_aprtfEtryptDt.setText(item.m_aprtfEtryptDt);

            a_m_harborEntrpsNm.setText(item.m_harborEntrpsNm);
            a_m_cntrlNm.setText(item.m_cntrlNm);
            a_m_cntrlOpertDt.setText(item.m_cntrlOpertDt);
            a_m_fcltyCd.setText(item.m_fcltyCd);
            a_m_fcltySubCd.setText(item.m_fcltySubCd);
            a_m_fcltyNm.setText(item.m_fcltyNm);

        }
    }
}
