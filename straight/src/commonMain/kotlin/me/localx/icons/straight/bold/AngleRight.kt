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

public val Icons.Bold.AngleRight: ImageVector
    get() {
        if (_angleRight != null) {
            return _angleRight!!
        }
        _angleRight = Builder(name = "AngleRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.127f, 24.0f)
                    lineTo(17.634f, 14.48f)
                    curveTo(18.2881f, 13.8228f, 18.6554f, 12.9333f, 18.6554f, 12.006f)
                    curveTo(18.6554f, 11.0787f, 18.2881f, 10.1892f, 17.634f, 9.532f)
                    lineTo(8.116f, 0.0f)
                    lineTo(6.0f, 2.121f)
                    lineTo(15.518f, 11.652f)
                    curveTo(15.6117f, 11.7458f, 15.6644f, 11.8729f, 15.6644f, 12.0055f)
                    curveTo(15.6644f, 12.1381f, 15.6117f, 12.2652f, 15.518f, 12.359f)
                    lineTo(6.01f, 21.879f)
                    lineTo(8.127f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _angleRight!!
    }

private var _angleRight: ImageVector? = null
