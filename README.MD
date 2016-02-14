# Crave's Android interview task

**In this project:**
  - MainActivity.java - An Activity with a simple list view and custom list adapter (inherits from BaseAdapter)
  - MainListAdapter.java - List adapter for the Activity's ListView widget
  - activity_main.xml - The activity layout (single ListView widget)

**Instructions:**
  - Fork the project
  - Clone the forked project to you'r machine
  - Read the implementation guidelines section
  - Implement :)
  - Push your implementation and let us know.

**Implementation guidelines**
- Do not use external libraries
- Implementation should support N number of rows/columns
- None of the pre-written code is a must - Change what ever you like as long as the end result will stay the same
- Use of caching, viewholders, and overall speed and memory usage optimizations is a virtue :)

**What to implement:**

The end result of this task should be a vertical ListView (the one already provided), where each of it's rows can be horizontally
scrollable.
The entire list structure defined in List object received by the adapter's constructor.

    List<List<String>> items;

The outer List<> defined the rows.
The inner List<String> defined the images in each row.

For example, the following structure will display a vertical list of 2 rows. in the first row we'll have 2 images and in the
second row we'll have 3 images, each is horizontally scrollable.

    Outerlist.count = 2
    OuterList[0] = InnerList['url0', 'url1']
    OuterList[1] = InnerList['url2', 'url3', 'url4']





