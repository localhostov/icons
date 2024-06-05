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

public val Icons.Filled.DownRight: ImageVector
    get() {
        if (_downRight != null) {
            return _downRight!!
        }
        _downRight = Builder(name = "DownRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.87f, 7.87f)
                curveToRelative(1.11f, -1.1f, 2.82f, -1.2f, 4.14f, -0.11f)
                curveToRelative(0.65f, 0.54f, 0.97f, 1.39f, 0.97f, 2.23f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 9.01f, 0.0f, 9.01f)
                curveToRelative(0.0f, 2.21f, -1.79f, 3.99f, -4.0f, 3.99f)
                horizontalLineTo(10.1f)
                curveToRelative(-1.17f, 0.0f, -2.3f, -0.61f, -2.81f, -1.66f)
                curveToRelative(-0.58f, -1.18f, -0.36f, -2.52f, 0.56f, -3.45f)
                lineToRelative(1.47f, -1.47f)
                lineTo(1.88f, 8.91f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.0f, -4.24f)
                lineTo(4.71f, 1.84f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0.0f)
                lineToRelative(7.45f, 7.5f)
                lineToRelative(1.47f, -1.48f)
                close()
            }
        }
        .build()
        return _downRight!!
    }

private var _downRight: ImageVector? = null
