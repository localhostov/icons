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

public val Icons.Filled.ParachuteBox: ImageVector
    get() {
        if (_parachuteBox != null) {
            return _parachuteBox!!
        }
        _parachuteBox = Builder(name = "ParachuteBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.737f)
                curveTo(24.0f, 5.524f, 20.048f, 1.29f, 14.619f, 0.247f)
                curveToRelative(1.457f, 2.26f, 3.121f, 3.876f, 3.376f, 9.439f)
                curveToRelative(0.599f, -0.372f, 1.317f, -0.687f, 2.005f, -0.687f)
                curveToRelative(1.063f, 0.0f, 1.702f, 0.911f, 1.954f, 1.362f)
                lineToRelative(-6.283f, 6.147f)
                curveToRelative(-0.302f, -0.203f, -0.644f, -0.353f, -1.01f, -0.435f)
                lineToRelative(1.519f, -5.613f)
                curveTo(16.179f, 6.611f, 13.415f, 1.951f, 12.05f, 0.0f)
                curveToRelative(-0.017f, 0.0f, -0.033f, 0.0f, -0.05f, 0.0f)
                reflectiveCurveToRelative(-0.033f, 0.0f, -0.05f, 0.0f)
                curveToRelative(-1.366f, 1.95f, -4.104f, 6.713f, -4.104f, 10.564f)
                lineToRelative(1.499f, 5.509f)
                curveToRelative(-0.369f, 0.082f, -0.712f, 0.232f, -1.016f, 0.437f)
                lineToRelative(-6.283f, -6.147f)
                curveToRelative(0.251f, -0.451f, 0.89f, -1.362f, 1.954f, -1.362f)
                curveToRelative(0.688f, 0.0f, 1.406f, 0.315f, 2.005f, 0.686f)
                curveToRelative(0.103f, -3.525f, 1.914f, -7.104f, 3.376f, -9.439f)
                curveTo(3.952f, 1.29f, 0.0f, 5.524f, 0.0f, 10.737f)
                verticalLineToRelative(0.421f)
                lineToRelative(7.128f, 6.974f)
                curveToRelative(-0.083f, 0.275f, -0.128f, 0.566f, -0.128f, 0.868f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.302f, -0.045f, -0.593f, -0.128f, -0.868f)
                lineToRelative(7.128f, -6.974f)
                verticalLineToRelative(-0.421f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.792f, 0.0f, 1.623f, 0.417f, 2.267f, 0.857f)
                lineToRelative(-1.677f, 6.143f)
                horizontalLineToRelative(-1.158f)
                lineToRelative(-1.516f, -6.264f)
                curveToRelative(0.614f, -0.393f, 1.365f, -0.736f, 2.084f, -0.736f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
