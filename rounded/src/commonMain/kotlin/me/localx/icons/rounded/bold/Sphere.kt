package me.localx.icons.rounded.bold

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

public val Icons.Bold.Sphere: ImageVector
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
                moveTo(12.0f, 15.272f)
                curveTo(6.59f, 15.272f, 3.0f, 13.3f, 3.0f, 12.0f)
                reflectiveCurveToRelative(3.59f, -3.272f, 9.0f, -3.272f)
                reflectiveCurveTo(21.0f, 10.7f, 21.0f, 12.0f)
                reflectiveCurveTo(17.41f, 15.272f, 12.0f, 15.272f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 7.5f, 4.039f)
                arcTo(20.176f, 20.176f, 0.0f, false, false, 12.0f, 5.728f)
                arcTo(20.176f, 20.176f, 0.0f, false, false, 4.5f, 7.039f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -7.5f, -4.039f)
                arcTo(20.176f, 20.176f, 0.0f, false, false, 12.0f, 18.272f)
                arcToRelative(20.176f, 20.176f, 0.0f, false, false, 7.5f, -1.311f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
