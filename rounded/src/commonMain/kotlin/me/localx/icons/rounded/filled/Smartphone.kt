package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0001f, 0.0f)
                    horizontalLineTo(9.0001f)
                    curveTo(7.6745f, 0.0016f, 6.4037f, 0.5289f, 5.4663f, 1.4662f)
                    curveTo(4.529f, 2.4036f, 4.0017f, 3.6744f, 4.0001f, 5.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(5.0f)
                    curveTo(19.9985f, 3.6744f, 19.4712f, 2.4036f, 18.5339f, 1.4662f)
                    curveTo(17.5966f, 0.5289f, 16.3257f, 0.0016f, 15.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0001f, 19.0f)
                    curveTo(4.0017f, 20.3256f, 4.529f, 21.5964f, 5.4663f, 22.5338f)
                    curveTo(6.4037f, 23.4711f, 7.6745f, 23.9984f, 9.0001f, 24.0f)
                    horizontalLineTo(15.0001f)
                    curveTo(16.3257f, 23.9984f, 17.5966f, 23.4711f, 18.5339f, 22.5338f)
                    curveTo(19.4712f, 21.5964f, 19.9985f, 20.3256f, 20.0001f, 19.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(12.0001f, 20.0f)
                    curveTo(12.1979f, 20.0f, 12.3912f, 20.0586f, 12.5557f, 20.1685f)
                    curveTo(12.7201f, 20.2784f, 12.8483f, 20.4346f, 12.924f, 20.6173f)
                    curveTo(12.9997f, 20.8f, 13.0195f, 21.0011f, 12.9809f, 21.1951f)
                    curveTo(12.9423f, 21.3891f, 12.8471f, 21.5673f, 12.7072f, 21.7071f)
                    curveTo(12.5674f, 21.847f, 12.3892f, 21.9422f, 12.1952f, 21.9808f)
                    curveTo(12.0012f, 22.0194f, 11.8002f, 21.9996f, 11.6174f, 21.9239f)
                    curveTo(11.4347f, 21.8482f, 11.2785f, 21.72f, 11.1687f, 21.5556f)
                    curveTo(11.0588f, 21.3911f, 11.0001f, 21.1978f, 11.0001f, 21.0f)
                    curveTo(11.0001f, 20.7348f, 11.1055f, 20.4804f, 11.293f, 20.2929f)
                    curveTo(11.4806f, 20.1054f, 11.7349f, 20.0f, 12.0001f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
