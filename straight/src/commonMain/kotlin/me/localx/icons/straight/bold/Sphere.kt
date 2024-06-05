package me.localx.icons.straight.bold

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
                moveTo(3.044f, 12.0f)
                curveToRelative(0.518f, -0.645f, 3.572f, -2.0f, 8.956f, -2.0f)
                reflectiveCurveToRelative(8.437f, 1.355f, 8.956f, 2.0f)
                curveToRelative(-0.519f, 0.645f, -3.572f, 2.0f, -8.956f, 2.0f)
                reflectiveCurveTo(3.562f, 12.645f, 3.044f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 8.132f, 5.17f)
                arcTo(25.53f, 25.53f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(25.53f, 25.53f, 0.0f, false, false, 3.868f, 8.17f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -8.132f, -5.17f)
                arcTo(25.53f, 25.53f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(25.53f, 25.53f, 0.0f, false, false, 8.132f, -1.17f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
