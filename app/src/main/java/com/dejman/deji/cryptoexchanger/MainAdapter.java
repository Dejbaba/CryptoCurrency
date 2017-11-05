package com.dejman.deji.cryptoexchanger;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.ArrayList;

import static com.dejman.deji.cryptoexchanger.R.id.label;
import static com.dejman.deji.cryptoexchanger.R.id.parent;

/**
 * Created by User on 11/3/2017.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {




    private ArrayList<String> mDataset;
    EditText currency;
    TextView result, label;
    double conversion, recover;
    String finalresult, retrieve;








    public MainAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;
    }



















    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(final MainAdapter.ViewHolder holder, int position) {







        holder.mTitle.setText(mDataset.get(position));
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus u.s.dollars")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Dollars");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_dollars();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus british pounds")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in British Pounds");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_british_pound();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus euro")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Euro");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_Euro();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Naira")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Naira");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_Naira();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Brazilian Real")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Brazilian Real");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_brazilian_real();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Albanian Lek")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Albanian Lek");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_albanian_lek();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Algerian Dinar")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Algerian Dinar");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_algerian_dinar();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Angolan Kwanza")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Angolan Kwanza");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_angolan_kwanza();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Argentine Peso")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Argentine Peso");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_argentine_peso();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Bitcoin Versus Austrian Dollars")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Austrian Dollars");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Bitcoin");
                    dialog.show();
                    btc_austrian_dollar();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus u.s.dollars")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Dollars");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_dollars();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus british pounds")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in British Pounds");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_british_pound();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Euro")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Euro");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_Euro();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Naira")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Naira");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_Naira();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Brazilian Real")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Brazilian Real");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_brazilian_real();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Albanian Lek")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Albanian Lek");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_albanian_lek();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Algerian Dinar")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Algerian Dinar");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_algerian_dinar();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Angolan Kwanza")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Angolan Kwanza");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_angolan_kwanza();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Argentine Peso")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Argentine Peso");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_argentine_peso();
                }else if(holder.mTitle.getText().toString().equalsIgnoreCase("Ethereum Versus Austrian Dollars")){
                    final Dialog dialog = new Dialog(v.getContext());
                    dialog.setContentView(R.layout.popup_dialog);
                    currency = (EditText) dialog.findViewById(R.id.value);
                    label = (TextView) dialog.findViewById(R.id.label);
                    label.setText("Enter Amount in Austrian Dollars");
                    result = (TextView) dialog.findViewById(R.id.result);
                    result.setHint("Equivalent Amount in Ethereum");
                    dialog.show();
                    eth_austrian_dollar();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTitle;
        private CardView cardview;


        public ViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.title);



            cardview = (CardView) itemView.findViewById(R.id.cardview);
            cardview.setCardBackgroundColor(Color.MAGENTA);
        }
    }

    private void btc_dollars(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 7426.01) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_british_pound(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 5677.81) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_Naira(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 2647370.78) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_Euro(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 6385.81) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_brazilian_real(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 24594.30) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_albanian_lek(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 852936.81) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_algerian_dinar(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 855059.51) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_angolan_kwanza(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 1231477.62) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_argentine_peso(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 130398.48) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void btc_austrian_dollar(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 9674.53) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }


    private void eth_dollars(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 299.3654) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_british_pound(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 228.9337) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_Naira(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 104180.00) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_Euro(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 257.4173) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_brazilian_real(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 990.46) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_albanian_lek(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 34202.57) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_algerian_dinar(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 34398.00) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_angolan_kwanza(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 49333.75) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_argentine_peso(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 5269.00) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }

    private void eth_austrian_dollar(){
        currency.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {}
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {}
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() == 0 ) {
                    result.setText("");
                }
                else {
                    retrieve = currency.getText().toString();
                    recover = Double.parseDouble(retrieve);
                    conversion = (1 / 390.15) * recover;
                    DecimalFormat decimalFormatter = new DecimalFormat("##.############");
                    decimalFormatter.setMinimumFractionDigits(2);
                    decimalFormatter.setMaximumFractionDigits(15);
                    finalresult = new String(BigDecimal.valueOf(conversion).toPlainString());
                    result.setText(finalresult);
                }

            }
        });
    }










}
