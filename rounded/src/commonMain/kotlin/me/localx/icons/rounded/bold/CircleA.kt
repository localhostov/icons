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

public val Icons.Bold.CircleA: ImageVector
    get() {
        if (_circleA != null) {
            return _circleA!!
        }
        _circleA = Builder(name = "CircleA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.62f, 7.286f)
                curveToRelative(-0.426f, -1.085f, -1.455f, -1.786f, -2.62f, -1.786f)
                reflectiveCurveToRelative(-2.194f, 0.701f, -2.634f, 1.824f)
                lineToRelative(-2.776f, 7.666f)
                curveToRelative(-0.282f, 0.779f, 0.121f, 1.639f, 0.899f, 1.921f)
                curveToRelative(0.776f, 0.283f, 1.639f, -0.12f, 1.921f, -0.899f)
                lineToRelative(0.366f, -1.011f)
                horizontalLineToRelative(4.448f)
                lineToRelative(0.366f, 1.011f)
                curveToRelative(0.221f, 0.61f, 0.796f, 0.99f, 1.41f, 0.99f)
                curveToRelative(0.169f, 0.0f, 0.342f, -0.029f, 0.511f, -0.09f)
                curveToRelative(0.779f, -0.282f, 1.182f, -1.142f, 0.899f, -1.921f)
                lineToRelative(-2.79f, -7.703f)
                close()
                moveTo(10.862f, 12.0f)
                lineToRelative(1.137f, -3.141f)
                lineToRelative(1.138f, 3.141f)
                horizontalLineToRelative(-2.275f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleA!!
    }

private var _circleA: ImageVector? = null
