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

public val Icons.Filled.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.1569f, 23.8429f)
                    curveTo(7.9679f, 23.5039f, 5.9155f, 22.5652f, 4.2275f, 21.1309f)
                    curveTo(2.5394f, 19.6967f, 1.2816f, 17.8229f, 0.5934f, 15.7174f)
                    curveTo(-0.0947f, 13.6119f, -0.1862f, 11.357f, 0.3291f, 9.2027f)
                    curveTo(0.8443f, 7.0483f, 1.9462f, 5.0788f, 3.5125f, 3.5125f)
                    curveTo(5.0788f, 1.9462f, 7.0483f, 0.8443f, 9.2027f, 0.3291f)
                    curveTo(11.357f, -0.1862f, 13.6119f, -0.0947f, 15.7174f, 0.5934f)
                    curveTo(17.8229f, 1.2816f, 19.6967f, 2.5394f, 21.1309f, 4.2275f)
                    curveTo(22.5652f, 5.9155f, 23.5039f, 7.9679f, 23.8429f, 10.1569f)
                    curveTo(21.9765f, 9.8506f, 20.064f, 9.9931f, 18.2635f, 10.5725f)
                    curveTo(16.4631f, 11.152f, 14.8265f, 12.1518f, 13.4891f, 13.4891f)
                    curveTo(12.1518f, 14.8265f, 11.152f, 16.4631f, 10.5725f, 18.2635f)
                    curveTo(9.9931f, 20.064f, 9.8506f, 21.9765f, 10.1569f, 23.8429f)
                    close()
                    moveTo(23.9999f, 12.1999f)
                    curveTo(22.3799f, 11.8687f, 20.7032f, 11.9445f, 19.1197f, 12.4203f)
                    curveTo(17.5362f, 12.8961f, 16.0954f, 13.7571f, 14.9262f, 14.9262f)
                    curveTo(13.7571f, 16.0954f, 12.8961f, 17.5362f, 12.4203f, 19.1197f)
                    curveTo(11.9445f, 20.7032f, 11.8687f, 22.3799f, 12.1999f, 23.9999f)
                    lineTo(23.9999f, 12.1999f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
