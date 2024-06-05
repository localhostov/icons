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
                moveToRelative(13.0f, 14.586f)
                lineTo(13.0f, 6.056f)
                curveToRelative(4.494f, 0.499f, 8.0f, 4.32f, 8.0f, 8.944f)
                curveToRelative(0.0f, 2.122f, -0.739f, 4.074f, -1.972f, 5.615f)
                lineToRelative(-6.028f, -6.029f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.122f, 0.0f, 4.074f, -0.738f, 5.614f, -1.971f)
                lineToRelative(-6.614f, -6.615f)
                lineTo(11.0f, 6.056f)
                curveToRelative(-4.494f, 0.499f, -8.0f, 4.32f, -8.0f, 8.944f)
                close()
                moveTo(14.596f, 4.596f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.596f, -2.596f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.577f, 2.577f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.577f, -1.577f)
                verticalLineToRelative(3.056f)
                curveToRelative(0.328f, -0.036f, 0.662f, -0.056f, 1.0f, -0.056f)
                reflectiveCurveToRelative(0.672f, 0.019f, 1.0f, 0.056f)
                verticalLineToRelative(-3.056f)
                lineToRelative(1.596f, 1.596f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
