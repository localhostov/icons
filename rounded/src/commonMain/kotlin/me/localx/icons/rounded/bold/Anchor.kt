package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.335f, 13.122f)
                curveToRelative(-0.575f, -0.713f, -1.43f, -1.122f, -2.344f, -1.122f)
                horizontalLineToRelative(-1.491f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                lineToRelative(1.501f, -0.012f)
                curveToRelative(-0.733f, 3.391f, -4.165f, 5.424f, -7.501f, 5.901f)
                verticalLineToRelative(-5.889f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.276f)
                curveToRelative(1.742f, -0.621f, 3.0f, -2.271f, 3.0f, -4.224f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 1.953f, 1.258f, 3.602f, 3.0f, 4.224f)
                verticalLineToRelative(3.276f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.889f)
                curveToRelative(-3.335f, -0.477f, -6.766f, -2.508f, -7.491f, -5.889f)
                horizontalLineToRelative(1.491f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.491f)
                curveToRelative(-0.914f, 0.0f, -1.769f, 0.409f, -2.344f, 1.123f)
                curveToRelative(-0.57f, 0.707f, -0.788f, 1.618f, -0.597f, 2.5f)
                curveToRelative(1.189f, 5.5f, 6.903f, 8.378f, 11.933f, 8.378f)
                reflectiveCurveToRelative(10.744f, -2.878f, 11.933f, -8.378f)
                curveToRelative(0.19f, -0.882f, -0.027f, -1.793f, -0.598f, -2.5f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
