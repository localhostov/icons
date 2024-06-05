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
                moveTo(23.9f, 9.0f)
                horizontalLineTo(22.0f)
                curveToRelative(-0.193f, 0.0f, -0.381f, 0.013f, -0.569f, 0.025f)
                arcToRelative(10.771f, 10.771f, 0.0f, false, false, -7.559f, -4.884f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.731f, 0.016f)
                arcTo(11.182f, 11.182f, 0.0f, false, false, 2.62f, 9.027f)
                curveTo(2.415f, 9.014f, 2.211f, 9.0f, 2.0f, 9.0f)
                horizontalLineTo(0.1f)
                lineTo(2.974f, 21.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.026f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(7.938f, 7.938f, 0.0f, false, true, 6.3f, 2.825f)
                arcToRelative(6.344f, 6.344f, 0.0f, false, false, -1.73f, 1.252f)
                arcToRelative(6.076f, 6.076f, 0.0f, false, false, -9.149f, 0.0f)
                arcTo(6.314f, 6.314f, 0.0f, false, false, 5.752f, 9.85f)
                arcTo(8.016f, 8.016f, 0.0f, false, true, 12.0f, 7.0f)
                close()
                moveTo(3.983f, 12.34f)
                arcTo(2.792f, 2.792f, 0.0f, false, true, 6.0f, 15.0f)
                horizontalLineTo(9.0f)
                arcToRelative(2.935f, 2.935f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(2.935f, 2.935f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.792f, 2.792f, 0.0f, false, true, 2.017f, -2.66f)
                lineTo(17.941f, 21.0f)
                horizontalLineTo(6.059f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
