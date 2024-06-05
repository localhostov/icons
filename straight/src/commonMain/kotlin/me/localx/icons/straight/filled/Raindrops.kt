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

public val Icons.Filled.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcToRelative(5.952f, 5.952f, 0.0f, false, true, -4.242f, -1.758f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, true, 0.0f, -8.484f)
                lineTo(14.0f, 9.261f)
                lineToRelative(4.263f, 4.517f)
                arcToRelative(6.029f, 6.029f, 0.0f, false, true, -0.021f, 8.464f)
                horizontalLineToRelative(0.0f)
                arcTo(5.952f, 5.952f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, true, -3.535f, -1.465f)
                arcToRelative(5.022f, 5.022f, 0.0f, false, true, 0.0f, -7.07f)
                lineTo(5.0f, 0.007f)
                lineToRelative(3.527f, 3.45f)
                arcToRelative(5.02f, 5.02f, 0.0f, false, true, 0.008f, 7.078f)
                arcTo(4.965f, 4.965f, 0.0f, false, true, 5.0f, 12.0f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, true, -2.828f, -1.172f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 0.0f, -5.656f)
                lineTo(19.982f, 0.049f)
                lineTo(22.86f, 3.205f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, -0.032f, 5.623f)
                horizontalLineToRelative(0.0f)
                arcTo(3.973f, 3.973f, 0.0f, false, true, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
