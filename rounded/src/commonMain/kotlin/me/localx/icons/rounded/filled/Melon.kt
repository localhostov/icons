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

public val Icons.Filled.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6f, 12.175f)
                lineTo(12.173f, 4.6f)
                lineToRelative(0.667f, 0.667f)
                curveToRelative(3.891f, 5.027f, -2.6f, 11.479f, -7.6f, 7.557f)
                close()
                moveTo(22.374f, 2.324f)
                arcTo(4.336f, 4.336f, 0.0f, false, false, 15.5f, 1.273f)
                lineTo(13.586f, 3.184f)
                curveToRelative(7.306f, 7.128f, -3.286f, 17.7f, -10.4f, 10.405f)
                lineTo(1.274f, 15.5f)
                arcTo(4.347f, 4.347f, 0.0f, false, false, 0.059f, 19.242f)
                curveToRelative(0.718f, 3.917f, 5.816f, 4.606f, 9.038f, 4.765f)
                curveTo(19.974f, 24.165f, 27.522f, 12.048f, 22.374f, 2.324f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
