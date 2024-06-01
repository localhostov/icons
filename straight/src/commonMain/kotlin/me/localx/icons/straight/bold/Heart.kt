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

public val Icons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 23.4616f)
                    lineTo(11.1339f, 22.8496f)
                    curveTo(9.9939f, 22.0436f, -1.0E-4f, 14.7826f, -1.0E-4f, 8.1496f)
                    curveTo(-0.0647f, 6.2911f, 0.609f, 4.4826f, 1.8738f, 3.1194f)
                    curveTo(3.1387f, 1.7562f, 4.8918f, 0.9491f, 6.7499f, 0.8746f)
                    curveTo(7.7756f, 0.8847f, 8.7846f, 1.1348f, 9.6963f, 1.6049f)
                    curveTo(10.608f, 2.0749f, 11.3969f, 2.7519f, 11.9999f, 3.5816f)
                    curveTo(12.603f, 2.7519f, 13.3919f, 2.0749f, 14.3036f, 1.6049f)
                    curveTo(15.2152f, 1.1348f, 16.2243f, 0.8847f, 17.2499f, 0.8746f)
                    curveTo(19.1081f, 0.9491f, 20.8612f, 1.7562f, 22.126f, 3.1194f)
                    curveTo(23.3909f, 4.4826f, 24.0646f, 6.2911f, 23.9999f, 8.1496f)
                    curveTo(23.9999f, 14.7826f, 14.0059f, 22.0436f, 12.8659f, 22.8496f)
                    lineTo(11.9999f, 23.4616f)
                    close()
                    moveTo(6.7499f, 3.8746f)
                    curveTo(5.6879f, 3.9499f, 4.6984f, 4.441f, 3.9963f, 5.2414f)
                    curveTo(3.2942f, 6.0418f, 2.9362f, 7.0869f, 2.9999f, 8.1496f)
                    curveTo(2.9999f, 12.0656f, 8.8629f, 17.3596f, 11.9999f, 19.7606f)
                    curveTo(15.1369f, 17.3606f, 20.9999f, 12.0656f, 20.9999f, 8.1496f)
                    curveTo(21.0637f, 7.0869f, 20.7056f, 6.0418f, 20.0035f, 5.2414f)
                    curveTo(19.3014f, 4.441f, 18.312f, 3.9499f, 17.2499f, 3.8746f)
                    curveTo(16.1879f, 3.9499f, 15.1984f, 4.441f, 14.4963f, 5.2414f)
                    curveTo(13.7942f, 6.0418f, 13.4362f, 7.0869f, 13.4999f, 8.1496f)
                    horizontalLineTo(10.4999f)
                    curveTo(10.5637f, 7.0869f, 10.2056f, 6.0418f, 9.5035f, 5.2414f)
                    curveTo(8.8014f, 4.441f, 7.812f, 3.9499f, 6.7499f, 3.8746f)
                    close()
                }
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
