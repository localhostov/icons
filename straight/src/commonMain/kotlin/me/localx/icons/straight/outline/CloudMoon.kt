package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.355f, 17.391f)
                arcTo(9.94f, 9.94f, 0.0f, false, true, 14.764f, 1.252f)
                lineToRelative(1.778f, 0.988f)
                lineToRelative(-1.869f, 0.8f)
                arcToRelative(8.521f, 8.521f, 0.0f, false, false, -4.282f, 4.4f)
                arcToRelative(7.978f, 7.978f, 0.0f, false, false, -2.371f, 1.3f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, 4.018f, -6.467f)
                arcTo(7.827f, 7.827f, 0.0f, false, false, 9.958f, 2.0f)
                arcTo(7.954f, 7.954f, 0.0f, false, false, 4.326f, 15.574f)
                arcTo(6.455f, 6.455f, 0.0f, false, false, 3.355f, 17.391f)
                close()
                moveTo(24.0f, 18.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.653f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 15.0f)
                arcToRelative(5.173f, 5.173f, 0.0f, false, false, 0.052f, 0.727f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 9.5f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                close()
                moveTo(16.923f, 14.247f)
                lineTo(17.1f, 15.177f)
                lineTo(18.144f, 15.036f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 18.5f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.941f, -4.812f)
                lineToRelative(0.812f, -0.332f)
                lineToRelative(-0.223f, -0.848f)
                arcTo(3.916f, 3.916f, 0.0f, false, true, 9.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.923f, -0.753f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
