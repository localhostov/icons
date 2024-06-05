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

public val Icons.Outline.RegionPinAlt: ImageVector
    get() {
        if (_regionPinAlt != null) {
            return _regionPinAlt!!
        }
        _regionPinAlt = Builder(name = "RegionPinAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.477f)
                verticalLineToRelative(3.523f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(-5.914f, -5.914f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(1.865f)
                curveToRelative(0.347f, -0.656f, 0.793f, -1.264f, 1.333f, -1.804f)
                curveToRelative(0.069f, -0.069f, 0.145f, -0.13f, 0.216f, -0.196f)
                lineTo(3.0f, -0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.415f)
                curveToRelative(-0.067f, 0.072f, -0.128f, 0.148f, -0.198f, 0.218f)
                lineToRelative(-1.802f, 1.673f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.9f)
                lineToRelative(-6.0f, 3.199f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 15.367f)
                lineToRelative(6.817f, -3.636f)
                lineToRelative(5.363f, 5.363f)
                lineToRelative(-3.679f, 4.906f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.633f)
                close()
                moveTo(13.0f, 22.0f)
                lineToRelative(3.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(17.0f, 5.506f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(14.649f, 9.426f)
                lineToRelative(3.851f, 3.572f)
                lineToRelative(3.889f, -3.609f)
                curveToRelative(1.039f, -1.038f, 1.611f, -2.419f, 1.611f, -3.889f)
                reflectiveCurveToRelative(-0.572f, -2.851f, -1.611f, -3.889f)
                curveToRelative(-1.038f, -1.039f, -2.419f, -1.611f, -3.889f, -1.611f)
                reflectiveCurveToRelative(-2.851f, 0.572f, -3.889f, 1.611f)
                curveToRelative(-1.039f, 1.038f, -1.611f, 2.419f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.576f, 2.854f, 1.649f, 3.926f)
                close()
                moveTo(16.025f, 3.026f)
                curveToRelative(0.661f, -0.661f, 1.539f, -1.025f, 2.475f, -1.025f)
                reflectiveCurveToRelative(1.813f, 0.364f, 2.475f, 1.025f)
                reflectiveCurveToRelative(1.025f, 1.539f, 1.025f, 2.475f)
                reflectiveCurveToRelative(-0.364f, 1.813f, -0.998f, 2.448f)
                lineToRelative(-2.502f, 2.321f)
                lineToRelative(-2.464f, -2.284f)
                curveToRelative(-0.668f, -0.668f, -1.036f, -1.55f, -1.036f, -2.485f)
                reflectiveCurveToRelative(0.364f, -1.813f, 1.025f, -2.475f)
                close()
            }
        }
        .build()
        return _regionPinAlt!!
    }

private var _regionPinAlt: ImageVector? = null
