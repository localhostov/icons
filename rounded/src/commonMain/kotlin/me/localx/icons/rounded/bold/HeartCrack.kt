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

public val Icons.Bold.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.24f, 0.0f, -2.48f, -0.42f, -3.49f, -1.25f)
                curveTo(4.63f, 17.55f, 0.0f, 12.77f, 0.0f, 8.19f)
                curveTo(0.0f, 4.22f, 3.03f, 1.0f, 6.75f, 1.0f)
                curveToRelative(2.12f, 0.0f, 4.01f, 1.04f, 5.25f, 2.67f)
                curveToRelative(1.24f, -1.63f, 3.13f, -2.67f, 5.25f, -2.67f)
                curveToRelative(3.72f, 0.0f, 6.75f, 3.22f, 6.75f, 7.18f)
                curveToRelative(0.0f, 4.58f, -4.63f, 9.36f, -8.51f, 12.57f)
                curveToRelative(-1.01f, 0.83f, -2.25f, 1.25f, -3.49f, 1.25f)
                close()
                moveTo(6.75f, 4.0f)
                curveToRelative(-2.03f, 0.0f, -3.75f, 1.92f, -3.75f, 4.18f)
                curveToRelative(0.0f, 2.62f, 2.7f, 6.36f, 7.42f, 10.25f)
                curveToRelative(0.92f, 0.76f, 2.25f, 0.76f, 3.16f, 0.0f)
                curveToRelative(4.71f, -3.89f, 7.42f, -7.63f, 7.42f, -10.25f)
                curveToRelative(0.0f, -2.27f, -1.72f, -4.18f, -3.75f, -4.18f)
                reflectiveCurveToRelative(-3.75f, 1.92f, -3.75f, 4.18f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.42f, -0.17f, 0.8f, -0.45f, 1.07f)
                lineToRelative(-0.96f, 0.95f)
                lineToRelative(2.15f, 2.14f)
                curveToRelative(0.48f, 0.47f, 0.74f, 1.1f, 0.74f, 1.77f)
                reflectiveCurveToRelative(-0.26f, 1.29f, -0.74f, 1.77f)
                lineToRelative(-0.72f, 0.71f)
                curveToRelative(-0.59f, 0.58f, -1.54f, 0.57f, -2.12f, -0.02f)
                curveToRelative(-0.58f, -0.59f, -0.57f, -1.54f, 0.02f, -2.12f)
                lineToRelative(0.34f, -0.33f)
                lineToRelative(-1.98f, -1.96f)
                curveToRelative(-0.52f, -0.52f, -0.81f, -1.21f, -0.81f, -1.94f)
                reflectiveCurveToRelative(0.29f, -1.42f, 0.81f, -1.94f)
                lineToRelative(0.67f, -0.67f)
                curveToRelative(-0.26f, -2.0f, -1.86f, -3.59f, -3.71f, -3.59f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
