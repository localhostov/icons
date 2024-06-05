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

public val Icons.Bold.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.17f, 0.0f, -2.29f, -0.51f, -3.05f, -1.41f)
                curveToRelative(-0.76f, -0.9f, -1.09f, -2.08f, -0.9f, -3.25f)
                curveToRelative(0.31f, -1.9f, 2.06f, -3.34f, 4.08f, -3.34f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.29f, 0.0f, 0.55f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.11f, -0.12f, 0.29f, -0.39f, 0.25f, -0.78f)
                curveToRelative(-0.05f, -0.49f, -0.56f, -0.89f, -1.14f, -0.89f)
                lineTo(4.0f, 8.0f)
                curveToRelative(-1.17f, 0.0f, -2.29f, -0.51f, -3.05f, -1.41f)
                curveTo(0.19f, 5.7f, -0.14f, 4.51f, 0.05f, 3.34f)
                curveTo(0.36f, 1.44f, 2.12f, 0.0f, 4.13f, 0.0f)
                horizontalLineToRelative(7.55f)
                curveToRelative(3.52f, 0.0f, 6.79f, 1.75f, 8.74f, 4.68f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.15f, 1.73f, 1.76f, 3.74f, 1.76f, 5.82f)
                verticalLineToRelative(10.77f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.77f)
                curveToRelative(0.0f, -1.49f, -0.44f, -2.92f, -1.26f, -4.16f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.39f, -2.09f, -3.73f, -3.34f, -6.24f, -3.34f)
                lineTo(4.13f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.04f, 0.36f, -1.12f, 0.82f)
                curveToRelative(-0.07f, 0.41f, 0.11f, 0.69f, 0.22f, 0.83f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(5.86f)
                curveToRelative(2.11f, 0.0f, 3.92f, 1.58f, 4.12f, 3.59f)
                curveToRelative(0.11f, 1.13f, -0.26f, 2.25f, -1.01f, 3.09f)
                reflectiveCurveToRelative(-1.84f, 1.32f, -2.97f, 1.32f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-0.55f, 0.0f, -1.04f, 0.36f, -1.12f, 0.82f)
                curveToRelative(-0.07f, 0.41f, 0.11f, 0.69f, 0.22f, 0.83f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
