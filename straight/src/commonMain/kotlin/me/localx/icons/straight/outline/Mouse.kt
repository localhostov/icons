package me.localx.icons.straight.outline

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

public val Icons.Outline.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4998f, 3.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.4999f)
                    curveTo(7.3068f, 3.0013f, 6.163f, 3.4759f, 5.3193f, 4.3195f)
                    curveTo(4.4757f, 5.1631f, 4.0012f, 6.3069f, 3.9999f, 7.5f)
                    verticalLineTo(16.0f)
                    curveTo(3.9999f, 18.1217f, 4.8427f, 20.1566f, 6.343f, 21.6569f)
                    curveTo(7.8433f, 23.1571f, 9.8781f, 24.0f, 11.9998f, 24.0f)
                    curveTo(14.1216f, 24.0f, 16.1564f, 23.1571f, 17.6567f, 21.6569f)
                    curveTo(19.157f, 20.1566f, 19.9998f, 18.1217f, 19.9998f, 16.0f)
                    verticalLineTo(7.5f)
                    curveTo(19.9985f, 6.3069f, 19.524f, 5.1631f, 18.6804f, 4.3195f)
                    curveTo(17.8367f, 3.4759f, 16.6929f, 3.0013f, 15.4998f, 3.0f)
                    close()
                    moveTo(17.9998f, 16.0f)
                    curveTo(17.9998f, 17.5913f, 17.3677f, 19.1174f, 16.2425f, 20.2426f)
                    curveTo(15.1173f, 21.3679f, 13.5911f, 22.0f, 11.9998f, 22.0f)
                    curveTo(10.4085f, 22.0f, 8.8824f, 21.3679f, 7.7572f, 20.2426f)
                    curveTo(6.632f, 19.1174f, 5.9998f, 17.5913f, 5.9998f, 16.0f)
                    verticalLineTo(7.5f)
                    curveTo(5.9998f, 6.837f, 6.2632f, 6.2011f, 6.7321f, 5.7322f)
                    curveTo(7.2009f, 5.2634f, 7.8368f, 5.0f, 8.4999f, 5.0f)
                    horizontalLineTo(15.4998f)
                    curveTo(16.1629f, 5.0f, 16.7988f, 5.2634f, 17.2676f, 5.7322f)
                    curveTo(17.7365f, 6.2011f, 17.9998f, 6.837f, 17.9998f, 7.5f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9997f, 7.0003f)
                    horizontalLineTo(10.9997f)
                    verticalLineTo(11.0003f)
                    horizontalLineTo(12.9997f)
                    verticalLineTo(7.0003f)
                    close()
                }
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
