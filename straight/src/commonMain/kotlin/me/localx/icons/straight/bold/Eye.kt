package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.8f, 11.4783f)
                    curveTo(23.67f, 11.1293f, 20.5f, 2.9403f, 12.0f, 2.9403f)
                    curveTo(3.5f, 2.9403f, 0.326f, 11.1293f, 0.2f, 11.4783f)
                    lineTo(0.0f, 12.0003f)
                    lineTo(0.2f, 12.5223f)
                    curveTo(0.33f, 12.8713f, 3.5f, 21.0603f, 12.0f, 21.0603f)
                    curveTo(20.5f, 21.0603f, 23.674f, 12.8713f, 23.8f, 12.5223f)
                    lineTo(24.0f, 12.0003f)
                    lineTo(23.8f, 11.4783f)
                    close()
                    moveTo(12.0f, 18.0853f)
                    curveTo(6.582f, 18.0853f, 3.959f, 13.5713f, 3.21f, 12.0003f)
                    curveTo(3.961f, 10.4253f, 6.585f, 5.9153f, 12.0f, 5.9153f)
                    curveTo(17.415f, 5.9153f, 20.038f, 10.4243f, 20.79f, 12.0003f)
                    curveTo(20.038f, 13.5763f, 17.415f, 18.0853f, 12.0f, 18.0853f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 15.9996f)
                    curveTo(14.2092f, 15.9996f, 16.0001f, 14.2088f, 16.0001f, 11.9996f)
                    curveTo(16.0001f, 9.7905f, 14.2092f, 7.9996f, 12.0001f, 7.9996f)
                    curveTo(9.791f, 7.9996f, 8.0001f, 9.7905f, 8.0001f, 11.9996f)
                    curveTo(8.0001f, 14.2088f, 9.791f, 15.9996f, 12.0001f, 15.9996f)
                    close()
                }
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
