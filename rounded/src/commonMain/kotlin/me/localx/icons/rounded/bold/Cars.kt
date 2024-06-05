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

public val Icons.Bold.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.5f)
                arcToRelative(10.746f, 10.746f, 0.0f, false, false, -0.551f, -3.4f)
                lineToRelative(-1.115f, -3.342f)
                arcTo(5.491f, 5.491f, 0.0f, false, false, 17.117f, 7.0f)
                lineTo(14.0f, 7.0f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, false, -5.218f, 3.761f)
                lineTo(7.668f, 14.1f)
                curveTo(6.849f, 16.452f, 6.719f, 19.65f, 9.0f, 21.159f)
                lineTo(9.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.76f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 24.0f, 17.5f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(3.117f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.372f, 1.709f)
                lineTo(20.586f, 15.0f)
                lineTo(10.531f, 15.0f)
                lineToRelative(1.1f, -3.291f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 10.0f)
                close()
                moveTo(6.913f, 10.046f)
                curveTo(6.9f, 10.074f, 6.0f, 12.784f, 6.0f, 12.784f)
                lineTo(6.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.76f)
                curveTo(-0.383f, 12.769f, -0.292f, 9.5f, 0.551f, 7.1f)
                lineTo(1.666f, 3.76f)
                arcTo(5.491f, 5.491f, 0.0f, false, true, 6.883f, 0.0f)
                lineTo(10.0f, 0.0f)
                arcToRelative(5.516f, 5.516f, 0.0f, false, true, 4.764f, 2.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.6f, 1.5f)
                arcTo(2.506f, 2.506f, 0.0f, false, false, 10.0f, 3.0f)
                lineTo(6.883f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.511f, 4.709f)
                lineTo(3.414f, 8.0f)
                lineTo(5.5f, 8.0f)
                arcTo(1.518f, 1.518f, 0.0f, false, true, 6.913f, 10.046f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
