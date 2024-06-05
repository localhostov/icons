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

public val Icons.Filled.Invest: ImageVector
    get() {
        if (_invest != null) {
            return _invest!!
        }
        _invest = Builder(name = "Invest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 3.0f)
                verticalLineToRelative(3.056f)
                curveToRelative(-0.328f, -0.036f, -0.662f, -0.056f, -1.0f, -0.056f)
                reflectiveCurveToRelative(-0.672f, 0.019f, -1.0f, 0.056f)
                verticalLineToRelative(-3.056f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                close()
                moveTo(19.029f, 20.614f)
                curveToRelative(1.233f, -1.54f, 1.971f, -3.492f, 1.971f, -5.614f)
                curveToRelative(0.0f, -4.624f, -3.506f, -8.445f, -8.0f, -8.944f)
                verticalLineToRelative(8.53f)
                lineToRelative(6.029f, 6.028f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.122f, 0.0f, 4.074f, -0.739f, 5.615f, -1.972f)
                lineToRelative(-6.029f, -6.028f)
                curveToRelative(-0.373f, -0.372f, -0.586f, -0.888f, -0.586f, -1.414f)
                lineTo(11.0f, 6.056f)
                curveToRelative(-4.494f, 0.499f, -8.0f, 4.32f, -8.0f, 8.944f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
