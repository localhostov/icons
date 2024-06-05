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

public val Icons.Outline.BatteryBolt: ImageVector
    get() {
        if (_batteryBolt != null) {
            return _batteryBolt!!
        }
        _batteryBolt = Builder(name = "BatteryBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(14.762f, 12.016f)
                curveToRelative(-0.336f, -0.627f, -0.976f, -1.016f, -1.668f, -1.016f)
                lineToRelative(-4.011f, 0.05f)
                lineToRelative(3.031f, -5.572f)
                curveToRelative(0.264f, -0.485f, 0.084f, -1.093f, -0.4f, -1.356f)
                curveToRelative(-0.486f, -0.264f, -1.093f, -0.084f, -1.356f, 0.4f)
                curveToRelative(0.0f, 0.0f, -3.255f, 5.998f, -3.274f, 6.063f)
                curveToRelative(-0.174f, 0.574f, -0.073f, 1.174f, 0.277f, 1.646f)
                curveToRelative(0.357f, 0.481f, 0.942f, 0.769f, 1.563f, 0.769f)
                horizontalLineToRelative(4.042f)
                lineToRelative(-0.013f, 0.025f)
                lineToRelative(-2.743f, 5.53f)
                curveToRelative(-0.245f, 0.495f, -0.043f, 1.095f, 0.452f, 1.34f)
                curveToRelative(0.143f, 0.071f, 0.294f, 0.104f, 0.443f, 0.104f)
                curveToRelative(0.368f, 0.0f, 0.722f, -0.204f, 0.897f, -0.556f)
                lineToRelative(2.72f, -5.484f)
                curveToRelative(0.356f, -0.585f, 0.374f, -1.323f, 0.041f, -1.944f)
                close()
                moveTo(23.0f, 8.0f)
                horizontalLineToRelative(-1.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(1.101f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _batteryBolt!!
    }

private var _batteryBolt: ImageVector? = null
