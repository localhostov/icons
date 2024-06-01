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

public val Icons.Outline.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.337f, 13.3224f)
                lineTo(10.6234f, 11.036f)
                lineTo(8.337f, 8.7496f)
                curveTo(7.9409f, 8.3671f, 7.9299f, 7.7358f, 8.3125f, 7.3397f)
                curveTo(8.695f, 6.9436f, 9.3263f, 6.9326f, 9.7224f, 7.3152f)
                curveTo(9.7307f, 7.3232f, 9.7389f, 7.3314f, 9.7469f, 7.3397f)
                lineTo(12.0333f, 9.6261f)
                lineTo(14.3196f, 7.3397f)
                curveTo(14.7022f, 6.9436f, 15.3334f, 6.9327f, 15.7295f, 7.3152f)
                curveTo(16.1256f, 7.6978f, 16.1366f, 8.3291f, 15.754f, 8.7252f)
                curveTo(15.746f, 8.7334f, 15.7378f, 8.7416f, 15.7295f, 8.7496f)
                lineTo(13.4432f, 11.036f)
                lineTo(15.7295f, 13.3224f)
                curveTo(16.1256f, 13.705f, 16.1366f, 14.3362f, 15.754f, 14.7323f)
                curveTo(15.3714f, 15.1284f, 14.7402f, 15.1393f, 14.3441f, 14.7567f)
                curveTo(14.3358f, 14.7487f, 14.3277f, 14.7406f, 14.3196f, 14.7323f)
                lineTo(12.0333f, 12.4459f)
                lineTo(9.7469f, 14.7323f)
                curveTo(9.3508f, 15.1149f, 8.7196f, 15.1039f, 8.337f, 14.7078f)
                curveTo(7.9638f, 14.3214f, 7.9638f, 13.7088f, 8.337f, 13.3224f)
                close()
                moveTo(4.3057f, 18.8184f)
                curveTo(-0.029f, 14.5871f, -0.1128f, 7.643f, 4.1186f, 3.3082f)
                curveTo(8.3499f, -1.0265f, 15.2941f, -1.1102f, 19.6287f, 3.1211f)
                curveTo(19.6826f, 3.1737f, 19.7359f, 3.2269f, 19.7887f, 3.2805f)
                curveTo(24.0718f, 7.5638f, 24.0718f, 14.5082f, 19.7887f, 18.7915f)
                lineTo(15.8083f, 22.4698f)
                curveTo(13.6962f, 24.5155f, 10.3392f, 24.5071f, 8.2373f, 22.4509f)
                lineTo(4.3057f, 18.8184f)
                close()
                moveTo(3.0593f, 11.036f)
                curveTo(3.0528f, 13.4174f, 3.9993f, 15.7024f, 5.6877f, 17.3816f)
                lineTo(9.6113f, 21.0071f)
                curveTo(10.9584f, 22.2944f, 13.0772f, 22.3027f, 14.4343f, 21.026f)
                lineTo(18.4068f, 17.3547f)
                curveTo(21.9039f, 13.8424f, 21.8917f, 8.1601f, 18.3794f, 4.663f)
                curveTo(14.8671f, 1.1659f, 9.1848f, 1.1781f, 5.6877f, 4.6904f)
                curveTo(3.9992f, 6.3697f, 3.0528f, 8.6547f, 3.0593f, 11.036f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
