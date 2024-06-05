package me.localx.icons.straight.outline

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

public val Icons.Outline.GlassHalf: ImageVector
    get() {
        if (_glassHalf != null) {
            return _glassHalf!!
        }
        _glassHalf = Builder(name = "GlassHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.111f, 0.0f)
                lineToRelative(1.747f, 21.246f)
                curveToRelative(0.127f, 1.544f, 1.44f, 2.754f, 2.99f, 2.754f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.566f, 0.0f, 2.852f, -1.177f, 2.988f, -2.737f)
                lineTo(22.886f, 0.0f)
                lineTo(1.111f, 0.0f)
                close()
                moveTo(18.028f, 22.0f)
                lineTo(5.849f, 22.0f)
                curveToRelative(-0.517f, 0.0f, -0.954f, -0.403f, -0.996f, -0.918f)
                lineToRelative(-0.665f, -8.082f)
                horizontalLineToRelative(15.547f)
                lineToRelative(-0.711f, 8.088f)
                curveToRelative(-0.046f, 0.52f, -0.474f, 0.912f, -0.996f, 0.912f)
                close()
                moveTo(19.911f, 11.0f)
                lineTo(4.023f, 11.0f)
                lineToRelative(-0.74f, -9.0f)
                horizontalLineToRelative(17.419f)
                lineToRelative(-0.791f, 9.0f)
                close()
            }
        }
        .build()
        return _glassHalf!!
    }

private var _glassHalf: ImageVector? = null
