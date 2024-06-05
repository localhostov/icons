package me.localx.icons.straight.bold

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

public val Icons.Bold.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                lineToRelative(0.0f, -10.791f)
                arcToRelative(10.456f, 10.456f, 0.0f, false, false, -2.552f, -7.231f)
                curveTo(17.6f, 1.0f, 14.922f, 0.0f, 11.5f, 0.0f)
                horizontalLineTo(10.329f)
                lineToRelative(-0.284f, 1.136f)
                curveTo(9.379f, 3.8f, 7.31f, 5.043f, 4.408f, 6.09f)
                arcTo(3.644f, 3.644f, 0.0f, false, false, 2.0f, 9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.694f)
                arcTo(13.575f, 13.575f, 0.0f, false, true, 2.9f, 21.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(11.988f, 11.686f)
                lineTo(12.2f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.5f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, 0.428f, -0.591f)
                curveTo(8.25f, 7.893f, 11.243f, 6.4f, 12.577f, 3.043f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 17.238f, 5.01f)
                arcTo(7.522f, 7.522f, 0.0f, false, true, 19.0f, 10.111f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.564f)
                arcTo(16.327f, 16.327f, 0.0f, false, false, 11.988f, 11.686f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
