package me.localx.icons.straight.outline

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

public val Icons.Outline.MusicFile: ImageVector
    get() {
        if (_musicFile != null) {
            return _musicFile!!
        }
        _musicFile = Builder(name = "MusicFile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.414f, 0.0f)
                horizontalLineToRelative(-9.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-16.414f)
                close()
                moveTo(15.0f, 3.414f)
                lineTo(18.586f, 7.0f)
                horizontalLineToRelative(-3.586f)
                close()
                moveTo(4.0f, 22.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.5f, -2.5f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, true, 0.5f, 0.05f)
                verticalLineToRelative(-2.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _musicFile!!
    }

private var _musicFile: ImageVector? = null
