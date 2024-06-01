package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.074f, 3.8418f)
                    curveTo(22.7999f, 3.7281f, 22.4982f, 3.6984f, 22.2072f, 3.7562f)
                    curveTo(21.9162f, 3.8141f, 21.6488f, 3.957f, 21.439f, 4.1668f)
                    lineTo(17.728f, 7.8788f)
                    lineTo(13.061f, 3.2118f)
                    curveTo(12.9217f, 3.0724f, 12.7563f, 2.9618f, 12.5742f, 2.8864f)
                    curveTo(12.3922f, 2.8109f, 12.1971f, 2.7721f, 12.0f, 2.7721f)
                    curveTo(11.8029f, 2.7721f, 11.6078f, 2.8109f, 11.4258f, 2.8864f)
                    curveTo(11.2437f, 2.9618f, 11.0783f, 3.0724f, 10.939f, 3.2118f)
                    lineTo(6.272f, 7.8788f)
                    lineTo(2.561f, 4.1668f)
                    curveTo(2.3512f, 3.9569f, 2.0839f, 3.8139f, 1.7928f, 3.7559f)
                    curveTo(1.5018f, 3.698f, 1.2001f, 3.7277f, 0.9259f, 3.8413f)
                    curveTo(0.6517f, 3.9549f, 0.4174f, 4.1473f, 0.2526f, 4.3941f)
                    curveTo(0.0878f, 4.6409f, -1.0E-4f, 4.931f, 0.0f, 5.2278f)
                    verticalLineTo(16.4998f)
                    curveTo(0.0019f, 17.9579f, 0.5819f, 19.3558f, 1.613f, 20.3868f)
                    curveTo(2.644f, 21.4179f, 4.0419f, 21.9979f, 5.5f, 21.9998f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9581f, 21.9979f, 21.356f, 21.4179f, 22.387f, 20.3868f)
                    curveTo(23.4181f, 19.3558f, 23.9981f, 17.9579f, 24.0f, 16.4998f)
                    verticalLineTo(5.2278f)
                    curveTo(24.0f, 4.9311f, 23.9121f, 4.641f, 23.7472f, 4.3943f)
                    curveTo(23.5824f, 4.1476f, 23.3481f, 3.9553f, 23.074f, 3.8418f)
                    close()
                    moveTo(21.0f, 16.4998f)
                    curveTo(21.0f, 17.1628f, 20.7366f, 17.7987f, 20.2678f, 18.2675f)
                    curveTo(19.7989f, 18.7364f, 19.163f, 18.9998f, 18.5f, 18.9998f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 18.9998f, 4.2011f, 18.7364f, 3.7322f, 18.2675f)
                    curveTo(3.2634f, 17.7987f, 3.0f, 17.1628f, 3.0f, 16.4998f)
                    verticalLineTo(8.8488f)
                    lineTo(5.212f, 11.0608f)
                    curveTo(5.4933f, 11.342f, 5.8748f, 11.5f, 6.2725f, 11.5f)
                    curveTo(6.6702f, 11.5f, 7.0517f, 11.342f, 7.333f, 11.0608f)
                    lineTo(12.0f, 6.3938f)
                    lineTo(16.667f, 11.0608f)
                    curveTo(16.9483f, 11.342f, 17.3298f, 11.5f, 17.7275f, 11.5f)
                    curveTo(18.1252f, 11.5f, 18.5067f, 11.342f, 18.788f, 11.0608f)
                    lineTo(21.0f, 8.8488f)
                    verticalLineTo(16.4998f)
                    close()
                }
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
