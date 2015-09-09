package com.example.espi.app;




import android.support.v4.app.Fragment;


public class FragmentPageDefinition <T extends Fragment> {
    private String _title;
    private Class<T> _clazz;
    private Fragment _fragment;

    public FragmentPageDefinition(String _title, Class<T> clazz) {
        this._title = _title;
        this._clazz = clazz;
    }

    public String get_title() {
        return _title;
    }

    public Fragment get_fragment() {
        if (this._fragment == null){
            this._fragment = this.CreateFragmentInstance();
        }
        return this._fragment;
    }

    public T CreateFragmentInstance(){
        T result = null;
        try{
            result = this._clazz.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return result;
    }
}