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

public val Icons.Outline.DownLeft: ImageVector
    get() {
        if (_downLeft != null) {
            return _downLeft!!
        }
        _downLeft = Builder(name = "DownLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-2.2f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                lineTo(1.0f, 10.0f)
                curveToRelative(0.0f, -1.23f, 0.7f, -2.3f, 1.84f, -2.77f)
                reflectiveCurveToRelative(2.39f, -0.23f, 3.27f, 0.64f)
                lineToRelative(1.47f, 1.48f)
                lineTo(14.76f, 2.17f)
                curveToRelative(1.51f, -1.51f, 4.14f, -1.51f, 5.66f, 0.0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.76f, 0.75f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.83f)
                lineToRelative(-7.17f, 7.17f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.87f, 0.88f, 1.12f, 2.13f, 0.64f, 3.27f)
                curveToRelative(-0.47f, 1.14f, -1.54f, 1.84f, -2.77f, 1.84f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.62f, 0.0f, 0.86f, -0.47f, 0.92f, -0.62f)
                curveToRelative(0.06f, -0.14f, 0.22f, -0.65f, -0.21f, -1.09f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.76f, -0.76f, -2.07f, -0.76f, -2.83f, 0.0f)
                lineToRelative(-7.88f, 7.88f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.44f, -0.43f, -0.94f, -0.27f, -1.08f, -0.21f)
                curveToRelative(-0.14f, 0.06f, -0.62f, 0.3f, -0.62f, 0.92f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _downLeft!!
    }

private var _downLeft: ImageVector? = null
