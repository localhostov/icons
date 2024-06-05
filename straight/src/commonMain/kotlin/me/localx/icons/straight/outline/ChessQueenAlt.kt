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

public val Icons.Outline.ChessQueenAlt: ImageVector
    get() {
        if (_chessQueenAlt != null) {
            return _chessQueenAlt!!
        }
        _chessQueenAlt = Builder(name = "ChessQueenAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-0.316f)
                arcTo(43.959f, 43.959f, 0.0f, false, true, 16.075f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.225f)
                lineToRelative(1.7f, -5.89f)
                lineTo(14.157f, 1.829f)
                lineTo(12.0f, 0.031f)
                lineToRelative(-2.157f, 1.8f)
                lineTo(6.077f, 0.11f)
                lineTo(7.775f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.925f)
                arcTo(44.018f, 44.018f, 0.0f, false, true, 5.316f, 18.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(9.2f, 3.735f)
                lineToRelative(0.953f, 0.436f)
                lineTo(12.0f, 2.635f)
                lineToRelative(1.843f, 1.536f)
                lineToRelative(0.953f, -0.436f)
                lineTo(14.144f, 6.0f)
                horizontalLineTo(9.856f)
                close()
                moveTo(9.933f, 8.0f)
                horizontalLineToRelative(4.134f)
                arcToRelative(43.091f, 43.091f, 0.0f, false, false, 2.481f, 10.0f)
                horizontalLineToRelative(-9.1f)
                arcTo(43.091f, 43.091f, 0.0f, false, false, 9.933f, 8.0f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
