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

public val Icons.Bold.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.954f, 10.6629f)
                    curveTo(18.6096f, 9.6037f, 18.9702f, 8.3885f, 18.9982f, 7.1432f)
                    curveTo(19.0263f, 5.8978f, 18.7208f, 4.6676f, 18.1135f, 3.58f)
                    curveTo(17.5062f, 2.4924f, 16.6192f, 1.587f, 15.5443f, 0.9575f)
                    curveTo(14.4693f, 0.328f, 13.2457f, -0.0026f, 12.0f, -1.0E-4f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(15.0f)
                    curveTo(16.5934f, 24.0016f, 18.1397f, 23.4591f, 19.3828f, 22.4623f)
                    curveTo(20.6259f, 21.4655f, 21.4914f, 20.0741f, 21.8359f, 18.5183f)
                    curveTo(22.1805f, 16.9626f, 21.9835f, 15.3359f, 21.2776f, 13.9074f)
                    curveTo(20.5717f, 12.4788f, 19.3991f, 11.3342f, 17.954f, 10.6629f)
                    close()
                    moveTo(7.0f, 3.9999f)
                    horizontalLineTo(12.0f)
                    curveTo(12.7956f, 3.9999f, 13.5587f, 4.316f, 14.1213f, 4.8786f)
                    curveTo(14.6839f, 5.4412f, 15.0f, 6.2042f, 15.0f, 6.9999f)
                    curveTo(15.0f, 7.7955f, 14.6839f, 8.5586f, 14.1213f, 9.1212f)
                    curveTo(13.5587f, 9.6838f, 12.7956f, 9.9999f, 12.0f, 9.9999f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(3.9999f)
                    close()
                    moveTo(15.0f, 19.9999f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(13.9999f)
                    horizontalLineTo(15.0f)
                    curveTo(15.7956f, 13.9999f, 16.5587f, 14.316f, 17.1213f, 14.8786f)
                    curveTo(17.6839f, 15.4412f, 18.0f, 16.2042f, 18.0f, 16.9999f)
                    curveTo(18.0f, 17.7955f, 17.6839f, 18.5586f, 17.1213f, 19.1212f)
                    curveTo(16.5587f, 19.6838f, 15.7956f, 19.9999f, 15.0f, 19.9999f)
                    close()
                }
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
