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

public val Icons.Bold.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0002f, 21.8866f)
                    lineTo(18.9201f, 16.8065f)
                    curveTo(22.3965f, 12.1665f, 21.4533f, 5.5868f, 16.8133f, 2.1104f)
                    curveTo(12.1733f, -1.3661f, 5.5936f, -0.4228f, 2.1171f, 4.2172f)
                    curveTo(-1.3593f, 8.8572f, -0.416f, 15.4369f, 4.224f, 18.9133f)
                    curveTo(7.952f, 21.7064f, 13.0747f, 21.7088f, 16.8054f, 18.9192f)
                    lineTo(21.8855f, 23.9994f)
                    lineTo(24.0002f, 21.8866f)
                    close()
                    moveTo(3.082f, 10.5519f)
                    curveTo(3.082f, 6.4259f, 6.4268f, 3.0811f, 10.5528f, 3.0811f)
                    curveTo(14.6788f, 3.0811f, 18.0236f, 6.4259f, 18.0236f, 10.5519f)
                    curveTo(18.0236f, 14.6779f, 14.6788f, 18.0227f, 10.5528f, 18.0227f)
                    curveTo(6.4286f, 18.0184f, 3.0864f, 14.6761f, 3.082f, 10.5519f)
                    close()
                    moveTo(15.0094f, 9.5309f)
                    curveTo(15.0094f, 12.1129f, 10.5269f, 15.2834f, 10.5269f, 15.2834f)
                    curveTo(10.5269f, 15.2834f, 6.0444f, 12.1128f, 6.0444f, 9.5309f)
                    curveTo(5.9858f, 8.2324f, 6.9875f, 7.1306f, 8.2857f, 7.0656f)
                    curveTo(9.5841f, 7.1301f, 10.5861f, 8.2322f, 10.5269f, 9.5309f)
                    curveTo(10.4682f, 8.2324f, 11.4699f, 7.1306f, 12.7681f, 7.0656f)
                    curveTo(14.0666f, 7.13f, 15.0686f, 8.2322f, 15.0094f, 9.5309f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
