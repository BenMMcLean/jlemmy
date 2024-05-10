import re


def to_camel_case(snake_str):
    return "".join(x.capitalize() for x in snake_str.lower().split("_"))


def to_lower_camel_case(snake_str):
    # We capitalize the first letter of each component except the first one
    # with the 'capitalize' method and join them together.
    camel_string = to_camel_case(snake_str)
    return snake_str[0].lower() + camel_string[1:]


def to_enum_case(camel_case):
    enum_str = camel_case[0].lower() + camel_case[1:]
    return re.sub(r"([A-Z])", r"_\1", enum_str).upper()
