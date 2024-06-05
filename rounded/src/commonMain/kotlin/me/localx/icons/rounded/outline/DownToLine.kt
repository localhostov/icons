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

public val Icons.Outline.DownToLine: ImageVector
    get() {
        if (_downToLine != null) {
            return _downToLine!!
        }
        _downToLine = Builder(name = "DownToLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(14.77f, 18.86f)
                reflectiveCurveToRelative(6.35f, -6.75f, 6.35f, -6.75f)
                curveToRelative(0.87f, -0.87f, 1.12f, -2.11f, 0.65f, -3.24f)
                curveToRelative(-0.47f, -1.13f, -1.52f, -1.84f, -2.75f, -1.85f)
                horizontalLineToRelative(-2.07f)
                reflectiveCurveToRelative(-0.03f, -3.05f, -0.03f, -3.05f)
                curveToRelative(0.0f, -2.19f, -1.78f, -3.97f, -3.97f, -3.97f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.19f, 0.0f, -3.97f, 1.78f, -3.97f, 3.98f)
                verticalLineToRelative(3.02f)
                reflectiveCurveToRelative(-2.05f, 0.0f, -2.05f, 0.0f)
                curveToRelative(-1.23f, 0.0f, -2.28f, 0.71f, -2.75f, 1.85f)
                curveToRelative(-0.47f, 1.13f, -0.22f, 2.38f, 0.63f, 3.22f)
                lineToRelative(6.33f, 6.8f)
                curveToRelative(0.77f, 0.77f, 1.79f, 1.16f, 2.81f, 1.16f)
                reflectiveCurveToRelative(2.03f, -0.39f, 2.81f, -1.16f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                lineTo(9.0f, 3.97f)
                curveToRelative(0.0f, -1.09f, 0.88f, -1.97f, 1.97f, -1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.09f, 0.0f, 1.97f, 0.89f, 1.97f, 1.98f)
                lineToRelative(0.03f, 4.05f)
                curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.61f, 0.0f, 0.85f, 0.47f, 0.9f, 0.61f)
                curveToRelative(0.06f, 0.14f, 0.22f, 0.64f, -0.24f, 1.09f)
                lineToRelative(-6.33f, 6.73f)
                curveToRelative(-0.77f, 0.76f, -2.01f, 0.75f, -2.75f, 0.01f)
                lineToRelative(-6.33f, -6.8f)
                curveToRelative(-0.43f, -0.43f, -0.27f, -0.93f, -0.21f, -1.07f)
                curveToRelative(0.06f, -0.14f, 0.3f, -0.61f, 0.9f, -0.61f)
                horizontalLineToRelative(3.06f)
                close()
            }
        }
        .build()
        return _downToLine!!
    }

private var _downToLine: ImageVector? = null
