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

public val Icons.Outline.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.044f, 15.434f)
                lineToRelative(0.739f, 1.859f)
                lineToRelative(4.647f, -1.846f)
                lineToRelative(-0.739f, -1.859f)
                lineToRelative(1.859f, -0.738f)
                lineTo(21.293f, 9.687f)
                arcToRelative(12.044f, 12.044f, 0.0f, false, false, -3.158f, -4.52f)
                lineToRelative(-3.813f, -3.4f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -3.1f, -0.55f)
                lineTo(2.362f, 4.729f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 0.48f, 7.261f)
                lineTo(0.043f, 12.354f)
                arcTo(12.082f, 12.082f, 0.0f, false, false, 0.848f, 17.81f)
                lineTo(2.1f, 20.972f)
                lineToRelative(1.859f, -0.738f)
                lineTo(4.7f, 22.092f)
                lineToRelative(4.646f, -1.845f)
                lineToRelative(-0.739f, -1.859f)
                close()
                moveTo(2.473f, 7.434f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.1f, 6.588f)
                lineToRelative(8.855f, -3.517f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.035f, 0.183f)
                lineTo(16.7f, 6.566f)
                lineTo(2.048f, 12.386f)
                close()
                moveTo(2.073f, 14.534f)
                lineTo(3.612f, 13.923f)
                lineTo(3.981f, 14.853f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.858f, -0.739f)
                lineToRelative(-0.369f, -0.929f)
                lineToRelative(9.294f, -3.692f)
                lineToRelative(0.369f, 0.929f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.858f, -0.738f)
                lineToRelative(-0.369f, -0.929f)
                lineToRelative(1.539f, -0.612f)
                arcToRelative(10.026f, 10.026f, 0.0f, false, true, 1.279f, 2.286f)
                lineToRelative(0.518f, 1.3f)
                lineToRelative(-2.9f, 1.153f)
                lineToRelative(-1.747f, 0.694f)
                horizontalLineToRelative(0.0f)
                lineTo(7.871f, 16.529f)
                horizontalLineToRelative(0.0f)
                lineTo(3.224f, 18.375f)
                lineToRelative(-0.517f, -1.3f)
                arcTo(10.016f, 10.016f, 0.0f, false, true, 2.068f, 14.53f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(14.0f, 24.0f)
                curveTo(14.211f, 17.391f, 23.791f, 17.4f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
