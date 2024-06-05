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

public val Icons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.091f, -0.109f, -9.093f, -9.572f, -9.987f)
                arcToRelative(2.838f, 2.838f, 0.0f, false, false, -2.881f, 1.8f)
                curveToRelative(-0.992f, 2.47f, -2.886f, 3.583f, -5.424f, 4.5f)
                arcTo(3.235f, 3.235f, 0.0f, false, false, 2.0f, 9.355f)
                arcTo(2.649f, 2.649f, 0.0f, false, false, 4.645f, 12.0f)
                horizontalLineTo(9.82f)
                curveToRelative(-1.244f, 5.927f, -6.032f, 9.308f, -7.1f, 10.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(11.992f, 11.124f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 10.0f)
                horizontalLineTo(4.645f)
                arcTo(0.645f, 0.645f, 0.0f, false, true, 4.0f, 9.355f)
                arcToRelative(1.231f, 1.231f, 0.0f, false, true, 0.8f, -1.164f)
                curveToRelative(2.51f, -0.9f, 5.256f, -2.275f, 6.6f, -5.631f)
                arcTo(0.858f, 0.858f, 0.0f, false, true, 12.239f, 2.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.012f)
                arcTo(17.517f, 17.517f, 0.0f, false, false, 11.992f, 11.124f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
