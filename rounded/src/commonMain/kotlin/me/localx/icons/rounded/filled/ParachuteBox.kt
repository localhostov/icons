package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(23.855f, 8.074f)
                curveTo(22.727f, 3.889f, 19.037f, 1.096f, 14.619f, 0.247f)
                curveToRelative(1.462f, 2.336f, 3.273f, 5.914f, 3.376f, 9.439f)
                curveToRelative(0.599f, -0.371f, 1.317f, -0.686f, 2.005f, -0.686f)
                curveToRelative(0.742f, 0.0f, 1.277f, 0.444f, 1.619f, 0.865f)
                curveToRelative(0.213f, 0.263f, 0.181f, 0.648f, -0.061f, 0.885f)
                lineToRelative(-5.886f, 5.759f)
                curveToRelative(-0.304f, -0.205f, -0.648f, -0.354f, -1.016f, -0.437f)
                lineToRelative(1.499f, -5.509f)
                curveTo(16.154f, 6.714f, 13.415f, 1.951f, 12.05f, 0.0f)
                curveToRelative(-0.017f, 0.0f, -0.033f, 0.0f, -0.05f, 0.0f)
                reflectiveCurveToRelative(-0.033f, 0.0f, -0.05f, 0.0f)
                curveToRelative(-1.366f, 1.95f, -4.104f, 6.713f, -4.104f, 10.564f)
                lineToRelative(1.499f, 5.509f)
                curveToRelative(-0.369f, 0.082f, -0.712f, 0.232f, -1.016f, 0.437f)
                lineToRelative(-5.886f, -5.759f)
                curveToRelative(-0.242f, -0.237f, -0.275f, -0.622f, -0.061f, -0.885f)
                curveToRelative(0.341f, -0.421f, 0.876f, -0.865f, 1.619f, -0.865f)
                curveToRelative(0.688f, 0.0f, 1.406f, 0.315f, 2.005f, 0.686f)
                curveToRelative(0.103f, -3.525f, 1.914f, -7.104f, 3.376f, -9.439f)
                curveTo(4.963f, 1.096f, 1.273f, 3.889f, 0.145f, 8.074f)
                curveToRelative(-0.463f, 1.718f, 0.086f, 3.554f, 1.357f, 4.798f)
                lineToRelative(5.626f, 5.26f)
                curveToRelative(-0.083f, 0.275f, -0.128f, 0.566f, -0.128f, 0.868f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.302f, -0.045f, -0.593f, -0.128f, -0.868f)
                lineToRelative(5.626f, -5.26f)
                curveToRelative(1.272f, -1.244f, 1.82f, -3.081f, 1.357f, -4.798f)
                close()
                moveTo(13.932f, 10.363f)
                lineToRelative(-1.364f, 5.637f)
                horizontalLineToRelative(-1.137f)
                lineToRelative(-1.364f, -5.637f)
                curveToRelative(-0.092f, -0.382f, 0.083f, -0.786f, 0.435f, -0.96f)
                curveToRelative(0.476f, -0.235f, 0.995f, -0.403f, 1.497f, -0.403f)
                reflectiveCurveToRelative(1.02f, 0.168f, 1.497f, 0.403f)
                curveToRelative(0.352f, 0.174f, 0.528f, 0.579f, 0.435f, 0.96f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
