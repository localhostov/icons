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

public val Icons.Outline.GuaraniSign: ImageVector
    get() {
        if (_guaraniSign != null) {
            return _guaraniSign!!
        }
        _guaraniSign = Builder(name = "GuaraniSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.39f, 12.21f)
                curveToRelative(-0.58f, -0.77f, -1.46f, -1.21f, -2.41f, -1.21f)
                horizontalLineToRelative(-5.98f)
                lineTo(13.0f, 4.06f)
                curveToRelative(2.65f, 0.32f, 4.97f, 1.94f, 6.18f, 4.39f)
                curveToRelative(0.25f, 0.49f, 0.84f, 0.7f, 1.34f, 0.45f)
                curveToRelative(0.49f, -0.25f, 0.7f, -0.85f, 0.45f, -1.34f)
                curveToRelative(-1.55f, -3.13f, -4.55f, -5.17f, -7.97f, -5.51f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.05f)
                curveTo(5.96f, 2.56f, 2.01f, 6.83f, 2.01f, 12.0f)
                reflectiveCurveToRelative(3.95f, 9.45f, 8.99f, 9.95f)
                verticalLineToRelative(1.05f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.05f)
                curveToRelative(4.1f, -0.41f, 7.73f, -3.27f, 8.87f, -7.11f)
                curveToRelative(0.27f, -0.91f, 0.1f, -1.87f, -0.47f, -2.63f)
                close()
                moveTo(4.01f, 12.0f)
                curveToRelative(0.0f, -4.07f, 3.05f, -7.44f, 6.99f, -7.94f)
                verticalLineToRelative(15.87f)
                curveToRelative(-3.93f, -0.49f, -6.99f, -3.86f, -6.99f, -7.94f)
                close()
                moveTo(19.95f, 14.27f)
                curveToRelative(-0.89f, 3.01f, -3.72f, 5.27f, -6.95f, 5.66f)
                verticalLineToRelative(-6.94f)
                horizontalLineToRelative(5.98f)
                curveToRelative(0.32f, 0.0f, 0.62f, 0.15f, 0.81f, 0.41f)
                curveToRelative(0.19f, 0.25f, 0.25f, 0.57f, 0.16f, 0.87f)
                close()
            }
        }
        .build()
        return _guaraniSign!!
    }

private var _guaraniSign: ImageVector? = null
