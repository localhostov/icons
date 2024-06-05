package me.localx.icons.rounded.outline

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
                moveToRelative(15.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.5f, -2.5f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, true, 0.5f, 0.05f)
                verticalLineToRelative(-2.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(4.515f)
                arcToRelative(6.955f, 6.955f, 0.0f, false, true, 4.95f, 2.051f)
                lineToRelative(3.484f, 3.484f)
                arcToRelative(6.955f, 6.955f, 0.0f, false, true, 2.051f, 4.95f)
                close()
                moveTo(15.051f, 3.465f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, -1.051f, -0.781f)
                verticalLineToRelative(4.316f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.316f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, -0.781f, -1.051f)
                close()
                moveTo(20.0f, 10.485f)
                curveToRelative(0.0f, -0.165f, -0.032f, -0.323f, -0.047f, -0.485f)
                horizontalLineToRelative(-4.953f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-4.953f)
                curveToRelative(-0.162f, -0.015f, -0.32f, -0.047f, -0.485f, -0.047f)
                horizontalLineToRelative(-4.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _musicFile!!
    }

private var _musicFile: ImageVector? = null
