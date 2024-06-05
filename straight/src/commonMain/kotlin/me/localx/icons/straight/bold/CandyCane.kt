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

public val Icons.Bold.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 7.61f)
                curveToRelative(-0.06f, -2.08f, -0.96f, -4.03f, -2.52f, -5.49f)
                curveTo(19.92f, 0.68f, 17.88f, -0.07f, 15.76f, 0.0f)
                curveToRelative(-2.12f, 0.08f, -4.09f, 0.98f, -5.54f, 2.54f)
                curveToRelative(-0.74f, 0.79f, -2.05f, 2.62f, -6.13f, 10.1f)
                curveTo(1.91f, 16.66f, 0.06f, 19.93f, 0.06f, 19.93f)
                lineToRelative(7.78f, 4.24f)
                reflectiveCurveToRelative(5.19f, -9.66f, 7.23f, -13.42f)
                lineToRelative(6.16f, 3.55f)
                lineToRelative(0.8f, -1.03f)
                curveToRelative(1.34f, -1.72f, 2.01f, -3.68f, 1.95f, -5.66f)
                close()
                moveTo(7.32f, 13.0f)
                horizontalLineToRelative(3.11f)
                curveToRelative(-0.36f, 0.66f, -0.72f, 1.34f, -1.08f, 2.0f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(0.16f, -0.29f, 0.33f, -0.6f, 0.5f, -0.92f)
                curveToRelative(0.2f, -0.37f, 0.4f, -0.73f, 0.59f, -1.08f)
                close()
                moveTo(8.99f, 10.0f)
                curveToRelative(0.42f, -0.74f, 0.81f, -1.4f, 1.16f, -2.0f)
                horizontalLineToRelative(3.01f)
                curveToRelative(-0.31f, 0.55f, -0.68f, 1.23f, -1.1f, 2.0f)
                horizontalLineToRelative(-3.07f)
                close()
                moveTo(15.88f, 3.0f)
                curveToRelative(0.43f, -0.01f, 0.85f, 0.03f, 1.26f, 0.12f)
                lineToRelative(-1.34f, 1.88f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(0.13f, -0.17f, 0.24f, -0.31f, 0.34f, -0.42f)
                curveToRelative(0.9f, -0.97f, 2.13f, -1.53f, 3.46f, -1.58f)
                close()
                moveTo(4.17f, 18.75f)
                curveToRelative(0.12f, -0.22f, 0.26f, -0.47f, 0.41f, -0.75f)
                horizontalLineToRelative(3.16f)
                curveToRelative(-0.43f, 0.8f, -0.82f, 1.52f, -1.12f, 2.09f)
                lineToRelative(-2.46f, -1.34f)
                close()
                moveTo(20.36f, 10.34f)
                lineToRelative(-2.17f, -1.25f)
                curveToRelative(0.09f, -0.26f, 0.13f, -0.54f, 0.13f, -0.82f)
                curveToRelative(0.0f, -0.43f, -0.12f, -0.83f, -0.33f, -1.19f)
                lineToRelative(1.74f, -2.44f)
                curveToRelative(0.78f, 0.86f, 1.22f, 1.93f, 1.25f, 3.06f)
                curveToRelative(0.03f, 0.89f, -0.19f, 1.79f, -0.63f, 2.64f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
