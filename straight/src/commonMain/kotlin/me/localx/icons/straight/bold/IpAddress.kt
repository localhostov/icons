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

public val Icons.Bold.IpAddress: ImageVector
    get() {
        if (_ipAddress != null) {
            return _ipAddress!!
        }
        _ipAddress = Builder(name = "IpAddress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.071f, 2.936f)
                horizontalLineToRelative(0.0f)
                curveTo(17.182f, 1.046f, 14.671f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveToRelative(-5.182f, 1.04f, -7.071f, 2.929f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.012f, 14.153f)
                lineToRelative(7.06f, 6.905f)
                lineToRelative(7.071f, -6.917f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.142f)
                close()
                moveTo(16.962f, 14.945f)
                lineToRelative(-4.962f, 4.853f)
                lineToRelative(-4.95f, -4.841f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                curveToRelative(1.322f, -1.323f, 3.081f, -2.051f, 4.95f, -2.051f)
                reflectiveCurveToRelative(3.628f, 0.728f, 4.95f, 2.05f)
                curveToRelative(2.729f, 2.729f, 2.729f, 7.17f, 0.012f, 9.888f)
                close()
                moveTo(8.9f, 6.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(8.9f, 6.0f)
                close()
                moveTo(14.5f, 6.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(14.5f, 9.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.497f, 0.0f, 0.9f, 0.403f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.403f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }
        .build()
        return _ipAddress!!
    }

private var _ipAddress: ImageVector? = null
