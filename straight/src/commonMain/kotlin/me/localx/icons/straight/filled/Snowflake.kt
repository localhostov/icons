package me.localx.icons.straight.filled

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

public val Icons.Filled.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.79f, 15.565f)
                lineTo(19.978f, 16.6f)
                lineToRelative(1.034f, 3.812f)
                lineToRelative(-1.93f, 0.524f)
                lineToRelative(-1.188f, -4.379f)
                lineToRelative(-1.963f, -1.125f)
                lineTo(13.0f, 17.124f)
                verticalLineToRelative(2.27f)
                lineTo(16.207f, 22.6f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 21.222f)
                lineTo(9.207f, 24.015f)
                lineTo(7.793f, 22.6f)
                lineTo(11.0f, 19.394f)
                verticalLineToRelative(-2.27f)
                lineTo(8.069f, 15.432f)
                lineTo(6.106f, 16.557f)
                lineTo(4.918f, 20.936f)
                lineToRelative(-1.93f, -0.524f)
                lineTo(4.022f, 16.6f)
                lineTo(0.21f, 15.565f)
                lineToRelative(0.523f, -1.929f)
                lineToRelative(4.378f, 1.187f)
                lineTo(7.0f, 13.74f)
                verticalLineTo(10.312f)
                lineTo(5.111f, 9.228f)
                lineTo(0.733f, 10.415f)
                lineTo(0.21f, 8.485f)
                lineTo(4.022f, 7.452f)
                lineTo(2.988f, 3.64f)
                lineToRelative(1.93f, -0.524f)
                lineTo(6.106f, 7.494f)
                lineTo(7.9f, 8.523f)
                lineTo(11.0f, 6.733f)
                verticalLineTo(4.657f)
                lineTo(7.793f, 1.45f)
                lineTo(9.207f, 0.036f)
                lineTo(12.0f, 2.829f)
                lineTo(14.793f, 0.036f)
                lineTo(16.207f, 1.45f)
                lineTo(13.0f, 4.657f)
                verticalLineTo(6.733f)
                lineToRelative(3.1f, 1.79f)
                lineTo(17.9f, 7.494f)
                lineToRelative(1.187f, -4.378f)
                lineToRelative(1.93f, 0.524f)
                lineTo(19.978f, 7.452f)
                lineTo(23.79f, 8.485f)
                lineToRelative(-0.523f, 1.93f)
                lineTo(18.889f, 9.228f)
                lineTo(17.0f, 10.311f)
                verticalLineTo(13.74f)
                lineToRelative(1.889f, 1.083f)
                lineToRelative(4.378f, -1.187f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
