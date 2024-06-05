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

public val Icons.Outline.ChessBoard: ImageVector
    get() {
        if (_chessBoard != null) {
            return _chessBoard!!
        }
        _chessBoard = Builder(name = "ChessBoard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(4.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(14.0f, 22.0f)
                lineTo(14.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                lineTo(6.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(10.0f, 14.0f)
                close()
            }
        }
        .build()
        return _chessBoard!!
    }

private var _chessBoard: ImageVector? = null
