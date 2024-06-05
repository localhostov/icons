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

public val Icons.Filled.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.0f, 7.0f)
                curveToRelative(3.281f, 0.0f, 4.0f, 2.5f, 4.0f, 3.461f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.47f, 9.414f)
                arcTo(2.289f, 2.289f, 0.0f, false, false, 6.0f, 9.0f)
                close()
                moveTo(16.336f, 17.748f)
                arcToRelative(6.358f, 6.358f, 0.0f, false, false, -8.672f, 0.0f)
                lineToRelative(-1.33f, -1.494f)
                arcToRelative(8.375f, 8.375f, 0.0f, false, true, 11.332f, 0.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -1.471f, 0.413f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.0f, 10.461f)
                horizontalLineToRelative(0.0f)
                curveTo(14.0f, 9.5f, 14.719f, 7.0f, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
