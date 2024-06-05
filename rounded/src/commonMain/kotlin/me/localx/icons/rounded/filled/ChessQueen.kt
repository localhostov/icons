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

public val Icons.Filled.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.009f, 7.881f)
                arcToRelative(10.363f, 10.363f, 0.0f, false, true, 6.15f, -3.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.682f, 0.0f)
                arcToRelative(10.363f, 10.363f, 0.0f, false, true, 6.15f, 3.7f)
                arcTo(10.048f, 10.048f, 0.0f, false, false, 16.937f, 11.6f)
                arcToRelative(5.995f, 5.995f, 0.0f, false, false, -9.875f, 0.0f)
                arcTo(10.036f, 10.036f, 0.0f, false, false, 4.009f, 7.881f)
                close()
                moveTo(21.032f, 22.0f)
                lineTo(2.968f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.032f, -2.0f)
                close()
                moveTo(21.585f, 20.0f)
                reflectiveCurveTo(24.0f, 11.252f, 24.0f, 10.5f)
                arcTo(1.449f, 1.449f, 0.0f, false, false, 22.5f, 9.0f)
                curveToRelative(-2.0f, 0.0f, -4.5f, 3.855f, -4.5f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -2.145f, -2.5f, -6.0f, -4.5f, -6.0f)
                arcTo(1.449f, 1.449f, 0.0f, false, false, 0.0f, 10.5f)
                curveTo(0.0f, 11.252f, 2.415f, 20.0f, 2.415f, 20.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
