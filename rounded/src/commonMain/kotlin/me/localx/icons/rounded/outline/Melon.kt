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

public val Icons.Outline.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.374f, 2.324f)
                arcTo(4.336f, 4.336f, 0.0f, false, false, 15.5f, 1.273f)
                lineTo(1.274f, 15.5f)
                arcTo(4.347f, 4.347f, 0.0f, false, false, 0.059f, 19.242f)
                curveToRelative(0.718f, 3.917f, 5.816f, 4.606f, 9.038f, 4.765f)
                curveTo(19.976f, 24.164f, 27.521f, 12.049f, 22.374f, 2.324f)
                close()
                moveTo(12.42f, 12.42f)
                arcToRelative(5.366f, 5.366f, 0.0f, false, true, -6.237f, 0.995f)
                lineToRelative(7.233f, -7.234f)
                arcTo(5.376f, 5.376f, 0.0f, false, true, 12.42f, 12.42f)
                close()
                moveTo(18.22f, 18.22f)
                arcTo(12.873f, 12.873f, 0.0f, false, true, 3.233f, 20.594f)
                arcToRelative(2.323f, 2.323f, 0.0f, false, true, -0.546f, -3.683f)
                lineToRelative(2.037f, -2.037f)
                curveToRelative(6.563f, 4.133f, 14.25f, -3.623f, 10.16f, -10.161f)
                lineToRelative(2.027f, -2.027f)
                arcToRelative(2.319f, 2.319f, 0.0f, false, true, 3.681f, 0.546f)
                arcTo(12.869f, 12.869f, 0.0f, false, true, 18.216f, 18.216f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
