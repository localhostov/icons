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

public val Icons.Filled.BoltAuto: ImageVector
    get() {
        if (_boltAuto != null) {
            return _boltAuto!!
        }
        _boltAuto = Builder(name = "BoltAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.587f, 11.823f)
                lineToRelative(-8.077f, 12.177f)
                horizontalLineToRelative(-3.321f)
                lineToRelative(2.023f, -8.0f)
                horizontalLineToRelative(-3.774f)
                curveToRelative(-0.917f, 0.0f, -1.757f, -0.503f, -2.191f, -1.313f)
                curveToRelative(-0.428f, -0.798f, -0.385f, -1.76f, 0.113f, -2.51f)
                lineTo(8.437f, 0.0f)
                horizontalLineToRelative(3.321f)
                lineToRelative(-2.023f, 8.0f)
                horizontalLineToRelative(3.801f)
                curveToRelative(0.908f, 0.0f, 1.739f, 0.497f, 2.169f, 1.298f)
                reflectiveCurveToRelative(0.385f, 1.769f, -0.117f, 2.525f)
                close()
                moveTo(21.407f, 22.0f)
                horizontalLineToRelative(-4.381f)
                lineToRelative(-0.565f, 2.0f)
                horizontalLineToRelative(-2.138f)
                lineToRelative(2.816f, -9.745f)
                curveToRelative(0.371f, -0.75f, 1.155f, -1.242f, 1.998f, -1.255f)
                curveToRelative(0.887f, 0.013f, 1.67f, 0.505f, 2.042f, 1.255f)
                lineToRelative(2.822f, 9.745f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.592f, -2.0f)
                close()
                moveTo(20.815f, 20.0f)
                lineToRelative(-1.451f, -4.892f)
                curveToRelative(-0.042f, -0.051f, -0.118f, -0.097f, -0.222f, -0.107f)
                curveToRelative(-0.057f, 0.007f, -0.115f, 0.035f, -0.158f, 0.073f)
                lineToRelative(-1.392f, 4.925f)
                horizontalLineToRelative(3.224f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
