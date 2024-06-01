package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.463f, 7.7128f)
                lineTo(11.363f, 1.0358f)
                curveTo(10.5707f, 0.4543f, 9.6327f, 0.1037f, 8.6532f, 0.0231f)
                curveTo(7.6737f, -0.0575f, 6.691f, 0.1349f, 5.8143f, 0.579f)
                curveTo(4.9376f, 1.0231f, 4.2011f, 1.7016f, 3.6866f, 2.539f)
                curveTo(3.1721f, 3.3764f, 2.8999f, 4.34f, 2.9f, 5.3228f)
                verticalLineTo(18.6768f)
                curveTo(2.8981f, 19.66f, 3.1691f, 20.6244f, 3.683f, 21.4627f)
                curveTo(4.1968f, 22.3009f, 4.9333f, 22.9801f, 5.8103f, 23.4245f)
                curveTo(6.6873f, 23.869f, 7.6705f, 24.0612f, 8.6504f, 23.9799f)
                curveTo(9.6302f, 23.8985f, 10.5682f, 23.5468f, 11.36f, 22.9638f)
                lineTo(20.465f, 16.2868f)
                curveTo(21.1385f, 15.7932f, 21.6863f, 15.1478f, 22.0638f, 14.403f)
                curveTo(22.4414f, 13.6582f, 22.6382f, 12.8349f, 22.6382f, 11.9998f)
                curveTo(22.6382f, 11.1647f, 22.4414f, 10.3414f, 22.0638f, 9.5966f)
                curveTo(21.6863f, 8.8518f, 21.1385f, 8.2064f, 20.465f, 7.7128f)
                horizontalLineTo(20.463f)
                close()
                moveTo(18.689f, 13.8678f)
                lineTo(9.589f, 20.5448f)
                curveTo(9.2437f, 20.7985f, 8.8349f, 20.9515f, 8.4079f, 20.9868f)
                curveTo(7.9809f, 21.0221f, 7.5525f, 20.9383f, 7.1703f, 20.7448f)
                curveTo(6.788f, 20.5512f, 6.4669f, 20.2555f, 6.2427f, 19.8904f)
                curveTo(6.0184f, 19.5253f, 5.8998f, 19.1052f, 5.9f, 18.6768f)
                verticalLineTo(5.3228f)
                curveTo(5.8954f, 4.8937f, 6.0122f, 4.4721f, 6.2369f, 4.1066f)
                curveTo(6.4616f, 3.741f, 6.7851f, 3.4464f, 7.17f, 3.2568f)
                curveTo(7.4959f, 3.0895f, 7.8566f, 3.0014f, 8.223f, 2.9998f)
                curveTo(8.7139f, 3.0022f, 9.1912f, 3.1617f, 9.585f, 3.4548f)
                lineTo(18.685f, 10.1318f)
                curveTo(18.9784f, 10.3469f, 19.2171f, 10.6281f, 19.3816f, 10.9527f)
                curveTo(19.5461f, 11.2772f, 19.6319f, 11.6359f, 19.6319f, 11.9998f)
                curveTo(19.6319f, 12.3637f, 19.5461f, 12.7224f, 19.3816f, 13.0469f)
                curveTo(19.2171f, 13.3715f, 18.9784f, 13.6527f, 18.685f, 13.8678f)
                horizontalLineTo(18.689f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
