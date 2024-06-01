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

public val Icons.Outline.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3188f, 4.431f)
                    lineTo(8.4999f, 18.249f)
                    curveTo(8.4069f, 18.3423f, 8.2965f, 18.4163f, 8.1749f, 18.4668f)
                    curveTo(8.0534f, 18.5173f, 7.923f, 18.5433f, 7.7913f, 18.5433f)
                    curveTo(7.6597f, 18.5433f, 7.5293f, 18.5173f, 7.4078f, 18.4668f)
                    curveTo(7.2862f, 18.4163f, 7.1758f, 18.3423f, 7.0828f, 18.249f)
                    lineTo(1.7388f, 12.9f)
                    curveTo(1.6459f, 12.8067f, 1.5355f, 12.7327f, 1.4139f, 12.6822f)
                    curveTo(1.2924f, 12.6317f, 1.162f, 12.6057f, 1.0303f, 12.6057f)
                    curveTo(0.8987f, 12.6057f, 0.7683f, 12.6317f, 0.6468f, 12.6822f)
                    curveTo(0.5252f, 12.7327f, 0.4148f, 12.8067f, 0.3218f, 12.9f)
                    curveTo(0.2286f, 12.9929f, 0.1546f, 13.1033f, 0.1041f, 13.2249f)
                    curveTo(0.0536f, 13.3465f, 0.0276f, 13.4769f, 0.0276f, 13.6085f)
                    curveTo(0.0276f, 13.7402f, 0.0536f, 13.8705f, 0.1041f, 13.9921f)
                    curveTo(0.1546f, 14.1137f, 0.2286f, 14.2241f, 0.3218f, 14.317f)
                    lineTo(5.6679f, 19.662f)
                    curveTo(6.2318f, 20.2249f, 6.996f, 20.5411f, 7.7929f, 20.5411f)
                    curveTo(8.5897f, 20.5411f, 9.3539f, 20.2249f, 9.9178f, 19.662f)
                    lineTo(23.7358f, 5.847f)
                    curveTo(23.829f, 5.7541f, 23.9029f, 5.6438f, 23.9533f, 5.5223f)
                    curveTo(24.0037f, 5.4008f, 24.0296f, 5.2705f, 24.0296f, 5.139f)
                    curveTo(24.0296f, 5.0075f, 24.0037f, 4.8772f, 23.9533f, 4.7557f)
                    curveTo(23.9029f, 4.6343f, 23.829f, 4.5239f, 23.7358f, 4.431f)
                    curveTo(23.6429f, 4.3377f, 23.5325f, 4.2637f, 23.4109f, 4.2132f)
                    curveTo(23.2894f, 4.1627f, 23.159f, 4.1367f, 23.0273f, 4.1367f)
                    curveTo(22.8957f, 4.1367f, 22.7653f, 4.1627f, 22.6438f, 4.2132f)
                    curveTo(22.5222f, 4.2637f, 22.4118f, 4.3377f, 22.3188f, 4.431f)
                    close()
                }
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
