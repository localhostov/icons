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

public val Icons.Bold.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.622f, 0.209f)
                horizontalLineTo(341.65f)
                verticalLineToRelative(63.803f)
                horizontalLineToRelative(61.229f)
                lineToRelative(-99.362f, 99.362f)
                curveToRelative(-86.388f, -61.475f, -206.255f, -41.28f, -267.731f, 45.108f)
                reflectiveCurveToRelative(-41.28f, 206.255f, 45.108f, 267.731f)
                curveToRelative(86.388f, 61.475f, 206.255f, 41.28f, 267.731f, -45.108f)
                curveToRelative(47.417f, -66.633f, 47.417f, -155.989f, 0.0f, -222.622f)
                lineToRelative(99.362f, -99.362f)
                verticalLineToRelative(61.229f)
                horizontalLineToRelative(63.803f)
                verticalLineTo(53.378f)
                curveTo(511.791f, 24.014f, 487.986f, 0.209f, 458.622f, 0.209f)
                close()
                moveTo(192.777f, 446.828f)
                curveToRelative(-70.475f, 0.0f, -127.605f, -57.131f, -127.605f, -127.605f)
                reflectiveCurveToRelative(57.131f, -127.605f, 127.605f, -127.605f)
                reflectiveCurveToRelative(127.605f, 57.131f, 127.605f, 127.605f)
                curveTo(320.312f, 389.668f, 263.223f, 446.758f, 192.777f, 446.828f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
