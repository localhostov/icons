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

public val Icons.Bold.ChessKnightAlt: ImageVector
    get() {
        if (_chessKnightAlt != null) {
            return _chessKnightAlt!!
        }
        _chessKnightAlt = Builder(name = "ChessKnightAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.338f)
                verticalLineTo(8.464f)
                curveTo(20.0f, 5.536f, 18.049f, 0.0f, 10.665f, 0.0f)
                horizontalLineTo(9.494f)
                lineTo(9.21f, 1.137f)
                curveToRelative(-0.593f, 2.37f, -1.509f, 3.129f, -3.1f, 3.77f)
                arcTo(3.335f, 3.335f, 0.0f, false, false, 4.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.608f)
                arcToRelative(9.02f, 9.02f, 0.0f, false, true, -3.85f, 4.194f)
                arcTo(3.529f, 3.529f, 0.0f, false, false, 4.0f, 17.229f)
                verticalLineToRelative(2.109f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 2.0f, 22.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.5f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 20.0f, 19.338f)
                close()
                moveTo(7.266f, 16.788f)
                curveToRelative(1.569f, -0.913f, 5.266f, -3.533f, 5.726f, -8.139f)
                lineTo(13.157f, 7.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(7.079f, 7.079f, 0.0f, false, false, 11.76f, 3.058f)
                arcTo(5.462f, 5.462f, 0.0f, false, true, 17.0f, 8.464f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.229f)
                arcTo(0.514f, 0.514f, 0.0f, false, true, 7.266f, 16.788f)
                close()
            }
        }
        .build()
        return _chessKnightAlt!!
    }

private var _chessKnightAlt: ImageVector? = null
