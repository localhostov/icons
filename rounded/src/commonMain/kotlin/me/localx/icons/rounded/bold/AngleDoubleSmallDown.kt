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

public val Icons.Bold.AngleDoubleSmallDown: ImageVector
    get() {
        if (_angleDoubleSmallDown != null) {
            return _angleDoubleSmallDown!!
        }
        _angleDoubleSmallDown = Builder(name = "AngleDoubleSmallDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.183f, 0.0f, -2.295f, -0.461f, -3.131f, -1.297f)
                lineToRelative(-3.922f, -3.873f)
                curveToRelative(-0.59f, -0.582f, -0.596f, -1.532f, -0.014f, -2.121f)
                curveToRelative(0.583f, -0.59f, 1.532f, -0.595f, 2.121f, -0.014f)
                lineToRelative(3.929f, 3.88f)
                curveToRelative(0.554f, 0.554f, 1.488f, 0.546f, 2.026f, 0.007f)
                lineToRelative(3.938f, -3.887f)
                curveToRelative(0.588f, -0.582f, 1.54f, -0.577f, 2.121f, 0.014f)
                curveToRelative(0.582f, 0.589f, 0.576f, 1.539f, -0.014f, 2.121f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.829f, 0.83f, -1.94f, 1.291f, -3.124f, 1.291f)
                close()
                moveTo(13.062f, 12.561f)
                lineToRelative(5.999f, -6.0f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-4.938f, 4.939f)
                lineTo(7.061f, 4.439f)
                curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(6.001f, 6.0f)
                curveToRelative(0.281f, 0.281f, 0.663f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.779f, -0.158f, 1.061f, -0.439f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallDown!!
    }

private var _angleDoubleSmallDown: ImageVector? = null
