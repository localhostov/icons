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

public val Icons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.036f, 24.0f)
                horizontalLineTo(3.964f)
                arcTo(3.955f, 3.955f, 0.0f, false, true, 0.422f, 18.267f)
                lineTo(8.459f, 2.189f)
                arcTo(3.932f, 3.932f, 0.0f, false, true, 11.736f, 0.008f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, true, 3.805f, 2.181f)
                lineToRelative(8.037f, 16.078f)
                arcTo(3.961f, 3.961f, 0.0f, false, true, 20.036f, 24.0f)
                close()
                moveTo(2.0f, 20.043f)
                arcTo(1.973f, 1.973f, 0.0f, false, false, 3.964f, 22.0f)
                horizontalLineTo(20.036f)
                arcTo(1.973f, 1.973f, 0.0f, false, false, 22.0f, 20.043f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, false, -0.212f, -0.881f)
                lineTo(13.753f, 3.083f)
                arcToRelative(1.959f, 1.959f, 0.0f, false, false, -3.506f, 0.0f)
                lineTo(2.21f, 19.162f)
                arcTo(1.95f, 1.95f, 0.0f, false, false, 2.0f, 20.043f)
                close()
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
