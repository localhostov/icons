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

public val Icons.Bold.RoboticArm: ImageVector
    get() {
        if (_roboticArm != null) {
            return _roboticArm!!
        }
        _roboticArm = Builder(name = "RoboticArm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-6.482f)
                curveToRelative(0.309f, -0.61f, 0.5f, -1.289f, 0.5f, -2.018f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-0.024f, 0.0f, -0.046f, 0.007f, -0.069f, 0.007f)
                lineToRelative(-1.798f, -3.597f)
                curveToRelative(0.227f, -0.422f, 0.367f, -0.898f, 0.367f, -1.41f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.015f, 0.004f, 0.029f, 0.004f, 0.044f)
                lineToRelative(-3.548f, 2.956f)
                horizontalLineToRelative(-2.214f)
                curveToRelative(-1.202f, 0.0f, -2.332f, 0.468f, -3.182f, 1.318f)
                lineToRelative(-1.121f, 1.121f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0.0f)
                lineToRelative(1.121f, -1.121f)
                curveToRelative(0.284f, -0.283f, 0.66f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(1.257f)
                verticalLineToRelative(1.257f)
                curveToRelative(0.0f, 0.401f, -0.156f, 0.777f, -0.439f, 1.061f)
                lineToRelative(-1.121f, 1.121f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(1.121f, -1.121f)
                curveToRelative(0.85f, -0.85f, 1.318f, -1.98f, 1.318f, -3.182f)
                verticalLineToRelative(-2.055f)
                lineToRelative(3.086f, -2.572f)
                curveToRelative(0.423f, 0.228f, 0.9f, 0.369f, 1.414f, 0.369f)
                curveToRelative(0.024f, 0.0f, 0.046f, -0.006f, 0.069f, -0.007f)
                lineToRelative(1.542f, 3.085f)
                curveToRelative(-0.977f, 0.826f, -1.612f, 2.045f, -1.612f, 3.422f)
                curveToRelative(0.0f, 0.729f, 0.191f, 1.409f, 0.5f, 2.018f)
                verticalLineToRelative(6.482f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 12.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 16.879f)
                curveToRelative(0.323f, 0.074f, 0.655f, 0.121f, 1.0f, 0.121f)
                reflectiveCurveToRelative(0.677f, -0.047f, 1.0f, -0.121f)
                verticalLineToRelative(4.121f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.121f)
                close()
            }
        }
        .build()
        return _roboticArm!!
    }

private var _roboticArm: ImageVector? = null
