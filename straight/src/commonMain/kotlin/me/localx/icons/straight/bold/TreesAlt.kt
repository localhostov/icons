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

public val Icons.Bold.TreesAlt: ImageVector
    get() {
        if (_treesAlt != null) {
            return _treesAlt!!
        }
        _treesAlt = Builder(name = "TreesAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.902f, 16.0f)
                horizontalLineToRelative(2.157f)
                lineToRelative(-3.5f, -6.0f)
                horizontalLineToRelative(1.862f)
                lineTo(16.848f, 1.253f)
                curveToRelative(-0.547f, -0.785f, -1.444f, -1.253f, -2.4f, -1.253f)
                curveToRelative(-0.709f, 0.0f, -1.385f, 0.258f, -1.91f, 0.711f)
                curveToRelative(-0.558f, -0.457f, -1.272f, -0.711f, -2.037f, -0.711f)
                curveToRelative(-0.998f, 0.0f, -1.91f, 0.432f, -2.501f, 1.183f)
                lineTo(2.787f, 10.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-3.957f, 6.0f)
                horizontalLineToRelative(2.444f)
                lineTo(-0.103f, 22.0f)
                horizontalLineToRelative(9.103f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.977f)
                lineToRelative(-3.075f, -6.0f)
                close()
                moveTo(10.5f, 13.675f)
                lineToRelative(-1.5f, 2.589f)
                verticalLineToRelative(2.737f)
                horizontalLineToRelative(-3.897f)
                lineToRelative(3.477f, -6.0f)
                horizontalLineToRelative(-2.077f)
                lineToRelative(3.957f, -6.0f)
                horizontalLineToRelative(-2.422f)
                lineToRelative(2.344f, -3.978f)
                curveToRelative(0.049f, -0.021f, 0.189f, -0.021f, 0.238f, 0.0f)
                lineToRelative(2.344f, 3.978f)
                horizontalLineToRelative(-2.422f)
                lineToRelative(3.957f, 6.0f)
                horizontalLineToRelative(-2.077f)
                lineToRelative(3.477f, 6.0f)
                horizontalLineToRelative(-3.897f)
                verticalLineToRelative(-2.737f)
                lineToRelative(-1.5f, -2.589f)
                close()
            }
        }
        .build()
        return _treesAlt!!
    }

private var _treesAlt: ImageVector? = null
