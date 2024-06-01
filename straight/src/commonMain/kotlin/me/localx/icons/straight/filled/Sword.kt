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

public val Icons.Filled.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.4139f, 0.5873f)
                    curveTo(23.1631f, 0.34f, 22.8521f, 0.1625f, 22.5116f, 0.0726f)
                    curveTo(22.1712f, -0.0174f, 21.8131f, -0.0168f, 21.4729f, 0.0743f)
                    lineTo(17.7579f, 1.2923f)
                    lineTo(5.5179f, 13.5323f)
                    curveTo(4.1497f, 12.7949f, 2.6724f, 12.2811f, 1.1419f, 12.0103f)
                    lineTo(0.8559f, 13.9893f)
                    curveTo(2.803f, 14.3543f, 4.637f, 15.172f, 6.2099f, 16.3763f)
                    lineTo(2.4999f, 20.0863f)
                    lineTo(1.4759f, 19.0623f)
                    lineTo(0.0619f, 20.4763f)
                    lineTo(3.5619f, 23.9763f)
                    lineTo(4.9759f, 22.5623f)
                    lineTo(3.9139f, 21.5003f)
                    lineTo(7.6239f, 17.7903f)
                    curveTo(8.8286f, 19.3628f, 9.646f, 21.197f, 10.0099f, 23.1443f)
                    lineTo(11.9899f, 22.8583f)
                    curveTo(11.7201f, 21.3275f, 11.2063f, 19.85f, 10.4679f, 18.4823f)
                    lineTo(22.7079f, 6.2423f)
                    lineTo(23.9529f, 2.4323f)
                    curveTo(24.0258f, 2.1042f, 24.0146f, 1.7631f, 23.9204f, 1.4405f)
                    curveTo(23.8261f, 1.118f, 23.6519f, 0.8245f, 23.4139f, 0.5873f)
                    close()
                }
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
