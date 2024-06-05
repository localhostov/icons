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

public val Icons.Bold.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.89f, 8.011f)
                lineToRelative(2.121f, -2.121f)
                lineTo(18.11f, -0.011f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-8.129f, 8.129f)
                lineToRelative(-3.182f, -3.182f)
                lineToRelative(-4.371f, 4.372f)
                curveToRelative(-1.417f, 1.417f, -2.197f, 3.3f, -2.197f, 5.303f)
                verticalLineToRelative(5.379f)
                horizontalLineToRelative(5.379f)
                curveToRelative(2.003f, 0.0f, 3.886f, -0.78f, 5.303f, -2.197f)
                lineToRelative(4.372f, -4.371f)
                lineToRelative(-3.182f, -3.182f)
                lineToRelative(8.129f, -8.129f)
                lineToRelative(1.89f, 1.89f)
                close()
                moveTo(8.561f, 19.682f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.318f, -3.182f, 1.318f)
                horizontalLineToRelative(-2.379f)
                verticalLineToRelative(-2.379f)
                curveToRelative(0.0f, -1.202f, 0.468f, -2.332f, 1.318f, -3.182f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-2.25f, 2.25f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
