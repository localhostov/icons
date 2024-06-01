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

public val Icons.Filled.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.427f, 9.841f)
                    lineTo(8.307f, 11.665f)
                    lineTo(12.355f, 15.712f)
                    lineTo(14.176f, 13.59f)
                    lineTo(10.427f, 9.841f)
                    close()
                    moveTo(15.482f, 12.068f)
                    lineTo(23.942f, 2.211f)
                    lineTo(21.789f, 0.058f)
                    lineTo(11.946f, 8.532f)
                    lineTo(15.482f, 12.068f)
                    close()
                    moveTo(8.046f, 24.0f)
                    horizontalLineTo(6.4f)
                    curveTo(4.7032f, 23.9981f, 3.0764f, 23.3233f, 1.8766f, 22.1234f)
                    curveTo(0.6767f, 20.9236f, 0.0019f, 19.2968f, 0.0f, 17.6f)
                    lineTo(0.0f, 15.968f)
                    lineTo(6.615f, 12.615f)
                    lineTo(11.346f, 17.346f)
                    lineTo(8.046f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
