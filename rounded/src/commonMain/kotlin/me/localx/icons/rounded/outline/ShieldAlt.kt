package me.localx.icons.rounded.outline

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

public val Icons.Outline.ShieldAlt: ImageVector
    get() {
        if (_shieldAlt != null) {
            return _shieldAlt!!
        }
        _shieldAlt = Builder(name = "ShieldAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.573f, 2.126f)
                lineTo(12.339f, 0.059f)
                curveToRelative(-0.032f, -0.011f, -0.177f, -0.059f, -0.339f, -0.059f)
                reflectiveCurveToRelative(-0.307f, 0.047f, -0.339f, 0.059f)
                lineToRelative(-6.234f, 2.067f)
                curveToRelative(-2.05f, 0.68f, -3.427f, 2.587f, -3.427f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.577f, 9.152f, 11.65f)
                lineToRelative(0.402f, 0.201f)
                curveToRelative(0.141f, 0.07f, 0.294f, 0.105f, 0.447f, 0.105f)
                curveToRelative(0.126f, 0.0f, 0.253f, -0.024f, 0.373f, -0.072f)
                lineToRelative(0.418f, -0.168f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.427f, -4.746f)
                close()
                moveTo(4.0f, 12.043f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.056f, -2.848f)
                lineToRelative(4.944f, -1.639f)
                verticalLineToRelative(18.956f)
                curveToRelative(-2.483f, -1.426f, -7.0f, -4.659f, -7.0f, -9.298f)
                close()
                moveTo(20.0f, 12.043f)
                curveToRelative(0.0f, 5.353f, -4.565f, 8.267f, -7.0f, 9.44f)
                lineTo(13.0f, 2.385f)
                lineToRelative(4.944f, 1.639f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.553f, 2.056f, 2.848f)
                verticalLineToRelative(5.171f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
