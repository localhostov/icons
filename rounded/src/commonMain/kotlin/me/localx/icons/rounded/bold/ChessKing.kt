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

public val Icons.Bold.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.286f, 10.349f)
                arcToRelative(5.352f, 5.352f, 0.0f, false, false, -3.478f, -2.541f)
                arcTo(38.735f, 38.735f, 0.0f, false, false, 13.5f, 7.032f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.5f, 7.032f)
                arcToRelative(38.764f, 38.764f, 0.0f, false, false, -6.309f, 0.776f)
                arcToRelative(5.32f, 5.32f, 0.0f, false, false, -3.92f, 6.865f)
                lineTo(2.6f, 21.0f)
                lineTo(2.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(2.348f, -6.394f)
                arcTo(5.323f, 5.323f, 0.0f, false, false, 23.286f, 10.349f)
                close()
                moveTo(20.913f, 13.638f)
                lineTo(18.208f, 21.0f)
                lineTo(5.792f, 21.0f)
                lineTo(3.109f, 13.7f)
                arcToRelative(2.286f, 2.286f, 0.0f, false, true, 0.2f, -1.854f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, true, 1.523f, -1.113f)
                arcTo(36.505f, 36.505f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(36.485f, 36.485f, 0.0f, false, true, 7.164f, 0.737f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, true, 1.524f, 1.113f)
                arcTo(2.256f, 2.256f, 0.0f, false, true, 20.913f, 13.638f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
