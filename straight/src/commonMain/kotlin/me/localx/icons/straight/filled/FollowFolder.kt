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
                moveTo(24.0f, 16.24f)
                curveToRelative(0.0f, 3.39f, -6.0f, 7.56f, -6.0f, 7.56f)
                curveToRelative(0.0f, 0.0f, -6.0f, -4.17f, -6.0f, -7.56f)
                curveToRelative(0.0f, -1.79f, 1.34f, -3.24f, 3.0f, -3.24f)
                reflectiveCurveToRelative(3.0f, 1.16f, 3.0f, 2.95f)
                curveToRelative(0.0f, -1.79f, 1.34f, -2.95f, 3.0f, -2.95f)
                reflectiveCurveToRelative(3.0f, 1.45f, 3.0f, 3.24f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(12.24f, 2.0f)
                lineTo(8.24f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(10.0f, 16.24f)
                curveToRelative(0.0f, -2.89f, 2.24f, -5.24f, 5.0f, -5.24f)
                curveToRelative(1.14f, 0.0f, 2.18f, 0.34f, 3.0f, 0.94f)
                curveToRelative(0.82f, -0.59f, 1.86f, -0.94f, 3.0f, -0.94f)
                reflectiveCurveToRelative(2.16f, 0.41f, 3.0f, 1.07f)
                verticalLineToRelative(-4.07f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(14.0f)
                lineTo(12.89f, 22.0f)
                curveToRelative(-1.53f, -1.65f, -2.89f, -3.7f, -2.89f, -5.76f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
