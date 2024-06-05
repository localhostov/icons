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

public val Icons.Outline.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(6.276f, 16.0f, 2.0f, 13.889f, 2.0f, 12.0f)
                reflectiveCurveTo(6.276f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(10.0f, 2.111f, 10.0f, 4.0f)
                reflectiveCurveTo(17.724f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, true, 9.189f, 6.062f)
                arcTo(18.635f, 18.635f, 0.0f, false, false, 12.0f, 6.0f)
                arcTo(18.635f, 18.635f, 0.0f, false, false, 2.811f, 8.062f)
                arcTo(10.013f, 10.013f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, true, -9.189f, -6.062f)
                arcTo(18.635f, 18.635f, 0.0f, false, false, 12.0f, 18.0f)
                arcToRelative(18.635f, 18.635f, 0.0f, false, false, 9.189f, -2.062f)
                arcTo(10.013f, 10.013f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
