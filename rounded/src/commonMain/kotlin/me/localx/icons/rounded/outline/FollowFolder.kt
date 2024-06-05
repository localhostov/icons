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

public val Icons.Outline.FollowFolder: ImageVector
    get() {
        if (_followFolder != null) {
            return _followFolder!!
        }
        _followFolder = Builder(name = "FollowFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0.0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineTo(8.87f, 0.32f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.15f, 0.0f, 0.31f, 0.04f, 0.45f, 0.11f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.41f, 0.21f, 0.88f, 0.32f, 1.34f, 0.32f)
                horizontalLineToRelative(6.53f)
                curveToRelative(1.3f, 0.0f, 2.42f, 0.84f, 2.83f, 2.0f)
                lineTo(2.0f, 6.01f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.5f, 13.0f)
                curveToRelative(-0.95f, 0.0f, -1.84f, 0.42f, -2.5f, 1.1f)
                curveToRelative(-0.65f, -0.68f, -1.54f, -1.1f, -2.5f, -1.1f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.68f, -3.5f, 3.75f)
                curveToRelative(0.0f, 2.85f, 3.52f, 5.89f, 4.6f, 6.76f)
                curveToRelative(0.41f, 0.33f, 0.9f, 0.49f, 1.4f, 0.49f)
                reflectiveCurveToRelative(1.0f, -0.16f, 1.4f, -0.49f)
                curveToRelative(1.08f, -0.87f, 4.6f, -3.91f, 4.6f, -6.76f)
                curveToRelative(0.0f, -2.07f, -1.57f, -3.75f, -3.5f, -3.75f)
                close()
                moveTo(18.15f, 21.95f)
                curveToRelative(-0.09f, 0.07f, -0.21f, 0.07f, -0.3f, 0.0f)
                curveToRelative(-1.85f, -1.49f, -3.85f, -3.75f, -3.85f, -5.2f)
                curveToRelative(0.0f, -0.96f, 0.67f, -1.75f, 1.5f, -1.75f)
                curveToRelative(0.72f, 0.0f, 1.37f, 0.6f, 1.51f, 1.4f)
                curveToRelative(0.08f, 0.48f, 0.5f, 0.83f, 0.98f, 0.83f)
                reflectiveCurveToRelative(0.9f, -0.35f, 0.98f, -0.83f)
                curveToRelative(0.14f, -0.8f, 0.8f, -1.4f, 1.52f, -1.4f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.79f, 1.5f, 1.75f)
                curveToRelative(0.0f, 1.45f, -2.0f, 3.71f, -3.85f, 5.2f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
