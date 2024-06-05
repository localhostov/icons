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
                moveTo(12.0f, 23.32f)
                lineToRelative(-0.85f, -0.58f)
                curveToRelative(-1.14f, -0.78f, -11.15f, -7.85f, -11.15f, -14.57f)
                curveTo(0.0f, 4.22f, 3.03f, 1.0f, 6.75f, 1.0f)
                curveToRelative(2.12f, 0.0f, 4.01f, 1.04f, 5.25f, 2.67f)
                curveToRelative(1.24f, -1.63f, 3.13f, -2.67f, 5.25f, -2.67f)
                curveToRelative(3.72f, 0.0f, 6.75f, 3.22f, 6.75f, 7.17f)
                curveToRelative(0.0f, 6.72f, -10.01f, 13.78f, -11.15f, 14.57f)
                lineToRelative(-0.85f, 0.58f)
                close()
                moveTo(6.75f, 4.0f)
                curveToRelative(-2.03f, 0.0f, -3.75f, 1.91f, -3.75f, 4.17f)
                curveToRelative(0.0f, 3.97f, 5.87f, 9.16f, 9.0f, 11.48f)
                curveToRelative(3.13f, -2.33f, 9.0f, -7.52f, 9.0f, -11.48f)
                curveToRelative(0.0f, -2.26f, -1.72f, -4.17f, -3.75f, -4.17f)
                reflectiveCurveToRelative(-3.75f, 1.91f, -3.75f, 4.17f)
                verticalLineToRelative(0.63f)
                lineToRelative(-1.29f, 1.27f)
                lineToRelative(3.4f, 3.43f)
                lineToRelative(-3.56f, 3.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-3.41f, -3.44f)
                lineToRelative(2.49f, -2.47f)
                curveToRelative(-0.27f, -2.0f, -1.86f, -3.58f, -3.71f, -3.58f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
