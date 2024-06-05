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

public val Icons.Outline.AttributionPen: ImageVector
    get() {
        if (_attributionPen != null) {
            return _attributionPen!!
        }
        _attributionPen = Builder(name = "AttributionPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(19.0f, 22.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(0.29f, 19.71f)
                curveToRelative(-0.24f, -0.24f, -0.35f, -0.6f, -0.27f, -0.94f)
                lineToRelative(1.64f, -7.01f)
                curveToRelative(0.33f, -1.41f, 1.4f, -2.56f, 2.78f, -3.0f)
                lineToRelative(3.7f, -1.16f)
                lineTo(14.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(-1.16f, 3.7f)
                curveToRelative(-0.44f, 1.38f, -1.58f, 2.45f, -3.0f, 2.78f)
                lineToRelative(-7.01f, 1.64f)
                curveToRelative(-0.08f, 0.02f, -0.15f, 0.03f, -0.23f, 0.03f)
                curveToRelative(-0.26f, 0.0f, -0.52f, -0.1f, -0.71f, -0.29f)
                close()
                moveTo(10.0f, 8.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                reflectiveQuadToRelative(0.0f, 0.0f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0.0f)
                lineToRelative(-6.29f, 6.29f)
                close()
                moveTo(3.62f, 12.22f)
                lineToRelative(-0.84f, 3.59f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(3.59f, -0.84f)
                curveToRelative(0.73f, -0.17f, 1.32f, -0.72f, 1.54f, -1.43f)
                lineToRelative(1.01f, -3.2f)
                lineToRelative(-2.08f, -2.08f)
                lineToRelative(-3.2f, 1.01f)
                curveToRelative(-0.71f, 0.22f, -1.26f, 0.82f, -1.43f, 1.54f)
                close()
            }
        }
        .build()
        return _attributionPen!!
    }

private var _attributionPen: ImageVector? = null
