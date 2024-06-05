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

public val Icons.Bold.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.83f, 18.54f)
                curveToRelative(-1.77f, 3.42f, -5.05f, 5.46f, -8.79f, 5.46f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-5.56f, 0.0f, -10.09f, -4.53f, -10.09f, -10.09f)
                verticalLineToRelative(-3.82f)
                curveTo(2.0f, 4.53f, 6.53f, 0.0f, 12.09f, 0.0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(3.76f, 0.0f, 7.05f, 2.1f, 8.8f, 5.6f)
                curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
                curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.67f)
                curveToRelative(-1.24f, -2.5f, -3.47f, -3.94f, -6.11f, -3.94f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-3.91f, 0.0f, -7.09f, 3.18f, -7.09f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0.0f, 2.8f, 1.63f, 5.23f, 4.0f, 6.38f)
                verticalLineTo(11.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.68f, 0.0f, 1.25f, 0.45f, 1.44f, 1.07f)
                curveToRelative(1.02f, -0.67f, 2.25f, -1.07f, 3.56f, -1.07f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                reflectiveCurveToRelative(0.06f, 0.0f, 0.09f, 0.0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(2.59f, 0.0f, 4.88f, -1.44f, 6.12f, -3.84f)
                curveToRelative(0.38f, -0.74f, 1.28f, -1.02f, 2.02f, -0.64f)
                curveToRelative(0.74f, 0.38f, 1.02f, 1.29f, 0.64f, 2.02f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
