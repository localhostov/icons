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

public val Icons.Outline.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 16.0f)
                lineTo(2.5f, 16.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.0f, 19.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                lineTo(2.5f, 20.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(20.0f, 11.82f)
                verticalLineToRelative(1.18f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0.0f, -0.698f, -0.372f, -1.356f, -0.972f, -1.716f)
                lineToRelative(-1.601f, -0.961f)
                curveToRelative(-1.497f, -0.898f, -2.427f, -2.541f, -2.427f, -4.287f)
                verticalLineToRelative(-1.856f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.856f)
                curveToRelative(0.0f, 1.048f, 0.558f, 2.033f, 1.457f, 2.572f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(1.198f, 0.72f, 1.942f, 2.034f, 1.942f, 3.431f)
                close()
                moveTo(24.0f, 10.264f)
                verticalLineToRelative(0.735f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-0.735f)
                curveToRelative(0.0f, -1.048f, -0.558f, -2.033f, -1.457f, -2.572f)
                lineToRelative(-2.087f, -1.252f)
                curveToRelative(-0.899f, -0.54f, -1.457f, -1.526f, -1.457f, -2.573f)
                lineTo(16.999f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.867f)
                curveToRelative(0.0f, 0.35f, 0.187f, 0.679f, 0.486f, 0.858f)
                lineToRelative(2.086f, 1.252f)
                curveToRelative(1.497f, 0.898f, 2.427f, 2.541f, 2.427f, 4.287f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
