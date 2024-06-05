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

public val Icons.Outline.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.886f, 8.437f)
                curveToRelative(-1.328f, 0.484f, -2.085f, 1.795f, -1.841f, 3.189f)
                curveToRelative(0.245f, 1.397f, 1.407f, 2.374f, 2.826f, 2.374f)
                horizontalLineToRelative(7.129f)
                verticalLineToRelative(7.128f)
                curveToRelative(0.0f, 1.419f, 0.976f, 2.582f, 2.374f, 2.827f)
                curveToRelative(0.175f, 0.03f, 0.349f, 0.046f, 0.521f, 0.046f)
                curveToRelative(1.192f, 0.0f, 2.249f, -0.727f, 2.666f, -1.878f)
                lineTo(24.028f, -0.014f)
                lineTo(1.886f, 8.437f)
                close()
                moveTo(13.687f, 21.425f)
                curveToRelative(-0.229f, 0.635f, -0.797f, 0.59f, -0.967f, 0.561f)
                curveToRelative(-0.169f, -0.03f, -0.72f, -0.18f, -0.72f, -0.857f)
                verticalLineToRelative(-9.128f)
                lineTo(2.871f, 12.001f)
                curveToRelative(-0.678f, 0.0f, -0.826f, -0.551f, -0.856f, -0.72f)
                curveToRelative(-0.029f, -0.168f, -0.076f, -0.736f, 0.561f, -0.967f)
                lineTo(20.562f, 3.449f)
                lineToRelative(-6.875f, 17.976f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
