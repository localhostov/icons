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
                moveTo(22.0f, 21.086f)
                lineTo(22.0f, 10.018f)
                curveToRelative(0.037f, -3.145f, -1.909f, -9.282f, -9.541f, -10.0f)
                arcToRelative(3.268f, 3.268f, 0.0f, false, false, -3.307f, 2.06f)
                arcTo(7.65f, 7.65f, 0.0f, false, true, 4.388f, 6.509f)
                arcTo(3.634f, 3.634f, 0.0f, false, false, 2.0f, 9.931f)
                arcTo(3.073f, 3.073f, 0.0f, false, false, 5.069f, 13.0f)
                horizontalLineToRelative(4.6f)
                arcToRelative(14.16f, 14.16f, 0.0f, false, true, -6.63f, 8.0f)
                lineTo(2.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.5f, -2.914f)
                close()
                moveTo(12.988f, 11.686f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 10.0f)
                lineTo(5.0f, 10.0f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, true, 0.4f, -0.667f)
                arcToRelative(10.68f, 10.68f, 0.0f, false, false, 6.536f, -6.141f)
                arcTo(0.305f, 0.305f, 0.0f, false, true, 12.176f, 3.0f)
                curveTo(18.819f, 3.629f, 19.0f, 9.341f, 19.0f, 10.0f)
                lineTo(19.0f, 21.0f)
                lineTo(8.088f, 21.0f)
                arcTo(15.279f, 15.279f, 0.0f, false, false, 12.988f, 11.686f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
