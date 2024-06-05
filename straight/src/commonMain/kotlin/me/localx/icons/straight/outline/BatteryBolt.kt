package me.localx.icons.straight.outline

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
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.896f)
                lineToRelative(1.08f, -2.0f)
                horizontalLineToRelative(3.816f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(20.0f, 7.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.909f)
                lineToRelative(1.087f, -2.0f)
                horizontalLineToRelative(3.822f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 6.0f)
                lineTo(7.262f, 6.0f)
                lineToRelative(1.08f, -2.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 20.0f)
                lineTo(7.268f, 20.0f)
                lineToRelative(1.087f, -2.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(14.762f, 12.016f)
                curveToRelative(-0.336f, -0.627f, -0.976f, -1.016f, -1.668f, -1.016f)
                lineToRelative(-4.011f, 0.05f)
                lineToRelative(3.287f, -6.042f)
                lineToRelative(-1.757f, -0.956f)
                lineToRelative(-3.53f, 6.532f)
                curveToRelative(-0.174f, 0.574f, -0.073f, 1.174f, 0.277f, 1.646f)
                curveToRelative(0.357f, 0.481f, 0.942f, 0.769f, 1.563f, 0.769f)
                horizontalLineToRelative(4.041f)
                lineToRelative(-3.029f, 6.107f)
                lineToRelative(1.792f, 0.889f)
                lineToRelative(2.994f, -6.036f)
                curveToRelative(0.356f, -0.585f, 0.374f, -1.323f, 0.041f, -1.944f)
                close()
            }
        }
        .build()
        return _batteryBolt!!
    }

private var _batteryBolt: ImageVector? = null
