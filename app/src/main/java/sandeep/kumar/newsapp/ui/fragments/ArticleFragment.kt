package sandeep.kumar.newsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sandeep.kumar.newsapp.R
import sandeep.kumar.newsapp.ui.activity.NewsActivity
import sandeep.kumar.newsapp.ui.viewmodel.NewsViewModel


class ArticleFragment : Fragment(R.layout.fragment_article) {


    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}