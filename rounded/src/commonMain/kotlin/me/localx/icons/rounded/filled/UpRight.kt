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

public val Icons.Filled.UpRight: ImageVector
    get() {
        if (_upRight != null) {
            return _upRight!!
        }
        _upRight = Builder(name = "UpRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.87f, 6.11f)
                curveToRelative(-1.1f, -1.11f, -1.2f, -2.82f, -0.11f, -4.14f)
                curveToRelative(0.54f, -0.65f, 1.39f, -0.97f, 2.23f, -0.97f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(9.01f, 0.0f, 9.01f, 0.0f)
                curveToRelative(2.21f, 0.0f, 3.99f, 1.79f, 3.99f, 4.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 8.88f, 0.0f, 8.88f)
                curveToRelative(0.0f, 1.17f, -0.61f, 2.3f, -1.66f, 2.81f)
                curveToRelative(-1.18f, 0.58f, -2.52f, 0.36f, -3.45f, -0.56f)
                lineToRelative(-1.47f, -1.47f)
                lineToRelative(-7.5f, 7.44f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0.0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(7.5f, -7.45f)
                lineToRelative(-1.48f, -1.47f)
                close()
            }
        }
        .build()
        return _upRight!!
    }

private var _upRight: ImageVector? = null
