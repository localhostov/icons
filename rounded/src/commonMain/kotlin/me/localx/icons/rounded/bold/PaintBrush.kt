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

public val Icons.Bold.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.941f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -1.149f, -2.8f)
                arcToRelative(3.941f, 3.941f, 0.0f, false, false, -5.516f, -0.034f)
                lineToRelative(-10.171f, 9.926f)
                arcToRelative(5.964f, 5.964f, 0.0f, false, false, -4.4f, 1.737f)
                curveToRelative(-1.617f, 1.619f, -2.518f, 5.772f, -2.729f, 7.237f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, 3.465f, 4.008f)
                arcToRelative(3.561f, 3.561f, 0.0f, false, false, 0.513f, -0.037f)
                curveToRelative(1.463f, -0.21f, 5.615f, -1.11f, 7.235f, -2.73f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, 1.691f, -4.881f)
                lineToRelative(9.88f, -9.641f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, 1.181f, -2.785f)
                close()
                moveTo(9.123f, 19.127f)
                curveToRelative(-0.652f, 0.651f, -3.346f, 1.566f, -5.541f, 1.882f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, -0.577f, -0.576f)
                curveToRelative(0.316f, -2.2f, 1.231f, -4.89f, 1.882f, -5.542f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.236f, 0.0f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, true, 0.728f, 1.234f)
                arcToRelative(1.435f, 1.435f, 0.0f, false, false, 0.1f, 0.356f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, -0.828f, 2.646f)
                close()
                moveTo(20.723f, 4.578f)
                lineTo(11.723f, 13.357f)
                arcToRelative(5.878f, 5.878f, 0.0f, false, false, -0.479f, -0.587f)
                arcToRelative(5.987f, 5.987f, 0.0f, false, false, -0.851f, -0.7f)
                lineToRelative(9.037f, -8.814f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, 1.3f, 0.008f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, -0.008f, 1.314f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
