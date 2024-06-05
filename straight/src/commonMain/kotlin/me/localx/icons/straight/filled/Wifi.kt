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

public val Icons.Filled.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(5.64f, 12.64f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0.0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.73f, 3.0f, 3.71f, 4.66f, 0.69f, 7.69f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.64f, -2.64f, 6.16f, -4.1f, 9.9f, -4.1f)
                reflectiveCurveToRelative(7.25f, 1.46f, 9.9f, 4.1f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-3.02f, -3.02f, -7.04f, -4.69f, -11.31f, -4.69f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
