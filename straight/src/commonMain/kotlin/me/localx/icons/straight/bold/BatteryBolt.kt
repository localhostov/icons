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

public val Icons.Bold.BatteryBolt: ImageVector
    get() {
        if (_batteryBolt != null) {
            return _batteryBolt!!
        }
        _batteryBolt = Builder(name = "BatteryBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.653f, 14.21f)
                lineToRelative(-2.971f, 5.818f)
                lineToRelative(-2.672f, -1.364f)
                lineToRelative(2.638f, -5.164f)
                horizontalLineToRelative(-2.216f)
                curveToRelative(-0.779f, 0.0f, -1.513f, -0.363f, -1.964f, -0.972f)
                curveToRelative(-0.446f, -0.601f, -0.575f, -1.362f, -0.354f, -2.089f)
                lineToRelative(3.875f, -6.45f)
                lineToRelative(2.562f, 1.561f)
                lineToRelative(-3.016f, 4.951f)
                horizontalLineToRelative(2.059f)
                curveToRelative(0.877f, 0.0f, 1.685f, 0.49f, 2.109f, 1.28f)
                curveToRelative(0.415f, 0.774f, 0.395f, 1.695f, -0.049f, 2.43f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(3.766f)
                lineToRelative(1.762f, -3.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 20.0f)
                lineTo(6.046f, 20.0f)
                lineToRelative(1.546f, -3.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(24.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.929f)
                lineToRelative(-1.714f, 3.0f)
                horizontalLineToRelative(3.643f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.033f)
                lineToRelative(-1.545f, 3.0f)
                horizontalLineToRelative(4.578f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                close()
            }
        }
        .build()
        return _batteryBolt!!
    }

private var _batteryBolt: ImageVector? = null
