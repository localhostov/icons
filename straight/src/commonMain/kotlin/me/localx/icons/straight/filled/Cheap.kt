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

public val Icons.Filled.Cheap: ImageVector
    get() {
        if (_cheap != null) {
            return _cheap!!
        }
        _cheap = Builder(name = "Cheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 15.171f)
                lineToRelative(1.0f, 1.0f)
                lineTo(15.0f, 1.353f)
                curveToRelative(-1.473f, -0.855f, -3.178f, -1.353f, -5.0f, -1.353f)
                curveTo(4.486f, 0.0f, 0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(0.109f, 0.0f, 0.213f, -0.018f, 0.321f, -0.022f)
                lineToRelative(-0.564f, -0.564f)
                lineToRelative(4.243f, -4.243f)
                close()
                moveTo(3.0f, 10.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.708f, 2.168f, 4.908f, 4.857f, 4.986f)
                lineToRelative(-1.748f, 1.748f)
                curveToRelative(-2.943f, -0.828f, -5.109f, -3.529f, -5.109f, -6.733f)
                close()
                moveTo(23.375f, 19.428f)
                lineToRelative(-3.993f, 3.993f)
                curveToRelative(-0.386f, 0.385f, -0.895f, 0.579f, -1.404f, 0.579f)
                curveToRelative(-0.513f, 0.0f, -1.026f, -0.195f, -1.417f, -0.586f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.002f, 3.002f)
                lineTo(17.0f, -0.002f)
                lineToRelative(2.0f, 0.002f)
                lineToRelative(-0.023f, 21.017f)
                lineToRelative(2.998f, -3.018f)
                lineToRelative(1.4f, 1.429f)
                close()
            }
        }
        .build()
        return _cheap!!
    }

private var _cheap: ImageVector? = null
