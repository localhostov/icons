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

public val Icons.Filled.TemperatureFrigid: ImageVector
    get() {
        if (_temperatureFrigid != null) {
            return _temperatureFrigid!!
        }
        _temperatureFrigid = Builder(name = "TemperatureFrigid", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-6.078f, 0.117f, -9.334f, -7.638f, -5.0f, -11.889f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                arcTo(7.007f, 7.007f, 0.0f, false, true, 24.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                lineTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(6.184f)
                arcTo(2.995f, 2.995f, 0.0f, true, false, 20.0f, 17.0f)
                close()
                moveTo(8.0f, 8.946f)
                lineToRelative(2.0f, 1.147f)
                verticalLineToRelative(-2.3f)
                lineTo(9.01f, 7.22f)
                lineTo(10.0f, 6.653f)
                verticalLineToRelative(-2.3f)
                lineTo(8.0f, 5.494f)
                lineTo(8.0f, 3.132f)
                lineTo(9.732f, 1.4f)
                lineTo(8.318f, -0.015f)
                lineTo(7.0f, 1.3f)
                lineTo(5.682f, -0.015f)
                lineTo(4.268f, 1.4f)
                lineTo(6.0f, 3.132f)
                lineTo(6.0f, 5.494f)
                lineTo(3.95f, 4.319f)
                lineTo(3.309f, 1.955f)
                lineToRelative(-1.93f, 0.523f)
                lineToRelative(0.488f, 1.8f)
                lineToRelative(-1.8f, 0.488f)
                lineTo(0.592f, 6.7f)
                lineToRelative(2.363f, -0.641f)
                lineTo(4.99f, 7.22f)
                lineTo(2.956f, 8.386f)
                lineTo(0.592f, 7.745f)
                lineTo(0.068f, 9.675f)
                lineToRelative(1.8f, 0.488f)
                lineToRelative(-0.488f, 1.8f)
                lineToRelative(1.93f, 0.523f)
                lineToRelative(0.641f, -2.363f)
                lineTo(6.0f, 8.946f)
                verticalLineToRelative(2.363f)
                lineTo(4.268f, 13.041f)
                lineToRelative(1.414f, 1.414f)
                lineTo(7.0f, 13.137f)
                lineToRelative(1.318f, 1.318f)
                lineToRelative(1.414f, -1.414f)
                lineTo(8.0f, 11.309f)
                close()
            }
        }
        .build()
        return _temperatureFrigid!!
    }

private var _temperatureFrigid: ImageVector? = null
