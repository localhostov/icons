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

public val Icons.Filled.HandWave: ImageVector
    get() {
        if (_handWave != null) {
            return _handWave!!
        }
        _handWave = Builder(name = "HandWave", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.542f, 4.789f)
                curveToRelative(-0.446f, -1.478f, -1.37f, -2.403f, -2.824f, -2.83f)
                lineTo(14.281f, 0.041f)
                curveToRelative(2.123f, 0.622f, 3.528f, 2.025f, 4.176f, 4.17f)
                lineToRelative(-1.915f, 0.578f)
                close()
                moveTo(4.781f, 20.963f)
                curveToRelative(-1.454f, -0.425f, -2.377f, -1.351f, -2.823f, -2.829f)
                lineTo(0.042f, 18.712f)
                curveToRelative(0.648f, 2.146f, 2.053f, 3.549f, 4.177f, 4.171f)
                lineToRelative(0.562f, -1.92f)
                close()
                moveTo(3.561f, 12.44f)
                lineToRelative(3.573f, 3.548f)
                lineToRelative(0.879f, -0.879f)
                lineTo(1.439f, 8.561f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(6.573f, 6.548f)
                lineToRelative(0.879f, -0.879f)
                lineTo(3.439f, 4.561f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(7.573f, 7.548f)
                lineToRelative(0.879f, -0.879f)
                lineTo(8.439f, 3.561f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(8.439f, 8.414f)
                verticalLineToRelative(-2.853f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                lineTo(22.999f, 15.746f)
                curveToRelative(0.0f, 2.16f, -0.841f, 4.191f, -2.369f, 5.719f)
                curveToRelative(-1.69f, 1.69f, -3.911f, 2.535f, -6.131f, 2.535f)
                reflectiveCurveToRelative(-4.44f, -0.845f, -6.131f, -2.535f)
                lineTo(1.439f, 14.561f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.536f, -0.586f, 2.121f, 0.0f)
                close()
            }
        }
        .build()
        return _handWave!!
    }

private var _handWave: ImageVector? = null
