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

public val Icons.Filled.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.537f, 11.0f)
                lineTo(4.463f, 11.0f)
                curveToRelative(-0.812f, 0.64f, -1.293f, 1.442f, -1.412f, 2.17f)
                curveToRelative(0.512f, 1.631f, 5.296f, 1.83f, 8.949f, 1.83f)
                reflectiveCurveToRelative(8.437f, -0.199f, 8.949f, -1.83f)
                curveToRelative(-0.119f, -0.728f, -0.6f, -1.53f, -1.412f, -2.17f)
                close()
                moveTo(3.654f, 16.092f)
                curveToRelative(0.988f, 1.96f, 3.111f, 3.767f, 6.466f, 4.266f)
                curveToRelative(-1.12f, 2.143f, -3.12f, 1.138f, -3.12f, 3.643f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.0f, -2.505f, -2.0f, -1.5f, -3.12f, -3.643f)
                curveToRelative(3.356f, -0.498f, 5.478f, -2.306f, 6.466f, -4.266f)
                curveToRelative(-2.148f, 0.801f, -5.302f, 0.908f, -8.346f, 0.908f)
                reflectiveCurveToRelative(-6.198f, -0.107f, -8.346f, -0.908f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
