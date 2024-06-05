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

public val Icons.Outline.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = Builder(name = "Eclipse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.0f, 18.921f)
                arcToRelative(6.829f, 6.829f, 0.0f, false, true, -1.623f, -0.435f)
                lineTo(7.33f, 22.007f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.6f, 21.0f)
                lineToRelative(2.049f, -3.525f)
                arcToRelative(7.092f, 7.092f, 0.0f, false, true, -1.128f, -1.13f)
                lineTo(3.01f, 18.391f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 16.662f)
                lineToRelative(3.51f, -2.043f)
                arcTo(6.922f, 6.922f, 0.0f, false, true, 5.072f, 13.0f)
                lineTo(1.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(5.072f, 11.0f)
                arcToRelative(6.922f, 6.922f, 0.0f, false, true, 0.445f, -1.626f)
                lineTo(2.0f, 7.326f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.6f)
                lineTo(6.528f, 7.649f)
                arcTo(7.137f, 7.137f, 0.0f, false, true, 7.671f, 6.507f)
                lineTo(5.627f, 2.992f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 7.355f, 1.986f)
                lineTo(9.4f, 5.5f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 1.609f, -0.431f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 5.079f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.29f, 7.05f)
                arcTo(5.019f, 5.019f, 0.0f, false, false, 7.0f, 12.0f)
                curveToRelative(0.0f, 3.538f, 3.728f, 4.87f, 4.289f, 4.95f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 18.921f)
                lineTo(13.0f, 23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(18.0f, 18.0f)
                curveToRelative(-7.929f, -0.252f, -7.928f, -11.749f, 0.0f, -12.0f)
                curveTo(25.929f, 6.252f, 25.928f, 17.749f, 18.0f, 18.0f)
                close()
                moveTo(18.0f, 8.0f)
                curveToRelative(-5.275f, 0.138f, -5.274f, 7.863f, 0.0f, 8.0f)
                curveTo(23.275f, 15.862f, 23.274f, 8.137f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
