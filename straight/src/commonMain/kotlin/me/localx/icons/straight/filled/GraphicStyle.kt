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

public val Icons.Filled.GraphicStyle: ImageVector
    get() {
        if (_graphicStyle != null) {
            return _graphicStyle!!
        }
        _graphicStyle = Builder(name = "GraphicStyle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.41f)
                verticalLineToRelative(0.59f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-6.59f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(6.0f, 6.0f)
                close()
                moveTo(18.67f, 5.33f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(-2.67f, -1.33f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(2.67f, 1.33f)
                close()
                moveTo(24.0f, 6.23f)
                verticalLineToRelative(14.35f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(5.0f, 9.59f)
                lineTo(0.0f, 14.59f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(14.76f)
                lineToRelative(-0.59f, 1.18f)
                lineToRelative(-5.65f, 2.82f)
                lineToRelative(5.65f, 2.82f)
                lineToRelative(2.82f, 5.65f)
                lineToRelative(2.82f, -5.65f)
                lineToRelative(1.18f, -0.59f)
                close()
                moveTo(9.0f, 5.49f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(17.0f, 10.49f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                close()
            }
        }
        .build()
        return _graphicStyle!!
    }

private var _graphicStyle: ImageVector? = null
