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
                moveTo(22.679f, 0.156f)
                arcToRelative(2.219f, 2.219f, 0.0f, false, false, -2.445f, 0.558f)
                lineTo(0.266f, 22.321f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.469f, 1.357f)
                lineToRelative(5.178f, -5.6f)
                curveTo(19.92f, 16.92f, 24.011f, 6.243f, 24.0f, 2.5f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 22.679f, 0.156f)
                close()
                moveTo(22.0f, 2.5f)
                curveToRelative(0.0f, 1.876f, -2.321f, 11.13f, -12.939f, 13.25f)
                lineTo(21.694f, 2.08f)
                arcToRelative(0.226f, 0.226f, 0.0f, false, true, 0.245f, -0.066f)
                curveTo(22.048f, 2.021f, 21.984f, 2.424f, 22.0f, 2.5f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
