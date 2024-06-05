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

public val Icons.Filled.SkinHair: ImageVector
    get() {
        if (_skinHair != null) {
            return _skinHair!!
        }
        _skinHair = Builder(name = "SkinHair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.084f, 4.694f)
                curveToRelative(0.342f, -1.664f, 1.725f, -3.08f, 2.916f, -3.694f)
                curveToRelative(-4.81f, 0.471f, -8.0f, 5.0f, -9.055f, 8.0f)
                horizontalLineToRelative(-5.483f)
                curveToRelative(-0.002f, -1.709f, 0.23f, -3.652f, 1.038f, -5.269f)
                curveTo(11.5f, 1.731f, 13.774f, 0.107f, 15.0f, 0.0f)
                curveTo(9.653f, 0.0f, 4.808f, 3.746f, 2.868f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.283f)
                curveToRelative(-0.205f, 0.968f, -0.321f, 1.97f, -0.321f, 3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.372f, -0.081f, -0.838f, -0.194f, -1.481f)
                curveToRelative(-0.067f, -0.386f, -0.144f, -0.91f, -0.205f, -1.519f)
                horizontalLineToRelative(4.8f)
                curveToRelative(-0.241f, 1.076f, -0.363f, 2.104f, -0.363f, 3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.372f, -0.081f, -0.838f, -0.194f, -1.481f)
                curveToRelative(-0.072f, -0.414f, -0.19f, -0.931f, -0.316f, -1.519f)
                horizontalLineToRelative(2.51f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.889f)
                curveToRelative(-0.212f, -1.38f, -0.315f, -2.901f, -0.027f, -4.306f)
                close()
            }
        }
        .build()
        return _skinHair!!
    }

private var _skinHair: ImageVector? = null
