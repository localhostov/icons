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

public val Icons.Filled.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.731f, 19.493f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-2.385f, 3.45f, -2.385f, 3.45f)
                lineToRelative(-1.659f, -1.117f)
                lineToRelative(1.963f, -2.824f)
                horizontalLineToRelative(-2.035f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.462f, -0.969f, -0.249f, -1.431f)
                curveToRelative(0.48f, -1.04f, 2.478f, -3.854f, 2.478f, -3.854f)
                lineToRelative(1.664f, 1.109f)
                lineToRelative(-1.845f, 2.828f)
                horizontalLineToRelative(2.029f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                curveToRelative(0.28f, 0.522f, 0.25f, 1.151f, -0.077f, 1.645f)
                close()
                moveTo(10.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.069f)
                curveToRelative(-3.945f, 0.493f, -7.0f, 3.852f, -7.0f, 7.931f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
