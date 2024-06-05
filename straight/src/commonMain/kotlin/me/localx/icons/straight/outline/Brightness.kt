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

public val Icons.Outline.Brightness: ImageVector
    get() {
        if (_brightness != null) {
            return _brightness!!
        }
        _brightness = Builder(name = "Brightness", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 0.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.19f, 4.22f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.76f, 17.66f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.76f, 6.35f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(21.2f, 19.79f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _brightness!!
    }

private var _brightness: ImageVector? = null
