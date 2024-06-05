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

public val Icons.Outline.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(23.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(18.934f, 7.126f)
                arcTo(2.427f, 2.427f, 0.0f, false, false, 17.65f, 4.395f)
                lineTo(9.668f, 0.428f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 6.4f, 0.433f)
                arcTo(2.809f, 2.809f, 0.0f, false, false, 5.0f, 2.914f)
                lineTo(5.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 9.0f)
                horizontalLineToRelative(8.318f)
                arcTo(2.538f, 2.538f, 0.0f, false, false, 18.934f, 7.126f)
                close()
                moveTo(8.737f, 2.2f)
                lineTo(16.749f, 6.18f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, 0.24f, 0.477f)
                curveToRelative(-0.074f, 0.308f, -0.494f, 0.341f, -0.671f, 0.341f)
                lineTo(8.0f, 6.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 6.0f)
                lineTo(7.0f, 2.914f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, true, 0.418f, -0.758f)
                arcTo(1.168f, 1.168f, 0.0f, false, true, 8.011f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.737f, 2.2f)
                close()
                moveTo(9.628f, 23.594f)
                lineTo(17.661f, 19.6f)
                arcToRelative(2.425f, 2.425f, 0.0f, false, false, 1.273f, -2.726f)
                arcTo(2.538f, 2.538f, 0.0f, false, false, 16.318f, 15.0f)
                lineTo(8.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.085f)
                arcToRelative(2.808f, 2.808f, 0.0f, false, false, 1.4f, 2.481f)
                arcTo(3.212f, 3.212f, 0.0f, false, false, 8.032f, 24.0f)
                arcTo(3.287f, 3.287f, 0.0f, false, false, 9.628f, 23.592f)
                close()
                moveTo(16.318f, 17.0f)
                curveToRelative(0.177f, 0.0f, 0.6f, 0.033f, 0.671f, 0.341f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.229f, 0.472f)
                lineTo(8.7f, 21.822f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, true, -1.279f, 0.02f)
                arcTo(0.824f, 0.824f, 0.0f, false, true, 7.0f, 21.084f)
                lineTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
