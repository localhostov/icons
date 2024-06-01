package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.7904f, 3.2789f)
                    curveTo(15.5429f, -1.0417f, 8.597f, -1.101f, 4.2764f, 3.1466f)
                    curveTo(-0.0442f, 7.3941f, -0.1034f, 14.34f, 4.1441f, 18.6606f)
                    curveTo(4.1969f, 18.7143f, 4.2502f, 18.7675f, 4.3041f, 18.8201f)
                    lineTo(8.2366f, 22.4533f)
                    curveTo(10.3389f, 24.5099f, 13.6966f, 24.5183f, 15.8092f, 22.4722f)
                    lineTo(19.7904f, 18.7932f)
                    curveTo(24.0744f, 14.5089f, 24.0744f, 7.5631f, 19.7904f, 3.2789f)
                    close()
                    moveTo(16.0226f, 12.0333f)
                    horizontalLineTo(13.0306f)
                    verticalLineTo(15.0252f)
                    curveTo(13.0306f, 15.576f, 12.5841f, 16.0226f, 12.0333f, 16.0226f)
                    curveTo(11.4826f, 16.0226f, 11.036f, 15.576f, 11.036f, 15.0252f)
                    verticalLineTo(12.0333f)
                    horizontalLineTo(8.0441f)
                    curveTo(7.4933f, 12.0333f, 7.0468f, 11.5868f, 7.0468f, 11.036f)
                    curveTo(7.0468f, 10.4852f, 7.4933f, 10.0387f, 8.0441f, 10.0387f)
                    horizontalLineTo(11.036f)
                    verticalLineTo(7.0468f)
                    curveTo(11.036f, 6.496f, 11.4826f, 6.0494f, 12.0333f, 6.0494f)
                    curveTo(12.5841f, 6.0494f, 13.0306f, 6.496f, 13.0306f, 7.0468f)
                    verticalLineTo(10.0387f)
                    horizontalLineTo(16.0226f)
                    curveTo(16.5734f, 10.0387f, 17.0199f, 10.4852f, 17.0199f, 11.036f)
                    curveTo(17.0199f, 11.5868f, 16.5734f, 12.0333f, 16.0226f, 12.0333f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
