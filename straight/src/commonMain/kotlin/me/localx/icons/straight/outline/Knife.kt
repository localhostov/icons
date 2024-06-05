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

public val Icons.Outline.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.679f, 0.155f)
                arcToRelative(2.219f, 2.219f, 0.0f, false, false, -2.445f, 0.558f)
                lineTo(-0.023f, 22.61f)
                lineToRelative(1.467f, 1.358f)
                lineToRelative(5.5f, -5.941f)
                lineToRelative(0.0f, 0.046f)
                curveTo(19.958f, 16.885f, 24.0f, 6.242f, 24.0f, 2.5f)
                verticalLineTo(2.145f)
                arcTo(2.091f, 2.091f, 0.0f, false, false, 22.679f, 0.155f)
                close()
                moveTo(22.0f, 2.5f)
                curveToRelative(0.0f, 1.878f, -2.323f, 11.141f, -12.957f, 13.254f)
                lineTo(21.694f, 2.079f)
                arcTo(0.232f, 0.232f, 0.0f, false, true, 21.866f, 2.0f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, true, 0.073f, 0.013f)
                curveToRelative(0.031f, 0.011f, 0.062f, 0.024f, 0.062f, 0.127f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
