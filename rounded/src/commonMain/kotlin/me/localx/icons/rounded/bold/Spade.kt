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

public val Icons.Bold.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.3f)
                curveToRelative(0.0f, -3.965f, -4.017f, -7.959f, -7.516f, -11.0f)
                arcToRelative(5.341f, 5.341f, 0.0f, false, false, -6.97f, 0.0f)
                curveTo(5.016f, 4.343f, 1.0f, 8.337f, 1.0f, 12.3f)
                arcTo(6.492f, 6.492f, 0.0f, false, false, 7.25f, 19.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 3.134f, -1.011f)
                curveTo(10.14f, 19.467f, 9.424f, 21.0f, 7.5f, 21.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.713f, 0.0f, -2.514f, -1.534f, -2.829f, -2.973f)
                arcTo(5.386f, 5.386f, 0.0f, false, false, 16.75f, 19.0f)
                arcTo(6.492f, 6.492f, 0.0f, false, false, 23.0f, 12.3f)
                close()
                moveTo(13.4f, 12.971f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.809f, 0.0f)
                curveTo(10.583f, 13.0f, 9.4f, 16.0f, 7.25f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 12.3f)
                curveTo(4.0f, 9.2f, 8.878f, 4.964f, 10.48f, 3.572f)
                arcToRelative(2.332f, 2.332f, 0.0f, false, true, 3.038f, 0.0f)
                curveTo(15.121f, 4.964f, 20.0f, 9.2f, 20.0f, 12.3f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.75f, 16.0f)
                curveTo(14.592f, 16.0f, 13.413f, 13.0f, 13.4f, 12.974f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
