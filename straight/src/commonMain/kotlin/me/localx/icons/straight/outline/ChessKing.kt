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

public val Icons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.647f, 9.842f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, false, -1.769f, -1.453f)
                arcTo(38.51f, 38.51f, 0.0f, false, false, 13.0f, 7.023f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 7.023f)
                arcTo(38.51f, 38.51f, 0.0f, false, false, 2.122f, 8.389f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 0.134f, 12.14f)
                lineTo(3.168f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.0f)
                lineTo(20.832f, 22.0f)
                lineToRelative(3.035f, -9.86f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 23.647f, 9.842f)
                close()
                moveTo(21.955f, 11.552f)
                lineTo(18.74f, 22.0f)
                lineTo(5.26f, 22.0f)
                lineTo(2.045f, 11.552f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.073f, -0.77f)
                arcTo(0.978f, 0.978f, 0.0f, false, true, 2.7f, 10.3f)
                arcTo(36.7f, 36.7f, 0.0f, false, true, 12.0f, 9.0f)
                arcToRelative(36.7f, 36.7f, 0.0f, false, true, 9.3f, 1.3f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, 0.583f, 0.479f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.955f, 11.552f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
