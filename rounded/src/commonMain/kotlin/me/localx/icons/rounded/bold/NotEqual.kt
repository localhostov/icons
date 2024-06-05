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

public val Icons.Bold.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.439f)
                lineToRelative(-2.182f, 5.091f)
                curveToRelative(-0.244f, 0.568f, -0.798f, 0.909f, -1.38f, 0.909f)
                curveToRelative(-0.197f, 0.0f, -0.397f, -0.039f, -0.59f, -0.121f)
                curveToRelative(-0.762f, -0.326f, -1.114f, -1.208f, -0.788f, -1.97f)
                lineToRelative(1.675f, -3.909f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.582f)
                lineToRelative(2.571f, -6.0f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.439f)
                lineTo(15.121f, 0.909f)
                curveToRelative(0.327f, -0.761f, 1.209f, -1.112f, 1.97f, -0.788f)
                curveToRelative(0.762f, 0.326f, 1.114f, 1.208f, 0.788f, 1.97f)
                lineToRelative(-1.675f, 3.909f)
                horizontalLineToRelative(6.296f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.582f)
                lineToRelative(-2.571f, 6.0f)
                horizontalLineToRelative(10.154f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
