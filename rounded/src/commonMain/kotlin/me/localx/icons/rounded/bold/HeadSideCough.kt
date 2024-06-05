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

public val Icons.Bold.HeadSideCough: ImageVector
    get() {
        if (_headSideCough != null) {
            return _headSideCough!!
        }
        _headSideCough = Builder(name = "HeadSideCough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 14.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 20.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.97f, 20.93f)
                curveToRelative(2.38f, -0.38f, 4.28f, -2.29f, 4.59f, -4.74f)
                lineToRelative(0.15f, -1.19f)
                curveToRelative(1.48f, -0.09f, 2.28f, -1.3f, 2.28f, -2.45f)
                curveToRelative(0.0f, -1.66f, -3.13f, -6.9f, -4.12f, -8.11f)
                curveTo(10.4f, 1.12f, 6.29f, -0.52f, 2.18f, 0.15f)
                curveToRelative(-0.36f, 0.06f, -0.73f, 0.14f, -1.08f, 0.24f)
                curveTo(0.3f, 0.61f, -0.17f, 1.43f, 0.05f, 2.23f)
                curveToRelative(0.22f, 0.8f, 1.05f, 1.27f, 1.84f, 1.05f)
                curveToRelative(0.25f, -0.07f, 0.51f, -0.13f, 0.77f, -0.17f)
                curveToRelative(3.0f, -0.5f, 6.0f, 0.7f, 7.85f, 3.16f)
                curveToRelative(0.97f, 1.19f, 2.65f, 4.25f, 3.27f, 5.72f)
                horizontalLineToRelative(-0.39f)
                curveToRelative(-0.76f, 0.0f, -1.39f, 0.56f, -1.49f, 1.31f)
                lineToRelative(-0.32f, 2.5f)
                curveToRelative(-0.16f, 1.25f, -1.22f, 2.19f, -2.48f, 2.19f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(1.5f, 20.99f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(6.5f, 23.99f)
                curveToRelative(1.78f, 0.0f, 3.26f, -1.34f, 3.47f, -3.07f)
                close()
            }
        }
        .build()
        return _headSideCough!!
    }

private var _headSideCough: ImageVector? = null
