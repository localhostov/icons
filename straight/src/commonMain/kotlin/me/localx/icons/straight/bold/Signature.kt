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

public val Icons.Bold.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 14.01f)
                curveToRelative(-0.31f, -1.59f, -0.95f, -2.94f, -1.89f, -4.03f)
                lineToRelative(2.27f, -1.96f)
                curveToRelative(1.29f, 1.49f, 2.15f, 3.31f, 2.56f, 5.41f)
                lineToRelative(-2.94f, 0.58f)
                close()
                moveTo(20.98f, 16.48f)
                lineToRelative(2.95f, 0.54f)
                curveToRelative(-0.52f, 2.84f, -2.85f, 4.99f, -5.44f, 4.99f)
                curveToRelative(-1.38f, 0.0f, -2.62f, -0.51f, -3.69f, -1.29f)
                curveToRelative(-1.21f, 0.78f, -2.66f, 1.29f, -4.31f, 1.29f)
                curveToRelative(-1.95f, 0.0f, -3.69f, -0.98f, -5.17f, -2.46f)
                curveToRelative(-1.55f, 1.48f, -3.36f, 2.46f, -5.33f, 2.46f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.18f, 0.0f, 2.37f, -0.7f, 3.45f, -1.77f)
                curveTo(1.27f, 13.95f, 0.0f, 9.8f, 0.0f, 7.5f)
                curveTo(0.0f, 4.47f, 2.47f, 2.0f, 5.5f, 2.0f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0.0f, 2.37f, -1.4f, 6.51f, -3.71f, 9.76f)
                curveToRelative(1.01f, 1.06f, 2.11f, 1.74f, 3.21f, 1.74f)
                curveToRelative(0.8f, 0.0f, 1.52f, -0.2f, 2.17f, -0.52f)
                curveToRelative(-1.06f, -1.52f, -1.67f, -3.24f, -1.67f, -4.48f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.28f, -0.67f, 3.06f, -1.9f, 4.61f)
                curveToRelative(0.45f, 0.24f, 0.92f, 0.39f, 1.4f, 0.39f)
                curveToRelative(1.14f, 0.0f, 2.23f, -1.11f, 2.49f, -2.52f)
                close()
                moveTo(5.41f, 14.73f)
                curveToRelative(1.54f, -2.45f, 2.58f, -5.39f, 2.58f, -7.23f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.84f, 0.97f, 4.78f, 2.42f, 7.23f)
                close()
                moveTo(15.99f, 14.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.64f, 0.37f, 1.6f, 0.96f, 2.5f)
                curveToRelative(0.67f, -0.92f, 1.04f, -1.89f, 1.04f, -2.5f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
