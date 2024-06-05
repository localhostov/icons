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
                moveToRelative(22.734f, 0.807f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -2.879f, -0.746f)
                lineToRelative(-12.0f, 2.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.855f, 3.44f)
                verticalLineToRelative(10.39f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, false, -1.0f, -0.141f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-9.2f)
                lineToRelative(13.0f, -2.435f)
                verticalLineToRelative(4.776f)
                arcToRelative(3.992f, 3.992f, 0.0f, true, false, 3.0f, 3.859f)
                verticalLineToRelative(-13.5f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, false, -1.266f, -2.693f)
                close()
                moveTo(8.0f, 7.75f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.408f, -0.491f)
                lineToRelative(12.0f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.592f, 0.491f)
                verticalLineToRelative(1.812f)
                close()
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
