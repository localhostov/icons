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

public val Icons.Outline.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 4.0f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(12.0f, 24.0f)
                curveTo(5.427f, 24.157f, -0.159f, 18.292f, 0.0f, 11.775f)
                arcTo(12.247f, 12.247f, 0.0f, false, true, 12.365f, 0.0f)
                lineTo(23.0f, 0.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineToRelative(-1.065f, 0.0f)
                arcTo(7.889f, 7.889f, 0.0f, false, true, 13.815f, 9.0f)
                arcToRelative(6.973f, 6.973f, 0.0f, false, false, -4.021f, 1.278f)
                arcTo(2.876f, 2.876f, 0.0f, false, false, 12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(4.736f, 4.736f, 0.0f, false, true, -3.653f, -1.349f)
                arcTo(6.325f, 6.325f, 0.0f, false, false, 7.2f, 13.944f)
                arcTo(3.683f, 3.683f, 0.0f, false, false, 10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(-0.163f, 1.87f, -3.22f, 0.675f, -3.943f, 0.307f)
                arcTo(6.516f, 6.516f, 0.0f, false, false, 13.5f, 22.0f)
                curveToRelative(1.309f, -1.023f, 5.442f, -4.0f, 7.5f, -4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 21.0f)
                close()
                moveTo(11.0f, 4.5f)
                arcTo(2.589f, 2.589f, 0.0f, false, false, 14.0f, 7.0f)
                arcToRelative(6.011f, 6.011f, 0.0f, false, false, 5.915f, -4.983f)
                lineTo(13.476f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.0f, 4.5f)
                close()
                moveTo(4.5f, 5.511f)
                arcToRelative(4.081f, 4.081f, 0.0f, false, false, 3.625f, 3.53f)
                arcTo(8.978f, 8.978f, 0.0f, false, true, 10.346f, 7.7f)
                arcToRelative(4.478f, 4.478f, 0.0f, false, true, -0.795f, -5.316f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 4.5f, 5.511f)
                close()
                moveTo(6.539f, 20.382f)
                arcToRelative(8.337f, 8.337f, 0.0f, false, true, -1.514f, -5.4f)
                arcToRelative(5.271f, 5.271f, 0.0f, false, true, -2.677f, -0.367f)
                arcTo(10.037f, 10.037f, 0.0f, false, false, 6.539f, 20.382f)
                close()
                moveTo(6.539f, 10.733f)
                arcToRelative(6.151f, 6.151f, 0.0f, false, true, -3.479f, -3.1f)
                arcTo(9.557f, 9.557f, 0.0f, false, false, 2.0f, 11.793f)
                curveToRelative(0.231f, 0.438f, 1.081f, 1.58f, 3.425f, 1.114f)
                arcTo(8.356f, 8.356f, 0.0f, false, true, 6.542f, 10.733f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(-0.4f, -2.2f, -2.947f, -0.233f, -4.95f, 1.0f)
                lineTo(21.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 21.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
