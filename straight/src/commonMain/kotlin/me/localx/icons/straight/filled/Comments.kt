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

public val Icons.Filled.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0f)
                    curveTo(0.0f, 7.22f, 0.5278f, 5.4799f, 1.5168f, 3.9999f)
                    curveTo(2.5057f, 2.5198f, 3.9113f, 1.3663f, 5.5559f, 0.6851f)
                    curveTo(7.2004f, 0.0039f, 9.01f, -0.1743f, 10.7558f, 0.1729f)
                    curveTo(12.5016f, 0.5202f, 14.1053f, 1.3774f, 15.364f, 2.636f)
                    curveTo(16.6226f, 3.8947f, 17.4798f, 5.4984f, 17.8271f, 7.2442f)
                    curveTo(18.1743f, 8.99f, 17.9961f, 10.7996f, 17.3149f, 12.4442f)
                    curveTo(16.6337f, 14.0887f, 15.4802f, 15.4943f, 14.0001f, 16.4832f)
                    curveTo(12.5201f, 17.4722f, 10.78f, 18.0f, 9.0f, 18.0f)
                    close()
                    moveTo(20.0f, 9.08f)
                    curveTo(19.977f, 11.9691f, 18.8191f, 14.7333f, 16.7762f, 16.7762f)
                    curveTo(14.7332f, 18.8191f, 11.9691f, 19.977f, 9.08f, 20.0f)
                    curveTo(9.7815f, 21.215f, 10.7901f, 22.2241f, 12.0047f, 22.9262f)
                    curveTo(13.2192f, 23.6282f, 14.5971f, 23.9986f, 16.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(16.0f)
                    curveTo(23.9986f, 14.5971f, 23.6282f, 13.2192f, 22.9262f, 12.0047f)
                    curveTo(22.2241f, 10.7901f, 21.215f, 9.7815f, 20.0f, 9.08f)
                    close()
                }
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
