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

public val Icons.Outline.BatterySlash: ImageVector
    get() {
        if (_batterySlash != null) {
            return _batterySlash!!
        }
        _batterySlash = Builder(name = "BatterySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.784f, 16.0f)
                horizontalLineToRelative(1.216f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                lineTo(5.414f, 4.0f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.683f, -0.098f, 0.292f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.292f, 1.707f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-3.582f, -3.582f)
                curveToRelative(0.78f, -0.72f, 1.364f, -1.679f, 1.659f, -2.711f)
                close()
                moveTo(7.414f, 6.0f)
                horizontalLineToRelative(9.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.034f, -0.512f, 2.111f, -1.291f, 2.796f)
                lineTo(7.414f, 6.0f)
                close()
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.879f, 0.231f, -1.744f, 0.669f, -2.5f)
                curveToRelative(0.277f, -0.479f, 0.888f, -0.642f, 1.366f, -0.365f)
                curveToRelative(0.479f, 0.277f, 0.642f, 0.888f, 0.365f, 1.366f)
                curveToRelative(-0.262f, 0.454f, -0.401f, 0.972f, -0.401f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(13.0f, 18.001f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _batterySlash!!
    }

private var _batterySlash: ImageVector? = null
