package me.localx.icons.straight.filled

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

public val Icons.Filled.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.5f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, false, -2.0f, 0.272f)
                verticalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(12.728f)
                arcTo(9.929f, 9.929f, 0.0f, false, false, 13.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 4.0f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, false, 0.272f, 2.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.536f)
                lineTo(6.3f, 23.0f)
                arcTo(9.8f, 9.8f, 0.0f, false, true, 6.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, -0.3f, 2.0f)
                lineToRelative(-0.237f, 1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.228f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, false, 2.0f, 0.272f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
