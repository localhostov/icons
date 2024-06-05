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

public val Icons.Outline.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                horizontalLineTo(22.738f)
                arcToRelative(8.406f, 8.406f, 0.0f, false, false, -1.82f, 0.2f)
                arcToRelative(10.826f, 10.826f, 0.0f, false, false, -7.1f, -5.03f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.7f, 0.011f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, -7.1f, 5.02f)
                arcTo(8.389f, 8.389f, 0.0f, false, false, 1.2f, 9.0f)
                horizontalLineTo(-0.062f)
                lineTo(2.99f, 22.0f)
                horizontalLineTo(1.969f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.949f)
                close()
                moveTo(11.969f, 6.0f)
                arcTo(8.489f, 8.489f, 0.0f, false, true, 19.0f, 9.923f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, false, -2.018f, 1.783f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.025f, 0.0f)
                arcTo(5.963f, 5.963f, 0.0f, false, false, 4.94f, 9.925f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 11.969f, 6.0f)
                close()
                moveTo(2.49f, 11.119f)
                arcTo(3.912f, 3.912f, 0.0f, false, true, 5.969f, 15.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.912f, 3.912f, 0.0f, false, true, 3.478f, -3.881f)
                lineTo(18.9f, 22.0f)
                horizontalLineTo(5.044f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
