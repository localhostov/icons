package me.localx.icons.straight.bold

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

public val Icons.Bold.ArrowTrendDown: ImageVector
    get() {
        if (_arrowTrendDown != null) {
            return _arrowTrendDown!!
        }
        _arrowTrendDown = Builder(name = "ArrowTrendDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.879f)
                lineToRelative(-5.879f, -5.879f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(0.064f, 8.186f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(4.814f, 4.814f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(8.0f, 8.0f)
                verticalLineToRelative(-4.879f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _arrowTrendDown!!
    }

private var _arrowTrendDown: ImageVector? = null
