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

public val Icons.Filled.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 0.0f)
                curveTo(6.71f, 0.0f, 2.0f, 4.71f, 2.0f, 10.5f)
                curveToRelative(0.0f, 2.97f, 1.281f, 5.797f, 3.47f, 7.775f)
                lineToRelative(-4.257f, 4.257f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.134f, -6.134f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.087f, -0.087f, 0.087f, -0.087f)
                curveToRelative(-1.143f, -1.246f, -1.847f, -2.902f, -1.847f, -4.726f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                curveToRelative(3.772f, 0.0f, 6.838f, 2.985f, 6.986f, 6.721f)
                lineToRelative(0.065f, 0.279f)
                horizontalLineToRelative(1.669f)
                reflectiveCurveToRelative(0.28f, -1.984f, 0.28f, -2.5f)
                curveTo(23.0f, 4.71f, 18.29f, 0.0f, 12.5f, 0.0f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
