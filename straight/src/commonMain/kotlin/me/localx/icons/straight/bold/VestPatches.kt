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

public val Icons.Bold.VestPatches: ImageVector
    get() {
        if (_vestPatches != null) {
            return _vestPatches!!
        }
        _vestPatches = Builder(name = "VestPatches", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.5f, 15.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, -3.0f)
                lineToRelative(-2.0f, 3.0f)
                close()
                moveTo(23.0f, 12.101f)
                verticalLineToRelative(11.899f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 12.103f)
                curveToRelative(0.688f, -0.811f, 2.0f, -2.736f, 2.0f, -3.449f)
                lineTo(3.0f, 3.894f)
                curveToRelative(0.0f, -1.584f, 1.058f, -2.974f, 2.573f, -3.378f)
                curveTo(7.482f, 0.006f, 9.419f, 0.0f, 9.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.081f, 0.0f, 2.018f, 0.006f, 3.927f, 0.515f)
                curveToRelative(1.516f, 0.405f, 2.573f, 1.794f, 2.573f, 3.378f)
                verticalLineToRelative(4.76f)
                curveToRelative(0.0f, 0.72f, 1.312f, 2.641f, 2.0f, 3.447f)
                close()
                moveTo(10.5f, 12.915f)
                lineTo(7.036f, 3.256f)
                curveToRelative(-0.228f, 0.044f, -0.46f, 0.096f, -0.689f, 0.158f)
                curveToRelative(-0.2f, 0.054f, -0.347f, 0.255f, -0.347f, 0.48f)
                verticalLineToRelative(4.76f)
                curveToRelative(0.0f, 1.713f, -1.304f, 3.628f, -2.0f, 4.53f)
                verticalLineToRelative(7.816f)
                horizontalLineToRelative(6.5f)
                lineTo(10.5f, 12.915f)
                close()
                moveTo(12.0f, 8.211f)
                lineToRelative(1.868f, -5.21f)
                horizontalLineToRelative(-3.737f)
                lineToRelative(1.868f, 5.21f)
                close()
                moveTo(20.0f, 13.184f)
                curveToRelative(-0.696f, -0.901f, -2.0f, -2.817f, -2.0f, -4.53f)
                lineTo(18.0f, 3.894f)
                curveToRelative(0.0f, -0.225f, -0.146f, -0.426f, -0.348f, -0.48f)
                curveToRelative(-0.229f, -0.061f, -0.461f, -0.113f, -0.688f, -0.158f)
                lineToRelative(-3.464f, 9.659f)
                verticalLineToRelative(8.085f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.816f)
                close()
            }
        }
        .build()
        return _vestPatches!!
    }

private var _vestPatches: ImageVector? = null
