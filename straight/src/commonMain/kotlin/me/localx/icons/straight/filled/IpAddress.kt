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

public val Icons.Filled.IpAddress: ImageVector
    get() {
        if (_ipAddress != null) {
            return _ipAddress!!
        }
        _ipAddress = Builder(name = "IpAddress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.4f, 8.5f)
                curveToRelative(0.0f, 0.497f, -0.403f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.497f, 0.0f, 0.9f, 0.403f, 0.9f, 0.9f)
                close()
                moveTo(22.0f, 10.0f)
                curveToRelative(0.0f, 2.671f, -1.04f, 5.182f, -2.93f, 7.071f)
                lineToRelative(-7.07f, 6.917f)
                lineToRelative(-7.063f, -6.909f)
                curveToRelative(-3.907f, -3.907f, -3.907f, -10.25f, -0.008f, -14.149f)
                curveToRelative(1.889f, -1.889f, 4.4f, -2.929f, 7.071f, -2.929f)
                reflectiveCurveToRelative(5.182f, 1.041f, 7.07f, 2.929f)
                curveToRelative(1.89f, 1.889f, 2.93f, 4.4f, 2.93f, 7.071f)
                close()
                moveTo(10.5f, 6.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                lineTo(10.5f, 6.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _ipAddress!!
    }

private var _ipAddress: ImageVector? = null
