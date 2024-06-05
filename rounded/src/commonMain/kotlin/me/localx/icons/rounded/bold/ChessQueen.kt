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

public val Icons.Bold.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.314f, 9.782f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.2f, -0.742f)
                arcToRelative(11.142f, 11.142f, 0.0f, false, false, -7.253f, -4.884f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.719f, 0.0f)
                arcTo(11.142f, 11.142f, 0.0f, false, false, 2.891f, 9.04f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, -2.2f, 0.742f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, false, -0.619f, 2.3f)
                lineToRelative(2.059f, 8.97f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 24.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.371f, -2.948f)
                lineToRelative(2.051f, -8.939f)
                arcTo(2.482f, 2.482f, 0.0f, false, false, 23.314f, 9.782f)
                close()
                moveTo(5.2f, 21.0f)
                lineTo(3.177f, 12.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 6.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                curveToRelative(0.0f, -0.113f, -0.01f, -0.223f, -0.016f, -0.335f)
                arcTo(1.487f, 1.487f, 0.0f, false, false, 9.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(3.805f, 3.805f, 0.0f, false, true, 2.825f, -3.3f)
                lineTo(18.809f, 21.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(7.819f, 7.819f, 0.0f, false, true, 6.207f, 3.154f)
                arcToRelative(7.407f, 7.407f, 0.0f, false, false, -1.474f, 1.161f)
                arcToRelative(5.986f, 5.986f, 0.0f, false, false, -9.463f, 0.008f)
                arcToRelative(7.337f, 7.337f, 0.0f, false, false, -1.465f, -1.182f)
                arcTo(7.812f, 7.812f, 0.0f, false, true, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
