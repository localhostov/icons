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

public val Icons.Bold.Aubergine: ImageVector
    get() {
        if (_aubergine != null) {
            return _aubergine!!
        }
        _aubergine = Builder(name = "Aubergine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 4.193f)
                curveToRelative(0.862f, -0.287f, 1.439f, -0.547f, 1.493f, -0.571f)
                lineTo(22.111f, 0.891f)
                arcTo(15.356f, 15.356f, 0.0f, false, true, 19.0f, 1.849f)
                verticalLineTo(0.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.846f)
                arcTo(15.177f, 15.177f, 0.0f, false, true, 12.919f, 0.893f)
                lineTo(11.668f, 3.62f)
                curveToRelative(0.053f, 0.024f, 0.629f, 0.285f, 1.49f, 0.574f)
                arcTo(6.467f, 6.467f, 0.0f, false, false, 11.13f, 7.7f)
                curveTo(11.051f, 8.093f, 10.686f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(7.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.0f, 15.0f)
                curveTo(17.832f, 24.0f, 24.0f, 18.393f, 24.0f, 9.0f)
                arcTo(6.478f, 6.478f, 0.0f, false, false, 21.86f, 4.193f)
                close()
                moveTo(7.5f, 21.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                horizontalLineTo(9.0f)
                curveToRelative(3.189f, 0.0f, 4.725f, -1.994f, 5.07f, -3.7f)
                arcTo(3.49f, 3.49f, 0.0f, false, true, 16.0f, 5.853f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.851f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.0f, 9.0f)
                curveTo(21.0f, 16.738f, 16.206f, 21.0f, 7.5f, 21.0f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
