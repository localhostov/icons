package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.WaterRise: ImageVector
    get() {
        if (_waterRise != null) {
            return _waterRise!!
        }
        _waterRise = Builder(name = "WaterRise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                arcToRelative(4.375f, 4.375f, 0.0f, false, true, -3.0f, -1.226f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.184f, 4.184f, 0.0f, false, true, -5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.336f, -1.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.387f, -0.816f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, false, 4.11f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, false, 4.11f, 0.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.388f, 0.817f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.335f, 1.489f)
                arcTo(3.989f, 3.989f, 0.0f, false, true, 21.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                arcToRelative(4.375f, 4.375f, 0.0f, false, true, -3.0f, -1.226f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.184f, 4.184f, 0.0f, false, true, -5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.336f, -1.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.387f, -0.816f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, false, 4.11f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, false, 4.11f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.89f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.388f, 0.817f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.335f, 1.489f)
                arcTo(3.989f, 3.989f, 0.0f, false, true, 21.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.705f, 3.293f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.705f, 4.708f)
                lineTo(11.0f, 3.415f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(3.415f)
                lineToRelative(1.3f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.413f, -1.415f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _waterRise!!
    }

private var _waterRise: ImageVector? = null
