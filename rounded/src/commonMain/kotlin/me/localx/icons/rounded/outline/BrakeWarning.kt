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

public val Icons.Outline.BrakeWarning: ImageVector
    get() {
        if (_brakeWarning != null) {
            return _brakeWarning!!
        }
        _brakeWarning = Builder(name = "BrakeWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.284f, 18.362f)
                curveToRelative(0.352f, 0.426f, 0.292f, 1.057f, -0.133f, 1.408f)
                curveToRelative(-0.187f, 0.154f, -0.412f, 0.229f, -0.637f, 0.229f)
                curveToRelative(-0.288f, 0.0f, -0.573f, -0.124f, -0.771f, -0.362f)
                curveToRelative(-3.652f, -4.416f, -3.658f, -10.833f, -0.015f, -15.257f)
                curveToRelative(0.351f, -0.427f, 0.98f, -0.489f, 1.408f, -0.136f)
                curveToRelative(0.426f, 0.351f, 0.487f, 0.98f, 0.136f, 1.407f)
                curveToRelative(-3.035f, 3.686f, -3.03f, 9.031f, 0.012f, 12.71f)
                close()
                moveTo(21.272f, 4.381f)
                curveToRelative(-0.351f, -0.427f, -0.982f, -0.487f, -1.408f, -0.136f)
                curveToRelative(-0.426f, 0.351f, -0.487f, 0.98f, -0.136f, 1.407f)
                curveToRelative(3.029f, 3.678f, 3.029f, 9.018f, 0.0f, 12.695f)
                curveToRelative(-0.351f, 0.427f, -0.29f, 1.057f, 0.136f, 1.407f)
                curveToRelative(0.186f, 0.154f, 0.412f, 0.229f, 0.635f, 0.229f)
                curveToRelative(0.289f, 0.0f, 0.575f, -0.124f, 0.772f, -0.364f)
                curveToRelative(3.636f, -4.415f, 3.636f, -10.823f, 0.0f, -15.238f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _brakeWarning!!
    }

private var _brakeWarning: ImageVector? = null
