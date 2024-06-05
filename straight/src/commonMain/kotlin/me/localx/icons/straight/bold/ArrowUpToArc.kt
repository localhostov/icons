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

public val Icons.Bold.ArrowUpToArc: ImageVector
    get() {
        if (_arrowUpToArc != null) {
            return _arrowUpToArc!!
        }
        _arrowUpToArc = Builder(name = "ArrowUpToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.854f, 7.763f)
                lineToRelative(5.216f, 5.172f)
                lineToRelative(-2.113f, 2.131f)
                lineToRelative(-3.443f, -3.415f)
                verticalLineToRelative(12.349f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-12.349f)
                lineToRelative(-3.444f, 3.415f)
                lineToRelative(-2.112f, -2.131f)
                lineToRelative(5.221f, -5.177f)
                curveToRelative(0.973f, -0.973f, 2.692f, -0.979f, 3.676f, 0.005f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUpToArc!!
    }

private var _arrowUpToArc: ImageVector? = null
