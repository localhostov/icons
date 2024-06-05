package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.229f)
                lineTo(22.0f, 7.51f)
                lineTo(19.0f, 7.51f)
                lineTo(19.0f, 11.0f)
                lineTo(15.662f, 11.0f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, -2.119f, -1.841f)
                lineTo(10.822f, 3.072f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.626f, 1.0f)
                lineTo(3.0f, 1.0f)
                lineTo(3.0f, 6.172f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 9.0f)
                verticalLineToRelative(6.672f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.5f, 23.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 16.0f, 15.672f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.229f)
                arcToRelative(9.332f, 9.332f, 0.0f, false, false, 2.752f, 6.644f)
                lineToRelative(2.121f, -2.121f)
                arcTo(6.354f, 6.354f, 0.0f, false, true, 22.0f, 16.229f)
                close()
                moveTo(12.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.528f)
                arcTo(4.583f, 4.583f, 0.0f, false, false, 12.5f, 14.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.583f, 4.583f, 0.0f, false, false, -0.5f, 0.028f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(6.0f, 4.0f)
                lineTo(7.626f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.457f, 0.3f)
                lineToRelative(2.1f, 4.7f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(3.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 20.0f)
                close()
                moveTo(8.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 20.0f)
                close()
                moveTo(13.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 20.0f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
