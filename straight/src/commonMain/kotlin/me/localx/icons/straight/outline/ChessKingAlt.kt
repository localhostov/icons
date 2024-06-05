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

public val Icons.Outline.ChessKingAlt: ImageVector
    get() {
        if (_chessKingAlt != null) {
            return _chessKingAlt!!
        }
        _chessKingAlt = Builder(name = "ChessKingAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-0.394f)
                arcToRelative(25.37f, 25.37f, 0.0f, false, true, -2.526f, -8.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                lineTo(16.385f, 8.0f)
                lineToRelative(1.5f, -3.331f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.634f, 0.847f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, -0.22f, 1.9f)
                lineTo(7.614f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.92f, 10.0f)
                arcToRelative(25.37f, 25.37f, 0.0f, false, true, -2.526f, 8.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.029f)
                lineTo(14.192f, 8.0f)
                lineTo(9.808f, 8.0f)
                close()
                moveTo(9.929f, 10.0f)
                horizontalLineToRelative(4.142f)
                arcToRelative(25.784f, 25.784f, 0.0f, false, false, 2.312f, 8.0f)
                lineTo(7.617f, 18.0f)
                arcTo(25.784f, 25.784f, 0.0f, false, false, 9.929f, 10.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
