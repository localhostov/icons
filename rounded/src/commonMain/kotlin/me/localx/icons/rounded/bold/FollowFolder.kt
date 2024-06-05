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

public val Icons.Bold.FollowFolder: ImageVector
    get() {
        if (_followFolder != null) {
            return _followFolder!!
        }
        _followFolder = Builder(name = "FollowFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.75f)
                curveToRelative(0.0f, 2.16f, -2.82f, 4.85f, -4.22f, 5.98f)
                curveToRelative(-0.45f, 0.36f, -1.1f, 0.36f, -1.55f, 0.0f)
                curveToRelative(-1.4f, -1.13f, -4.22f, -3.81f, -4.22f, -5.98f)
                curveToRelative(0.0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
                curveToRelative(1.22f, 0.0f, 2.27f, 0.96f, 2.49f, 2.22f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.22f, -1.27f, 1.29f, -2.22f, 2.51f, -2.22f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.23f, 2.5f, 2.75f)
                close()
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(-0.08f, 0.0f, -0.15f, -0.02f, -0.22f, -0.05f)
                lineTo(9.59f, 0.37f)
                curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.47f, 0.0f, 0.0f, 2.47f, 0.0f, 5.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.95f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(7.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
