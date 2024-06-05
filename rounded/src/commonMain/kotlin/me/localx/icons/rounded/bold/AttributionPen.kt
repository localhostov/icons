package me.localx.icons.rounded.bold

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

public val Icons.Bold.AttributionPen: ImageVector
    get() {
        if (_attributionPen != null) {
            return _attributionPen!!
        }
        _attributionPen = Builder(name = "AttributionPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.44f, 12.44f)
                lineToRelative(-3.36f, 3.35f)
                curveToRelative(-0.45f, 0.45f, -1.21f, 0.01f, -1.05f, -0.61f)
                lineToRelative(1.43f, -5.38f)
                curveToRelative(0.33f, -1.1f, 1.26f, -1.91f, 2.4f, -2.09f)
                lineToRelative(3.88f, -0.62f)
                lineToRelative(4.18f, 4.18f)
                lineToRelative(-0.62f, 3.87f)
                curveToRelative(-0.18f, 1.14f, -1.0f, 2.07f, -2.1f, 2.4f)
                lineToRelative(-5.39f, 1.41f)
                curveToRelative(-0.62f, 0.16f, -1.06f, -0.6f, -0.6f, -1.05f)
                lineToRelative(3.36f, -3.34f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                close()
                moveTo(19.22f, 4.54f)
                curveToRelative(1.04f, -1.04f, 1.04f, -2.72f, 0.0f, -3.76f)
                reflectiveCurveToRelative(-2.72f, -1.04f, -3.76f, 0.0f)
                lineToRelative(-4.39f, 4.39f)
                lineToRelative(3.76f, 3.76f)
                lineToRelative(4.39f, -4.39f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(20.0f, 24.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _attributionPen!!
    }

private var _attributionPen: ImageVector? = null
