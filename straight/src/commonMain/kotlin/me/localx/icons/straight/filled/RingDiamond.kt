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

public val Icons.Filled.RingDiamond: ImageVector
    get() {
        if (_ringDiamond != null) {
            return _ringDiamond!!
        }
        _ringDiamond = Builder(name = "RingDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.577f, 6.147f)
                lineToRelative(2.923f, -3.897f)
                lineToRelative(-2.25f, -2.25f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(2.923f, 3.897f)
                curveToRelative(-4.212f, 0.749f, -7.423f, 4.429f, -7.423f, 8.853f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -4.424f, -3.211f, -8.104f, -7.423f, -8.853f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ringDiamond!!
    }

private var _ringDiamond: ImageVector? = null
