//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.saasovation.collaboration.domain.model.forum;

import com.saasovation.collaboration.domain.model.tenant.Tenant;
import com.saasovation.common.domain.model.DomainEvent;

public class PostContentAltered extends DomainEvent {

    private String bodyText;
    private DiscussionId discussionId;
    private ForumId forumId;
    private PostId postId;
    private String subject;
    private Tenant tenant;

    public PostContentAltered(
	    Tenant aTenant,
	    ForumId aForumId,
	    DiscussionId aDiscussionId,
	    PostId aPostId,
	    String aSubject,
	    String aBodyText) {

	super();

	this.bodyText = aBodyText;
	this.discussionId = aDiscussionId;
	this.forumId = aForumId;
	this.postId = aPostId;
	this.subject = aSubject;
	this.tenant = aTenant;
    }

    public String bodyText() {
	return this.bodyText;
    }

    public DiscussionId discussionId() {
	return this.discussionId;
    }

    public ForumId forumId() {
	return this.forumId;
    }

    public PostId postId() {
	return this.postId;
    }

    public String subject() {
	return this.subject;
    }

    public Tenant tenant() {
	return this.tenant;
    }
}
