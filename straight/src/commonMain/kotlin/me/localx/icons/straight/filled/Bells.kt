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

public val Icons.Filled.Bells: ImageVector
    get() {
        if (_bells != null) {
            return _bells!!
        }
        _bells = Builder(name = "Bells", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.36f, 21.0f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3.0f, -3.86f, 3.0f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3.0f)
                horizontalLineToRelative(7.72f)
                close()
                moveTo(23.41f, 18.01f)
                lineToRelative(0.05f, -0.06f)
                curveToRelative(0.5f, -0.66f, 0.67f, -1.5f, 0.46f, -2.25f)
                lineToRelative(-1.65f, -7.83f)
                curveToRelative(-0.97f, -3.46f, -4.16f, -5.88f, -7.77f, -5.88f)
                curveToRelative(-3.81f, 0.0f, -7.04f, 2.58f, -7.87f, 6.3f)
                lineToRelative(-1.56f, 7.49f)
                curveToRelative(-0.17f, 0.79f, 0.02f, 1.6f, 0.52f, 2.23f)
                curveToRelative(0.51f, 0.63f, 1.26f, 0.99f, 2.07f, 0.99f)
                horizontalLineToRelative(13.67f)
                curveToRelative(0.81f, 0.0f, 1.56f, -0.36f, 2.07f, -0.99f)
                close()
                moveTo(3.12f, 15.35f)
                lineToRelative(1.55f, -7.47f)
                curveToRelative(0.84f, -3.75f, 3.62f, -6.57f, 7.15f, -7.53f)
                curveToRelative(-0.74f, -0.22f, -1.52f, -0.36f, -2.32f, -0.36f)
                curveTo(5.69f, 0.0f, 2.45f, 2.58f, 1.62f, 6.3f)
                lineTo(0.06f, 13.78f)
                curveToRelative(-0.17f, 0.79f, 0.02f, 1.6f, 0.52f, 2.23f)
                curveToRelative(0.51f, 0.63f, 1.26f, 0.99f, 2.07f, 0.99f)
                horizontalLineToRelative(0.4f)
                curveToRelative(-0.08f, -0.54f, -0.06f, -1.1f, 0.06f, -1.65f)
                close()
            }
        }
        .build()
        return _bells!!
    }

private var _bells: ImageVector? = null
