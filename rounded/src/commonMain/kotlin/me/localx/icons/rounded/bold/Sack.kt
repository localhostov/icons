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

public val Icons.Bold.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.747f, 5.202f)
                curveToRelative(1.155f, -0.794f, 2.563f, -2.014f, 3.17f, -3.539f)
                curveToRelative(0.318f, -0.799f, -0.32f, -1.663f, -1.179f, -1.663f)
                horizontalLineToRelative(-7.475f)
                curveToRelative(-0.86f, 0.0f, -1.497f, 0.864f, -1.179f, 1.663f)
                curveToRelative(0.607f, 1.525f, 2.015f, 2.745f, 3.17f, 3.539f)
                curveTo(5.112f, 6.39f, 1.0f, 12.585f, 1.0f, 17.75f)
                curveToRelative(0.0f, 3.446f, 2.804f, 6.25f, 6.25f, 6.25f)
                horizontalLineToRelative(9.5f)
                curveToRelative(3.446f, 0.0f, 6.25f, -2.804f, 6.25f, -6.25f)
                curveToRelative(0.0f, -5.165f, -4.112f, -11.36f, -9.253f, -12.548f)
                close()
                moveTo(16.75f, 21.0f)
                lineTo(7.25f, 21.0f)
                curveToRelative(-1.792f, 0.0f, -3.25f, -1.458f, -3.25f, -3.25f)
                curveToRelative(0.0f, -4.556f, 4.262f, -9.75f, 8.0f, -9.75f)
                reflectiveCurveToRelative(8.0f, 5.194f, 8.0f, 9.75f)
                curveToRelative(0.0f, 1.792f, -1.458f, 3.25f, -3.25f, 3.25f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null
