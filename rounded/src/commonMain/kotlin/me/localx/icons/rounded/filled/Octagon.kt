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

public val Icons.Filled.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.95f, 24.0f)
                horizontalLineToRelative(-5.8f)
                curveToRelative(-1.33f, 0.0f, -2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(1.52f, 18.44f)
                curveTo(0.57f, 17.49f, 0.05f, 16.23f, 0.05f, 14.9f)
                verticalLineToRelative(-5.8f)
                curveTo(0.05f, 7.77f, 0.57f, 6.51f, 1.52f, 5.56f)
                lineTo(5.62f, 1.46f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                horizontalLineToRelative(5.8f)
                curveToRelative(1.34f, 0.0f, 2.59f, 0.52f, 3.54f, 1.46f)
                lineToRelative(4.1f, 4.1f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 1.33f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-4.1f, 4.1f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
