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

public val Icons.Bold.ChessRookAlt: ImageVector
    get() {
        if (_chessRookAlt != null) {
            return _chessRookAlt!!
        }
        _chessRookAlt = Builder(name = "ChessRookAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.662f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 6.5f)
                verticalLineToRelative(-3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, -2.0f, 0.629f)
                arcTo(3.475f, 3.475f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, -2.0f, 0.629f)
                arcTo(3.475f, 3.475f, 0.0f, false, false, 7.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.5f)
                verticalLineToRelative(3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 9.662f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(6.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 6.5f)
                verticalLineToRelative(-3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 8.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 7.0f)
                close()
                moveTo(10.0f, 13.0f)
                verticalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chessRookAlt!!
    }

private var _chessRookAlt: ImageVector? = null
