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

public val Icons.Filled.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8f, 8.152f)
                arcTo(10.491f, 10.491f, 0.0f, false, true, 10.16f, 4.181f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.681f, 0.0f)
                arcTo(10.441f, 10.441f, 0.0f, false, true, 20.2f, 8.149f)
                arcToRelative(7.837f, 7.837f, 0.0f, false, false, -3.358f, 3.326f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, -9.69f, 0.0f)
                arcTo(7.836f, 7.836f, 0.0f, false, false, 3.8f, 8.152f)
                close()
                moveTo(21.449f, 20.0f)
                lineTo(24.017f, 9.062f)
                curveTo(20.427f, 9.447f, 18.0f, 11.777f, 18.0f, 15.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 11.777f, 3.573f, 9.447f, -0.016f, 9.062f)
                lineTo(2.551f, 20.0f)
                close()
                moveTo(2.0f, 24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
