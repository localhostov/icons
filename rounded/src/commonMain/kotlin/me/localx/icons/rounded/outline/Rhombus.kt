package me.localx.icons.rounded.outline

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

public val Icons.Outline.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 23.9271f)
                    curveTo(11.3433f, 23.928f, 10.693f, 23.7994f, 10.0862f, 23.5485f)
                    curveTo(9.4794f, 23.2976f, 8.9281f, 22.9294f, 8.4639f, 22.4651f)
                    lineTo(1.5339f, 15.5341f)
                    curveTo(0.5965f, 14.5965f, 0.0699f, 13.3249f, 0.0699f, 11.9991f)
                    curveTo(0.0699f, 10.6733f, 0.5965f, 9.4017f, 1.5339f, 8.4641f)
                    lineTo(8.4639f, 1.5331f)
                    curveTo(9.4026f, 0.5971f, 10.6742f, 0.0715f, 11.9999f, 0.0715f)
                    curveTo(13.3255f, 0.0715f, 14.5971f, 0.5971f, 15.5359f, 1.5331f)
                    lineTo(22.4659f, 8.4641f)
                    curveTo(23.4032f, 9.4017f, 23.9298f, 10.6733f, 23.9298f, 11.9991f)
                    curveTo(23.9298f, 13.3249f, 23.4032f, 14.5965f, 22.4659f, 15.5341f)
                    lineTo(15.5359f, 22.4651f)
                    curveTo(15.0717f, 22.9294f, 14.5204f, 23.2976f, 13.9136f, 23.5485f)
                    curveTo(13.3068f, 23.7994f, 12.6565f, 23.928f, 11.9999f, 23.9271f)
                    close()
                    moveTo(11.9999f, 2.0701f)
                    curveTo(11.6059f, 2.0694f, 11.2156f, 2.1464f, 10.8514f, 2.2969f)
                    curveTo(10.4873f, 2.4474f, 10.1564f, 2.6684f, 9.8779f, 2.9471f)
                    lineTo(2.9479f, 9.8781f)
                    curveTo(2.3855f, 10.4407f, 2.0695f, 11.2036f, 2.0695f, 11.9991f)
                    curveTo(2.0695f, 12.7946f, 2.3855f, 13.5575f, 2.9479f, 14.1201f)
                    lineTo(9.8779f, 21.0511f)
                    curveTo(10.1565f, 21.3299f, 10.4873f, 21.551f, 10.8514f, 21.7019f)
                    curveTo(11.2155f, 21.8528f, 11.6058f, 21.9305f, 11.9999f, 21.9305f)
                    curveTo(12.394f, 21.9305f, 12.7843f, 21.8528f, 13.1484f, 21.7019f)
                    curveTo(13.5125f, 21.551f, 13.8433f, 21.3299f, 14.1219f, 21.0511f)
                    lineTo(21.0519f, 14.1201f)
                    curveTo(21.6143f, 13.5575f, 21.9302f, 12.7946f, 21.9302f, 11.9991f)
                    curveTo(21.9302f, 11.2036f, 21.6143f, 10.4407f, 21.0519f, 9.8781f)
                    lineTo(14.1219f, 2.9471f)
                    curveTo(13.8433f, 2.6684f, 13.5125f, 2.4474f, 13.1484f, 2.2969f)
                    curveTo(12.7842f, 2.1464f, 12.3939f, 2.0694f, 11.9999f, 2.0701f)
                    close()
                }
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
