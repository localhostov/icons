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
                lineToRelative(-1.764f, 3.534f)
                lineToRelative(-1.789f, -0.893f)
                lineToRelative(1.529f, -3.066f)
                horizontalLineToRelative(-2.134f)
                curveToRelative(-0.509f, 0.0f, -0.993f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.396f, -0.943f, -0.249f, -1.43f)
                lineToRelative(2.224f, -4.162f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.778f, 3.294f)
                horizontalLineToRelative(2.121f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.412f, 0.845f)
                curveToRelative(0.269f, 0.499f, 0.253f, 1.098f, -0.035f, 1.581f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.305f, 11.0f)
                lineTo(0.779f, 11.0f)
                curveToRelative(0.188f, -0.718f, 0.404f, -1.429f, 0.659f, -2.131f)
                lineTo(3.582f, 2.975f)
                curveToRelative(0.429f, -1.181f, 1.562f, -1.975f, 2.818f, -1.975f)
                horizontalLineToRelative(11.199f)
                curveToRelative(1.257f, 0.0f, 2.39f, 0.793f, 2.818f, 1.975f)
                lineToRelative(2.144f, 5.895f)
                curveToRelative(0.176f, 0.484f, 0.328f, 0.973f, 0.47f, 1.465f)
                curveToRelative(-1.597f, -1.446f, -3.708f, -2.334f, -6.032f, -2.334f)
                curveToRelative(-2.662f, 0.0f, -5.047f, 1.163f, -6.695f, 3.0f)
                close()
                moveTo(8.0f, 17.0f)
                curveToRelative(0.0f, -1.439f, 0.346f, -2.794f, 0.947f, -4.0f)
                lineTo(0.346f, 13.0f)
                curveToRelative(-0.227f, 1.327f, -0.346f, 2.674f, -0.346f, 4.032f)
                verticalLineToRelative(1.968f)
                lineTo(8.231f, 19.0f)
                curveToRelative(-0.146f, -0.644f, -0.231f, -1.312f, -0.231f, -2.0f)
                close()
                moveTo(6.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _carCircleBolt!!
    }

private var _carCircleBolt: ImageVector? = null
