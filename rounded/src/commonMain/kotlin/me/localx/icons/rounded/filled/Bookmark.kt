package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.849f, 23.55f)
                    curveTo(3.3951f, 23.7834f, 3.9988f, 23.8467f, 4.5814f, 23.7319f)
                    curveTo(5.164f, 23.617f, 5.6984f, 23.3292f, 6.115f, 22.906f)
                    lineTo(12.0f, 17.053f)
                    lineTo(17.885f, 22.906f)
                    curveTo(18.1594f, 23.1844f, 18.4863f, 23.4056f, 18.8468f, 23.5568f)
                    curveTo(19.2072f, 23.7081f, 19.5941f, 23.7863f, 19.985f, 23.787f)
                    curveTo(20.3868f, 23.7858f, 20.7844f, 23.7053f, 21.155f, 23.55f)
                    curveTo(21.7055f, 23.3272f, 22.1761f, 22.9436f, 22.5052f, 22.4493f)
                    curveTo(22.8344f, 21.9549f, 23.0068f, 21.3728f, 23.0f, 20.779f)
                    verticalLineTo(5.0f)
                    curveTo(22.9984f, 3.6744f, 22.4711f, 2.4036f, 21.5338f, 1.4662f)
                    curveTo(20.5965f, 0.5289f, 19.3256f, 0.0016f, 18.0f, 0.0f)
                    lineTo(6.0f, 0.0f)
                    curveTo(4.6744f, 0.0016f, 3.4036f, 0.5289f, 2.4662f, 1.4662f)
                    curveTo(1.5289f, 2.4036f, 1.0016f, 3.6744f, 1.0f, 5.0f)
                    verticalLineTo(20.779f)
                    curveTo(0.9936f, 21.3733f, 1.1666f, 21.9557f, 1.4965f, 22.4501f)
                    curveTo(1.8264f, 22.9445f, 2.2978f, 23.3278f, 2.849f, 23.55f)
                    close()
                }
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
