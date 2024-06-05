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

public val Icons.Filled.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.968f, 8.532f)
                lineTo(19.3f, 7.365f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(2.333f, 1.167f)
                lineTo(21.635f, 9.7f)
                lineToRelative(-1.167f, 2.333f)
                lineTo(19.3f, 9.7f)
                close()
                moveTo(23.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 17.0f)
                close()
                moveTo(17.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 13.0f)
                close()
                moveTo(18.76f, 21.894f)
                lineTo(20.226f, 20.888f)
                lineTo(18.605f, 20.157f)
                curveToRelative(-7.013f, -3.036f, -7.5f, -13.218f, -0.8f, -16.906f)
                lineToRelative(1.542f, -0.88f)
                lineToRelative(-1.552f, -0.862f)
                curveTo(10.032f, -2.985f, -0.151f, 3.044f, 0.0f, 12.0f)
                arcTo(11.975f, 11.975f, 0.0f, false, false, 18.76f, 21.894f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
