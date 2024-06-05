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

public val Icons.Filled.GameBoardAlt: ImageVector
    get() {
        if (_gameBoardAlt != null) {
            return _gameBoardAlt!!
        }
        _gameBoardAlt = Builder(name = "GameBoardAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(-0.959f)
                lineTo(0.0f, 10.041f)
                lineTo(0.0f, 11.0f)
                lineTo(3.172f, 11.0f)
                lineTo(11.0f, 3.172f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(18.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(24.0f, 13.0f)
                lineTo(20.828f, 13.0f)
                lineTo(13.0f, 20.828f)
                lineTo(13.0f, 24.0f)
                horizontalLineToRelative(0.959f)
                lineTo(24.0f, 13.959f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(16.787f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 16.787f)
                close()
                moveTo(7.213f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 7.213f)
                close()
            }
        }
        .build()
        return _gameBoardAlt!!
    }

private var _gameBoardAlt: ImageVector? = null
