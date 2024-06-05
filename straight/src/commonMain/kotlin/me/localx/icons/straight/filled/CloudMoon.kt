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

public val Icons.Filled.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, true, -2.448f, -8.273f)
                curveTo(6.262f, 8.64f, 16.227f, 6.348f, 18.653f, 13.0f)
                curveTo(25.812f, 13.414f, 25.675f, 23.784f, 18.5f, 24.0f)
                close()
                moveTo(3.355f, 17.391f)
                arcTo(6.443f, 6.443f, 0.0f, false, true, 5.0f, 14.807f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, true, 5.389f, -7.361f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.521f, 8.521f, 0.0f, false, true, 4.282f, -4.4f)
                lineToRelative(1.869f, -0.8f)
                lineToRelative(-1.778f, -0.988f)
                curveTo(4.283f, -4.3f, -5.326f, 9.47f, 3.355f, 17.391f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
