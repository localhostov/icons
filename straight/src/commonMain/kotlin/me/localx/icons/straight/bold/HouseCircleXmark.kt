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

public val Icons.Bold.HouseCircleXmark: ImageVector
    get() {
        if (_houseCircleXmark != null) {
            return _houseCircleXmark!!
        }
        _houseCircleXmark = Builder(name = "HouseCircleXmark", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(21.536f, 20.121f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(24.0f, 10.176f)
                verticalLineToRelative(2.557f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                verticalLineToRelative(-0.423f)
                curveToRelative(0.0f, -0.155f, -0.07f, -0.299f, -0.191f, -0.394f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(12.308f, 3.131f, 12.308f, 3.131f)
                curveToRelative(-0.18f, -0.143f, -0.434f, -0.143f, -0.615f, 0.0f)
                lineTo(3.192f, 9.782f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(10.824f)
                horizontalLineToRelative(4.996f)
                reflectiveCurveToRelative(0.003f, 0.0f, 0.004f, 0.0f)
                horizontalLineToRelative(2.582f)
                curveToRelative(0.468f, 1.161f, 1.202f, 2.184f, 2.124f, 3.0f)
                horizontalLineToRelative(-4.707f)
                reflectiveCurveToRelative(-8.0f, 0.0f, -8.0f, 0.0f)
                verticalLineToRelative(-13.824f)
                curveToRelative(0.0f, -1.082f, 0.489f, -2.087f, 1.342f, -2.756f)
                lineTo(9.843f, 0.768f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.994f, 4.314f, 0.0f)
                lineToRelative(8.5f, 6.651f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.854f, 0.669f, 1.343f, 1.674f, 1.343f, 2.757f)
                close()
            }
        }
        .build()
        return _houseCircleXmark!!
    }

private var _houseCircleXmark: ImageVector? = null
