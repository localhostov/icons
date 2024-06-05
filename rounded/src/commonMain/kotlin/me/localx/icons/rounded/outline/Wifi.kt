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

public val Icons.Outline.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(23.68f, 9.54f)
                curveToRelative(0.41f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-3.02f, -3.25f, -7.3f, -5.12f, -11.73f, -5.12f)
                reflectiveCurveTo(3.29f, 4.87f, 0.27f, 8.12f)
                curveToRelative(-0.38f, 0.41f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.4f, 0.38f, 1.04f, 0.35f, 1.41f, -0.05f)
                curveToRelative(2.64f, -2.85f, 6.38f, -4.48f, 10.27f, -4.48f)
                reflectiveCurveToRelative(7.62f, 1.63f, 10.27f, 4.48f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                close()
                moveTo(18.67f, 14.35f)
                curveToRelative(0.41f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-1.73f, -1.87f, -4.18f, -2.94f, -6.72f, -2.94f)
                reflectiveCurveToRelative(-4.99f, 1.07f, -6.72f, 2.94f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.4f, 0.38f, 1.04f, 0.35f, 1.41f, -0.05f)
                curveToRelative(1.35f, -1.46f, 3.27f, -2.29f, 5.26f, -2.29f)
                reflectiveCurveToRelative(3.9f, 0.84f, 5.26f, 2.29f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
