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

public val Icons.Outline.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.543f, 6.457f)
                lineToRelative(1.414f, -1.414f)
                lineTo(18.957f, 0.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-6.758f, 6.758f)
                lineToRelative(-2.069f, -2.069f)
                curveToRelative(-1.25f, -1.251f, -3.285f, -1.251f, -4.535f, 0.0f)
                lineTo(0.086f, 13.827f)
                lineToRelative(10.122f, 10.122f)
                lineToRelative(5.888f, -5.888f)
                curveToRelative(1.25f, -1.25f, 1.25f, -3.285f, 0.0f, -4.535f)
                lineToRelative(-2.104f, -2.104f)
                lineToRelative(6.758f, -6.758f)
                lineToRelative(1.793f, 1.793f)
                close()
                moveTo(14.682f, 16.647f)
                lineToRelative(-4.474f, 4.474f)
                lineToRelative(-1.457f, -1.457f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.586f, -1.586f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.422f, -1.422f)
                lineToRelative(4.474f, -4.474f)
                curveToRelative(0.471f, -0.471f, 1.236f, -0.471f, 1.707f, 0.0f)
                lineToRelative(5.587f, 5.586f)
                curveToRelative(0.47f, 0.471f, 0.47f, 1.236f, 0.0f, 1.707f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
