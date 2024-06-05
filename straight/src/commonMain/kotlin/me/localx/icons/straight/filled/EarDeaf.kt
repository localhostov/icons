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

public val Icons.Filled.EarDeaf: ImageVector
    get() {
        if (_earDeaf != null) {
            return _earDeaf!!
        }
        _earDeaf = Builder(name = "EarDeaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.29f, 12.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(1.41f, 24.01f)
                lineTo(0.0f, 22.59f)
                lineTo(10.29f, 12.29f)
                close()
                moveTo(19.83f, 5.57f)
                lineTo(24.01f, 1.41f)
                lineTo(22.59f, 0.0f)
                lineToRelative(-3.95f, 3.95f)
                curveToRelative(-1.43f, -1.57f, -3.41f, -2.64f, -5.61f, -2.88f)
                curveToRelative(-2.56f, -0.29f, -5.13f, 0.53f, -7.03f, 2.23f)
                curveToRelative(-1.91f, 1.71f, -3.0f, 4.15f, -3.0f, 6.71f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.99f, 0.85f, -3.89f, 2.34f, -5.22f)
                curveToRelative(1.51f, -1.35f, 3.45f, -1.96f, 5.48f, -1.73f)
                curveToRelative(3.17f, 0.36f, 5.74f, 2.91f, 6.13f, 6.06f)
                curveToRelative(0.25f, 2.05f, -0.36f, 4.01f, -1.71f, 5.54f)
                curveToRelative(-0.75f, 0.85f, -1.24f, 2.16f, -1.24f, 3.36f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.7f, 0.31f, -1.55f, 0.73f, -2.03f)
                curveToRelative(1.71f, -1.93f, 2.52f, -4.52f, 2.2f, -7.11f)
                curveToRelative(-0.14f, -1.18f, -0.53f, -2.29f, -1.09f, -3.29f)
                close()
                moveTo(15.74f, 13.3f)
                curveToRelative(0.81f, -0.91f, 1.25f, -2.09f, 1.25f, -3.31f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.73f, -0.27f, 1.44f, -0.75f, 1.98f)
                lineToRelative(1.5f, 1.32f)
                close()
            }
        }
        .build()
        return _earDeaf!!
    }

private var _earDeaf: ImageVector? = null
