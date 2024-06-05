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
                curveToRelative(0.0f, -0.1f, -0.127f, -10.0f, -11.125f, -10.0f)
                horizontalLineToRelative(-0.781f)
                lineTo(9.9f, 0.758f)
                curveTo(9.112f, 3.929f, 7.119f, 5.229f, 4.162f, 6.3f)
                arcTo(3.266f, 3.266f, 0.0f, false, false, 2.0f, 9.355f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.82f)
                curveToRelative(-1.249f, 5.952f, -6.061f, 9.328f, -7.106f, 10.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(11.992f, 11.124f)
                lineTo(12.133f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.355f)
                arcToRelative(1.262f, 1.262f, 0.0f, false, true, 0.841f, -1.178f)
                curveTo(7.659f, 7.159f, 10.41f, 5.7f, 11.621f, 2.019f)
                curveTo(19.856f, 2.432f, 20.0f, 9.686f, 20.0f, 10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.01f)
                arcTo(17.507f, 17.507f, 0.0f, false, false, 11.992f, 11.124f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
