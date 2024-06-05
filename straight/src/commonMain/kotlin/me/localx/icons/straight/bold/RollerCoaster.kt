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
                moveTo(20.5f, 13.0f)
                curveToRelative(-0.804f, 0.0f, -1.579f, -0.127f, -2.306f, -0.362f)
                curveToRelative(1.74f, -1.875f, 2.806f, -4.384f, 2.806f, -7.138f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                curveToRelative(0.0f, 2.754f, 1.065f, 5.263f, 2.806f, 7.138f)
                curveToRelative(-0.727f, 0.235f, -1.502f, 0.362f, -2.306f, 0.362f)
                curveToRelative(-4.275f, 0.0f, -7.5f, -3.01f, -7.5f, -7.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 13.133f)
                curveToRelative(0.595f, 0.568f, 1.266f, 1.063f, 2.0f, 1.476f)
                verticalLineToRelative(9.391f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 15.737f)
                curveToRelative(0.642f, 0.138f, 1.31f, 0.224f, 2.0f, 0.252f)
                verticalLineToRelative(8.011f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 15.699f)
                curveToRelative(0.696f, -0.171f, 1.366f, -0.411f, 2.0f, -0.713f)
                verticalLineToRelative(9.014f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 15.699f)
                curveToRelative(0.646f, 0.158f, 1.314f, 0.257f, 2.0f, 0.289f)
                verticalLineToRelative(8.012f)
                horizontalLineToRelative(3.0f)
                lineTo(23.0f, 13.0f)
                horizontalLineToRelative(-2.5f)
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
