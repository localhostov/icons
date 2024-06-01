package me.localx.icons.rounded.filled

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

public val Icons.Filled.AngleLeft: ImageVector
    get() {
        if (_angleLeft != null) {
            return _angleLeft!!
        }
        _angleLeft = Builder(name = "AngleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9209f, 1.505f)
                curveTo(17.9206f, 1.9026f, 17.7623f, 2.2839f, 17.4809f, 2.5649f)
                lineTo(9.809f, 10.237f)
                curveTo(9.5767f, 10.4691f, 9.3925f, 10.7447f, 9.2668f, 11.0481f)
                curveTo(9.1412f, 11.3515f, 9.0765f, 11.6766f, 9.0765f, 12.005f)
                curveTo(9.0765f, 12.3333f, 9.1412f, 12.6585f, 9.2668f, 12.9618f)
                curveTo(9.3925f, 13.2652f, 9.5767f, 13.5408f, 9.809f, 13.773f)
                lineTo(17.4709f, 21.435f)
                curveTo(17.7442f, 21.7179f, 17.8954f, 22.0968f, 17.892f, 22.4901f)
                curveTo(17.8885f, 22.8834f, 17.7308f, 23.2596f, 17.4527f, 23.5377f)
                curveTo(17.1746f, 23.8158f, 16.7983f, 23.9735f, 16.405f, 23.977f)
                curveTo(16.0118f, 23.9804f, 15.6329f, 23.8292f, 15.3499f, 23.556f)
                lineTo(7.688f, 15.9f)
                curveTo(6.6577f, 14.8677f, 6.0791f, 13.4689f, 6.0791f, 12.0105f)
                curveTo(6.0791f, 10.552f, 6.6577f, 9.1532f, 7.688f, 8.1209f)
                lineTo(15.3599f, 0.444f)
                curveTo(15.5697f, 0.234f, 15.8371f, 0.0911f, 16.1281f, 0.0331f)
                curveTo(16.4192f, -0.0248f, 16.7209f, 0.0049f, 16.9951f, 0.1185f)
                curveTo(17.2692f, 0.2321f, 17.5036f, 0.4244f, 17.6684f, 0.6712f)
                curveTo(17.8332f, 0.918f, 17.9211f, 1.2082f, 17.9209f, 1.505f)
                close()
            }
        }
        .build()
        return _angleLeft!!
    }

private var _angleLeft: ImageVector? = null
