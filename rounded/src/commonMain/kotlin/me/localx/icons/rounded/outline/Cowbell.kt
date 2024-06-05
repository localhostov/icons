package me.localx.icons.rounded.outline

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

public val Icons.Outline.Cowbell: ImageVector
    get() {
        if (_cowbell != null) {
            return _cowbell!!
        }
        _cowbell = Builder(name = "Cowbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.94f, 15.3f)
                lineToRelative(-1.28f, -7.18f)
                curveToRelative(-0.42f, -2.36f, -2.45f, -4.08f, -4.84f, -4.11f)
                curveToRelative(0.11f, -0.32f, 0.19f, -0.65f, 0.19f, -1.01f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.19f, 1.01f)
                curveToRelative(-2.39f, 0.04f, -4.42f, 1.75f, -4.84f, 4.11f)
                lineToRelative(-1.28f, 7.18f)
                curveToRelative(-0.21f, 1.17f, 0.11f, 2.36f, 0.87f, 3.27f)
                curveToRelative(0.76f, 0.91f, 1.88f, 1.43f, 3.07f, 1.43f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.19f, 0.0f, 2.31f, -0.52f, 3.07f, -1.43f)
                reflectiveCurveToRelative(1.08f, -2.1f, 0.87f, -3.27f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(20.53f, 17.28f)
                curveToRelative(-0.38f, 0.46f, -0.94f, 0.72f, -1.53f, 0.72f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-0.59f, 0.0f, -1.15f, -0.26f, -1.53f, -0.72f)
                reflectiveCurveToRelative(-0.54f, -1.05f, -0.44f, -1.64f)
                lineToRelative(1.28f, -7.18f)
                curveToRelative(0.26f, -1.43f, 1.5f, -2.47f, 2.95f, -2.47f)
                horizontalLineToRelative(9.47f)
                curveToRelative(1.46f, 0.0f, 2.7f, 1.04f, 2.95f, 2.47f)
                lineToRelative(1.28f, 7.18f)
                curveToRelative(0.1f, 0.58f, -0.05f, 1.18f, -0.43f, 1.63f)
                close()
            }
        }
        .build()
        return _cowbell!!
    }

private var _cowbell: ImageVector? = null
