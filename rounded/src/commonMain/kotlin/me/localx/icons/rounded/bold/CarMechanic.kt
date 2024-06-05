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

public val Icons.Bold.CarMechanic: ImageVector
    get() {
        if (_carMechanic != null) {
            return _carMechanic!!
        }
        _carMechanic = Builder(name = "CarMechanic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.858f, 5.9f)
                arcToRelative(3.523f, 3.523f, 0.0f, false, true, -5.7f, -0.9f)
                lineTo(5.842f, 5.0f)
                arcToRelative(3.524f, 3.524f, 0.0f, false, true, -5.7f, 0.9f)
                arcTo(0.535f, 0.535f, 0.0f, false, true, 0.535f, 5.0f)
                lineTo(1.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(0.536f, 2.0f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.392f, -0.9f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 5.851f, 2.0f)
                horizontalLineToRelative(12.3f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, true, 5.707f, -0.9f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.392f, 0.9f)
                lineTo(22.5f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.965f)
                arcTo(0.535f, 0.535f, 0.0f, false, true, 23.858f, 5.9f)
                close()
                moveTo(21.126f, 12.78f)
                arcTo(9.573f, 9.573f, 0.0f, false, true, 22.0f, 16.757f)
                verticalLineToRelative(1.2f)
                arcToRelative(4.041f, 4.041f, 0.0f, false, true, -2.0f, 3.484f)
                lineTo(20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.565f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -0.806f, -0.632f)
                arcToRelative(4.009f, 4.009f, 0.0f, false, true, -1.168f, -2.881f)
                arcToRelative(11.261f, 11.261f, 0.0f, false, true, 0.848f, -5.146f)
                lineTo(4.066f, 10.2f)
                arcTo(5.517f, 5.517f, 0.0f, false, true, 9.059f, 7.0f)
                lineTo(14.94f, 7.0f)
                arcToRelative(5.515f, 5.515f, 0.0f, false, true, 4.994f, 3.2f)
                close()
                moveTo(6.063f, 19.0f)
                horizontalLineToRelative(11.9f)
                arcTo(1.04f, 1.04f, 0.0f, false, false, 19.0f, 17.962f)
                verticalLineToRelative(-1.2f)
                arcTo(6.382f, 6.382f, 0.0f, false, false, 18.954f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(14.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(5.094f, 16.0f)
                arcToRelative(17.25f, 17.25f, 0.0f, false, false, -0.068f, 1.92f)
                arcToRelative(1.048f, 1.048f, 0.0f, false, false, 0.3f, 0.772f)
                arcTo(1.031f, 1.031f, 0.0f, false, false, 6.063f, 19.0f)
                close()
                moveTo(6.789f, 11.453f)
                lineTo(6.075f, 13.0f)
                lineTo(17.924f, 13.0f)
                lineToRelative(-0.714f, -1.547f)
                arcTo(2.505f, 2.505f, 0.0f, false, false, 14.94f, 10.0f)
                lineTo(9.059f, 10.0f)
                arcTo(2.509f, 2.509f, 0.0f, false, false, 6.789f, 11.453f)
                close()
            }
        }
        .build()
        return _carMechanic!!
    }

private var _carMechanic: ImageVector? = null
