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

public val Icons.Bold.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.595f, 10.646f)
                lineToRelative(-5.358f, -5.357f)
                curveToRelative(0.765f, -3.037f, 3.506f, -5.289f, 6.781f, -5.289f)
                curveToRelative(1.017f, 0.0f, 1.981f, 0.222f, 2.853f, 0.612f)
                lineToRelative(-3.12f, 3.12f)
                curveToRelative(-0.976f, 0.976f, -0.976f, 2.559f, 0.0f, 3.536f)
                curveToRelative(0.976f, 0.976f, 2.559f, 0.976f, 3.536f, 0.0f)
                lineToRelative(3.12f, -3.12f)
                curveToRelative(0.39f, 0.872f, 0.612f, 1.836f, 0.612f, 2.853f)
                curveToRelative(0.0f, 2.704f, -1.548f, 5.026f, -3.793f, 6.19f)
                lineToRelative(-3.581f, -3.592f)
                lineToRelative(-1.048f, 1.048f)
                close()
                moveTo(0.863f, 18.986f)
                curveToRelative(-1.151f, 1.151f, -1.151f, 3.017f, 0.0f, 4.168f)
                curveToRelative(1.151f, 1.151f, 3.017f, 1.151f, 4.168f, 0.0f)
                lineToRelative(6.586f, -6.586f)
                lineToRelative(-4.169f, -4.168f)
                lineTo(0.863f, 18.986f)
                close()
                moveTo(16.643f, 12.426f)
                lineToRelative(-1.048f, 1.048f)
                lineToRelative(-7.596f, -7.596f)
                verticalLineToRelative(-2.85f)
                lineTo(2.749f, 0.0f)
                lineTo(0.0f, 2.749f)
                lineToRelative(3.027f, 5.251f)
                horizontalLineToRelative(2.851f)
                lineToRelative(7.596f, 7.596f)
                lineToRelative(-0.994f, 0.994f)
                lineToRelative(6.548f, 6.548f)
                curveToRelative(1.15f, 1.15f, 3.013f, 1.15f, 4.163f, 0.0f)
                reflectiveCurveToRelative(1.005f, -2.868f, 0.0f, -4.163f)
                lineToRelative(-6.548f, -6.548f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
