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

public val Icons.Bold.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.561f, 7.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, -2.122f)
                lineToRelative(0.44f, -0.439f)
                lineToRelative(-0.879f, -0.879f)
                lineToRelative(-0.439f, 0.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, -2.122f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                lineToRelative(-0.44f, 0.439f)
                lineToRelative(0.879f, 0.879f)
                lineToRelative(0.439f, -0.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 0.0f)
                close()
                moveTo(10.439f, 14.439f)
                lineTo(10.0f, 14.879f)
                lineTo(9.121f, 14.0f)
                lineTo(9.561f, 13.561f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(0.439f, -0.44f)
                lineToRelative(0.879f, 0.879f)
                lineToRelative(-0.44f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                close()
                moveTo(24.0f, 7.891f)
                arcToRelative(7.838f, 7.838f, 0.0f, false, true, -2.312f, 5.579f)
                lineToRelative(-8.218f, 8.218f)
                arcToRelative(7.89f, 7.89f, 0.0f, true, true, -11.158f, -11.158f)
                lineToRelative(8.218f, -8.218f)
                arcToRelative(7.891f, 7.891f, 0.0f, false, true, 13.47f, 5.579f)
                close()
                moveTo(21.0f, 7.891f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, -8.349f, -3.458f)
                lineToRelative(-8.218f, 8.218f)
                arcToRelative(4.89f, 4.89f, 0.0f, true, false, 6.916f, 6.916f)
                lineToRelative(8.218f, -8.218f)
                arcToRelative(4.86f, 4.86f, 0.0f, false, false, 1.433f, -3.458f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
