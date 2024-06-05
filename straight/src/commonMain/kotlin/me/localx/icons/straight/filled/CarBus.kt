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

public val Icons.Filled.CarBus: ImageVector
    get() {
        if (_carBus != null) {
            return _carBus!!
        }
        _carBus = Builder(name = "CarBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 4.184f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 1.691f, -2.7f)
                curveToRelative(3.284f, -1.9f, 9.338f, -1.894f, 12.617f, 0.0f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 18.0f, 4.184f)
                close()
                moveTo(2.0f, 14.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 17.0f)
                arcToRelative(13.348f, 13.348f, 0.0f, false, true, 0.639f, -3.0f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 24.0f)
                lineTo(10.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                lineTo(8.0f, 18.0f)
                arcToRelative(11.027f, 11.027f, 0.0f, false, true, 0.189f, -2.0f)
                lineTo(23.811f, 16.0f)
                arcTo(11.027f, 11.027f, 0.0f, false, true, 24.0f, 18.0f)
                close()
                moveTo(12.006f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.006f, 18.0f)
                close()
                moveTo(20.006f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.006f, 18.0f)
                close()
                moveTo(10.064f, 10.846f)
                lineTo(8.846f, 13.769f)
                curveToRelative(-0.031f, 0.076f, -0.053f, 0.155f, -0.083f, 0.231f)
                lineTo(23.237f, 14.0f)
                curveToRelative(-0.03f, -0.076f, -0.052f, -0.155f, -0.083f, -0.231f)
                lineToRelative(-1.218f, -2.922f)
                arcTo(2.991f, 2.991f, 0.0f, false, false, 19.167f, 9.0f)
                lineTo(12.833f, 9.0f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 10.064f, 10.846f)
                close()
                moveTo(8.218f, 10.077f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 12.833f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(7.417f, 12.0f)
                close()
            }
        }
        .build()
        return _carBus!!
    }

private var _carBus: ImageVector? = null
