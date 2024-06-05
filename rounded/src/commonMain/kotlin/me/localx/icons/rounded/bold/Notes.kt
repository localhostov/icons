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

public val Icons.Bold.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(name = "Notes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.523f, 2.061f, 4.5f, 4.692f, 4.5f)
                horizontalLineToRelative(7.565f)
                curveToRelative(1.185f, 0.0f, 2.344f, -0.48f, 3.182f, -1.318f)
                lineToRelative(2.242f, -2.242f)
                curveToRelative(0.838f, -0.838f, 1.318f, -1.998f, 1.318f, -3.183f)
                verticalLineToRelative(-7.757f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(8.0f, 14.5f)
                lineTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.308f)
                curveToRelative(-0.98f, 0.0f, -1.692f, -0.631f, -1.692f, -1.5f)
                close()
                moveTo(17.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.001f)
                curveTo(4.332f, 24.0f, 0.071f, 19.797f, 0.0f, 14.63f)
                verticalLineToRelative(-6.109f)
                curveToRelative(-0.011f, -0.828f, 0.651f, -1.509f, 1.479f, -1.521f)
                curveToRelative(0.866f, 0.016f, 1.509f, 0.672f, 1.521f, 1.5f)
                verticalLineToRelative(6.089f)
                curveToRelative(0.048f, 3.535f, 2.964f, 6.411f, 6.499f, 6.411f)
                horizontalLineToRelative(6.001f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
