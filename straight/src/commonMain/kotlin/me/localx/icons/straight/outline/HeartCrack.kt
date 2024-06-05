package me.localx.icons.straight.outline

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
                moveTo(12.0f, 23.32f)
                lineToRelative(-0.57f, -0.4f)
                curveToRelative(-0.47f, -0.32f, -11.43f, -8.0f, -11.43f, -14.92f)
                curveTo(0.0f, 4.14f, 2.92f, 1.0f, 6.5f, 1.0f)
                curveToRelative(2.31f, 0.0f, 4.35f, 1.31f, 5.5f, 3.27f)
                curveToRelative(1.15f, -1.96f, 3.19f, -3.27f, 5.5f, -3.27f)
                curveToRelative(3.58f, 0.0f, 6.5f, 3.14f, 6.5f, 7.0f)
                curveToRelative(0.0f, 6.92f, -10.96f, 14.6f, -11.43f, 14.92f)
                lineToRelative(-0.57f, 0.4f)
                close()
                moveTo(6.5f, 3.0f)
                curveToRelative(-2.44f, 0.0f, -4.5f, 2.29f, -4.5f, 5.0f)
                curveToRelative(0.0f, 4.59f, 6.75f, 10.49f, 10.0f, 12.87f)
                curveToRelative(3.25f, -2.38f, 10.0f, -8.29f, 10.0f, -12.87f)
                curveToRelative(0.0f, -2.71f, -2.06f, -5.0f, -4.5f, -5.0f)
                reflectiveCurveToRelative(-4.5f, 2.29f, -4.5f, 5.0f)
                verticalLineToRelative(0.41f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(2.4f, -2.4f)
                curveToRelative(-0.19f, -2.53f, -2.17f, -4.6f, -4.49f, -4.6f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
