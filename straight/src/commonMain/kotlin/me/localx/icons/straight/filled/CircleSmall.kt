package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = Builder(name = "CircleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 19.0001f)
                curveTo(10.6156f, 19.0001f, 9.2622f, 18.5896f, 8.1111f, 17.8204f)
                curveTo(6.9599f, 17.0512f, 6.0627f, 15.958f, 5.5329f, 14.6789f)
                curveTo(5.0031f, 13.3998f, 4.8645f, 11.9924f, 5.1346f, 10.6345f)
                curveTo(5.4047f, 9.2766f, 6.0714f, 8.0294f, 7.0503f, 7.0504f)
                curveTo(8.0293f, 6.0714f, 9.2766f, 5.4047f, 10.6344f, 5.1346f)
                curveTo(11.9923f, 4.8645f, 13.3998f, 5.0032f, 14.6789f, 5.533f)
                curveTo(15.9579f, 6.0628f, 17.0512f, 6.96f, 17.8204f, 8.1111f)
                curveTo(18.5895f, 9.2623f, 19.0001f, 10.6157f, 19.0001f, 12.0001f)
                curveTo(18.998f, 13.856f, 18.2598f, 15.6352f, 16.9475f, 16.9475f)
                curveTo(15.6352f, 18.2598f, 13.8559f, 18.998f, 12.0001f, 19.0001f)
                close()
            }
        }
        .build()
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
