package me.localx.icons.rounded.bold

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

public val Icons.Bold.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.74f, 24.0f)
                horizontalLineToRelative(-5.38f)
                curveToRelative(-1.47f, 0.0f, -2.85f, -0.57f, -3.89f, -1.61f)
                lineToRelative(-3.81f, -3.81f)
                curveTo(0.62f, 17.54f, 0.05f, 16.16f, 0.05f, 14.69f)
                verticalLineToRelative(-5.38f)
                curveTo(0.05f, 7.84f, 0.62f, 6.46f, 1.66f, 5.42f)
                lineTo(5.47f, 1.61f)
                curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
                horizontalLineToRelative(5.38f)
                curveToRelative(1.47f, 0.0f, 2.85f, 0.57f, 3.89f, 1.61f)
                lineToRelative(3.81f, 3.81f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                verticalLineToRelative(5.38f)
                curveToRelative(0.0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
                lineToRelative(-3.81f, 3.81f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                close()
                moveTo(9.36f, 3.0f)
                curveToRelative(-0.67f, 0.0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineToRelative(-3.81f, 3.81f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                verticalLineToRelative(5.38f)
                curveToRelative(0.0f, 0.67f, 0.26f, 1.3f, 0.73f, 1.77f)
                lineToRelative(3.81f, 3.81f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(5.38f)
                curveToRelative(0.67f, 0.0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(3.81f, -3.81f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                verticalLineToRelative(-5.38f)
                curveToRelative(0.0f, -0.67f, -0.26f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-3.81f, -3.81f)
                curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
                horizontalLineToRelative(-5.38f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
