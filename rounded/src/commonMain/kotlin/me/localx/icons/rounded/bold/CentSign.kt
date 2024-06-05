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

public val Icons.Bold.CentSign: ImageVector
    get() {
        if (_centSign != null) {
            return _centSign!!
        }
        _centSign = Builder(name = "CentSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.78f, 17.42f)
                curveToRelative(-1.35f, 2.6f, -3.9f, 4.3f, -6.78f, 4.55f)
                verticalLineToRelative(0.53f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.52f)
                curveToRelative(-4.41f, -0.29f, -7.9f, -3.96f, -7.9f, -8.44f)
                verticalLineToRelative(-3.09f)
                curveTo(3.1f, 5.98f, 6.59f, 2.3f, 11.0f, 2.02f)
                verticalLineToRelative(-0.52f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.53f)
                curveToRelative(2.93f, 0.25f, 5.51f, 1.99f, 6.84f, 4.66f)
                curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
                curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.67f)
                curveToRelative(-0.93f, -1.87f, -2.8f, -3.03f, -4.89f, -3.03f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-3.01f, 0.0f, -5.45f, 2.45f, -5.45f, 5.45f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 3.01f, 2.45f, 5.45f, 5.45f, 5.45f)
                horizontalLineToRelative(1.72f)
                curveToRelative(2.05f, 0.0f, 3.91f, -1.13f, 4.85f, -2.95f)
                curveToRelative(0.38f, -0.74f, 1.29f, -1.03f, 2.02f, -0.64f)
                curveToRelative(0.74f, 0.38f, 1.02f, 1.29f, 0.64f, 2.02f)
                close()
            }
        }
        .build()
        return _centSign!!
    }

private var _centSign: ImageVector? = null
