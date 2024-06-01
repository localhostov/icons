package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.021f, 6.9997f)
                    lineTo(15.357f, 4.9587f)
                    curveTo(15.4451f, 4.4199f, 15.3867f, 3.8673f, 15.1878f, 3.3588f)
                    curveTo(14.9889f, 2.8504f, 14.657f, 2.4047f, 14.2267f, 2.0686f)
                    curveTo(13.7965f, 1.7326f, 13.2837f, 1.5184f, 12.7422f, 1.4485f)
                    curveTo(12.2008f, 1.3787f, 11.6505f, 1.4558f, 11.149f, 1.6717f)
                    curveTo(10.456f, 1.9827f, 9.8992f, 2.5345f, 9.582f, 3.2247f)
                    lineTo(7.717f, 6.9997f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 6.9997f, 1.4413f, 7.3158f, 0.8787f, 7.8784f)
                    curveTo(0.3161f, 8.441f, 0.0f, 9.2041f, 0.0f, 9.9997f)
                    lineTo(0.0f, 18.9997f)
                    curveTo(0.0f, 19.7954f, 0.3161f, 20.5584f, 0.8787f, 21.121f)
                    curveTo(1.4413f, 21.6836f, 2.2043f, 21.9997f, 3.0f, 21.9997f)
                    horizontalLineTo(22.018f)
                    lineTo(24.0f, 10.9627f)
                    lineTo(24.016f, 6.9997f)
                    horizontalLineTo(15.021f)
                    close()
                    moveTo(2.0f, 18.9997f)
                    verticalLineTo(9.9997f)
                    curveTo(2.0f, 9.7345f, 2.1054f, 9.4801f, 2.2929f, 9.2926f)
                    curveTo(2.4804f, 9.1051f, 2.7348f, 8.9997f, 3.0f, 8.9997f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 19.9997f, 2.4804f, 19.8944f, 2.2929f, 19.7068f)
                    curveTo(2.1054f, 19.5193f, 2.0f, 19.2649f, 2.0f, 18.9997f)
                    close()
                    moveTo(22.0f, 10.6997f)
                    lineTo(20.33f, 19.9997f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(8.9087f)
                    lineTo(11.419f, 4.0087f)
                    curveTo(11.5009f, 3.8605f, 11.6168f, 3.7338f, 11.7572f, 3.6392f)
                    curveTo(11.8976f, 3.5445f, 12.0585f, 3.4845f, 12.2266f, 3.4641f)
                    curveTo(12.3947f, 3.4437f, 12.5652f, 3.4634f, 12.7242f, 3.5218f)
                    curveTo(12.8832f, 3.5801f, 13.026f, 3.6754f, 13.141f, 3.7997f)
                    curveTo(13.2392f, 3.914f, 13.3111f, 4.0485f, 13.3513f, 4.1937f)
                    curveTo(13.3916f, 4.3389f, 13.3994f, 4.4912f, 13.374f, 4.6397f)
                    lineTo(12.655f, 8.9997f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(10.6997f)
                    close()
                }
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
