package me.localx.icons.rounded.filled

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

public val Icons.Filled.ChessKingAlt: ImageVector
    get() {
        if (_chessKingAlt != null) {
            return _chessKingAlt!!
        }
        _chessKingAlt = Builder(name = "ChessKingAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                lineTo(7.4f, 8.0f)
                reflectiveCurveTo(6.307f, 6.318f, 6.288f, 6.277f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.715f, 4.277f)
                curveTo(17.7f, 6.318f, 16.608f, 8.0f, 16.608f, 8.0f)
                lineTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(16.411f, 12.0f)
                lineTo(7.589f, 12.0f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, true, -2.2f, 6.0f)
                lineTo(18.606f, 18.0f)
                arcTo(27.754f, 27.754f, 0.0f, false, true, 16.411f, 12.0f)
                close()
            }
        }
        .build()
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
