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

public val Icons.Outline.CarSideBolt: ImageVector
    get() {
        if (_carSideBolt != null) {
            return _carSideBolt!!
        }
        _carSideBolt = Builder(name = "CarSideBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -1.626f, -1.338f, -3.0f, -2.923f, -3.0f)
                horizontalLineToRelative(-0.555f)
                lineTo(15.84f, 3.285f)
                curveToRelative(-0.561f, -0.804f, -1.48f, -1.285f, -2.461f, -1.285f)
                lineTo(6.381f, 2.0f)
                curveToRelative(-1.239f, 0.0f, -2.366f, 0.778f, -2.805f, 1.937f)
                lineTo(0.98f, 10.784f)
                curveToRelative(-0.602f, 0.549f, -0.98f, 1.339f, -0.98f, 2.216f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(7.0f, 18.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.584f)
                lineToRelative(2.03f, -5.354f)
                curveToRelative(0.146f, -0.386f, 0.522f, -0.646f, 0.935f, -0.646f)
                horizontalLineToRelative(6.999f)
                curveToRelative(0.327f, 0.0f, 0.633f, 0.16f, 0.82f, 0.428f)
                lineToRelative(3.884f, 5.572f)
                horizontalLineToRelative(-3.084f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.077f)
                curveToRelative(0.492f, 0.0f, 0.923f, 0.467f, 0.923f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.809f, 9.846f)
                curveToRelative(0.268f, 0.499f, 0.252f, 1.098f, -0.037f, 1.58f)
                lineToRelative(-1.764f, 3.534f)
                lineToRelative(-1.789f, -0.894f)
                lineToRelative(1.53f, -3.066f)
                horizontalLineToRelative(-2.134f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.653f)
                reflectiveCurveToRelative(-0.396f, -0.943f, -0.249f, -1.43f)
                lineToRelative(2.224f, -4.161f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.778f, 3.294f)
                horizontalLineToRelative(2.121f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                close()
            }
        }
        .build()
        return _carSideBolt!!
    }

private var _carSideBolt: ImageVector? = null
