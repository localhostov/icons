package me.localx.icons.rounded.filled

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

public val Icons.Filled.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.585f, 9.616f)
                lineTo(15.21f, 6.0f)
                horizontalLineToRelative(2.422f)
                arcTo(5.885f, 5.885f, 0.0f, false, true, 22.36f, 8.4f)
                lineToRelative(0.787f, 1.075f)
                arcTo(4.431f, 4.431f, 0.0f, false, true, 23.867f, 11.0f)
                lineTo(16.952f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 16.585f, 9.616f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(14.722f, 10.343f)
                lineTo(13.071f, 6.0f)
                lineTo(10.938f, 6.0f)
                lineTo(9.26f, 10.452f)
                arcTo(4.709f, 4.709f, 0.0f, false, false, 9.1f, 11.0f)
                horizontalLineToRelative(5.821f)
                arcTo(4.623f, 4.623f, 0.0f, false, false, 14.722f, 10.343f)
                close()
                moveTo(16.553f, 3.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.9f, 3.447f)
                lineToRelative(1.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.79f, -0.894f)
                lineToRelative(-1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.553f, 3.9f)
                close()
                moveTo(11.988f, 18.887f)
                lineToRelative(2.786f, -5.253f)
                arcTo(4.591f, 4.591f, 0.0f, false, false, 14.941f, 13.0f)
                lineTo(9.0f, 13.0f)
                arcToRelative(4.585f, 4.585f, 0.0f, false, false, 0.2f, 0.757f)
                close()
                moveTo(7.4f, 9.729f)
                lineTo(8.8f, 6.0f)
                lineTo(6.383f, 6.0f)
                arcTo(5.892f, 5.892f, 0.0f, false, false, 1.721f, 8.309f)
                lineTo(0.9f, 9.383f)
                arcTo(4.366f, 4.366f, 0.0f, false, false, 0.141f, 11.0f)
                horizontalLineToRelative(6.9f)
                arcTo(6.6f, 6.6f, 0.0f, false, true, 7.4f, 9.729f)
                close()
                moveTo(16.969f, 13.0f)
                arcToRelative(6.573f, 6.573f, 0.0f, false, true, -0.344f, 1.4f)
                curveToRelative(-0.015f, 0.04f, -3.756f, 7.074f, -3.759f, 7.075f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -1.726f, 0.008f)
                reflectiveCurveToRelative(-3.774f, -6.912f, -3.79f, -6.955f)
                arcTo(6.586f, 6.586f, 0.0f, false, true, 6.994f, 13.0f)
                lineTo(0.121f, 13.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.328f, 2.32f)
                lineToRelative(7.99f, 7.707f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, 2.55f, 0.969f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.6f, -1.0f)
                lineToRelative(7.936f, -7.633f)
                arcTo(4.373f, 4.373f, 0.0f, false, false, 23.89f, 13.0f)
                close()
                moveTo(6.105f, 3.447f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.9f, 2.553f)
                lineToRelative(-1.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.79f, 0.894f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
