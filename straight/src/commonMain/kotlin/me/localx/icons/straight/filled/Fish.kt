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

public val Icons.Filled.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.857f)
                curveTo(24.0f, 7.542f, 23.659f, 8.0f, 22.974f, 8.0f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-0.166f, 7.694f, -2.268f, 12.2f, -7.148f, 14.369f)
                arcToRelative(12.389f, 12.389f, 0.0f, false, false, -8.208f, -8.2f)
                curveTo(3.8f, 9.286f, 8.3f, 7.182f, 16.0f, 7.016f)
                verticalLineTo(1.026f)
                curveTo(16.0f, 0.341f, 16.458f, 0.0f, 17.143f, 0.0f)
                arcToRelative(3.446f, 3.446f, 0.0f, false, true, 3.428f, 3.429f)
                arcTo(3.446f, 3.446f, 0.0f, false, true, 24.0f, 6.857f)
                close()
                moveTo(7.961f, 23.066f)
                arcTo(28.738f, 28.738f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(28.731f, 28.731f, 0.0f, false, true, 0.932f, -7.953f)
                arcTo(10.365f, 10.365f, 0.0f, false, true, 7.961f, 23.066f)
                close()
                moveTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 21.0f)
                close()
                moveTo(12.0f, 5.3f)
                verticalLineTo(3.0f)
                arcTo(23.642f, 23.642f, 0.0f, false, false, 3.622f, 4.775f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 7.44f)
                verticalLineTo(9.914f)
                curveTo(4.241f, 7.4f, 7.49f, 5.9f, 12.0f, 5.3f)
                close()
                moveTo(18.7f, 12.0f)
                arcToRelative(20.092f, 20.092f, 0.0f, false, true, -1.651f, 6.0f)
                horizontalLineToRelative(1.245f)
                curveToRelative(3.088f, -0.119f, 2.557f, -3.586f, 2.708f, -6.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
