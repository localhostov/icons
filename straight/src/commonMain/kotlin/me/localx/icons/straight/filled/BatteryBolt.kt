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

public val Icons.Filled.BatteryBolt: ImageVector
    get() {
        if (_batteryBolt != null) {
            return _batteryBolt!!
        }
        _batteryBolt = Builder(name = "BatteryBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.103f, 13.969f)
                lineToRelative(-2.327f, 4.491f)
                lineToRelative(-1.775f, -0.92f)
                lineToRelative(2.353f, -4.54f)
                horizontalLineToRelative(-3.429f)
                curveToRelative(-0.621f, 0.0f, -1.206f, -0.288f, -1.563f, -0.769f)
                curveToRelative(-0.35f, -0.472f, -0.451f, -1.072f, -0.277f, -1.646f)
                lineToRelative(2.524f, -5.036f)
                lineToRelative(1.785f, 0.901f)
                lineToRelative(-2.321f, 4.549f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.692f, 0.0f, 1.332f, 0.389f, 1.668f, 1.016f)
                curveToRelative(0.335f, 0.624f, 0.315f, 1.366f, -0.047f, 1.953f)
                close()
            }
        }
        .build()
        return _batteryBolt!!
    }

private var _batteryBolt: ImageVector? = null
