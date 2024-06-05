package me.localx.icons.rounded.bold

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

public val Icons.Bold.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.223f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-0.223f)
                arcToRelative(2.611f, 2.611f, 0.0f, false, true, 1.785f, -2.543f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.677f, -1.25f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, false, -0.67f, -0.671f)
                arcToRelative(1.031f, 1.031f, 0.0f, false, false, -0.82f, 0.112f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.452f, 0.649f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.94f, -0.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.961f, -3.067f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.459f, 7.575f)
                verticalLineToRelative(0.016f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.502f)
                close()
                moveTo(12.563f, 23.891f)
                lineTo(12.957f, 23.732f)
                curveToRelative(2.121f, -0.853f, 9.043f, -4.211f, 9.043f, -11.581f)
                verticalLineToRelative(-5.1f)
                arcToRelative(5.273f, 5.273f, 0.0f, false, false, -3.617f, -5.01f)
                lineToRelative(-5.911f, -1.965f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, -0.944f, 0.0f)
                lineToRelative(-5.911f, 1.96f)
                arcToRelative(5.273f, 5.273f, 0.0f, false, false, -3.617f, 5.01f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.0f, 6.52f, 6.852f, 10.451f, 8.951f, 11.5f)
                lineToRelative(0.38f, 0.191f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.232f, 0.05f)
                close()
                moveTo(17.439f, 4.884f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, 1.561f, 2.162f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.0f, 5.259f, -5.03f, 7.9f, -6.932f, 8.7f)
                curveToRelative(-1.925f, -1.0f, -7.068f, -4.1f, -7.068f, -8.7f)
                verticalLineToRelative(-5.1f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, 1.561f, -2.162f)
                lineToRelative(5.439f, -1.804f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
