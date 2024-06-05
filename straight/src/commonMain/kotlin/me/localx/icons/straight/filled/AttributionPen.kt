package me.localx.icons.straight.filled

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
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(19.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(7.02f, 8.44f)
                lineToRelative(-4.52f, 1.0f)
                lineTo(0.01f, 18.58f)
                lineToRelative(6.01f, -6.01f)
                lineToRelative(1.41f, 1.41f)
                lineTo(1.42f, 19.99f)
                lineToRelative(9.13f, -2.49f)
                lineToRelative(1.0f, -4.52f)
                lineToRelative(-4.54f, -4.54f)
                close()
                moveTo(19.19f, 0.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(6.72f, -6.72f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }
        .build()
        return _attributionPen!!
    }

private var _attributionPen: ImageVector? = null
