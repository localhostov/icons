package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 9.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 6.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 9.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.083f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 3.745f, 3.371f)
                arcTo(11.885f, 11.885f, 0.0f, false, true, 12.5f, 0.007f)
                arcTo(12.155f, 12.155f, 0.0f, false, true, 24.08f, 11.7f)
                arcToRelative(11.924f, 11.924f, 0.0f, false, true, -0.775f, 4.552f)
                arcToRelative(1.888f, 1.888f, 0.0f, false, true, -1.377f, 1.177f)
                arcToRelative(1.912f, 1.912f, 0.0f, false, true, -1.769f, -0.521f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(3.567f, 3.567f, 0.0f, false, false, -6.089f, 2.553f)
                lineToRelative(0.04f, 4.516f)
                lineToRelative(-0.924f, 0.077f)
                curveTo(12.753f, 23.978f, 12.421f, 24.0f, 12.083f, 24.0f)
                close()
                moveTo(12.083f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.09f, 20.0f)
                lineToRelative(-0.024f, -2.625f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 13.6f, 15.39f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 7.872f, 0.0f)
                lineToRelative(0.014f, 0.014f)
                arcToRelative(9.892f, 9.892f, 0.0f, false, false, 0.595f, -3.655f)
                arcToRelative(10.127f, 10.127f, 0.0f, false, false, -9.645f, -9.743f)
                curveTo(12.317f, 2.0f, 12.2f, 2.0f, 12.082f, 2.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
