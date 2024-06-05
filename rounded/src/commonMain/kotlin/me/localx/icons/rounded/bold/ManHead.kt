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

public val Icons.Bold.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 13.0f)
                close()
                moveTo(21.887f, 8.067f)
                arcTo(10.064f, 10.064f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.053f, 0.0f, 3.0f, 4.582f, 1.781f, 7.319f)
                arcTo(6.978f, 6.978f, 0.0f, false, true, 0.745f, 9.2f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.385f, 12.0f)
                arcTo(17.691f, 17.691f, 0.0f, false, false, 8.1f, 10.963f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.95f, -0.855f)
                arcToRelative(14.163f, 14.163f, 0.0f, false, false, 3.508f, -2.547f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                arcTo(12.727f, 12.727f, 0.0f, false, true, 4.395f, 8.822f)
                lineToRelative(0.125f, -0.278f)
                curveTo(5.681f, 5.945f, 7.0f, 3.0f, 12.0f, 3.0f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, true, 7.049f, 6.337f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.224f, 1.318f)
                arcToRelative(0.884f, 0.884f, 0.0f, false, true, 0.727f, 0.867f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, -0.292f, 0.7f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, -0.7f, 0.287f)
                horizontalLineToRelative(-0.011f)
                lineToRelative(-0.162f, 0.0f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, false, -1.538f, 1.0f)
                arcTo(7.178f, 7.178f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(7.629f, 7.629f, 0.0f, false, true, -6.107f, -4.057f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.786f, 1.114f)
                arcTo(9.708f, 9.708f, 0.0f, false, false, 7.0f, 19.416f)
                lineTo(7.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(10.0f, 20.732f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(8.413f, 8.413f, 0.0f, false, false, 2.0f, -0.274f)
                lineTo(14.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(17.0f, 19.455f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.719f, -4.01f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 24.0f, 11.522f)
                arcTo(3.882f, 3.882f, 0.0f, false, false, 21.887f, 8.067f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
