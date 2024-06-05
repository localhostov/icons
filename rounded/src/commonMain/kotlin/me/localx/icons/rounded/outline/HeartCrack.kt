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

public val Icons.Outline.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 1.0f)
                curveToRelative(-2.31f, 0.0f, -4.35f, 1.31f, -5.5f, 3.27f)
                curveToRelative(-1.15f, -1.96f, -3.19f, -3.27f, -5.5f, -3.27f)
                curveTo(2.92f, 1.0f, 0.0f, 4.14f, 0.0f, 8.0f)
                curveToRelative(0.0f, 4.61f, 4.73f, 9.51f, 8.7f, 12.81f)
                curveToRelative(0.96f, 0.79f, 2.13f, 1.19f, 3.3f, 1.19f)
                reflectiveCurveToRelative(2.34f, -0.4f, 3.3f, -1.19f)
                curveToRelative(3.97f, -3.3f, 8.7f, -8.21f, 8.7f, -12.81f)
                curveToRelative(0.0f, -3.86f, -2.92f, -7.0f, -6.5f, -7.0f)
                close()
                moveTo(14.02f, 19.28f)
                curveToRelative(-1.17f, 0.97f, -2.87f, 0.97f, -4.04f, 0.0f)
                curveToRelative(-2.98f, -2.48f, -7.98f, -7.24f, -7.98f, -11.28f)
                curveToRelative(0.0f, -2.71f, 2.06f, -5.0f, 4.5f, -5.0f)
                reflectiveCurveToRelative(4.29f, 2.07f, 4.49f, 4.6f)
                lineToRelative(-1.31f, 1.31f)
                curveToRelative(-0.9f, 0.9f, -0.9f, 2.36f, 0.0f, 3.26f)
                lineToRelative(2.34f, 2.4f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.72f, -1.72f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.1f, 0.0f, -2.9f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.07f, -0.07f, -0.09f, -0.16f, -0.09f, -0.22f)
                reflectiveCurveToRelative(0.02f, -0.14f, 0.09f, -0.22f)
                lineToRelative(1.62f, -1.62f)
                reflectiveCurveToRelative(0.02f, -0.02f, 0.02f, -0.02f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.17f, -0.18f, 0.27f, -0.42f, 0.27f, -0.68f)
                curveToRelative(0.0f, -2.71f, 2.06f, -5.0f, 4.5f, -5.0f)
                reflectiveCurveToRelative(4.5f, 2.29f, 4.5f, 5.0f)
                curveToRelative(0.0f, 4.03f, -5.0f, 8.8f, -7.98f, 11.28f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
