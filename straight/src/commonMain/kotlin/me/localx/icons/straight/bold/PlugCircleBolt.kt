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

public val Icons.Bold.PlugCircleBolt: ImageVector
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
                moveTo(10.459f, 15.35f)
                curveToRelative(-0.292f, 0.831f, -0.459f, 1.72f, -0.459f, 2.65f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.519f)
                curveToRelative(-3.352f, -0.256f, -6.0f, -3.065f, -6.0f, -6.481f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.262f)
                curveToRelative(-1.112f, 0.287f, -2.131f, 0.801f, -3.0f, 1.498f)
                verticalLineToRelative(-3.76f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.335f, 0.0f, 0.652f, -0.062f, 0.959f, -0.15f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
