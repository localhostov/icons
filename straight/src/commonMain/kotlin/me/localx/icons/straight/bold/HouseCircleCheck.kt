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

public val Icons.Bold.HouseCircleCheck: ImageVector
    get() {
        if (_houseCircleCheck != null) {
            return _houseCircleCheck!!
        }
        _houseCircleCheck = Builder(name = "HouseCircleCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.752f, 20.44f)
                lineToRelative(-0.004f, 0.004f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                close()
                moveTo(24.0f, 10.177f)
                verticalLineToRelative(2.557f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                verticalLineToRelative(-0.423f)
                curveToRelative(0.0f, -0.155f, -0.07f, -0.299f, -0.191f, -0.394f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(12.308f, 3.131f)
                curveToRelative(-0.182f, -0.143f, -0.435f, -0.143f, -0.616f, 0.0f)
                lineTo(3.192f, 9.782f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(10.824f)
                horizontalLineToRelative(4.996f)
                reflectiveCurveToRelative(0.003f, 0.0f, 0.004f, 0.0f)
                horizontalLineToRelative(2.582f)
                curveToRelative(0.468f, 1.161f, 1.202f, 2.184f, 2.124f, 3.0f)
                horizontalLineToRelative(-3.707f)
                reflectiveCurveToRelative(-9.0f, 0.0f, -9.0f, 0.0f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.082f, 0.489f, -2.087f, 1.342f, -2.756f)
                lineTo(9.843f, 0.768f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.992f, 4.313f, 0.0f)
                lineToRelative(8.5f, 6.651f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.854f, 0.669f, 1.344f, 1.673f, 1.344f, 2.757f)
                close()
            }
        }
        .build()
        return _houseCircleCheck!!
    }

private var _houseCircleCheck: ImageVector? = null
