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

public val Icons.Bold.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.957f, 11.339f)
                arcTo(4.107f, 4.107f, 0.0f, false, false, 19.877f, 8.0f)
                lineTo(17.882f, 8.0f)
                lineTo(14.416f, 1.778f)
                arcTo(3.406f, 3.406f, 0.0f, false, false, 11.423f, 0.0f)
                lineTo(6.41f, 0.0f)
                lineToRelative(2.7f, 8.0f)
                lineTo(4.93f, 8.0f)
                lineToRelative(-0.618f, -0.925f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 2.311f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineToRelative(2.213f, 6.0f)
                lineToRelative(-2.2f, 6.0f)
                horizontalLineToRelative(2.31f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.075f)
                lineTo(4.94f, 16.0f)
                lineTo(9.111f, 16.0f)
                lineToRelative(-2.7f, 8.0f)
                horizontalLineToRelative(5.013f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 2.986f, -1.765f)
                lineTo(17.882f, 16.0f)
                horizontalLineToRelative(2.129f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.946f, -4.661f)
                close()
                moveTo(20.773f, 12.647f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.762f, 0.353f)
                lineTo(16.118f, 13.0f)
                lineToRelative(-4.337f, 7.788f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, -0.358f, 0.212f)
                lineTo(10.59f, 21.0f)
                lineToRelative(2.7f, -8.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(7.291f)
                lineToRelative(-2.7f, -8.0f)
                horizontalLineToRelative(0.833f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.365f, 0.225f)
                lineTo(16.118f, 11.0f)
                horizontalLineToRelative(3.759f)
                arcTo(1.1f, 1.1f, 0.0f, false, true, 21.0f, 11.821f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.773f, 12.647f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
