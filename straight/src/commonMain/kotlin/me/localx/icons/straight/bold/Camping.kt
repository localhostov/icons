package me.localx.icons.straight.bold

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

public val Icons.Bold.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 0.006f)
                    lineTo(0.4964f, 18.9694f)
                    lineTo(0.4874f, 18.9844f)
                    curveTo(-0.4453f, 20.5634f, 0.0787f, 22.5995f, 1.6578f, 23.5322f)
                    curveTo(2.1691f, 23.8342f, 2.752f, 23.9936f, 3.3459f, 23.9937f)
                    horizontalLineTo(20.6545f)
                    curveTo(22.4884f, 23.9933f, 23.9747f, 22.5063f, 23.9744f, 20.6724f)
                    curveTo(23.9742f, 20.0727f, 23.8117f, 19.4842f, 23.504f, 18.9694f)
                    lineTo(12.0002f, 0.006f)
                    close()
                    moveTo(20.9369f, 20.8368f)
                    curveTo(20.8811f, 20.9401f, 20.7719f, 21.0033f, 20.6545f, 21.0004f)
                    horizontalLineTo(16.4127f)
                    lineTo(12.0002f, 13.967f)
                    lineTo(7.5868f, 21.0004f)
                    horizontalLineTo(3.3459f)
                    curveTo(3.1657f, 21.0001f, 3.0198f, 20.8537f, 3.0202f, 20.6734f)
                    curveTo(3.0203f, 20.6173f, 3.0349f, 20.5622f, 3.0625f, 20.5134f)
                    lineTo(12.0002f, 5.7828f)
                    lineTo(20.935f, 20.5124f)
                    curveTo(20.9957f, 20.6118f, 20.9964f, 20.7366f, 20.9369f, 20.8368f)
                    close()
                }
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
