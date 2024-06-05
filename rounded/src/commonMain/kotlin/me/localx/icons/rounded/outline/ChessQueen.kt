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

public val Icons.Outline.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.449f, 9.627f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -1.87f, -0.587f)
                curveToRelative(-0.214f, 0.043f, -0.423f, 0.1f, -0.629f, 0.156f)
                arcToRelative(10.829f, 10.829f, 0.0f, false, false, -7.1f, -5.032f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.7f, 0.0f)
                arcTo(10.829f, 10.829f, 0.0f, false, false, 3.051f, 9.2f)
                curveToRelative(-0.206f, -0.059f, -0.415f, -0.113f, -0.629f, -0.156f)
                arcToRelative(2.012f, 2.012f, 0.0f, false, false, -1.87f, 0.587f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, -0.484f, 1.886f)
                lineToRelative(2.9f, 10.493f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.03f, -1.994f)
                lineToRelative(2.907f, -10.515f)
                arcTo(1.984f, 1.984f, 0.0f, false, false, 23.449f, 9.627f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(8.516f, 8.516f, 0.0f, false, true, 7.087f, 4.005f)
                arcToRelative(6.854f, 6.854f, 0.0f, false, false, -2.0f, 1.807f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.163f, 0.0f)
                arcToRelative(6.841f, 6.841f, 0.0f, false, false, -2.0f, -1.807f)
                arcTo(8.516f, 8.516f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(18.958f, 22.0f)
                lineTo(5.045f, 22.0f)
                lineTo(2.026f, 11.0f)
                curveTo(4.0f, 11.4f, 6.0f, 12.9f, 6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -2.1f, 2.0f, -3.6f, 4.0f, -4.021f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
