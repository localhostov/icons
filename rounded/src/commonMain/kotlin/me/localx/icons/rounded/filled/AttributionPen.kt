package me.localx.icons.rounded.filled

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

public val Icons.Filled.AttributionPen: ImageVector
    get() {
        if (_attributionPen != null) {
            return _attributionPen!!
        }
        _attributionPen = Builder(name = "AttributionPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 24.0f)
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
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(11.56f, 12.98f)
                lineToRelative(-0.61f, 2.75f)
                curveToRelative(-0.24f, 1.09f, -1.06f, 1.95f, -2.14f, 2.24f)
                lineToRelative(-5.23f, 1.43f)
                curveToRelative(-0.59f, 0.16f, -1.01f, -0.56f, -0.58f, -0.99f)
                lineToRelative(3.72f, -3.72f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-3.72f, 3.72f)
                curveToRelative(-0.43f, 0.43f, -1.15f, 0.01f, -0.99f, -0.58f)
                lineToRelative(1.43f, -5.23f)
                curveToRelative(0.29f, -1.07f, 1.16f, -1.9f, 2.24f, -2.14f)
                lineToRelative(2.75f, -0.61f)
                lineToRelative(4.54f, 4.54f)
                close()
                moveTo(19.94f, 2.54f)
                curveToRelative(0.0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.8f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(15.6f, 0.74f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
            }
        }
        .build()
        return _attributionPen!!
    }

private var _attributionPen: ImageVector? = null
