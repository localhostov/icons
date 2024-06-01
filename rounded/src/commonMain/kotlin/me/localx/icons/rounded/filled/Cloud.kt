package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.792f, 7.212f)
                curveTo(17.3476f, 5.3012f, 16.2167f, 3.6204f, 14.6142f, 2.489f)
                curveTo(13.0116f, 1.3575f, 11.0492f, 0.8543f, 9.1f, 1.075f)
                curveTo(7.1507f, 1.2957f, 5.3505f, 2.2249f, 4.0415f, 3.686f)
                curveTo(2.7325f, 5.1471f, 2.006f, 7.0383f, 2.0f, 9.0f)
                curveTo(1.9992f, 10.2784f, 2.308f, 11.5379f, 2.9f, 12.671f)
                curveTo(1.8211f, 13.2491f, 0.9664f, 14.1712f, 0.4716f, 15.2908f)
                curveTo(-0.0231f, 16.4103f, -0.1296f, 17.6631f, 0.1692f, 18.8501f)
                curveTo(0.468f, 20.0371f, 1.1549f, 21.0902f, 2.1207f, 21.8421f)
                curveTo(3.0866f, 22.594f, 4.276f, 23.0015f, 5.5f, 23.0f)
                horizontalLineTo(16.0f)
                curveTo(17.9591f, 22.9909f, 19.8468f, 22.2632f, 21.3051f, 20.955f)
                curveTo(22.7634f, 19.6468f, 23.6909f, 17.8489f, 23.9119f, 15.9023f)
                curveTo(24.1328f, 13.9557f, 23.6318f, 11.9957f, 22.5038f, 10.3939f)
                curveTo(21.3758f, 8.7921f, 19.6992f, 7.6599f, 17.792f, 7.212f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
