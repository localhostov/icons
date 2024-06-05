package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.BrakeWarning: ImageVector
    get() {
        if (_brakeWarning != null) {
            return _brakeWarning!!
        }
        _brakeWarning = Builder(name = "BrakeWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.272f, 5.652f)
                curveToRelative(0.351f, -0.427f, 0.29f, -1.057f, -0.136f, -1.407f)
                curveToRelative(-0.428f, -0.354f, -1.057f, -0.291f, -1.408f, 0.136f)
                curveToRelative(-3.643f, 4.424f, -3.637f, 10.841f, 0.015f, 15.257f)
                curveToRelative(0.198f, 0.238f, 0.483f, 0.362f, 0.771f, 0.362f)
                curveToRelative(0.225f, 0.0f, 0.45f, -0.075f, 0.637f, -0.229f)
                curveToRelative(0.426f, -0.352f, 0.485f, -0.982f, 0.133f, -1.408f)
                curveToRelative(-3.042f, -3.679f, -3.047f, -9.024f, -0.012f, -12.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.272f, 4.381f)
                curveToRelative(-0.351f, -0.427f, -0.982f, -0.487f, -1.408f, -0.136f)
                curveToRelative(-0.426f, 0.351f, -0.487f, 0.98f, -0.136f, 1.407f)
                curveToRelative(3.029f, 3.678f, 3.029f, 9.018f, 0.0f, 12.695f)
                curveToRelative(-0.351f, 0.427f, -0.29f, 1.057f, 0.136f, 1.407f)
                curveToRelative(0.186f, 0.154f, 0.412f, 0.229f, 0.635f, 0.229f)
                curveToRelative(0.289f, 0.0f, 0.575f, -0.124f, 0.772f, -0.364f)
                curveToRelative(3.636f, -4.415f, 3.636f, -10.823f, 0.0f, -15.238f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _brakeWarning!!
    }

private var _brakeWarning: ImageVector? = null
