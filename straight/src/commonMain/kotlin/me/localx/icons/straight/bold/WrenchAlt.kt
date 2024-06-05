package me.localx.icons.straight.bold

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

public val Icons.Bold.WrenchAlt: ImageVector
    get() {
        if (_wrenchAlt != null) {
            return _wrenchAlt!!
        }
        _wrenchAlt = Builder(name = "WrenchAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.257f, 5.035f)
                lineToRelative(-0.89f, -1.988f)
                lineToRelative(-4.661f, 4.66f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(4.661f, -4.662f)
                lineToRelative(-1.99f, -0.889f)
                curveToRelative(-1.102f, -0.492f, -2.267f, -0.742f, -3.464f, -0.742f)
                curveTo(10.813f, 0.0f, 7.0f, 3.813f, 7.0f, 8.5f)
                curveToRelative(0.0f, 0.844f, 0.124f, 1.672f, 0.37f, 2.474f)
                lineToRelative(-6.198f, 6.198f)
                curveToRelative(-0.756f, 0.756f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.072f, 1.171f, 2.828f)
                reflectiveCurveToRelative(1.76f, 1.172f, 2.829f, 1.172f)
                reflectiveCurveToRelative(2.073f, -0.416f, 2.828f, -1.172f)
                lineToRelative(6.199f, -6.197f)
                curveToRelative(0.801f, 0.245f, 1.629f, 0.369f, 2.473f, 0.369f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -1.198f, -0.25f, -2.363f, -0.743f, -3.465f)
                close()
                moveTo(15.5f, 14.0f)
                curveToRelative(-0.772f, 0.0f, -1.526f, -0.162f, -2.241f, -0.48f)
                lineToRelative(-0.942f, -0.422f)
                lineToRelative(-7.61f, 7.609f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(7.61f, -7.61f)
                lineToRelative(-0.422f, -0.942f)
                curveToRelative(-0.319f, -0.714f, -0.481f, -1.468f, -0.481f, -2.24f)
                curveToRelative(0.0f, -2.979f, 2.381f, -5.413f, 5.341f, -5.498f)
                lineToRelative(-1.169f, 1.17f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.097f, 0.0f, 5.656f)
                curveToRelative(1.511f, 1.512f, 4.146f, 1.512f, 5.657f, 0.0f)
                lineToRelative(1.169f, -1.169f)
                curveToRelative(-0.084f, 2.959f, -2.518f, 5.341f, -5.498f, 5.341f)
                close()
            }
        }
        .build()
        return _wrenchAlt!!
    }

private var _wrenchAlt: ImageVector? = null
