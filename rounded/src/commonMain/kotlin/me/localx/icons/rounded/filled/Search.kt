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

public val Icons.Filled.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0065f, 20.0093f)
                    curveTo(12.3144f, 20.0123f, 14.5517f, 19.2138f, 16.3362f, 17.7503f)
                    lineTo(22.3047f, 23.7178f)
                    curveTo(22.7021f, 24.1016f, 23.3354f, 24.0906f, 23.7193f, 23.6932f)
                    curveTo(24.0937f, 23.3055f, 24.0937f, 22.6909f, 23.7193f, 22.3032f)
                    lineTo(17.7518f, 16.3347f)
                    curveTo(21.2475f, 12.0561f, 20.6129f, 5.7536f, 16.3342f, 2.2579f)
                    curveTo(12.0555f, -1.2379f, 5.7531f, -0.6032f, 2.2573f, 3.6755f)
                    curveTo(-1.2384f, 7.9541f, -0.6038f, 14.2565f, 3.6749f, 17.7523f)
                    curveTo(5.462f, 19.2124f, 7.6988f, 20.0097f, 10.0065f, 20.0093f)
                    close()
                }
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
