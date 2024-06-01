package me.localx.icons.straight.filled

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

public val Icons.Filled.UserDelete: ImageVector
    get() {
        if (_userDelete != null) {
            return _userDelete!!
        }
        _userDelete = Builder(name = "UserDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 6.0f)
                    curveTo(3.0f, 4.8133f, 3.3519f, 3.6533f, 4.0112f, 2.6666f)
                    curveTo(4.6705f, 1.6799f, 5.6075f, 0.9109f, 6.7039f, 0.4567f)
                    curveTo(7.8003f, 0.0026f, 9.0067f, -0.1162f, 10.1705f, 0.1153f)
                    curveTo(11.3344f, 0.3468f, 12.4035f, 0.9182f, 13.2426f, 1.7574f)
                    curveTo(14.0818f, 2.5965f, 14.6532f, 3.6656f, 14.8847f, 4.8295f)
                    curveTo(15.1162f, 5.9934f, 14.9974f, 7.1997f, 14.5433f, 8.2961f)
                    curveTo(14.0892f, 9.3925f, 13.3201f, 10.3295f, 12.3334f, 10.9888f)
                    curveTo(11.3467f, 11.6481f, 10.1867f, 12.0f, 9.0f, 12.0f)
                    curveTo(7.4087f, 12.0f, 5.8826f, 11.3679f, 4.7574f, 10.2426f)
                    curveTo(3.6321f, 9.1174f, 3.0f, 7.5913f, 3.0f, 6.0f)
                    close()
                    moveTo(13.043f, 14.0f)
                    horizontalLineTo(4.957f)
                    curveTo(3.6428f, 14.0016f, 2.3829f, 14.5244f, 1.4536f, 15.4536f)
                    curveTo(0.5244f, 16.3829f, 0.0016f, 17.6428f, 0.0f, 18.957f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(18.957f)
                    curveTo(17.9984f, 17.6428f, 17.4756f, 16.3829f, 16.5464f, 15.4536f)
                    curveTo(15.6171f, 14.5244f, 14.3572f, 14.0016f, 13.043f, 14.0f)
                    close()
                    moveTo(16.0f, 10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _userDelete!!
    }

private var _userDelete: ImageVector? = null
