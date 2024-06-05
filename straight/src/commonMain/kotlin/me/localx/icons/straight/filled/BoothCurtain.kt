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

public val Icons.Filled.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.426f, 1.762f, -3.0f, 4.489f, -3.0f, 8.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.11f, -1.398f, -7.638f, -4.65f, -8.0f, -12.0f)
                verticalLineToRelative(22.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 12.0f)
                lineTo(10.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(-1.407f, -1.14f, -2.788f, -3.124f, -3.023f, -6.5f)
                horizontalLineToRelative(-2.018f)
                curveToRelative(0.302f, 5.11f, 2.904f, 7.643f, 5.041f, 8.877f)
                verticalLineToRelative(-2.377f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null
