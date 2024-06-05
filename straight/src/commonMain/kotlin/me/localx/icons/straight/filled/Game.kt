package me.localx.icons.straight.filled

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

public val Icons.Filled.Game: ImageVector
    get() {
        if (_game != null) {
            return _game!!
        }
        _game = Builder(name = "Game", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 18.0f)
                reflectiveCurveToRelative(-4.0f, -2.667f, -4.0f, -5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 2.333f, -4.0f, 5.0f, -4.0f, 5.0f)
                close()
                moveTo(23.88f, 6.693f)
                lineTo(19.1f, 23.107f)
                lineTo(18.0f, 22.7f)
                verticalLineToRelative(-15.7f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-4.243f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, 3.657f, -1.879f)
                lineToRelative(9.436f, 2.856f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.03f, 3.716f)
                close()
            }
        }
        .build()
        return _game!!
    }

private var _game: ImageVector? = null
