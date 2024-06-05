package me.localx.icons.rounded.filled

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

public val Icons.Filled.TextBox: ImageVector
    get() {
        if (_textBox != null) {
            return _textBox!!
        }
        _textBox = Builder(name = "TextBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 9.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(20.0f, 17.036f)
                lineTo(20.0f, 6.964f)
                curveToRelative(-1.53f, -0.22f, -2.744f, -1.434f, -2.964f, -2.964f)
                lineTo(6.964f, 4.0f)
                curveToRelative(-0.22f, 1.53f, -1.434f, 2.744f, -2.964f, 2.964f)
                verticalLineToRelative(10.072f)
                curveToRelative(1.53f, 0.22f, 2.744f, 1.434f, 2.964f, 2.964f)
                horizontalLineToRelative(10.072f)
                curveToRelative(0.22f, -1.53f, 1.434f, -2.744f, 2.964f, -2.964f)
                close()
                moveTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.393f, 0.0f, -2.599f, -0.819f, -3.162f, -2.0f)
                lineTo(6.662f, 22.0f)
                curveToRelative(-0.563f, 1.181f, -1.769f, 2.0f, -3.162f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.393f, 0.819f, -2.599f, 2.0f, -3.162f)
                lineTo(2.0f, 6.662f)
                curveToRelative(-1.181f, -0.563f, -2.0f, -1.769f, -2.0f, -3.162f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                curveToRelative(1.393f, 0.0f, 2.599f, 0.819f, 3.162f, 2.0f)
                horizontalLineToRelative(10.677f)
                curveToRelative(0.563f, -1.181f, 1.769f, -2.0f, 3.162f, -2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.393f, -0.819f, 2.599f, -2.0f, 3.162f)
                verticalLineToRelative(10.677f)
                curveToRelative(1.181f, 0.563f, 2.0f, 1.769f, 2.0f, 3.162f)
                close()
            }
        }
        .build()
        return _textBox!!
    }

private var _textBox: ImageVector? = null
