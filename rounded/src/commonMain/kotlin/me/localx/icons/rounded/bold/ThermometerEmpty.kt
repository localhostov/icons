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

public val Icons.Bold.ThermometerEmpty: ImageVector
    get() {
        if (_thermometerEmpty != null) {
            return _thermometerEmpty!!
        }
        _thermometerEmpty = Builder(name = "ThermometerEmpty", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 16.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.959f, 0.706f, -3.807f, 2.0f, -5.271f)
                verticalLineToRelative(-4.729f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(4.729f)
                curveToRelative(1.294f, 1.464f, 2.0f, 3.312f, 2.0f, 5.271f)
                close()
                moveTo(17.0f, 16.0f)
                curveToRelative(0.0f, -1.357f, -0.547f, -2.632f, -1.541f, -3.59f)
                curveToRelative(-0.293f, -0.283f, -0.459f, -0.673f, -0.459f, -1.08f)
                verticalLineToRelative(-5.33f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.33f)
                curveToRelative(0.0f, 0.407f, -0.166f, 0.797f, -0.459f, 1.08f)
                curveToRelative(-0.994f, 0.958f, -1.541f, 2.232f, -1.541f, 3.59f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _thermometerEmpty!!
    }

private var _thermometerEmpty: ImageVector? = null
