package me.localx.icons.straight.outline

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
                moveTo(15.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(19.0f, 22.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(10.55f, 17.5f)
                lineTo(0.04f, 19.96f)
                lineTo(2.5f, 9.45f)
                lineToRelative(5.55f, -1.74f)
                lineTo(14.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-6.83f, 6.83f)
                lineToRelative(-1.74f, 5.55f)
                close()
                moveTo(10.0f, 8.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0.0f)
                lineToRelative(-6.29f, 6.29f)
                close()
                moveTo(8.98f, 15.81f)
                lineToRelative(1.29f, -4.12f)
                lineToRelative(-1.97f, -1.97f)
                lineToRelative(-4.12f, 1.29f)
                lineToRelative(-1.03f, 4.41f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(4.41f, -1.03f)
                close()
            }
        }
        .build()
        return _attributionPen!!
    }

private var _attributionPen: ImageVector? = null
