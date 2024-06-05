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

public val Icons.Filled.Browsers: ImageVector
    get() {
        if (_browsers != null) {
            return _browsers!!
        }
        _browsers = Builder(name = "Browsers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1f, 6.0f)
                curveToRelative(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.41f, 0.0f, 4.43f, 1.72f, 4.9f, 4.0f)
                lineTo(5.1f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -0.2f, 0.01f, -0.4f, 0.03f, -0.59f)
                curveToRelative(-1.78f, 0.77f, -3.03f, 2.54f, -3.03f, 4.59f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(14.0f, 22.0f)
                curveToRelative(1.63f, 0.0f, 3.06f, -0.79f, 3.97f, -2.0f)
                horizontalLineToRelative(-7.97f)
                close()
            }
        }
        .build()
        return _browsers!!
    }

private var _browsers: ImageVector? = null
