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

public val Icons.Filled.Eye: ImageVector
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
                    moveTo(23.8208f, 11.181f)
                    curveTo(22.9428f, 9.261f, 19.4998f, 3.0f, 11.9998f, 3.0f)
                    curveTo(4.4998f, 3.0f, 1.0568f, 9.261f, 0.1788f, 11.181f)
                    curveTo(0.0609f, 11.4383f, -1.0E-4f, 11.718f, -1.0E-4f, 12.001f)
                    curveTo(-1.0E-4f, 12.284f, 0.0609f, 12.5637f, 0.1788f, 12.821f)
                    curveTo(1.0568f, 14.739f, 4.4998f, 21.0f, 11.9998f, 21.0f)
                    curveTo(19.4998f, 21.0f, 22.9428f, 14.739f, 23.8208f, 12.819f)
                    curveTo(23.9384f, 12.562f, 23.9993f, 12.2827f, 23.9993f, 12.0f)
                    curveTo(23.9993f, 11.7173f, 23.9384f, 11.438f, 23.8208f, 11.181f)
                    close()
                    moveTo(11.9998f, 18.0f)
                    curveTo(10.8131f, 18.0f, 9.6531f, 17.6481f, 8.6664f, 16.9888f)
                    curveTo(7.6797f, 16.3295f, 6.9107f, 15.3925f, 6.4565f, 14.2961f)
                    curveTo(6.0024f, 13.1997f, 5.8836f, 11.9933f, 6.1151f, 10.8295f)
                    curveTo(6.3466f, 9.6656f, 6.9181f, 8.5965f, 7.7572f, 7.7574f)
                    curveTo(8.5963f, 6.9182f, 9.6654f, 6.3468f, 10.8293f, 6.1153f)
                    curveTo(11.9932f, 5.8838f, 13.1996f, 6.0026f, 14.2959f, 6.4567f)
                    curveTo(15.3923f, 6.9109f, 16.3293f, 7.6799f, 16.9886f, 8.6666f)
                    curveTo(17.6479f, 9.6533f, 17.9998f, 10.8133f, 17.9998f, 12.0f)
                    curveTo(17.9982f, 13.5908f, 17.3656f, 15.116f, 16.2407f, 16.2409f)
                    curveTo(15.1158f, 17.3658f, 13.5906f, 17.9984f, 11.9998f, 18.0f)
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
