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

public val Icons.Bold.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.5f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(21.903f, 9.058f)
                lineToRelative(-3.939f, 3.939f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.938f, 1.938f)
                curveToRelative(0.566f, 0.567f, 1.319f, 0.88f, 2.122f, 0.88f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(3.939f, -3.939f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(14.94f, 16.954f)
                curveToRelative(-1.267f, 1.264f, -3.014f, 2.047f, -4.941f, 2.047f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                curveToRelative(2.268f, 0.0f, 4.281f, 1.089f, 5.561f, 2.766f)
                lineToRelative(2.403f, 2.403f)
                lineToRelative(1.466f, -1.466f)
                curveToRelative(-1.367f, -3.896f, -5.073f, -6.703f, -9.43f, -6.703f)
                curveTo(4.486f, 2.0f, 0.0f, 6.486f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.263f, 0.0f, 6.158f, -1.579f, 7.984f, -4.005f)
                curveToRelative(-0.007f, 0.0f, -0.014f, 0.002f, -0.021f, 0.002f)
                curveToRelative(-1.112f, 0.0f, -2.156f, -0.378f, -3.023f, -1.044f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
