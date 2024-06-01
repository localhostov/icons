package me.localx.icons.straight.filled

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

public val Icons.Filled.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.2442f, 7.8299f)
                    curveTo(10.0615f, 7.2886f, 11.02f, 6.9999f, 12.0002f, 6.9999f)
                    curveTo(12.9805f, 6.9999f, 13.939f, 7.2886f, 14.7562f, 7.8299f)
                    lineTo(19.7442f, 2.8419f)
                    curveTo(17.5811f, 1.0071f, 14.8367f, 0.0f, 12.0002f, 0.0f)
                    curveTo(9.1637f, 0.0f, 6.4194f, 1.0071f, 4.2562f, 2.8419f)
                    lineTo(9.2442f, 7.8299f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.158f, 4.2557f)
                    lineTo(16.17f, 9.2437f)
                    curveTo(16.7113f, 10.061f, 17.0f, 11.0195f, 17.0f, 11.9997f)
                    curveTo(17.0f, 12.98f, 16.7113f, 13.9385f, 16.17f, 14.7557f)
                    lineTo(21.158f, 19.7437f)
                    curveTo(22.9928f, 17.5806f, 23.9999f, 14.8362f, 23.9999f, 11.9997f)
                    curveTo(23.9999f, 9.1632f, 22.9928f, 6.4189f, 21.158f, 4.2557f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.7562f, 16.17f)
                    curveTo(13.939f, 16.7113f, 12.9805f, 17.0f, 12.0002f, 17.0f)
                    curveTo(11.02f, 17.0f, 10.0615f, 16.7113f, 9.2442f, 16.17f)
                    lineTo(4.2562f, 21.158f)
                    curveTo(6.4194f, 22.9928f, 9.1637f, 23.9999f, 12.0002f, 23.9999f)
                    curveTo(14.8367f, 23.9999f, 17.5811f, 22.9928f, 19.7442f, 21.158f)
                    lineTo(14.7562f, 16.17f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.8298f, 14.7557f)
                    curveTo(7.2885f, 13.9385f, 6.9999f, 12.98f, 6.9999f, 11.9997f)
                    curveTo(6.9999f, 11.0195f, 7.2885f, 10.061f, 7.8298f, 9.2437f)
                    lineTo(2.8418f, 4.2557f)
                    curveTo(1.0071f, 6.4189f, -1.0E-4f, 9.1632f, -1.0E-4f, 11.9997f)
                    curveTo(-1.0E-4f, 14.8362f, 1.0071f, 17.5806f, 2.8418f, 19.7437f)
                    lineTo(7.8298f, 14.7557f)
                    close()
                }
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
