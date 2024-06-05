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

public val Icons.Outline.TruckBolt: ImageVector
    get() {
        if (_truckBolt != null) {
            return _truckBolt!!
        }
        _truckBolt = Builder(name = "TruckBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(4.0f, 1.0f)
                curveTo(1.794f, 1.0f, 0.0f, 2.794f, 0.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.881f, 1.309f, 3.452f, 3.061f, 3.877f)
                curveToRelative(-0.038f, 0.204f, -0.061f, 0.412f, -0.061f, 0.623f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.017f, -0.335f, -0.041f, -0.5f)
                horizontalLineToRelative(4.082f)
                curveToRelative(-0.024f, 0.165f, -0.041f, 0.331f, -0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.211f, -0.023f, -0.419f, -0.061f, -0.623f)
                curveToRelative(1.752f, -0.425f, 3.061f, -1.996f, 3.061f, -3.877f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 15.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 17.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(5.318f, 10.348f)
                curveToRelative(-0.303f, -0.408f, -0.396f, -0.943f, -0.249f, -1.43f)
                curveToRelative(0.028f, -0.095f, 2.599f, -3.973f, 2.599f, -3.973f)
                curveToRelative(0.308f, -0.46f, 0.928f, -0.584f, 1.387f, -0.277f)
                curveToRelative(0.46f, 0.307f, 0.584f, 0.928f, 0.277f, 1.387f)
                lineToRelative(-1.965f, 2.945f)
                horizontalLineToRelative(3.028f)
                curveToRelative(0.591f, 0.0f, 1.133f, 0.323f, 1.412f, 0.845f)
                curveToRelative(0.28f, 0.521f, 0.251f, 1.151f, -0.075f, 1.645f)
                lineToRelative(-2.403f, 3.569f)
                curveToRelative(-0.192f, 0.287f, -0.509f, 0.441f, -0.83f, 0.441f)
                curveToRelative(-0.192f, 0.0f, -0.386f, -0.055f, -0.558f, -0.171f)
                curveToRelative(-0.458f, -0.308f, -0.579f, -0.93f, -0.271f, -1.388f)
                lineToRelative(1.979f, -2.941f)
                horizontalLineToRelative(-3.035f)
                curveToRelative(-0.509f, 0.0f, -0.993f, -0.244f, -1.297f, -0.652f)
                close()
            }
        }
        .build()
        return _truckBolt!!
    }

private var _truckBolt: ImageVector? = null
