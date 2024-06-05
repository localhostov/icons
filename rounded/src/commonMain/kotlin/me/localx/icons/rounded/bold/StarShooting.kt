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

public val Icons.Bold.StarShooting: ImageVector
    get() {
        if (_starShooting != null) {
            return _starShooting!!
        }
        _starShooting = Builder(name = "StarShooting", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 2.561f)
                lineToRelative(-9.0f, 9.0f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineTo(21.439f, 0.439f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(0.384f, 0.0f, 0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                close()
                moveTo(19.439f, 10.439f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                close()
                moveTo(11.916f, 15.0f)
                horizontalLineToRelative(-3.251f)
                lineToRelative(-1.151f, -3.09f)
                curveToRelative(-0.158f, -0.424f, -0.563f, -0.705f, -1.015f, -0.705f)
                reflectiveCurveToRelative(-0.857f, 0.281f, -1.015f, 0.705f)
                lineToRelative(-1.151f, 3.09f)
                lineTo(1.083f, 15.0f)
                curveToRelative(-0.454f, 0.0f, -0.86f, 0.284f, -1.017f, 0.71f)
                curveToRelative(-0.157f, 0.426f, -0.031f, 0.905f, 0.316f, 1.199f)
                lineToRelative(2.576f, 2.096f)
                lineToRelative(-1.019f, 3.267f)
                curveToRelative(-0.138f, 0.438f, 0.016f, 0.917f, 0.384f, 1.192f)
                curveToRelative(0.192f, 0.144f, 0.421f, 0.216f, 0.65f, 0.216f)
                curveToRelative(0.21f, 0.0f, 0.42f, -0.061f, 0.603f, -0.183f)
                lineToRelative(2.934f, -1.964f)
                lineToRelative(2.983f, 1.943f)
                curveToRelative(0.385f, 0.25f, 0.887f, 0.231f, 1.253f, -0.05f)
                curveToRelative(0.365f, -0.281f, 0.512f, -0.762f, 0.367f, -1.199f)
                lineToRelative(-1.06f, -3.229f)
                lineToRelative(2.563f, -2.088f)
                curveToRelative(0.348f, -0.293f, 0.476f, -0.773f, 0.32f, -1.2f)
                curveToRelative(-0.156f, -0.427f, -0.563f, -0.712f, -1.018f, -0.712f)
                close()
            }
        }
        .build()
        return _starShooting!!
    }

private var _starShooting: ImageVector? = null
