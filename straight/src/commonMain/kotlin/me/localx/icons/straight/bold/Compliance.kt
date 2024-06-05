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

public val Icons.Bold.Compliance: ImageVector
    get() {
        if (_compliance != null) {
            return _compliance!!
        }
        _compliance = Builder(name = "Compliance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.396f, 10.735f)
                curveToRelative(0.057f, -0.334f, 0.029f, -0.519f, 0.007f, -0.599f)
                curveToRelative(-0.188f, -0.69f, -0.75f, -1.136f, -1.432f, -1.136f)
                curveToRelative(-0.213f, 0.0f, -0.428f, 0.044f, -0.64f, 0.132f)
                curveToRelative(-0.254f, 0.105f, -0.503f, 0.367f, -0.682f, 0.719f)
                lineToRelative(-2.193f, 4.149f)
                horizontalLineToRelative(-2.456f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.5f)
                lineToRelative(1.5f, -8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.184f)
                lineToRelative(0.58f, -3.265f)
                close()
                moveTo(12.76f, 17.0f)
                lineToRelative(-0.75f, 4.0f)
                horizontalLineToRelative(-7.01f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.76f)
                close()
                moveTo(21.98f, 12.189f)
                lineToRelative(1.829f, 1.171f)
                lineToRelative(-1.617f, 2.527f)
                lineToRelative(-1.83f, -1.171f)
                curveToRelative(-0.682f, 0.701f, -1.489f, 1.279f, -2.4f, 1.672f)
                lineToRelative(0.004f, -0.019f)
                lineToRelative(0.034f, -0.183f)
                verticalLineToRelative(-3.356f)
                curveToRelative(0.914f, -0.824f, 1.5f, -2.005f, 1.5f, -3.33f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-2.071f, 0.0f, -3.85f, 1.541f, -4.372f, 3.449f)
                lineToRelative(-2.192f, -1.395f)
                lineToRelative(-2.245f, -1.413f)
                lineToRelative(1.617f, -2.527f)
                lineToRelative(1.819f, 1.164f)
                curveToRelative(1.031f, -1.06f, 2.37f, -1.817f, 3.872f, -2.125f)
                lineTo(13.499f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.151f)
                curveToRelative(1.503f, 0.306f, 2.841f, 1.066f, 3.872f, 2.127f)
                lineToRelative(1.819f, -1.164f)
                lineToRelative(1.617f, 2.527f)
                lineToRelative(-1.818f, 1.164f)
                curveToRelative(0.324f, 0.838f, 0.509f, 1.745f, 0.509f, 2.696f)
                reflectiveCurveToRelative(-0.196f, 1.852f, -0.52f, 2.689f)
                close()
                moveTo(16.5f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _compliance!!
    }

private var _compliance: ImageVector? = null
