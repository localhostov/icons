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

public val Icons.Bold.MugAlt: ImageVector
    get() {
        if (_mugAlt != null) {
            return _mugAlt!!
        }
        _mugAlt = Builder(name = "MugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 20.9999f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9999f)
                    close()
                    moveTo(24.0f, 8.4999f)
                    curveTo(24.0f, 11.5059f, 21.6f, 14.9999f, 18.5f, 14.9999f)
                    horizontalLineTo(17.206f)
                    lineTo(16.393f, 18.9999f)
                    horizontalLineTo(3.107f)
                    lineTo(0.075f, 4.0999f)
                    curveTo(-0.031f, 3.6057f, -0.0252f, 3.0939f, 0.0922f, 2.6022f)
                    curveTo(0.2095f, 2.1105f, 0.4354f, 1.6513f, 0.7532f, 1.2582f)
                    curveTo(1.0711f, 0.8651f, 1.4728f, 0.548f, 1.9291f, 0.3303f)
                    curveTo(2.3853f, 0.1126f, 2.8845f, -3.0E-4f, 3.39f, -1.0E-4f)
                    horizontalLineTo(16.11f)
                    curveTo(16.6119f, -8.0E-4f, 17.1076f, 0.1102f, 17.5612f, 0.325f)
                    curveTo(18.0148f, 0.5397f, 18.4148f, 0.8529f, 18.7323f, 1.2415f)
                    curveTo(19.0497f, 1.6302f, 19.2766f, 2.0848f, 19.3964f, 2.5721f)
                    curveTo(19.5162f, 3.0594f, 19.526f, 3.5674f, 19.425f, 4.0589f)
                    curveTo(22.3f, 4.3419f, 24.0f, 5.9489f, 24.0f, 8.4999f)
                    close()
                    moveTo(16.484f, 3.4999f)
                    curveTo(16.525f, 3.1819f, 16.41f, 3.0369f, 16.11f, 2.9999f)
                    horizontalLineTo(3.39f)
                    curveTo(3.3317f, 2.9999f, 3.2741f, 3.0129f, 3.2215f, 3.0382f)
                    curveTo(3.1689f, 3.0634f, 3.1226f, 3.1001f, 3.0861f, 3.1456f)
                    curveTo(3.0496f, 3.1911f, 3.0238f, 3.2443f, 3.0107f, 3.3011f)
                    curveTo(2.9975f, 3.3579f, 2.9973f, 3.417f, 3.01f, 3.4739f)
                    lineTo(5.559f, 15.9999f)
                    horizontalLineTo(13.941f)
                    lineTo(16.484f, 3.4999f)
                    close()
                    moveTo(21.0f, 8.4999f)
                    curveTo(21.0f, 8.0719f, 21.0f, 7.0999f, 18.832f, 7.0089f)
                    lineTo(17.817f, 11.9999f)
                    horizontalLineTo(18.5f)
                    curveTo(19.645f, 11.9999f, 21.0f, 10.0999f, 21.0f, 8.4999f)
                    close()
                }
            }
        }
        .build()
        return _mugAlt!!
    }

private var _mugAlt: ImageVector? = null
