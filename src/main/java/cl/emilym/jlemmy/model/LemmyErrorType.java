// This class was generated, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public enum LemmyErrorType {
	@SerializedName("report_reason_required")
	REPORT_REASON_REQUIRED,
	@SerializedName("report_too_long")
	REPORT_TOO_LONG,
	@SerializedName("not_a_moderator")
	NOT_A_MODERATOR,
	@SerializedName("not_an_admin")
	NOT_AN_ADMIN,
	@SerializedName("cant_block_yourself")
	CANT_BLOCK_YOURSELF,
	@SerializedName("cant_block_admin")
	CANT_BLOCK_ADMIN,
	@SerializedName("couldnt_update_user")
	COULDNT_UPDATE_USER,
	@SerializedName("passwords_do_not_match")
	PASSWORDS_DO_NOT_MATCH,
	@SerializedName("email_not_verified")
	EMAIL_NOT_VERIFIED,
	@SerializedName("email_required")
	EMAIL_REQUIRED,
	@SerializedName("couldnt_update_comment")
	COULDNT_UPDATE_COMMENT,
	@SerializedName("couldnt_update_private_message")
	COULDNT_UPDATE_PRIVATE_MESSAGE,
	@SerializedName("cannot_leave_admin")
	CANNOT_LEAVE_ADMIN,
	@SerializedName("no_lines_in_html")
	NO_LINES_IN_HTML,
	@SerializedName("site_metadata_page_is_not_doctype_html")
	SITE_METADATA_PAGE_IS_NOT_DOCTYPE_HTML,
	@SerializedName("pictrs_response_error")
	PICTRS_RESPONSE_ERROR,
	@SerializedName("pictrs_purge_response_error")
	PICTRS_PURGE_RESPONSE_ERROR,
	@SerializedName("pictrs_caching_disabled")
	PICTRS_CACHING_DISABLED,
	@SerializedName("image_url_missing_path_segments")
	IMAGE_URL_MISSING_PATH_SEGMENTS,
	@SerializedName("image_url_missing_last_path_segment")
	IMAGE_URL_MISSING_LAST_PATH_SEGMENT,
	@SerializedName("pictrs_api_key_not_provided")
	PICTRS_API_KEY_NOT_PROVIDED,
	@SerializedName("no_content_type_header")
	NO_CONTENT_TYPE_HEADER,
	@SerializedName("not_an_image_type")
	NOT_AN_IMAGE_TYPE,
	@SerializedName("not_a_mod_or_admin")
	NOT_A_MOD_OR_ADMIN,
	@SerializedName("no_admins")
	NO_ADMINS,
	@SerializedName("not_top_admin")
	NOT_TOP_ADMIN,
	@SerializedName("not_top_mod")
	NOT_TOP_MOD,
	@SerializedName("not_logged_in")
	NOT_LOGGED_IN,
	@SerializedName("site_ban")
	SITE_BAN,
	@SerializedName("deleted")
	DELETED,
	@SerializedName("banned_from_community")
	BANNED_FROM_COMMUNITY,
	@SerializedName("couldnt_find_community")
	COULDNT_FIND_COMMUNITY,
	@SerializedName("couldnt_find_person")
	COULDNT_FIND_PERSON,
	@SerializedName("couldnt_find_comment")
	COULDNT_FIND_COMMENT,
	@SerializedName("couldnt_find_comment_report")
	COULDNT_FIND_COMMENT_REPORT,
	@SerializedName("couldnt_find_post_report")
	COULDNT_FIND_POST_REPORT,
	@SerializedName("couldnt_find_private_message_report")
	COULDNT_FIND_PRIVATE_MESSAGE_REPORT,
	@SerializedName("couldnt_find_local_user")
	COULDNT_FIND_LOCAL_USER,
	@SerializedName("couldnt_find_person_mention")
	COULDNT_FIND_PERSON_MENTION,
	@SerializedName("couldnt_find_registration_application")
	COULDNT_FIND_REGISTRATION_APPLICATION,
	@SerializedName("couldnt_find_comment_reply")
	COULDNT_FIND_COMMENT_REPLY,
	@SerializedName("couldnt_find_private_message")
	COULDNT_FIND_PRIVATE_MESSAGE,
	@SerializedName("couldnt_find_activity")
	COULDNT_FIND_ACTIVITY,
	@SerializedName("person_is_blocked")
	PERSON_IS_BLOCKED,
	@SerializedName("community_is_blocked")
	COMMUNITY_IS_BLOCKED,
	@SerializedName("instance_is_blocked")
	INSTANCE_IS_BLOCKED,
	@SerializedName("downvotes_are_disabled")
	DOWNVOTES_ARE_DISABLED,
	@SerializedName("instance_is_private")
	INSTANCE_IS_PRIVATE,
	@SerializedName("invalid_password")
	INVALID_PASSWORD,
	@SerializedName("site_description_length_overflow")
	SITE_DESCRIPTION_LENGTH_OVERFLOW,
	@SerializedName("honeypot_failed")
	HONEYPOT_FAILED,
	@SerializedName("registration_application_is_pending")
	REGISTRATION_APPLICATION_IS_PENDING,
	@SerializedName("cant_enable_private_instance_and_federation_together")
	CANT_ENABLE_PRIVATE_INSTANCE_AND_FEDERATION_TOGETHER,
	@SerializedName("locked")
	LOCKED,
	@SerializedName("couldnt_create_comment")
	COULDNT_CREATE_COMMENT,
	@SerializedName("max_comment_depth_reached")
	MAX_COMMENT_DEPTH_REACHED,
	@SerializedName("no_comment_edit_allowed")
	NO_COMMENT_EDIT_ALLOWED,
	@SerializedName("only_admins_can_create_communities")
	ONLY_ADMINS_CAN_CREATE_COMMUNITIES,
	@SerializedName("community_already_exists")
	COMMUNITY_ALREADY_EXISTS,
	@SerializedName("language_not_allowed")
	LANGUAGE_NOT_ALLOWED,
	@SerializedName("only_mods_can_post_in_community")
	ONLY_MODS_CAN_POST_IN_COMMUNITY,
	@SerializedName("couldnt_update_post")
	COULDNT_UPDATE_POST,
	@SerializedName("no_post_edit_allowed")
	NO_POST_EDIT_ALLOWED,
	@SerializedName("couldnt_find_post")
	COULDNT_FIND_POST,
	@SerializedName("edit_private_message_not_allowed")
	EDIT_PRIVATE_MESSAGE_NOT_ALLOWED,
	@SerializedName("site_already_exists")
	SITE_ALREADY_EXISTS,
	@SerializedName("application_question_required")
	APPLICATION_QUESTION_REQUIRED,
	@SerializedName("invalid_default_post_listing_type")
	INVALID_DEFAULT_POST_LISTING_TYPE,
	@SerializedName("registration_closed")
	REGISTRATION_CLOSED,
	@SerializedName("registration_application_answer_required")
	REGISTRATION_APPLICATION_ANSWER_REQUIRED,
	@SerializedName("email_already_exists")
	EMAIL_ALREADY_EXISTS,
	@SerializedName("federation_forbidden_by_strict_allow_list")
	FEDERATION_FORBIDDEN_BY_STRICT_ALLOW_LIST,
	@SerializedName("person_is_banned_from_community")
	PERSON_IS_BANNED_FROM_COMMUNITY,
	@SerializedName("object_is_not_public")
	OBJECT_IS_NOT_PUBLIC,
	@SerializedName("invalid_community")
	INVALID_COMMUNITY,
	@SerializedName("cannot_create_post_or_comment_in_deleted_or_removed_community")
	CANNOT_CREATE_POST_OR_COMMENT_IN_DELETED_OR_REMOVED_COMMUNITY,
	@SerializedName("cannot_receive_page")
	CANNOT_RECEIVE_PAGE,
	@SerializedName("new_post_cannot_be_locked")
	NEW_POST_CANNOT_BE_LOCKED,
	@SerializedName("only_local_admin_can_remove_community")
	ONLY_LOCAL_ADMIN_CAN_REMOVE_COMMUNITY,
	@SerializedName("only_local_admin_can_restore_community")
	ONLY_LOCAL_ADMIN_CAN_RESTORE_COMMUNITY,
	@SerializedName("no_id_given")
	NO_ID_GIVEN,
	@SerializedName("incorrect_login")
	INCORRECT_LOGIN,
	@SerializedName("invalid_query")
	INVALID_QUERY,
	@SerializedName("object_not_local")
	OBJECT_NOT_LOCAL,
	@SerializedName("post_is_locked")
	POST_IS_LOCKED,
	@SerializedName("person_is_banned_from_site")
	PERSON_IS_BANNED_FROM_SITE,
	@SerializedName("invalid_vote_value")
	INVALID_VOTE_VALUE,
	@SerializedName("page_does_not_specify_creator")
	PAGE_DOES_NOT_SPECIFY_CREATOR,
	@SerializedName("page_does_not_specify_group")
	PAGE_DOES_NOT_SPECIFY_GROUP,
	@SerializedName("no_community_found_in_cc")
	NO_COMMUNITY_FOUND_IN_CC,
	@SerializedName("no_email_setup")
	NO_EMAIL_SETUP,
	@SerializedName("local_site_not_setup")
	LOCAL_SITE_NOT_SETUP,
	@SerializedName("email_smtp_server_needs_a_port")
	EMAIL_SMTP_SERVER_NEEDS_A_PORT,
	@SerializedName("missing_an_email")
	MISSING_AN_EMAIL,
	@SerializedName("rate_limit_error")
	RATE_LIMIT_ERROR,
	@SerializedName("invalid_name")
	INVALID_NAME,
	@SerializedName("invalid_display_name")
	INVALID_DISPLAY_NAME,
	@SerializedName("invalid_matrix_id")
	INVALID_MATRIX_ID,
	@SerializedName("invalid_post_title")
	INVALID_POST_TITLE,
	@SerializedName("invalid_body_field")
	INVALID_BODY_FIELD,
	@SerializedName("bio_length_overflow")
	BIO_LENGTH_OVERFLOW,
	@SerializedName("alt_text_length_overflow")
	ALT_TEXT_LENGTH_OVERFLOW,
	@SerializedName("missing_totp_token")
	MISSING_TOTP_TOKEN,
	@SerializedName("missing_totp_secret")
	MISSING_TOTP_SECRET,
	@SerializedName("incorrect_totp_token")
	INCORRECT_TOTP_TOKEN,
	@SerializedName("couldnt_parse_totp_secret")
	COULDNT_PARSE_TOTP_SECRET,
	@SerializedName("couldnt_generate_totp")
	COULDNT_GENERATE_TOTP,
	@SerializedName("totp_already_enabled")
	TOTP_ALREADY_ENABLED,
	@SerializedName("couldnt_like_comment")
	COULDNT_LIKE_COMMENT,
	@SerializedName("couldnt_save_comment")
	COULDNT_SAVE_COMMENT,
	@SerializedName("couldnt_create_report")
	COULDNT_CREATE_REPORT,
	@SerializedName("couldnt_resolve_report")
	COULDNT_RESOLVE_REPORT,
	@SerializedName("community_moderator_already_exists")
	COMMUNITY_MODERATOR_ALREADY_EXISTS,
	@SerializedName("community_user_already_banned")
	COMMUNITY_USER_ALREADY_BANNED,
	@SerializedName("community_block_already_exists")
	COMMUNITY_BLOCK_ALREADY_EXISTS,
	@SerializedName("community_follower_already_exists")
	COMMUNITY_FOLLOWER_ALREADY_EXISTS,
	@SerializedName("couldnt_update_community_hidden_status")
	COULDNT_UPDATE_COMMUNITY_HIDDEN_STATUS,
	@SerializedName("person_block_already_exists")
	PERSON_BLOCK_ALREADY_EXISTS,
	@SerializedName("user_already_exists")
	USER_ALREADY_EXISTS,
	@SerializedName("token_not_found")
	TOKEN_NOT_FOUND,
	@SerializedName("couldnt_like_post")
	COULDNT_LIKE_POST,
	@SerializedName("couldnt_save_post")
	COULDNT_SAVE_POST,
	@SerializedName("couldnt_mark_post_as_read")
	COULDNT_MARK_POST_AS_READ,
	@SerializedName("couldnt_hide_post")
	COULDNT_HIDE_POST,
	@SerializedName("couldnt_update_community")
	COULDNT_UPDATE_COMMUNITY,
	@SerializedName("couldnt_update_replies")
	COULDNT_UPDATE_REPLIES,
	@SerializedName("couldnt_update_person_mentions")
	COULDNT_UPDATE_PERSON_MENTIONS,
	@SerializedName("post_title_too_long")
	POST_TITLE_TOO_LONG,
	@SerializedName("couldnt_create_post")
	COULDNT_CREATE_POST,
	@SerializedName("couldnt_create_private_message")
	COULDNT_CREATE_PRIVATE_MESSAGE,
	@SerializedName("couldnt_update_private")
	COULDNT_UPDATE_PRIVATE,
	@SerializedName("system_err_login")
	SYSTEM_ERR_LOGIN,
	@SerializedName("couldnt_set_all_registrations_accepted")
	COULDNT_SET_ALL_REGISTRATIONS_ACCEPTED,
	@SerializedName("couldnt_set_all_email_verified")
	COULDNT_SET_ALL_EMAIL_VERIFIED,
	@SerializedName("banned")
	BANNED,
	@SerializedName("blocked_url")
	BLOCKED_URL,
	@SerializedName("couldnt_get_comments")
	COULDNT_GET_COMMENTS,
	@SerializedName("couldnt_get_posts")
	COULDNT_GET_POSTS,
	@SerializedName("invalid_url")
	INVALID_URL,
	@SerializedName("email_send_failed")
	EMAIL_SEND_FAILED,
	@SerializedName("slurs")
	SLURS,
	@SerializedName("couldnt_find_object")
	COULDNT_FIND_OBJECT,
	@SerializedName("registration_denied")
	REGISTRATION_DENIED,
	@SerializedName("federation_disabled")
	FEDERATION_DISABLED,
	@SerializedName("domain_blocked")
	DOMAIN_BLOCKED,
	@SerializedName("domain_not_in_allow_list")
	DOMAIN_NOT_IN_ALLOW_LIST,
	@SerializedName("federation_disabled_by_strict_allow_list")
	FEDERATION_DISABLED_BY_STRICT_ALLOW_LIST,
	@SerializedName("site_name_required")
	SITE_NAME_REQUIRED,
	@SerializedName("site_name_length_overflow")
	SITE_NAME_LENGTH_OVERFLOW,
	@SerializedName("permissive_regex")
	PERMISSIVE_REGEX,
	@SerializedName("invalid_regex")
	INVALID_REGEX,
	@SerializedName("captcha_incorrect")
	CAPTCHA_INCORRECT,
	@SerializedName("password_reset_limit_reached")
	PASSWORD_RESET_LIMIT_REACHED,
	@SerializedName("couldnt_create_audio_captcha")
	COULDNT_CREATE_AUDIO_CAPTCHA,
	@SerializedName("invalid_url_scheme")
	INVALID_URL_SCHEME,
	@SerializedName("couldnt_send_webmention")
	COULDNT_SEND_WEBMENTION,
	@SerializedName("contradicting_filters")
	CONTRADICTING_FILTERS,
	@SerializedName("instance_block_already_exists")
	INSTANCE_BLOCK_ALREADY_EXISTS,
	@SerializedName("too_many_items")
	TOO_MANY_ITEMS,
	@SerializedName("community_has_no_followers")
	COMMUNITY_HAS_NO_FOLLOWERS,
	@SerializedName("ban_expiration_in_past")
	BAN_EXPIRATION_IN_PAST,
	@SerializedName("invalid_unix_time")
	INVALID_UNIX_TIME,
	@SerializedName("invalid_bot_action")
	INVALID_BOT_ACTION,
	@SerializedName("cant_block_local_instance")
	CANT_BLOCK_LOCAL_INSTANCE,
	@SerializedName("unknown")
	UNKNOWN
}