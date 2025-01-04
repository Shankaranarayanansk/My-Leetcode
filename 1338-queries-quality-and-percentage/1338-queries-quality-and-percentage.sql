with query_metrics as (
    select
        query_name,
        avg(rating * 1.0 / position) as quality,
        sum(case when rating < 3 then 1 else 0 end) * 100.0 / count(*) as poor_query_percentage
    from queries
    group by query_name
)
select
    query_name,
    round(quality, 2) as quality,
    round(poor_query_percentage, 2) as poor_query_percentage
from query_metrics;
