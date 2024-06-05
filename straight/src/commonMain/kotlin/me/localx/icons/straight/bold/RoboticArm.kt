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
                moveToRelative(22.0f, 21.0f)
                verticalLineToRelative(-6.482f)
                curveToRelative(0.309f, -0.61f, 0.5f, -1.289f, 0.5f, -2.018f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-0.024f, 0.0f, -0.046f, 0.007f, -0.069f, 0.007f)
                lineToRelative(-1.798f, -3.596f)
                curveToRelative(0.227f, -0.422f, 0.368f, -0.898f, 0.368f, -1.411f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.015f, 0.004f, 0.029f, 0.004f, 0.044f)
                lineToRelative(-3.548f, 2.956f)
                lineTo(2.879f, 6.0f)
                lineTo(0.055f, 8.824f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.945f, -1.945f)
                horizontalLineToRelative(1.879f)
                verticalLineToRelative(1.879f)
                lineToRelative(-1.945f, 1.945f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.824f, -2.824f)
                verticalLineToRelative(-3.918f)
                lineToRelative(3.086f, -2.572f)
                curveToRelative(0.423f, 0.228f, 0.9f, 0.369f, 1.414f, 0.369f)
                curveToRelative(0.024f, 0.0f, 0.046f, -0.006f, 0.069f, -0.007f)
                lineToRelative(1.542f, 3.085f)
                curveToRelative(-0.977f, 0.826f, -1.612f, 2.045f, -1.612f, 3.422f)
                curveToRelative(0.0f, 0.729f, 0.191f, 1.409f, 0.5f, 2.018f)
                verticalLineToRelative(6.482f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
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
