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

public val Icons.Bold.Cowbell: ImageVector
    get() {
        if (_cowbell != null) {
            return _cowbell!!
        }
        _cowbell = Builder(name = "Cowbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.93f, 15.71f)
                lineToRelative(-1.1f, -6.18f)
                curveToRelative(-0.44f, -2.48f, -2.49f, -4.31f, -4.96f, -4.51f)
                curveToRelative(0.09f, -0.33f, 0.13f, -0.67f, 0.13f, -1.02f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.35f, 0.05f, 0.69f, 0.13f, 1.02f)
                curveToRelative(-2.47f, 0.2f, -4.52f, 2.04f, -4.96f, 4.51f)
                lineToRelative(-1.1f, 6.18f)
                curveToRelative(-0.23f, 1.31f, 0.12f, 2.66f, 0.98f, 3.68f)
                curveToRelative(0.86f, 1.02f, 2.11f, 1.61f, 3.45f, 1.61f)
                horizontalLineToRelative(2.63f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3.0f, 3.87f, 3.0f)
                reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3.0f)
                horizontalLineToRelative(2.63f)
                curveToRelative(1.33f, 0.0f, 2.59f, -0.59f, 3.45f, -1.61f)
                curveToRelative(0.86f, -1.02f, 1.21f, -2.37f, 0.98f, -3.68f)
                close()
                moveTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(19.65f, 17.46f)
                curveToRelative(-0.17f, 0.2f, -0.54f, 0.54f, -1.15f, 0.54f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-0.61f, 0.0f, -0.98f, -0.34f, -1.15f, -0.54f)
                reflectiveCurveToRelative(-0.43f, -0.63f, -0.33f, -1.23f)
                lineToRelative(1.1f, -6.18f)
                curveToRelative(0.21f, -1.19f, 1.25f, -2.06f, 2.46f, -2.06f)
                horizontalLineToRelative(8.83f)
                curveToRelative(1.21f, 0.0f, 2.25f, 0.87f, 2.46f, 2.06f)
                lineToRelative(1.1f, 6.18f)
                curveToRelative(0.11f, 0.6f, -0.16f, 1.03f, -0.33f, 1.23f)
                close()
            }
        }
        .build()
        return _cowbell!!
    }

private var _cowbell: ImageVector? = null
