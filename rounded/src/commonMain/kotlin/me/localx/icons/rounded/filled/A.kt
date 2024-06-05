package me.localx.icons.rounded.filled

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

public val Icons.Filled.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.931f, 22.634f)
                lineTo(16.144f, 2.814f)
                curveTo(15.46f, 1.072f, 13.872f, -0.01f, 12.0f, -0.01f)
                reflectiveCurveToRelative(-3.46f, 1.082f, -4.144f, 2.824f)
                lineTo(0.069f, 22.634f)
                curveToRelative(-0.202f, 0.514f, 0.051f, 1.095f, 0.565f, 1.296f)
                curveToRelative(0.515f, 0.203f, 1.095f, -0.051f, 1.296f, -0.565f)
                lineToRelative(2.501f, -6.366f)
                horizontalLineToRelative(15.137f)
                lineToRelative(2.501f, 6.366f)
                curveToRelative(0.155f, 0.394f, 0.532f, 0.635f, 0.931f, 0.635f)
                curveToRelative(0.122f, 0.0f, 0.245f, -0.022f, 0.365f, -0.07f)
                curveToRelative(0.514f, -0.202f, 0.767f, -0.782f, 0.565f, -1.296f)
                close()
                moveTo(5.217f, 15.0f)
                lineTo(9.717f, 3.545f)
                curveToRelative(0.451f, -1.147f, 1.475f, -1.556f, 2.283f, -1.556f)
                reflectiveCurveToRelative(1.832f, 0.409f, 2.283f, 1.556f)
                lineToRelative(4.5f, 11.455f)
                horizontalLineTo(5.217f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
