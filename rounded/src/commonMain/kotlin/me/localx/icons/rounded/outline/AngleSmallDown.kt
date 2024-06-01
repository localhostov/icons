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

public val Icons.Outline.AngleSmallDown: ImageVector
    get() {
        if (_angleSmallDown != null) {
            return _angleSmallDown!!
        }
        _angleSmallDown = Builder(name = "AngleSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7099f, 8.21f)
                curveTo(18.6169f, 8.1163f, 18.5063f, 8.0419f, 18.3845f, 7.9911f)
                curveTo(18.2626f, 7.9403f, 18.1319f, 7.9142f, 17.9999f, 7.9142f)
                curveTo(17.8679f, 7.9142f, 17.7372f, 7.9403f, 17.6153f, 7.9911f)
                curveTo(17.4934f, 8.0419f, 17.3828f, 8.1163f, 17.2899f, 8.21f)
                lineTo(12.7099f, 12.79f)
                curveTo(12.6169f, 12.8837f, 12.5063f, 12.9581f, 12.3845f, 13.0089f)
                curveTo(12.2626f, 13.0596f, 12.1319f, 13.0858f, 11.9999f, 13.0858f)
                curveTo(11.8679f, 13.0858f, 11.7372f, 13.0596f, 11.6153f, 13.0089f)
                curveTo(11.4934f, 12.9581f, 11.3828f, 12.8837f, 11.2899f, 12.79f)
                lineTo(6.7099f, 8.21f)
                curveTo(6.6169f, 8.1163f, 6.5063f, 8.0419f, 6.3844f, 7.9911f)
                curveTo(6.2626f, 7.9403f, 6.1319f, 7.9142f, 5.9999f, 7.9142f)
                curveTo(5.8679f, 7.9142f, 5.7372f, 7.9403f, 5.6153f, 7.9911f)
                curveTo(5.4934f, 8.0419f, 5.3828f, 8.1163f, 5.2899f, 8.21f)
                curveTo(5.1036f, 8.3973f, 4.9991f, 8.6508f, 4.9991f, 8.915f)
                curveTo(4.9991f, 9.1792f, 5.1036f, 9.4326f, 5.2899f, 9.62f)
                lineTo(9.8799f, 14.21f)
                curveTo(10.4424f, 14.7718f, 11.2049f, 15.0873f, 11.9999f, 15.0873f)
                curveTo(12.7949f, 15.0873f, 13.5574f, 14.7718f, 14.1199f, 14.21f)
                lineTo(18.7099f, 9.62f)
                curveTo(18.8961f, 9.4326f, 19.0007f, 9.1792f, 19.0007f, 8.915f)
                curveTo(19.0007f, 8.6508f, 18.8961f, 8.3973f, 18.7099f, 8.21f)
                close()
            }
        }
        .build()
        return _angleSmallDown!!
    }

private var _angleSmallDown: ImageVector? = null
