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

public val Icons.Bold.ArrowTrendUp: ImageVector
    get() {
        if (_arrowTrendUp != null) {
            return _arrowTrendUp!!
        }
        _arrowTrendUp = Builder(name = "ArrowTrendUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.879f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-4.81f, 4.81f)
                lineTo(0.069f, 15.81f)
                lineToRelative(6.931f, -6.931f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(5.879f, -5.879f)
                horizontalLineToRelative(-4.879f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _arrowTrendUp!!
    }

private var _arrowTrendUp: ImageVector? = null
