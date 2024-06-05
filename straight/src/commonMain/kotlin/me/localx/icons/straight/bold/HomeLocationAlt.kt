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

public val Icons.Bold.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 9.757f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.486f, 8.486f)
                lineTo(12.0f, 22.392f)
                lineToRelative(4.243f, -4.149f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.243f, 9.757f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(24.0f, 10.132f)
                lineTo(24.0f, 24.0f)
                lineTo(14.647f, 24.0f)
                lineToRelative(3.067f, -3.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 10.132f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.158f, -0.323f)
                lineToRelative(-8.59f, -6.722f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.505f, 0.0f)
                lineTo(3.157f, 9.81f)
                arcTo(0.407f, 0.407f, 0.0f, false, false, 3.0f, 10.132f)
                lineTo(3.0f, 21.0f)
                lineTo(6.286f, 21.0f)
                lineToRelative(3.067f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.132f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 1.307f, 7.447f)
                lineTo(9.9f, 0.724f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, true, 4.2f, 0.0f)
                lineToRelative(8.592f, 6.723f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 24.0f, 10.132f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
