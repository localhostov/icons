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

public val Icons.Outline.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                lineTo(24.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(20.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(18.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                lineTo(15.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(11.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(0.0f, 8.0f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, false, 3.0f, 3.873f)
                lineTo(3.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(22.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 11.873f)
                arcTo(4.005f, 4.005f, 0.0f, false, false, 24.0f, 8.0f)
                close()
                moveTo(5.0f, 22.0f)
                lineTo(5.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 8.0f)
                lineTo(2.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(19.0f, 22.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(15.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
