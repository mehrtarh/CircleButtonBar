
<div id="readme" class="readme blob instapaper_body">
 <article class="markdown-body entry-content" itemprop="text"><h1><a id="user-content-bottombar" class="anchor" aria-hidden="true" href="#bottombar"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>BottomNavigationBar</h1>
<h2><a id="user-content-version-10-released" class="anchor" aria-hidden="true" href="#version-10-released"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>Version 1.1. released!</h2>
<p><a href="https://github.com/mehrtarh/CircleButtonBar">The latest version before that can be found in the v1 branch</a></p>
<ul>
<li>Cleaner code and Easy to use</li>


<h2><a id="user-content-gimme-that-gradle-sweetness-pls" class="anchor" aria-hidden="true" href="#gimme-that-gradle-sweetness-pls"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>How to add dependency in your project</h2>

<p><strong>Add it in your root build.gradle at the end of repositories:</strong></p>
<div class="highlight highlight-text-xml"><pre><span class="pl-ent">allprojects {</span>
 <span class="pl-ent"></span><span class="pl-ent">repositories {</span>
  <span class="pl-ent"></span>maven { url 'https://jitpack.io' }<span class="pl-ent"></span>
  <span class="pl-ent">   </span><span class="pl-ent"></span>}
 <span class="pl-ent"></span>}<span class="pl-ent"></span>


<p><strong>Add the dependency:</strong></p>
<div class="highlight highlight-text-xml"><pre><span class="pl-ent">dependencies {</span>
<span class="pl-ent">   </span><span class="pl-ent"></span>
 <span class="pl-ent"></span><span class="pl-ent"> compile 'com.github.mehrtarh:CircleButtonBar:v1.1.2'</span>
 <span class="pl-ent">   </span><span class="pl-ent"></span>
  <span class="pl-ent"></span>}<span class="pl-ent"></span>

<h2><a id="user-content-how" class="anchor" aria-hidden="true" href="#how"><svg class="octicon octicon-link"  version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>How to use it ?</h2>
<p>First add code in xml.</p>

<div class="highlight highlight-text-xml"><pre> &lt;<span class="pl-ent">com.itparsa.circlenavigation.CircleNavigationView</span>
                <span class="pl-e">android:id="@+id/navigation"</span>
                <span class="pl-e">android:layout_width="match_parent"</span>
                <span class="pl-e">android:layout_height="?attr/actionBarSize"</span>
                <span class="pl-e">android:layout_alignParentBottom="true"</span>
                <span class="pl-e">app:inactive_center_button_icon_color="#ffffff"</span>
                <span class="pl-e">app:active_center_button_background_color="#ec4545"</span>
                <span class="pl-e">app:active_center_button_icon_color="#97d221"</span>
                <span class="pl-e">app:active_item_color="#f59b46"</span>
                <span class="pl-e">app:center_button_color="#a560cf"</span>
                <span class="pl-e">app:center_button_icon="@drawable/ic_home"</span>
                <span class="pl-e">app:inactive_item_color="#ffff"</span>
                <span class="pl-e">app:space_background_color="#078d9c"</span> /<span class="pl-ent"></span>&gt;</pre></div>

<p>you can add tab by code:</p>

<div class="highlight highlight-text-xml"><pre> &lt;<span class="pl-ent">com.itparsa.circlenavigation.CircleNavigationView</span>
                <span class="pl-e">
           CircleNavigationView mCircleNavigationView;
           mCircleNavigationView = (CircleNavigationView)findViewById(R.id.navigation);
           mCircleNavigationView.initWithSaveInstanceState(savedInstanceState);
           mCircleNavigationView.setCenterButtonSelectable(true);
           mCircleNavigationView.addCircleItem(new CircleItem("setting", R.drawable.ic_settings));
           mCircleNavigationView.addCircleItem(new CircleItem("profile", R.drawable.ic_person));
           mCircleNavigationView.addCircleItem(new CircleItem("chat", R.drawable.ic_chat));
           mCircleNavigationView.addCircleItem(new CircleItem("share", R.drawable.ic_share));
  </span>
<span class="pl-e">
           mCircleNavigationView.setCircleOnClickListener(new CircleOnClickListener() {
               @Override
               public void onCenterButtonClick() {
     </span>
<span class="pl-e">
               }
  </span>
   <span class="pl-e">
               @Override
               public void onItemClick(int itemIndex, String itemName) {
  </span>
   <span class="pl-e">
               }
  </span>
   <span class="pl-e">
               @Override
               public void onItemReselected(int itemIndex, String itemName) {
  </span>
   <span class="pl-e">
               }
           });
  </span>

![bottom_bar.png](app/src/main/res/drawable/bottom_bar.png)

<h2><a id="user-content-license" class="anchor" aria-hidden="true" href="#license"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>License</h2>
<pre><code>CircleBottomBar library for Android

Copyright (c) 2018 Mehran Jafari (https://github.com/mehrtarh/CircleButtonBar).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0


Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</code></pre>
</article>
  </body>
</html>

