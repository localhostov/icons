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

public val Icons.Filled.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.295f)
                lineToRelative(-2.096f, -0.898f)
                curveToRelative(-0.23f, -1.371f, -0.941f, -2.428f, -2.027f, -2.972f)
                curveToRelative(-0.954f, -0.478f, -2.037f, -0.557f, -3.054f, -0.22f)
                curveToRelative(-1.014f, 0.337f, -1.835f, 1.049f, -2.299f, 1.975f)
                lineToRelative(-1.296f, 2.495f)
                curveToRelative(-3.248f, -1.255f, -5.531f, -3.302f, -5.556f, -3.325f)
                lineTo(6.213f, 0.027f)
                reflectiveCurveToRelative(-0.236f, 1.453f, -0.236f, 2.327f)
                curveToRelative(1.338f, 1.286f, 3.619f, 3.031f, 6.364f, 4.026f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.841f, 1.619f)
                curveTo(6.0f, 6.5f, 2.272f, 0.011f, 2.272f, 0.011f)
                curveToRelative(0.0f, 0.0f, -0.259f, 3.331f, -0.272f, 4.489f)
                curveToRelative(-0.035f, 3.109f, 0.535f, 9.053f, 6.0f, 12.5f)
                lineToRelative(-8.0f, 0.618f)
                curveToRelative(0.0f, 2.423f, 1.242f, 5.362f, 4.729f, 6.344f)
                lineToRelative(0.362f, 0.102f)
                lineToRelative(5.909f, -3.334f)
                reflectiveCurveToRelative(1.5f, 1.269f, 4.25f, 1.269f)
                curveToRelative(3.722f, 0.0f, 6.75f, -3.028f, 6.75f, -6.75f)
                curveToRelative(0.0f, -1.643f, -0.007f, -5.924f, -0.011f, -8.593f)
                lineToRelative(2.011f, -0.862f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
