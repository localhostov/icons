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

public val Icons.Bold.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.227f)
                curveToRelative(0.0f, -4.465f, -2.828f, -8.435f, -7.0f, -10.031f)
                verticalLineToRelative(-1.742f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.742f)
                curveTo(3.828f, 4.338f, 1.0f, 8.308f, 1.0f, 12.773f)
                verticalLineToRelative(2.227f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.77f)
                lineToRelative(0.392f, 0.5f)
                curveToRelative(2.225f, 2.859f, 5.578f, 4.5f, 9.201f, 4.5f)
                horizontalLineToRelative(1.273f)
                curveToRelative(3.623f, 0.0f, 6.977f, -1.641f, 9.197f, -4.495f)
                lineToRelative(0.396f, -0.505f)
                horizontalLineToRelative(1.771f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.0f, 12.773f)
                verticalLineToRelative(2.227f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 6.069f)
                curveToRelative(2.418f, 1.367f, 4.0f, 3.892f, 4.0f, 6.705f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 12.773f)
                curveToRelative(0.0f, -2.813f, 1.582f, -5.338f, 4.0f, -6.704f)
                verticalLineToRelative(8.931f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.227f)
                close()
                moveTo(12.636f, 20.0f)
                horizontalLineToRelative(-1.273f)
                curveToRelative(-2.055f, 0.0f, -3.991f, -0.715f, -5.529f, -2.0f)
                horizontalLineToRelative(12.333f)
                curveToRelative(-1.538f, 1.284f, -3.474f, 2.0f, -5.531f, 2.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
