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

public val Icons.Bold.RollerCoaster: ImageVector
    get() {
        if (_rollerCoaster != null) {
            return _rollerCoaster!!
        }
        _rollerCoaster = Builder(name = "RollerCoaster", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 13.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.804f, 0.0f, -1.579f, -0.127f, -2.306f, -0.362f)
                curveToRelative(1.74f, -1.875f, 2.806f, -4.384f, 2.806f, -7.138f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                curveToRelative(0.0f, 2.754f, 1.065f, 5.263f, 2.806f, 7.138f)
                curveToRelative(-0.727f, 0.235f, -1.502f, 0.362f, -2.306f, 0.362f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(0.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(3.0f, 12.841f)
                curveToRelative(0.598f, 0.611f, 1.269f, 1.149f, 2.0f, 1.6f)
                verticalLineToRelative(8.059f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-6.802f)
                curveToRelative(0.646f, 0.158f, 1.314f, 0.257f, 2.0f, 0.289f)
                verticalLineToRelative(6.512f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-6.801f)
                curveToRelative(0.696f, -0.171f, 1.366f, -0.411f, 2.0f, -0.713f)
                verticalLineToRelative(7.514f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-6.801f)
                curveToRelative(0.646f, 0.158f, 1.314f, 0.257f, 2.0f, 0.289f)
                verticalLineToRelative(6.512f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(23.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 11.086f)
                curveToRelative(-1.533f, -1.375f, -2.5f, -3.369f, -2.5f, -5.586f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                curveToRelative(0.0f, 2.217f, -0.967f, 4.211f, -2.5f, 5.586f)
                close()
            }
        }
        .build()
        return _rollerCoaster!!
    }

private var _rollerCoaster: ImageVector? = null
