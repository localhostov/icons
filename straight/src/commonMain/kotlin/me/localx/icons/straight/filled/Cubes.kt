package me.localx.icons.straight.filled

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

public val Icons.Filled.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.93f)
                lineToRelative(4.93f, -2.47f)
                lineToRelative(-4.93f, -2.46f)
                lineToRelative(-4.93f, 2.46f)
                lineToRelative(4.93f, 2.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 17.48f)
                lineToRelative(-5.0f, -2.49f)
                lineToRelative(0.0f, 6.12f)
                lineToRelative(5.0f, 2.87f)
                lineToRelative(0.0f, -6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.98f)
                lineToRelative(5.0f, -2.87f)
                lineToRelative(0.0f, -6.12f)
                lineToRelative(-5.0f, 2.49f)
                lineToRelative(0.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.09f)
                lineToRelative(0.0f, -5.5f)
                lineToRelative(-5.0f, -2.49f)
                lineToRelative(0.0f, 5.42f)
                lineToRelative(5.0f, 2.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.89f, 11.2f)
                lineToRelative(-4.01f, 2.01f)
                lineToRelative(5.12f, 2.52f)
                lineToRelative(3.89f, -1.96f)
                lineToRelative(-5.0f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.52f)
                lineToRelative(0.0f, -5.42f)
                lineToRelative(-5.0f, 2.49f)
                lineToRelative(0.0f, 5.49f)
                lineToRelative(5.0f, -2.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.11f, 11.2f)
                lineToRelative(-5.01f, 2.57f)
                lineToRelative(3.9f, 1.96f)
                lineToRelative(5.12f, -2.52f)
                lineToRelative(-4.01f, -2.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.48f)
                lineToRelative(-4.0f, 1.95f)
                lineToRelative(0.0f, 6.5f)
                lineToRelative(4.0f, -2.25f)
                lineToRelative(0.0f, -6.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.47f)
                lineToRelative(0.0f, 6.2f)
                lineToRelative(4.0f, 2.24f)
                lineToRelative(0.0f, -6.5f)
                lineToRelative(-4.0f, -1.94f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
