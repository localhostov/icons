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

public val Icons.Filled.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                curveTo(15.0f, 3.364f, 11.636f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                lineTo(0.0f, 23.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                lineTo(2.0f, 15.0f)
                lineTo(7.412f, 15.0f)
                lineToRelative(4.714f, 8.485f)
                curveToRelative(0.269f, 0.487f, 0.886f, 0.655f, 1.359f, 0.389f)
                curveToRelative(0.483f, -0.269f, 0.657f, -0.877f, 0.389f, -1.359f)
                lineToRelative(-4.335f, -7.804f)
                curveToRelative(3.147f, -0.891f, 5.461f, -3.783f, 5.461f, -7.211f)
                close()
                moveTo(7.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(7.27f, 0.232f, 7.265f, 10.77f, 0.0f, 11.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-1.067f, 0.0f, -2.063f, -0.574f, -2.598f, -1.499f)
                curveToRelative(-0.277f, -0.479f, -0.113f, -1.09f, 0.364f, -1.366f)
                curveToRelative(0.48f, -0.279f, 1.091f, -0.113f, 1.366f, 0.364f)
                curveToRelative(0.179f, 0.31f, 0.511f, 0.501f, 0.867f, 0.501f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.997f, 0.065f, 1.443f, -1.548f, 0.356f, -1.76f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-3.501f, -0.651f, -2.748f, -5.753f, 0.685f, -5.733f)
                horizontalLineToRelative(2.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.574f, 2.598f, 1.499f)
                curveToRelative(0.277f, 0.479f, 0.113f, 1.09f, -0.364f, 1.366f)
                curveToRelative(-0.481f, 0.277f, -1.091f, 0.113f, -1.366f, -0.364f)
                curveToRelative(-0.179f, -0.31f, -0.511f, -0.501f, -0.867f, -0.501f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.998f, -0.065f, -1.443f, 1.55f, -0.355f, 1.761f)
                lineToRelative(3.04f, 0.507f)
                curveToRelative(1.342f, 0.223f, 2.315f, 1.372f, 2.315f, 2.732f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
