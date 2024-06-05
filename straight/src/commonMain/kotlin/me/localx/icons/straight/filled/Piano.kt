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

public val Icons.Filled.Piano: ImageVector
    get() {
        if (_piano != null) {
            return _piano!!
        }
        _piano = Builder(name = "Piano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(-0.048f, 15.0f)
                verticalLineToRelative(-6.352f)
                curveTo(-0.048f, 3.879f, 3.847f, 0.0f, 8.633f, 0.0f)
                curveToRelative(4.004f, 0.0f, 7.403f, 2.72f, 8.268f, 6.614f)
                lineToRelative(0.231f, 1.042f)
                curveToRelative(0.238f, 1.072f, 1.177f, 1.821f, 2.282f, 1.821f)
                curveToRelative(2.555f, 0.0f, 4.634f, 2.072f, 4.634f, 4.618f)
                verticalLineToRelative(0.905f)
                lineTo(-0.048f, 15.0f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(-0.048f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(24.096f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.048f)
                close()
            }
        }
        .build()
        return _piano!!
    }

private var _piano: ImageVector? = null
