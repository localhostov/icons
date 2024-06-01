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

public val Icons.Bold.CommentInfo: ImageVector
    get() {
        if (_commentInfo != null) {
            return _commentInfo!!
        }
        _commentInfo = Builder(name = "CommentInfo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 7.25f)
                    curveTo(14.0f, 7.5961f, 13.8974f, 7.9345f, 13.7051f, 8.2222f)
                    curveTo(13.5128f, 8.51f, 13.2395f, 8.7343f, 12.9197f, 8.8668f)
                    curveTo(12.5999f, 8.9993f, 12.2481f, 9.0339f, 11.9086f, 8.9664f)
                    curveTo(11.5691f, 8.8989f, 11.2573f, 8.7322f, 11.0126f, 8.4874f)
                    curveTo(10.7678f, 8.2427f, 10.6012f, 7.9309f, 10.5336f, 7.5914f)
                    curveTo(10.4661f, 7.2519f, 10.5008f, 6.9001f, 10.6332f, 6.5803f)
                    curveTo(10.7657f, 6.2605f, 10.99f, 5.9872f, 11.2778f, 5.7949f)
                    curveTo(11.5655f, 5.6026f, 11.9039f, 5.5f, 12.25f, 5.5f)
                    curveTo(12.7141f, 5.5003f, 13.159f, 5.6847f, 13.4872f, 6.0129f)
                    curveTo(13.8153f, 6.341f, 13.9997f, 6.786f, 14.0f, 7.25f)
                    close()
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 9.6266f, 23.2962f, 7.3066f, 21.9776f, 5.3332f)
                    curveTo(20.6591f, 3.3598f, 18.7849f, 1.8217f, 16.5922f, 0.9135f)
                    curveTo(14.3995f, 0.0052f, 11.9867f, -0.2324f, 9.6589f, 0.2306f)
                    curveTo(7.3312f, 0.6936f, 5.1929f, 1.8365f, 3.5147f, 3.5147f)
                    curveTo(1.8365f, 5.1929f, 0.6936f, 7.3312f, 0.2306f, 9.6589f)
                    curveTo(-0.2324f, 11.9867f, 0.0052f, 14.3995f, 0.9135f, 16.5922f)
                    curveTo(1.8217f, 18.7849f, 3.3598f, 20.6591f, 5.3332f, 21.9776f)
                    curveTo(7.3066f, 23.2962f, 9.6266f, 24.0f, 12.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(21.0f, 12.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(12.0f)
                    curveTo(10.22f, 21.0f, 8.4799f, 20.4722f, 6.9999f, 19.4832f)
                    curveTo(5.5198f, 18.4943f, 4.3663f, 17.0887f, 3.6851f, 15.4442f)
                    curveTo(3.0039f, 13.7996f, 2.8257f, 11.99f, 3.1729f, 10.2442f)
                    curveTo(3.5202f, 8.4984f, 4.3774f, 6.8947f, 5.636f, 5.636f)
                    curveTo(6.8947f, 4.3774f, 8.4984f, 3.5202f, 10.2442f, 3.1729f)
                    curveTo(11.99f, 2.8257f, 13.7996f, 3.0039f, 15.4442f, 3.6851f)
                    curveTo(17.0887f, 4.3663f, 18.4943f, 5.5198f, 19.4832f, 6.9999f)
                    curveTo(20.4722f, 8.4799f, 21.0f, 10.22f, 21.0f, 12.0f)
                    close()
                    moveTo(14.0f, 12.5f)
                    curveTo(14.0f, 11.837f, 13.7366f, 11.2011f, 13.2678f, 10.7322f)
                    curveTo(12.7989f, 10.2634f, 12.163f, 10.0f, 11.5f, 10.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(12.5f)
                    close()
                }
            }
        }
        .build()
        return _commentInfo!!
    }

private var _commentInfo: ImageVector? = null
