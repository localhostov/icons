package me.localx.icons.rounded.outline

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

public val Icons.Outline.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, false, -1.47f, 0.41f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.0f, 10.481f)
                curveTo(14.0f, 9.5f, 14.708f, 7.006f, 18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 8.0f)
                close()
                moveTo(7.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, -0.019f)
                curveTo(10.0f, 9.5f, 9.292f, 7.006f, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 9.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, true, 1.472f, 0.409f)
                arcTo(1.491f, 1.491f, 0.0f, false, false, 7.0f, 10.5f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                curveToRelative(-13.248f, 0.5f, -13.245f, 19.5f, 0.0f, 20.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(17.666f, 16.254f)
                arcToRelative(8.375f, 8.375f, 0.0f, false, false, -11.332f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.33f, 1.494f)
                arcToRelative(6.358f, 6.358f, 0.0f, false, true, 8.671f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.331f, -1.493f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
