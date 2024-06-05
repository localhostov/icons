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

public val Icons.Bold.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 10.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 13.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 5.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.949f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, 2.449f)
                close()
                moveTo(5.0f, 3.051f)
                verticalLineToRelative(3.949f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.449f)
                close()
                moveTo(3.0f, 18.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.949f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, -2.449f)
                close()
                moveTo(19.0f, 20.949f)
                verticalLineToRelative(-3.949f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.449f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
