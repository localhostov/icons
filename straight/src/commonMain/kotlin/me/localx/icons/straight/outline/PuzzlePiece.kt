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

public val Icons.Outline.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                lineTo(10.437f, 24.0f)
                lineToRelative(0.291f, -1.23f)
                arcTo(8.944f, 8.944f, 0.0f, false, false, 11.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(8.944f, 8.944f, 0.0f, false, false, 0.272f, 1.77f)
                lineTo(7.563f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 6.0f)
                lineTo(5.272f, 6.0f)
                arcTo(9.929f, 9.929f, 0.0f, false, true, 5.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, true, -0.272f, 2.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.772f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, true, 2.0f, -0.272f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, true, -2.0f, -0.272f)
                close()
                moveTo(12.914f, 22.0f)
                lineTo(16.0f, 22.0f)
                lineTo(16.0f, 15.582f)
                lineToRelative(1.291f, 0.392f)
                arcTo(11.224f, 11.224f, 0.0f, false, false, 20.0f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcToRelative(11.224f, 11.224f, 0.0f, false, false, -2.709f, 0.526f)
                lineTo(16.0f, 13.418f)
                lineTo(16.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(10.082f, 8.0f)
                lineToRelative(0.392f, -1.291f)
                arcTo(11.2f, 11.2f, 0.0f, false, false, 11.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 4.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 0.526f, 2.709f)
                lineTo(7.918f, 8.0f)
                lineTo(3.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                lineTo(2.0f, 22.0f)
                lineTo(5.086f, 22.0f)
                arcTo(7.149f, 7.149f, 0.0f, false, true, 5.0f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcTo(7.149f, 7.149f, 0.0f, false, true, 12.914f, 22.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
