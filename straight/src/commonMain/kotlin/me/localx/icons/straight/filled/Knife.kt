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

public val Icons.Filled.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.668f, 0.14f)
                arcTo(2.214f, 2.214f, 0.0f, false, false, 20.226f, 0.7f)
                lineTo(-0.011f, 22.624f)
                lineToRelative(1.466f, 1.359f)
                lineToRelative(5.494f, -5.9f)
                curveToRelative(13.0f, -1.19f, 17.039f, -11.846f, 17.039f, -15.593f)
                verticalLineTo(2.132f)
                arcTo(2.094f, 2.094f, 0.0f, false, false, 22.668f, 0.14f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
