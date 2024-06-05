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

public val Icons.Outline.ChessKnightAlt: ImageVector
    get() {
        if (_chessKnightAlt != null) {
            return _chessKnightAlt!!
        }
        _chessKnightAlt = Builder(name = "ChessKnightAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.172f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -0.079f, -0.1f, -7.963f, -8.536f, -8.5f)
                arcTo(1.983f, 1.983f, 0.0f, false, false, 9.411f, 1.385f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, -3.5f, 3.846f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 4.0f, 8.025f)
                arcTo(1.977f, 1.977f, 0.0f, false, false, 5.975f, 10.0f)
                horizontalLineToRelative(4.247f)
                arcToRelative(5.681f, 5.681f, 0.0f, false, true, -3.181f, 3.416f)
                arcTo(5.075f, 5.075f, 0.0f, false, false, 4.0f, 18.0f)
                verticalLineToRelative(0.17f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 24.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.0f, -5.828f)
                close()
                moveTo(7.861f, 15.24f)
                arcToRelative(7.769f, 7.769f, 0.0f, false, false, 4.625f, -6.076f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.5f, 8.0f)
                lineTo(6.0f, 8.025f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, true, 0.663f, -0.94f)
                arcTo(7.333f, 7.333f, 0.0f, false, false, 11.339f, 2.0f)
                arcTo(6.607f, 6.607f, 0.0f, false, true, 18.0f, 8.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                arcTo(3.036f, 3.036f, 0.0f, false, true, 7.861f, 15.24f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chessKnightAlt!!
    }

private var _chessKnightAlt: ImageVector? = null
