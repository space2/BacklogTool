/*
 *  The MIT License
 *
 *  Copyright 2012 Sony Mobile Communications AB. All rights reserved.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.sonymobile.backlogtool;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Container used when creating a new story.
 *
 * @author Fredrik Persson &lt;fredrik5.persson@sonymobile.com&gt;
 * @author Nicklas Nilsson &lt;nicklas4.persson@sonymobile.com&gt;
 */
public class NewStoryContainer extends Story {

    private boolean top;

    private String themeTitle;

    private String epicTitle;

    private String storyAttr1Id;

    private String storyAttr2Id;

    private String storyAttr3Id;

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public String getThemeTitle() {
        return StringEscapeUtils.escapeHtml(themeTitle);
    }

    public void setThemeTitle(String themeTitle) {
        this.themeTitle = StringEscapeUtils.unescapeHtml(themeTitle);
    }

    public String getEpicTitle() {
        return StringEscapeUtils.escapeHtml(epicTitle);
    }

    public void setEpicTitle(String epicTitle) {
        this.epicTitle = StringEscapeUtils.unescapeHtml(epicTitle);
    }

    public String getStoryAttr1Id() {
        return storyAttr1Id;
    }

    public void setStoryAttr1Id(String storyAttr1Id) {
        this.storyAttr1Id = storyAttr1Id;
    }

    public String getStoryAttr2Id() {
        return storyAttr2Id;
    }

    public void setStoryAttr2Id(String storyAttr2Id) {
        this.storyAttr2Id = storyAttr2Id;
    }

    public String getStoryAttr3Id() {
        return storyAttr3Id;
    }

    public void setStoryAttr3Id(String storyAttr3Id) {
        this.storyAttr3Id = storyAttr3Id;
    }

}