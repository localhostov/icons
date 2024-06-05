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

public val Icons.Outline.GameBoardAlt: ImageVector
    get() {
        if (_gameBoardAlt != null) {
            return _gameBoardAlt!!
        }
        _gameBoardAlt = Builder(name = "GameBoardAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 0.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(13.0f, 20.414f)
                lineTo(20.414f, 13.0f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(1.586f)
                lineTo(14.586f, 22.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.586f)
                lineTo(13.0f, 17.586f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(6.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 5.0f)
                close()
                moveTo(2.0f, 11.0f)
                lineTo(2.0f, 9.414f)
                lineTo(9.414f, 2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(11.0f, 3.586f)
                lineTo(3.586f, 11.0f)
                close()
                moveTo(11.0f, 6.414f)
                lineTo(11.0f, 11.0f)
                lineTo(6.414f, 11.0f)
                close()
                moveTo(5.0f, 2.0f)
                lineTo(6.586f, 2.0f)
                lineTo(2.0f, 6.586f)
                lineTo(2.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                lineTo(5.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 19.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(17.414f, 22.0f)
                lineTo(22.0f, 17.414f)
                lineTo(22.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _gameBoardAlt!!
    }

private var _gameBoardAlt: ImageVector? = null
