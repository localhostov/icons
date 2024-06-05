package me.localx.icons.rounded.filled

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

public val Icons.Filled.CarCircleBolt: ImageVector
    get() {
        if (_carCircleBolt != null) {
            return _carCircleBolt!!
        }
        _carCircleBolt = Builder(name = "CarCircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(19.772f, 18.425f)
                lineToRelative(-1.317f, 2.639f)
                curveToRelative(-0.247f, 0.494f, -0.847f, 0.695f, -1.341f, 0.448f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.494f, -0.246f, -0.695f, -0.847f, -0.448f, -1.341f)
                lineToRelative(1.083f, -2.172f)
                horizontalLineToRelative(-2.134f)
                curveToRelative(-0.509f, 0.0f, -0.993f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.396f, -0.943f, -0.249f, -1.43f)
                lineToRelative(1.751f, -3.278f)
                curveToRelative(0.26f, -0.488f, 0.868f, -0.67f, 1.354f, -0.408f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.485f, 0.262f, 0.666f, 0.867f, 0.404f, 1.352f)
                lineToRelative(-1.304f, 2.416f)
                horizontalLineToRelative(2.121f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.412f, 0.845f)
                curveToRelative(0.269f, 0.499f, 0.253f, 1.098f, -0.035f, 1.581f)
                close()
                moveTo(9.517f, 12.0f)
                lineTo(0.337f, 12.0f)
                curveToRelative(0.022f, -0.081f, 0.036f, -0.164f, 0.065f, -0.244f)
                lineTo(3.104f, 4.329f)
                curveToRelative(0.715f, -1.968f, 2.603f, -3.291f, 4.698f, -3.291f)
                horizontalLineToRelative(8.396f)
                curveToRelative(2.096f, 0.0f, 3.983f, 1.323f, 4.698f, 3.292f)
                lineToRelative(2.208f, 6.07f)
                curveToRelative(-1.605f, -1.485f, -3.745f, -2.4f, -6.104f, -2.4f)
                curveToRelative(-3.12f, 0.0f, -5.868f, 1.589f, -7.482f, 4.0f)
                close()
                moveTo(8.946f, 21.0f)
                horizontalLineToRelative(-1.947f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.424f)
                curveToRelative(-1.763f, -0.774f, -3.0f, -2.531f, -3.0f, -4.576f)
                verticalLineToRelative(-1.962f)
                lineTo(4.0f, 14.038f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.038f)
                horizontalLineToRelative(2.523f)
                curveToRelative(-0.333f, 0.94f, -0.523f, 1.946f, -0.523f, 3.0f)
                curveToRelative(0.0f, 1.439f, 0.346f, 2.794f, 0.947f, 4.0f)
                close()
            }
        }
        .build()
        return _carCircleBolt!!
    }

private var _carCircleBolt: ImageVector? = null
