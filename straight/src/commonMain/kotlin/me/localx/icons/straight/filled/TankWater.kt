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

public val Icons.Filled.TankWater: ImageVector
    get() {
        if (_tankWater != null) {
            return _tankWater!!
        }
        _tankWater = Builder(name = "TankWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.878f, 3.882f)
                lineToRelative(2.122f, -2.382f)
                lineToRelative(2.16f, 2.424f)
                curveToRelative(1.131f, 1.128f, 1.131f, 3.03f, -0.039f, 4.2f)
                curveToRelative(-0.566f, 0.566f, -1.32f, 0.879f, -2.121f, 0.879f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                curveToRelative(-1.169f, -1.17f, -1.169f, -3.072f, 0.0f, -4.242f)
                close()
                moveTo(24.0f, 14.618f)
                verticalLineToRelative(9.382f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-9.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                close()
                moveTo(11.293f, 6.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.039f, -1.455f)
                lineToRelative(0.669f, -0.75f)
                lineToRelative(0.707f, 0.791f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.378f, 0.377f, -1.037f, 0.377f, -1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _tankWater!!
    }

private var _tankWater: ImageVector? = null
