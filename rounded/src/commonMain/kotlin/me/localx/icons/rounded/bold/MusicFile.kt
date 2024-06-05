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

public val Icons.Bold.MusicFile: ImageVector
    get() {
        if (_musicFile != null) {
            return _musicFile!!
        }
        _musicFile = Builder(name = "MusicFile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -0.03f, 0.3f)
                arcToRelative(2.993f, 2.993f, 0.0f, true, true, -2.97f, -3.3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -5.5f, 5.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, 5.5f, -5.5f)
                horizontalLineToRelative(6.343f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 3.889f, 1.611f)
                lineToRelative(2.657f, 2.657f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 1.611f, 3.889f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _musicFile!!
    }

private var _musicFile: ImageVector? = null
