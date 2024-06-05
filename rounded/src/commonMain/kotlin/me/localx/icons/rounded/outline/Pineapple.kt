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

public val Icons.Outline.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 10.625f)
                curveToRelative(-0.715f, -2.048f, -2.239f, -3.7f, -5.343f, -4.335f)
                arcTo(4.461f, 4.461f, 0.0f, false, true, 17.447f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, -1.79f)
                arcTo(6.53f, 6.53f, 0.0f, false, false, 13.0f, 6.037f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 6.037f)
                arcTo(6.53f, 6.53f, 0.0f, false, false, 7.447f, 1.105f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.553f, 2.9f)
                arcToRelative(4.461f, 4.461f, 0.0f, false, true, 2.393f, 3.4f)
                curveTo(3.794f, 7.345f, 3.0f, 11.2f, 3.0f, 15.0f)
                curveToRelative(0.0f, 3.456f, 0.661f, 6.963f, 4.665f, 8.361f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, false, 0.226f, 0.077f)
                curveTo(16.4f, 25.439f, 21.33f, 22.247f, 21.0f, 15.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 20.4f, 10.625f)
                close()
                moveTo(16.2f, 8.7f)
                arcToRelative(4.114f, 4.114f, 0.0f, false, true, 2.149f, 2.128f)
                lineToRelative(-2.8f, 2.8f)
                lineToRelative(-2.138f, -2.138f)
                close()
                moveTo(14.134f, 15.043f)
                lineTo(12.0f, 17.18f)
                lineTo(9.859f, 15.041f)
                lineTo(12.0f, 12.9f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(15.689f, 15.689f, 0.0f, false, true, 1.96f, 0.112f)
                lineTo(12.0f, 10.075f)
                lineTo(10.035f, 8.112f)
                arcTo(15.773f, 15.773f, 0.0f, false, true, 12.0f, 8.0f)
                close()
                moveTo(7.794f, 8.7f)
                lineTo(10.584f, 11.49f)
                lineTo(8.445f, 13.627f)
                lineToRelative(-2.8f, -2.8f)
                arcTo(4.11f, 4.11f, 0.0f, false, true, 7.794f, 8.7f)
                close()
                moveTo(5.1f, 16.972f)
                arcToRelative(19.249f, 19.249f, 0.0f, false, true, -0.008f, -3.87f)
                lineToRelative(1.938f, 1.939f)
                close()
                moveTo(7.853f, 21.324f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -2.181f, -2.1f)
                lineToRelative(2.772f, -2.773f)
                lineToRelative(2.138f, 2.139f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(15.884f, 15.884f, 0.0f, false, true, -1.889f, -0.105f)
                lineTo(12.0f, 20.008f)
                lineTo(13.884f, 21.9f)
                arcTo(15.809f, 15.809f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(16.143f, 21.325f)
                lineTo(13.411f, 18.594f)
                lineTo(15.55f, 16.455f)
                lineTo(18.325f, 19.231f)
                arcTo(4.119f, 4.119f, 0.0f, false, true, 16.143f, 21.325f)
                close()
                moveTo(18.9f, 16.976f)
                lineToRelative(-1.935f, -1.935f)
                lineTo(18.907f, 13.1f)
                arcTo(19.329f, 19.329f, 0.0f, false, true, 18.9f, 16.976f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
