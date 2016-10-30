# SimpleAnimationLogin

in this repository I'll show you about Simple Animation Login based with XML Animation and `PropertyValuesHolder.onfloat()`.

## Demo

![screensimple-animation](https://github.com/rakamaheka22/SimpleAnimationLogin/blob/master/demo/screenrecord.gif)

## Configuration

For configure the Animation with `PropertyValuesHolder.onfloat()` you can setting in here. Also, you can use `ObjectAnimator.ofPropertyValuesHolder()` to set Animation.
```java
 PropertyValuesHolder alpha = PropertyValuesHolder.ofFloat("alpha", 0, 1); //for animation fade in
 PropertyValuesHolder trans = PropertyValuesHolder.ofFloat("translationY", 0, -280); //for animation move to up

 //Setup animation edittext username
 editTextUsername = (EditText) findViewById(R.id.editText_username); //Declare edittext username
 ObjectAnimator edUsername = ObjectAnimator.ofPropertyValuesHolder(editTextUsername, alpha, trans); //set ObjectAnimator from animation  alpha and trans
 edUsername.setDuration(2000); //set duration for animation
 edUsername.start(); //start animation
```

And to setting the Animation with XML Resources you can check **res/anim/flying_logo.xml** and **res/anim/show_logo.xml**

## Credits

- Bump Technologies - [GitHub](https://github.com/bumptech)
	- For image loading and caching library

## Developed By

* Raka Maheka Auramuwahid 
 * [Raka Maheka Auramuawahid](http://facebook.com/mahekacreative) - <rakamaheka@gmail.com>

## License

Copyright 2016 Raka Maheka Auramuwahid

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
