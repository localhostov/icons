package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

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
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 12.2652f, 23.8946f, 12.5196f, 23.7071f, 12.7071f)
                    curveTo(23.5196f, 12.8946f, 23.2652f, 13.0f, 23.0f, 13.0f)
                    horizontalLineTo(17.0f)
                    curveTo(16.7348f, 13.0f, 16.4804f, 12.8946f, 16.2929f, 12.7071f)
                    curveTo(16.1054f, 12.5196f, 16.0f, 12.2652f, 16.0f, 12.0f)
                    curveTo(16.0f, 11.7348f, 16.1054f, 11.4804f, 16.2929f, 11.2929f)
                    curveTo(16.4804f, 11.1054f, 16.7348f, 11.0f, 17.0f, 11.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 11.0f, 23.5196f, 11.1054f, 23.7071f, 11.2929f)
                    curveTo(23.8946f, 11.4804f, 24.0f, 11.7348f, 24.0f, 12.0f)
                    close()
                    moveTo(9.0f, 12.0f)
                    curveTo(10.1867f, 12.0f, 11.3467f, 11.6481f, 12.3334f, 10.9888f)
                    curveTo(13.3201f, 10.3295f, 14.0892f, 9.3925f, 14.5433f, 8.2961f)
                    curveTo(14.9974f, 7.1997f, 15.1162f, 5.9934f, 14.8847f, 4.8295f)
                    curveTo(14.6532f, 3.6656f, 14.0818f, 2.5965f, 13.2426f, 1.7574f)
                    curveTo(12.4035f, 0.9182f, 11.3344f, 0.3468f, 10.1705f, 0.1153f)
                    curveTo(9.0067f, -0.1162f, 7.8003f, 0.0026f, 6.7039f, 0.4567f)
                    curveTo(5.6075f, 0.9109f, 4.6705f, 1.6799f, 4.0112f, 2.6666f)
                    curveTo(3.3519f, 3.6533f, 3.0f, 4.8133f, 3.0f, 6.0f)
                    curveTo(3.0016f, 7.5908f, 3.6342f, 9.116f, 4.7591f, 10.2409f)
                    curveTo(5.884f, 11.3658f, 7.4092f, 11.9984f, 9.0f, 12.0f)
                    close()
                    moveTo(9.0f, 14.0f)
                    curveTo(6.6139f, 14.0027f, 4.3262f, 14.9517f, 2.639f, 16.639f)
                    curveTo(0.9517f, 18.3262f, 0.0026f, 20.6139f, 0.0f, 23.0f)
                    curveTo(0.0f, 23.2652f, 0.1054f, 23.5196f, 0.2929f, 23.7071f)
                    curveTo(0.4804f, 23.8946f, 0.7348f, 24.0f, 1.0f, 24.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 24.0f, 17.5196f, 23.8946f, 17.7071f, 23.7071f)
                    curveTo(17.8946f, 23.5196f, 18.0f, 23.2652f, 18.0f, 23.0f)
                    curveTo(17.9974f, 20.6139f, 17.0483f, 18.3262f, 15.361f, 16.639f)
                    curveTo(13.6738f, 14.9517f, 11.3861f, 14.0027f, 9.0f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _userDelete!!
    }

private var _userDelete: ImageVector? = null
