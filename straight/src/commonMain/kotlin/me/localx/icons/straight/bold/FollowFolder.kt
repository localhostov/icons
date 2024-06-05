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
                moveTo(24.0f, 5.5f)
                lineTo(24.0f, 13.79f)
                curveToRelative(-0.72f, -0.5f, -1.58f, -0.79f, -2.5f, -0.79f)
                curveToRelative(-0.17f, 0.0f, -0.34f, 0.0f, -0.5f, 0.03f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.19f, 19.0f)
                curveToRelative(0.3f, 1.06f, 0.93f, 2.08f, 1.68f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.5f, 15.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 0.96f, -2.5f, 2.45f)
                curveToRelative(0.0f, -1.49f, -1.12f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.21f, -2.5f, 2.7f)
                curveToRelative(0.0f, 2.83f, 5.0f, 6.3f, 5.0f, 6.3f)
                curveToRelative(0.0f, 0.0f, 5.0f, -3.47f, 5.0f, -6.3f)
                curveToRelative(0.0f, -1.49f, -1.12f, -2.7f, -2.5f, -2.7f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
