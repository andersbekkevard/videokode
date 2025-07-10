# Static vs Non-Static Variables and Methods In Java - Full Simple Tutorial

00:00:00.000 when I was first learning Java in
00:00:01.800 college I remember one of the first
00:00:03.240 things that really stumped me was static
00:00:05.460 versus non-static variables and methods
00:00:08.160 it just wasn't clicking for me and I
00:00:10.260 felt so lost so if you feel the same way
00:00:12.420 believe me it's not just you here we'll
00:00:14.639 go over exactly what the static keyword
00:00:16.800 means for both fields and methods with
00:00:19.140 plenty of examples and you'll know
00:00:20.699 exactly when to make something static or
00:00:22.980 non-static but first I also have a full
00:00:25.019 Java course available in the link down
00:00:26.820 in the description there you'll find
00:00:28.320 over eight hours of exclusive video
00:00:30.300 lessons covering dozens of java topics
00:00:32.520 so if you haven't yet go check it out
00:00:34.260 now so what is static versus non-static
00:00:37.200 well it's often helpful to start with an
00:00:39.000 example so let's do that here so here I
00:00:41.160 have my cat class now this cat class has
00:00:43.860 a few Fields the cat's name its age the
00:00:47.100 number of lives it has remaining because
00:00:48.660 we all know cats start with nine and
00:00:50.940 also this method meow now if you'll
00:00:53.700 notice all these fields on this method
00:00:55.860 are non-static none of these have the
00:00:58.680 static keyword what that means is all of
00:01:01.140 them only apply to individual cat
00:01:03.780 objects and not to the cat class itself
00:01:06.900 now let me show you exactly what I mean
00:01:08.939 by that so to demonstrate let's go over
00:01:11.280 to our main method here and let's go
00:01:14.100 ahead and create a new cat object like
00:01:16.619 this so cat my cat equals new pet and
00:01:20.880 then of course we can say my cat dot
00:01:23.880 meow we can call this meow method on our
00:01:27.180 individual cat object however what we
00:01:30.240 can't do is say cat the class dot meow
00:01:34.619 the cat class can't meow only individual
00:01:38.579 actual cats can meow that's what
00:01:41.820 non-static means they make sense and
00:01:44.460 apply only to individual cat objects and
00:01:48.299 not to the class itself and that kind of
00:01:51.060 makes sense right remember we can think
00:01:52.920 of a class as kind of a blueprint for
00:01:56.159 creating objects of that class this cat
00:01:59.100 class is isn't an actual cat it's just a
00:02:02.040 blueprint of what a cat has and what
00:02:04.439 it's able to do so a cat has a name an
00:02:07.920 age a number of lives remaining and a
00:02:10.318 cat can meow so we can use our cat class
00:02:13.140 to create individual cats and then those
00:02:16.379 individual cats can meow but we can't
00:02:19.440 just tell the cat blueprint to meow it
00:02:22.020 just doesn't make sense so non-static
00:02:24.060 methods can only be called on individual
00:02:26.640 objects now the same goes for these
00:02:29.640 fields here the name the age and the
00:02:32.520 number of lives remaining these are also
00:02:34.459 non-static so we can go back to our main
00:02:37.379 method here and take our my cat object
00:02:40.200 and set its name like this my cat dot
00:02:43.560 name equals Stella and I can set
00:02:46.319 Stella's age my cat.age equals eight and
00:02:50.099 of course you can create more than just
00:02:52.019 one individual cat object you can create
00:02:54.060 as many as you want and since the name
00:02:56.400 and age fields are non-static each
00:02:58.980 individual cat object object that you
00:03:00.720 create can have its own separate name
00:03:03.180 and age and they don't conflict with
00:03:04.800 each other the cat class itself doesn't
00:03:07.200 have its own name and age just each
00:03:08.879 individual cat does so if I tried to
00:03:11.099 just take my cat class and set its name
00:03:13.860 equal to George that just doesn't make
00:03:16.800 sense and it doesn't work and I get an
00:03:18.659 error that tells me this non-static
00:03:20.700 field name can't be referenced from a
00:03:22.980 static context it's just telling me hey
00:03:25.019 this name field is non-static so it only
00:03:27.900 makes sense in the context of an
00:03:30.959 individual cat object not the cat class
00:03:33.720 so then if that's non-static what are
00:03:36.360 static methods in fields static methods
00:03:38.879 and fields are not different per each
00:03:41.340 individual cat object one example of a
00:03:43.920 static field that we can add to our cat
00:03:45.840 class is perhaps a field that holds the
00:03:48.540 total number of cat objects that have
00:03:51.060 been created throughout the life of our
00:03:53.040 program we would want to make that
00:03:54.540 static because that's a common value
00:03:56.760 that's shared among all the objects of
00:03:59.099 the cat class and isn't different per
00:04:01.560 each individual cat so to make that we
00:04:04.080 would declare a private static int and
00:04:08.280 we'll just call it cat count and we'll
00:04:10.560 initialize it to zero static Fields can
00:04:13.439 of course also be public or protected or
00:04:15.780 whatever but in this case we want our
00:04:17.579 cat count to be private so it can't just
00:04:19.500 be manipulated by other classes all
00:04:21.600 around the program we want to have full
00:04:23.160 control of it here in this class so then
00:04:25.259 we can take our static cat count field
00:04:28.259 and then every time the program creates
00:04:30.540 a new cat we want to increment that now
00:04:33.180 that will only happen down here in our
00:04:35.759 Constructor so in here we can just say
00:04:37.500 cat count plus plus so now every time a
00:04:40.139 cat is created we'll increment our cat
00:04:42.240 count that way we can keep track of the
00:04:43.979 total number of cats we created
00:04:45.300 throughout the program so now that we're
00:04:46.919 keeping track of the number of cats
00:04:48.840 created throughout our program how do we
00:04:50.759 actually access that count from outside
00:04:53.460 of this class well that's actually where
00:04:55.740 a static method is perfectly suited so
00:04:58.919 we can create a standard getter method
00:05:01.500 for this cat count field but we'll make
00:05:03.479 the getter method static so that we can
00:05:05.400 get it through the cat class itself and
00:05:07.500 we don't have to get it through an
00:05:08.880 individual cat object so then down here
00:05:11.100 we can say public
00:05:13.259 static int get cat count and then all we
00:05:17.340 have to do in that method is return cat
00:05:20.340 count and then back over in our main
00:05:22.680 method we can call that method on the
00:05:25.139 cat class because it's static so we can
00:05:27.419 say cat dot get cat count and then to
00:05:30.960 make sure that's working we can go ahead
00:05:33.180 and print out our cat count both before
00:05:36.660 and after we create our cat object like
00:05:40.800 this so if everything's working right it
00:05:42.660 should print out zero here at the
00:05:44.100 beginning of the program before any cats
00:05:45.600 are created and then one here at the end
00:05:47.460 after it's been created
00:05:49.500 so let's check it out and yes looks good
00:05:52.860 now it's important to note that
00:05:55.080 non-static fields and methods can never
00:05:58.259 be used without calling them on an
00:06:00.720 individual object and we know that
00:06:02.280 because we can't just call Cat you know
00:06:04.259 our class dot name now similarly though
00:06:07.680 let's go back over to our cat class
00:06:10.259 inside this static get cat count method
00:06:13.740 that we created now inside this static
00:06:16.199 method we are not allowed to refer to
00:06:19.199 any non-static Fields so inside this
00:06:22.620 static method I couldn't print out this
00:06:25.800 cat's age you'll see here I get an error
00:06:28.800 that a non-static field can't be
00:06:31.199 referenced from a static context and the
00:06:33.960 reason is that it just doesn't make
00:06:35.400 sense non-static Fields only make sense
00:06:38.400 in the context of an individual object
00:06:40.560 and they can be different for each
00:06:42.419 individual object so inside a static
00:06:45.000 method when you're kind of operating at
00:06:47.160 the class level instead of the
00:06:48.720 individual object object level it just
00:06:50.699 doesn't make any sense to refer to any
00:06:53.400 non-static field so it's not allowed
00:06:56.220 however the opposite is not the case
00:06:59.639 technically you can access static fields
00:07:03.419 and methods through an individual object
00:07:06.180 so if we go back to our main method here
00:07:08.580 now technically I am allowed to call my
00:07:12.300 cat dot get cat count as you can see I'm
00:07:15.780 not getting any errors here so here I'm
00:07:18.240 calling a static method from an
00:07:20.880 individual object however this is
00:07:23.520 discouraged and you're going to get a
00:07:25.440 warning like I'm getting here it's
00:07:27.419 saying this static method get cat count
00:07:30.000 is being accessed via an instance and
00:07:33.300 it's encouraging you to change it to use
00:07:36.060 the cat class to access it instead of
00:07:38.160 the individual object and so if I want
00:07:39.840 to do that which I should I can just
00:07:41.580 click this suggestion here and it'll fix
00:07:43.800 it for me so you should always access
00:07:46.380 static methods and Fields through the
00:07:49.860 class and not through any individual
00:07:51.599 object so you might ask why though if it
00:07:53.819 works through an individual object why
00:07:55.500 not just use one what does it hurt well
00:07:57.300 the reason is that it can be misleading
00:07:59.699 and confusing if someone sees my
00:08:02.900 cat.getcat count they might think
00:08:05.160 they're getting some kind of account
00:08:06.900 that only applies to this individual cat
00:08:10.139 when in fact it applies to the class as
00:08:12.720 a whole this is even more important when
00:08:14.940 you're modifying something so perhaps
00:08:16.919 you had a static method that modified
00:08:20.220 something on that class if somebody sees
00:08:22.919 that being called with an individual
00:08:24.539 object they might think oh I'm just
00:08:27.300 changing this value for this individual
00:08:29.220 object when in fact they're changing it
00:08:31.440 for the whole class so that's why it's
00:08:33.599 important to always access these static
00:08:36.179 fields and methods through a static
00:08:38.580 context through the class and not
00:08:40.559 through any individual object another
00:08:42.779 great example where you'll see static
00:08:44.760 Fields used all the time is for
00:08:47.040 constants constants are variables that
00:08:49.320 don't ever change they stay the same
00:08:51.360 throughout the entire run time of your
00:08:53.279 program so for our cat class here one
00:08:56.399 value that we might want to have in our
00:08:58.620 program that would be the same for every
00:09:00.540 cat would be a maximum number of lives a
00:09:03.480 cat has which is of course nine so up
00:09:06.240 here we can have a public static final
00:09:10.440 we use the final keyword to make it a
00:09:13.380 constant so it can't be changed later if
00:09:15.600 you want to learn more about final I
00:09:17.100 have a whole video on Final here it'll
00:09:19.440 be an INT and we'll call it Max lives
00:09:22.860 and of course we'll set it equal to nine
00:09:25.380 so this is just saying that for any cat
00:09:28.080 no matter how many lives it might have
00:09:30.600 remaining here at any given time the
00:09:33.959 maximum number of lives for any cat is
00:09:37.140 nine and you can retrieve that value for
00:09:39.360 whatever you need both inside the class
00:09:41.399 here or outside the class just by
00:09:43.980 accessing it through the class name
00:09:45.720 because it's public and it's static so
00:09:48.480 for example maybe it may makes sense
00:09:49.920 that when every cat is created we start
00:09:52.920 its number of lives remaining with the
00:09:55.800 number of Max lives that would make
00:09:57.480 sense so down here in our Constructor
00:10:00.300 while we're creating a new cat we can
00:10:03.060 set its lives remaining equal to Max
00:10:06.540 lives and if for some reason we wanted
00:10:08.760 to access this Max lives field from
00:10:11.880 outside the cat class so back over here
00:10:14.040 in our main class because that field is
00:10:16.140 static we can access it directly on the
00:10:18.959 cat class itself so we can say cat dot
00:10:21.959 Max lives and we can print that out if
00:10:24.360 we like just to prove that it works go
00:10:26.220 ahead and run it and yes we get our
00:10:28.500 maximum lives of nine so the overall
00:10:31.019 question how do you determine whether
00:10:33.300 you should make any given field or
00:10:36.240 method static or non-static well if the
00:10:39.360 method or field that you're creating
00:10:40.920 only makes sense for an individual
00:10:43.980 object an individual instance of that
00:10:46.320 class or if it has to be different
00:10:48.480 forever every object of that class then
00:10:51.060 it will have to be non-static but if
00:10:53.279 it's something more at the class level
00:10:55.260 or something that should be the same or
00:10:57.600 a shared value among all of your class
00:11:00.720 then it probably makes more sense to be
00:11:03.060 static like I said I totally understand
00:11:05.339 that this can be really confusing at
00:11:07.740 first it absolutely was for me but I
00:11:10.140 promise you after a while it will sink
00:11:12.360 in and this holds static versus
00:11:13.860 non-static thing will be something you
00:11:16.079 hardly even have to think about and as
00:11:17.820 always if you enjoyed this video or
00:11:19.200 learned something please let me know by
00:11:20.519 leaving a like and if you didn't go
00:11:22.140 ahead and leave a dislike and Shout at
00:11:23.880 me in the comments thank you so much for
00:11:25.500 watching and being here with me I will
00:11:27.540 see you next time
