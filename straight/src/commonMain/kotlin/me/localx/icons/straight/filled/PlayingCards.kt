package me.localx.icons.straight.filled

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

public val Icons.Filled.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 3.9991f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.9991f, 1.4413f, 4.3152f, 0.8787f, 4.8778f)
                    curveTo(0.3161f, 5.4404f, 0.0f, 6.2035f, 0.0f, 6.9991f)
                    lineTo(0.0f, 23.9991f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(6.9991f)
                    curveTo(16.0f, 6.2035f, 15.6839f, 5.4404f, 15.1213f, 4.8778f)
                    curveTo(14.5587f, 4.3152f, 13.7956f, 3.9991f, 13.0f, 3.9991f)
                    close()
                    moveTo(8.0f, 17.9991f)
                    curveTo(8.0f, 17.9991f, 4.0f, 15.3321f, 4.0f, 12.9991f)
                    curveTo(4.0f, 12.4687f, 4.2107f, 11.96f, 4.5858f, 11.5849f)
                    curveTo(4.9609f, 11.2098f, 5.4696f, 10.9991f, 6.0f, 10.9991f)
                    curveTo(6.5304f, 10.9991f, 7.0391f, 11.2098f, 7.4142f, 11.5849f)
                    curveTo(7.7893f, 11.96f, 8.0f, 12.4687f, 8.0f, 12.9991f)
                    curveTo(8.0f, 12.4687f, 8.2107f, 11.96f, 8.5858f, 11.5849f)
                    curveTo(8.9609f, 11.2098f, 9.4696f, 10.9991f, 10.0f, 10.9991f)
                    curveTo(10.5304f, 10.9991f, 11.0391f, 11.2098f, 11.4142f, 11.5849f)
                    curveTo(11.7893f, 11.96f, 12.0f, 12.4687f, 12.0f, 12.9991f)
                    curveTo(12.0f, 15.3321f, 8.0f, 17.9991f, 8.0f, 17.9991f)
                    close()
                    moveTo(23.88f, 6.6921f)
                    lineTo(19.1f, 23.1061f)
                    lineTo(18.0f, 22.6991f)
                    verticalLineTo(6.9991f)
                    curveTo(17.9984f, 5.6735f, 17.4711f, 4.4027f, 16.5338f, 3.4653f)
                    curveTo(15.5964f, 2.528f, 14.3256f, 2.0007f, 13.0f, 1.9991f)
                    horizontalLineTo(8.757f)
                    curveTo(9.0082f, 1.2759f, 9.5282f, 0.6771f, 10.2092f, 0.3272f)
                    curveTo(10.8902f, -0.0227f, 11.6798f, -0.0968f, 12.414f, 0.1201f)
                    lineTo(21.85f, 2.9761f)
                    curveTo(22.6111f, 3.201f, 23.252f, 3.7184f, 23.6325f, 4.4148f)
                    curveTo(24.013f, 5.1113f, 24.102f, 5.9302f, 23.88f, 6.6921f)
                    close()
                }
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null
