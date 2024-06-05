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

public val Icons.Bold.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(-4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, -2.0f, 0.629f)
                arcTo(3.475f, 3.475f, 0.0f, false, false, 13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, -2.0f, 0.629f)
                arcTo(3.475f, 3.475f, 0.0f, false, false, 6.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, false, 3.0f, 4.243f)
                lineTo(3.0f, 21.0f)
                lineTo(2.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 11.743f)
                arcTo(4.508f, 4.508f, 0.0f, false, false, 24.0f, 7.5f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(6.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 7.5f)
                verticalLineToRelative(-4.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 10.5f)
                lineTo(18.0f, 21.0f)
                close()
                moveTo(15.0f, 13.0f)
                verticalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 17.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 15.5f)
                lineTo(9.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
