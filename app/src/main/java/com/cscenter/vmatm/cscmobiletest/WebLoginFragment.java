package com.cscenter.vmatm.cscmobiletest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebLoginFragment extends Fragment {

    public WebLoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_web_login, container, false);
        WebView w = (WebView) v.findViewById(R.id.weblogin);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl(getString(R.string.url_with_client_id));
        return v;
    }
}
