package me.localx.icons.rounded.outline

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

public val Icons.Outline.AngleSmallUp: ImageVector
    get() {
        if (_angleSmallUp != null) {
            return _angleSmallUp!!
        }
        _angleSmallUp = Builder(name = "AngleSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9998f, 15.4999f)
                curveTo(17.8682f, 15.5007f, 17.7377f, 15.4755f, 17.6159f, 15.4257f)
                curveTo(17.494f, 15.3759f, 17.3832f, 15.3026f, 17.2898f, 15.2099f)
                lineTo(12.7098f, 10.6199f)
                curveTo(12.6168f, 10.5262f, 12.5062f, 10.4518f, 12.3844f, 10.401f)
                curveTo(12.2625f, 10.3503f, 12.1318f, 10.3241f, 11.9998f, 10.3241f)
                curveTo(11.8678f, 10.3241f, 11.7371f, 10.3503f, 11.6152f, 10.401f)
                curveTo(11.4934f, 10.4518f, 11.3828f, 10.5262f, 11.2898f, 10.6199f)
                lineTo(6.7098f, 15.2099f)
                curveTo(6.5215f, 15.3982f, 6.2661f, 15.504f, 5.9998f, 15.504f)
                curveTo(5.7335f, 15.504f, 5.4781f, 15.3982f, 5.2898f, 15.2099f)
                curveTo(5.1015f, 15.0216f, 4.9957f, 14.7662f, 4.9957f, 14.4999f)
                curveTo(4.9957f, 14.3681f, 5.0217f, 14.2375f, 5.0721f, 14.1157f)
                curveTo(5.1226f, 13.9939f, 5.1965f, 13.8832f, 5.2898f, 13.7899f)
                lineTo(9.8798f, 9.2099f)
                curveTo(10.4497f, 8.6624f, 11.2094f, 8.3566f, 11.9998f, 8.3566f)
                curveTo(12.7901f, 8.3566f, 13.5498f, 8.6624f, 14.1198f, 9.2099f)
                lineTo(18.7098f, 13.7899f)
                curveTo(18.8035f, 13.8829f, 18.8779f, 13.9935f, 18.9287f, 14.1154f)
                curveTo(18.9794f, 14.2372f, 19.0056f, 14.3679f, 19.0056f, 14.4999f)
                curveTo(19.0056f, 14.6319f, 18.9794f, 14.7626f, 18.9287f, 14.8845f)
                curveTo(18.8779f, 15.0064f, 18.8035f, 15.117f, 18.7098f, 15.2099f)
                curveTo(18.6163f, 15.3026f, 18.5055f, 15.3759f, 18.3837f, 15.4257f)
                curveTo(18.2619f, 15.4755f, 18.1314f, 15.5007f, 17.9998f, 15.4999f)
                close()
            }
        }
        .build()
        return _angleSmallUp!!
    }

private var _angleSmallUp: ImageVector? = null
