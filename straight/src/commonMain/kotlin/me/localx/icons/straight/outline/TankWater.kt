package me.localx.icons.straight.outline

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

public val Icons.Outline.TankWater: ImageVector
    get() {
        if (_tankWater != null) {
            return _tankWater!!
        }
        _tankWater = Builder(name = "TankWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-7.655f)
                lineToRelative(1.783f, 2.0f)
                horizontalLineToRelative(5.873f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(9.717f)
                curveToRelative(-0.304f, 0.177f, -0.643f, 0.283f, -1.0f, 0.283f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.357f, 0.0f, -0.696f, -0.106f, -1.0f, -0.283f)
                lineTo(2.001f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.874f)
                lineToRelative(1.782f, -2.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-7.135f)
                curveToRelative(0.325f, 0.084f, 0.659f, 0.135f, 1.0f, 0.135f)
                curveToRelative(1.2f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                curveToRelative(0.341f, 0.0f, 0.675f, -0.051f, 1.0f, -0.135f)
                verticalLineToRelative(7.135f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(9.878f, 8.121f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.039f, -4.2f)
                lineToRelative(-2.16f, -2.424f)
                lineToRelative(-2.122f, 2.382f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                close()
            }
        }
        .build()
        return _tankWater!!
    }

private var _tankWater: ImageVector? = null
