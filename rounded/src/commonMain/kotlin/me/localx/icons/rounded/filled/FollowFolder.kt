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

public val Icons.Filled.FollowFolder: ImageVector
    get() {
        if (_followFolder != null) {
            return _followFolder!!
        }
        _followFolder = Builder(name = "FollowFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.3f)
                curveToRelative(0.0f, 2.6f, -3.38f, 5.82f, -5.07f, 7.17f)
                curveToRelative(-0.54f, 0.44f, -1.32f, 0.44f, -1.86f, 0.0f)
                curveToRelative(-1.69f, -1.35f, -5.07f, -4.58f, -5.07f, -7.17f)
                curveToRelative(0.0f, -1.82f, 1.34f, -3.3f, 3.0f, -3.3f)
                curveToRelative(1.46f, 0.0f, 2.72f, 1.15f, 2.99f, 2.67f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.27f, -1.52f, 1.55f, -2.67f, 3.01f, -2.67f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.48f, 3.0f, 3.3f)
                close()
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0.0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineTo(8.87f, 0.32f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(23.9f, 6.0f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f)
                close()
                moveTo(10.0f, 16.3f)
                curveToRelative(0.0f, -2.92f, 2.24f, -5.3f, 5.0f, -5.3f)
                curveToRelative(1.11f, 0.0f, 2.15f, 0.38f, 2.99f, 1.03f)
                curveToRelative(0.85f, -0.65f, 1.89f, -1.03f, 3.01f, -1.03f)
                reflectiveCurveToRelative(2.16f, 0.4f, 3.0f, 1.06f)
                verticalLineToRelative(-4.06f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.67f)
                curveToRelative(-1.4f, -1.63f, -2.67f, -3.68f, -2.67f, -5.7f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
