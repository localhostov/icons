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

public val Icons.Bold.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.842f, 12.0f)
                arcTo(19.074f, 19.074f, 0.0f, false, false, 18.0f, 12.477f)
                verticalLineTo(9.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 6.0f)
                horizontalLineTo(11.521f)
                curveToRelative(0.061f, -0.337f, 0.128f, -0.7f, 0.193f, -1.033f)
                arcTo(12.623f, 12.623f, 0.0f, false, false, 12.0f, 3.158f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 9.0f, 0.0f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 6.0f, 3.158f)
                arcToRelative(13.691f, 13.691f, 0.0f, false, false, 0.3f, 1.913f)
                curveToRelative(0.058f, 0.308f, 0.118f, 0.627f, 0.173f, 0.929f)
                horizontalLineTo(3.409f)
                arcTo(3.419f, 3.419f, 0.0f, false, false, 0.0f, 9.422f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.521f)
                arcTo(19.065f, 19.065f, 0.0f, false, false, 20.842f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineTo(11.521f)
                curveToRelative(0.061f, -0.337f, 0.128f, -0.7f, 0.193f, -1.033f)
                arcTo(12.623f, 12.623f, 0.0f, false, false, 12.0f, 18.158f)
                arcTo(2.949f, 2.949f, 0.0f, false, false, 9.0f, 15.0f)
                arcToRelative(2.949f, 2.949f, 0.0f, false, false, -3.0f, 3.158f)
                arcToRelative(13.691f, 13.691f, 0.0f, false, false, 0.3f, 1.913f)
                curveToRelative(0.058f, 0.308f, 0.118f, 0.627f, 0.173f, 0.929f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.422f)
                arcTo(0.421f, 0.421f, 0.0f, false, true, 3.409f, 9.0f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
