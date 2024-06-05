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

public val Icons.Filled.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.24f, 8.0f)
                horizontalLineToRelative(6.75f)
                curveToRelative(-0.6f, 0.89f, -1.39f, 2.16f, -2.45f, 4.0f)
                lineTo(4.98f, 12.0f)
                curveToRelative(0.87f, -1.59f, 1.61f, -2.9f, 2.26f, -4.0f)
                close()
                moveTo(18.0f, 6.0f)
                horizontalLineToRelative(5.86f)
                curveToRelative(-0.29f, -1.52f, -1.05f, -2.92f, -2.23f, -4.01f)
                curveToRelative(-1.03f, -0.95f, -2.28f, -1.58f, -3.63f, -1.84f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(1.41f, 18.0f)
                horizontalLineToRelative(6.69f)
                curveToRelative(0.76f, -1.27f, 1.47f, -2.46f, 1.78f, -3.02f)
                curveToRelative(0.19f, -0.34f, 0.36f, -0.66f, 0.54f, -0.98f)
                lineTo(3.82f, 14.0f)
                curveToRelative(-0.74f, 1.24f, -1.69f, 2.81f, -2.41f, 4.0f)
                close()
                moveTo(18.09f, 8.0f)
                reflectiveCurveToRelative(0.0f, 0.01f, 0.0f, 0.02f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.18f, 0.38f, -0.27f, 0.79f, -0.27f, 1.22f)
                curveToRelative(0.0f, 1.33f, 0.89f, 2.76f, 2.84f, 2.76f)
                curveToRelative(1.26f, 0.0f, 2.4f, -0.77f, 2.83f, -1.93f)
                curveToRelative(0.25f, -0.68f, 0.41f, -1.37f, 0.47f, -2.07f)
                horizontalLineToRelative(-5.86f)
                close()
                moveTo(15.63f, 6.0f)
                curveToRelative(0.12f, -0.07f, 0.24f, -0.13f, 0.36f, -0.17f)
                lineTo(15.99f, 0.03f)
                curveToRelative(-1.88f, 0.14f, -3.62f, 0.96f, -4.91f, 2.35f)
                curveToRelative(-0.4f, 0.42f, -1.12f, 1.21f, -2.64f, 3.62f)
                horizontalLineToRelative(7.19f)
                close()
                moveTo(0.26f, 20.0f)
                curveToRelative(-0.27f, 0.62f, -0.33f, 1.3f, -0.13f, 1.96f)
                curveToRelative(0.23f, 0.75f, 0.73f, 1.36f, 1.42f, 1.72f)
                curveToRelative(0.43f, 0.22f, 0.88f, 0.33f, 1.33f, 0.33f)
                curveToRelative(1.0f, 0.0f, 1.97f, -0.53f, 2.49f, -1.47f)
                curveToRelative(0.14f, -0.25f, 0.77f, -1.29f, 1.52f, -2.53f)
                lineTo(0.26f, 20.01f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
