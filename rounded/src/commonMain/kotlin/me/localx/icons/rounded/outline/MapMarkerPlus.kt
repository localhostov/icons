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

public val Icons.Outline.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1746f, 22.4473f)
                curveTo(10.2773f, 24.5042f, 13.6354f, 24.5126f, 15.7483f, 22.4663f)
                lineTo(19.7302f, 18.7866f)
                curveTo(24.0436f, 14.5306f, 24.0902f, 7.5836f, 19.8341f, 3.2702f)
                curveTo(15.5781f, -1.0432f, 8.6312f, -1.0898f, 4.3177f, 3.1662f)
                curveTo(4.2828f, 3.2006f, 4.2481f, 3.2353f, 4.2137f, 3.2702f)
                curveTo(-0.0708f, 7.5554f, -0.0702f, 14.5025f, 4.215f, 18.787f)
                curveTo(4.2238f, 18.7958f, 4.2327f, 18.8047f, 4.2416f, 18.8136f)
                lineTo(8.1746f, 22.4473f)
                close()
                moveTo(5.6241f, 4.6806f)
                curveTo(9.1222f, 1.1671f, 14.8062f, 1.1546f, 18.3197f, 4.6527f)
                curveTo(21.8333f, 8.1508f, 21.8458f, 13.8348f, 18.3477f, 17.3483f)
                lineTo(14.3738f, 21.021f)
                curveTo(13.0165f, 22.2984f, 10.8969f, 22.2905f, 9.5491f, 21.003f)
                lineTo(5.6241f, 17.3762f)
                curveTo(2.1183f, 13.8705f, 2.1183f, 8.1865f, 5.624f, 4.6807f)
                curveTo(5.6241f, 4.6807f, 5.6241f, 4.6806f, 5.6241f, 4.6806f)
                close()
                moveTo(6.9847f, 11.0284f)
                curveTo(6.9847f, 10.4775f, 7.4312f, 10.031f, 7.9821f, 10.031f)
                horizontalLineTo(10.9745f)
                verticalLineTo(7.0386f)
                curveTo(10.9745f, 6.4877f, 11.4211f, 6.0412f, 11.9719f, 6.0412f)
                curveTo(12.5228f, 6.0412f, 12.9694f, 6.4877f, 12.9694f, 7.0386f)
                verticalLineTo(10.031f)
                horizontalLineTo(15.9617f)
                curveTo(16.5126f, 10.031f, 16.9592f, 10.4775f, 16.9592f, 11.0284f)
                curveTo(16.9592f, 11.5793f, 16.5126f, 12.0259f, 15.9617f, 12.0259f)
                horizontalLineTo(12.9694f)
                verticalLineTo(15.0182f)
                curveTo(12.9694f, 15.5691f, 12.5228f, 16.0157f, 11.9719f, 16.0157f)
                curveTo(11.4211f, 16.0157f, 10.9745f, 15.5691f, 10.9745f, 15.0182f)
                verticalLineTo(12.0259f)
                horizontalLineTo(7.9821f)
                curveTo(7.4312f, 12.0259f, 6.9847f, 11.5793f, 6.9847f, 11.0284f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
