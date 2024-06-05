package me.localx.icons.straight.bold

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

public val Icons.Bold.Brightness: ImageVector
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
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 0.0f)
                close()
                moveTo(13.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 10.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 10.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.55f, 4.58f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(8.11f, 18.02f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(8.11f, 6.0f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(21.55f, 19.44f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }
        .build()
        return _brightness!!
    }

private var _brightness: ImageVector? = null
