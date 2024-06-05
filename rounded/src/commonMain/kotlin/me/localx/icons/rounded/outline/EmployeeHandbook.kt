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

public val Icons.Outline.EmployeeHandbook: ImageVector
    get() {
        if (_employeeHandbook != null) {
            return _employeeHandbook!!
        }
        _employeeHandbook = Builder(name = "EmployeeHandbook", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.204f, 2.162f)
                curveToRelative(-1.141f, -0.952f, -2.634f, -1.343f, -4.098f, -1.081f)
                lineToRelative(-3.822f, 0.695f)
                curveToRelative(-0.913f, 0.167f, -1.706f, 0.634f, -2.284f, 1.289f)
                curveToRelative(-0.578f, -0.655f, -1.371f, -1.123f, -2.285f, -1.289f)
                lineToRelative(-3.821f, -0.695f)
                curveToRelative(-1.461f, -0.263f, -2.956f, 0.129f, -4.098f, 1.081f)
                curveToRelative(-1.142f, 0.953f, -1.796f, 2.352f, -1.796f, 3.839f)
                verticalLineToRelative(10.792f)
                curveToRelative(0.0f, 2.417f, 1.727f, 4.486f, 4.106f, 4.919f)
                lineToRelative(6.284f, 1.143f)
                curveToRelative(0.534f, 0.097f, 1.072f, 0.146f, 1.61f, 0.146f)
                reflectiveCurveToRelative(1.076f, -0.048f, 1.61f, -0.146f)
                lineToRelative(6.285f, -1.143f)
                curveToRelative(2.379f, -0.433f, 4.105f, -2.502f, 4.105f, -4.919f)
                lineTo(24.0f, 6.001f)
                curveToRelative(0.0f, -1.487f, -0.655f, -2.886f, -1.796f, -3.839f)
                close()
                moveTo(11.0f, 20.928f)
                curveToRelative(-0.084f, -0.012f, -0.168f, -0.026f, -0.252f, -0.041f)
                lineToRelative(-6.284f, -1.143f)
                curveToRelative(-1.428f, -0.26f, -2.464f, -1.501f, -2.464f, -2.952f)
                lineTo(2.0f, 6.001f)
                curveToRelative(0.0f, -0.892f, 0.393f, -1.731f, 1.078f, -2.303f)
                curveToRelative(0.545f, -0.455f, 1.223f, -0.697f, 1.919f, -0.697f)
                curveToRelative(0.179f, 0.0f, 0.36f, 0.016f, 0.54f, 0.049f)
                lineToRelative(3.821f, 0.695f)
                curveToRelative(0.952f, 0.173f, 1.643f, 1.001f, 1.643f, 1.968f)
                verticalLineToRelative(15.216f)
                close()
                moveTo(22.0f, 16.793f)
                curveToRelative(0.0f, 1.451f, -1.036f, 2.692f, -2.463f, 2.952f)
                lineToRelative(-6.284f, 1.143f)
                curveToRelative(-0.084f, 0.015f, -0.168f, 0.029f, -0.252f, 0.041f)
                lineTo(13.001f, 5.712f)
                curveToRelative(0.0f, -0.967f, 0.691f, -1.794f, 1.642f, -1.968f)
                lineToRelative(3.821f, -0.695f)
                curveToRelative(0.878f, -0.162f, 1.773f, 0.077f, 2.459f, 0.648f)
                curveToRelative(0.685f, 0.572f, 1.078f, 1.411f, 1.078f, 2.303f)
                verticalLineToRelative(10.792f)
                close()
                moveTo(5.5f, 13.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _employeeHandbook!!
    }

private var _employeeHandbook: ImageVector? = null
