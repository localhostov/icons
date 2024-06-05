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

public val Icons.Bold.Clarinet: ImageVector
    get() {
        if (_clarinet != null) {
            return _clarinet!!
        }
        _clarinet = Builder(name = "Clarinet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 3.704f)
                lineToRelative(-2.33f, 1.547f)
                curveToRelative(-0.88f, 0.585f, -2.518f, 1.466f, -3.669f, 1.693f)
                verticalLineToRelative(-1.944f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.396f)
                curveToRelative(-2.08f, 0.588f, -3.963f, 1.64f, -4.244f, 1.801f)
                lineToRelative(-0.756f, 0.433f)
                verticalLineToRelative(5.673f)
                lineToRelative(0.668f, 0.445f)
                curveToRelative(0.138f, 0.092f, 3.417f, 2.252f, 6.832f, 2.252f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.119f, 0.0f, 3.151f, 1.072f, 4.169f, 1.749f)
                lineToRelative(2.331f, 1.548f)
                lineTo(24.0f, 3.704f)
                close()
                moveTo(20.999f, 15.954f)
                curveToRelative(-1.082f, -0.501f, -2.371f, -0.954f, -3.5f, -0.954f)
                lineTo(7.5f, 15.0f)
                curveToRelative(-1.738f, 0.0f, -3.552f, -0.841f, -4.5f, -1.356f)
                verticalLineToRelative(-2.24f)
                curveToRelative(1.187f, -0.588f, 3.136f, -1.403f, 4.5f, -1.403f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.129f, 0.0f, 2.418f, -0.453f, 3.5f, -0.954f)
                verticalLineToRelative(6.908f)
                close()
                moveTo(12.999f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(7.999f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(16.499f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _clarinet!!
    }

private var _clarinet: ImageVector? = null
