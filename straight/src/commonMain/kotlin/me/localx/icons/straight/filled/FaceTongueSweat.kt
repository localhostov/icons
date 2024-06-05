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

public val Icons.Filled.FaceTongueSweat: ImageVector
    get() {
        if (_faceTongueSweat != null) {
            return _faceTongueSweat!!
        }
        _faceTongueSweat = Builder(name = "FaceTongueSweat", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.216f)
                verticalLineToRelative(1.384f)
                curveToRelative(0.0f, 0.662f, -0.411f, 1.4f, -1.0f, 1.4f)
                reflectiveCurveToRelative(-1.0f, -0.738f, -1.0f, -1.4f)
                verticalLineToRelative(-1.384f)
                curveToRelative(0.285f, -0.125f, 0.606f, -0.216f, 1.0f, -0.216f)
                reflectiveCurveToRelative(0.715f, 0.092f, 1.0f, 0.216f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-5.41f, 0.0f, -9.981f, -3.582f, -11.479f, -8.502f)
                curveToRelative(0.457f, 0.597f, 1.169f, 0.988f, 1.979f, 0.988f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.987f, -2.5f, -4.5f, -2.5f, -4.5f)
                curveToRelative(0.0f, 0.0f, -2.005f, 1.979f, -2.42f, 3.858f)
                curveToRelative(-0.049f, -0.442f, -0.08f, -0.889f, -0.08f, -1.344f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.37f, 9.334f)
                curveToRelative(1.582f, -0.631f, 2.952f, -1.765f, 3.962f, -3.279f)
                lineToRelative(-1.664f, -1.11f)
                curveToRelative(-0.773f, 1.159f, -1.853f, 2.058f, -3.039f, 2.532f)
                lineToRelative(0.741f, 1.857f)
                close()
                moveTo(14.966f, 18.0f)
                horizontalLineToRelative(2.034f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                horizontalLineToRelative(2.034f)
                curveToRelative(0.168f, 1.51f, 1.263f, 3.0f, 2.966f, 3.0f)
                reflectiveCurveToRelative(2.797f, -1.49f, 2.966f, -3.0f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(19.371f, 7.477f)
                curveToRelative(-1.187f, -0.474f, -2.266f, -1.373f, -3.039f, -2.532f)
                lineToRelative(-1.664f, 1.11f)
                curveToRelative(1.01f, 1.514f, 2.38f, 2.647f, 3.962f, 3.279f)
                lineToRelative(0.741f, -1.857f)
                close()
            }
        }
        .build()
        return _faceTongueSweat!!
    }

private var _faceTongueSweat: ImageVector? = null
