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

public val Icons.Filled.HeartCrack: ImageVector
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
                curveToRelative(-1.69f, 0.0f, -3.22f, 0.7f, -4.38f, 1.83f)
                lineToRelative(1.32f, 1.32f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.42f)
                lineToRelative(-3.34f, 3.34f)
                curveToRelative(-0.12f, 0.12f, -0.12f, 0.31f, 0.0f, 0.43f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.39f, 0.39f, 0.6f, 0.9f, 0.6f, 1.45f)
                reflectiveCurveToRelative(-0.21f, 1.06f, -0.6f, 1.45f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(1.72f, -1.72f)
                lineToRelative(-2.34f, -2.4f)
                curveToRelative(-0.9f, -0.9f, -0.9f, -2.36f, 0.0f, -3.26f)
                lineToRelative(3.34f, -3.34f)
                lineToRelative(-3.01f, -3.01f)
                curveToRelative(-0.93f, -0.93f, -2.17f, -1.55f, -3.49f, -1.56f)
                curveToRelative(0.0f, 0.0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveTo(2.92f, 1.0f, 0.0f, 4.14f, 0.0f, 8.0f)
                curveToRelative(0.0f, 4.61f, 4.73f, 9.51f, 8.7f, 12.81f)
                curveToRelative(0.96f, 0.79f, 2.13f, 1.19f, 3.3f, 1.19f)
                reflectiveCurveToRelative(2.34f, -0.4f, 3.3f, -1.19f)
                curveToRelative(3.97f, -3.3f, 8.7f, -8.21f, 8.7f, -12.81f)
                curveToRelative(0.0f, -3.86f, -2.92f, -7.0f, -6.5f, -7.0f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
