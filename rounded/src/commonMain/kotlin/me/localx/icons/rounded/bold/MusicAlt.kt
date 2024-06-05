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

public val Icons.Bold.MusicAlt: ImageVector
    get() {
        if (_musicAlt != null) {
            return _musicAlt!!
        }
        _musicAlt = Builder(name = "MusicAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.374f, 1.038f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.7f, -0.96f)
                lineToRelative(-9.188f, 1.722f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.486f, 5.406f)
                verticalLineToRelative(8.935f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, false, -1.0f, -0.141f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.224f, -1.474f)
                lineToRelative(11.183f, -2.1f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, true, 0.412f, 0.106f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.181f, 0.388f)
                verticalLineToRelative(4.221f)
                arcToRelative(3.992f, 3.992f, 0.0f, true, false, 3.0f, 3.859f)
                verticalLineToRelative(-12.5f)
                arcToRelative(4.488f, 4.488f, 0.0f, false, false, -1.626f, -3.462f)
                close()
                moveTo(19.855f, 5.479f)
                lineTo(8.671f, 7.577f)
                arcToRelative(4.527f, 4.527f, 0.0f, false, false, -0.671f, 0.189f)
                verticalLineToRelative(-0.56f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.039f, -2.457f)
                lineToRelative(9.185f, -1.722f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.776f, 1.473f)
                verticalLineToRelative(0.976f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, false, -1.145f, 0.003f)
                close()
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
