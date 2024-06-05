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

public val Icons.Outline.BellNotificationSocialMedia: ImageVector
    get() {
        if (_bellNotificationSocialMedia != null) {
            return _bellNotificationSocialMedia!!
        }
        _bellNotificationSocialMedia = Builder(name = "BellNotificationSocialMedia", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(20.0f, 2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(21.868f, 10.301f)
                curveToRelative(-0.127f, -0.538f, -0.675f, -0.869f, -1.202f, -0.745f)
                curveToRelative(-0.538f, 0.127f, -0.871f, 0.665f, -0.745f, 1.202f)
                lineToRelative(1.057f, 4.489f)
                curveToRelative(0.184f, 0.658f, 0.051f, 1.348f, -0.365f, 1.893f)
                curveToRelative(-0.419f, 0.547f, -1.056f, 0.86f, -1.748f, 0.86f)
                lineTo(5.135f, 18.0f)
                curveToRelative(-0.67f, 0.0f, -1.294f, -0.297f, -1.712f, -0.815f)
                curveToRelative(-0.417f, -0.517f, -0.573f, -1.183f, -0.439f, -1.786f)
                lineToRelative(2.094f, -7.777f)
                curveToRelative(0.74f, -3.31f, 3.642f, -5.621f, 7.056f, -5.621f)
                curveToRelative(0.43f, 0.0f, 0.859f, 0.038f, 1.275f, 0.114f)
                curveToRelative(0.551f, 0.098f, 1.064f, -0.264f, 1.163f, -0.806f)
                curveToRelative(0.099f, -0.544f, -0.263f, -1.064f, -0.806f, -1.163f)
                curveToRelative(-0.534f, -0.097f, -1.083f, -0.146f, -1.633f, -0.146f)
                curveTo(7.776f, 0.0f, 4.072f, 2.955f, 3.136f, 7.144f)
                lineToRelative(-2.094f, 7.776f)
                curveToRelative(-0.278f, 1.244f, 0.022f, 2.527f, 0.824f, 3.521f)
                curveToRelative(0.799f, 0.991f, 1.991f, 1.56f, 3.269f, 1.56f)
                horizontalLineToRelative(1.966f)
                curveToRelative(0.465f, 2.279f, 2.484f, 4.0f, 4.899f, 4.0f)
                reflectiveCurveToRelative(4.434f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(1.965f)
                curveToRelative(1.32f, 0.0f, 2.537f, -0.6f, 3.337f, -1.646f)
                curveToRelative(0.801f, -1.048f, 1.057f, -2.377f, 0.713f, -3.605f)
                lineToRelative(-1.046f, -4.448f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, -0.839f, -2.816f, -2.0f)
                horizontalLineToRelative(5.631f)
                curveToRelative(-0.414f, 1.161f, -1.514f, 2.0f, -2.816f, 2.0f)
                close()
            }
        }
        .build()
        return _bellNotificationSocialMedia!!
    }

private var _bellNotificationSocialMedia: ImageVector? = null
