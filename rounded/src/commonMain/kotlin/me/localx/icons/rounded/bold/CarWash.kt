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

public val Icons.Bold.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.586f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, 1.223f, 0.0f)
                lineToRelative(0.8f, 0.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.829f, 2.828f)
                close()
                moveTo(17.986f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 19.4f, 1.586f)
                lineToRelative(-0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -1.223f, 0.0f)
                lineToRelative(-0.8f, 0.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.986f, 5.0f)
                close()
                moveTo(5.986f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 7.4f, 1.586f)
                lineToRelative(-0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -1.223f, 0.0f)
                lineToRelative(-0.8f, 0.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.986f, 5.0f)
                close()
                moveTo(22.0f, 16.758f)
                verticalLineToRelative(1.2f)
                arcToRelative(4.039f, 4.039f, 0.0f, false, true, -2.0f, 3.484f)
                lineTo(20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.565f)
                arcToRelative(4.064f, 4.064f, 0.0f, false, true, -0.807f, -0.633f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, -1.167f, -2.881f)
                arcToRelative(11.248f, 11.248f, 0.0f, false, true, 0.848f, -5.144f)
                lineTo(4.065f, 10.2f)
                arcTo(5.519f, 5.519f, 0.0f, false, true, 9.06f, 7.0f)
                horizontalLineToRelative(5.881f)
                arcToRelative(5.519f, 5.519f, 0.0f, false, true, 4.995f, 3.2f)
                lineToRelative(1.19f, 2.582f)
                arcTo(9.424f, 9.424f, 0.0f, false, true, 22.0f, 16.758f)
                close()
                moveTo(6.064f, 19.0f)
                horizontalLineToRelative(11.9f)
                arcTo(1.039f, 1.039f, 0.0f, false, false, 19.0f, 17.962f)
                verticalLineToRelative(-1.2f)
                arcTo(6.564f, 6.564f, 0.0f, false, false, 18.956f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(14.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(5.1f, 16.0f)
                arcToRelative(16.977f, 16.977f, 0.0f, false, false, -0.069f, 1.92f)
                arcTo(1.041f, 1.041f, 0.0f, false, false, 6.064f, 19.0f)
                close()
                moveTo(6.79f, 11.453f)
                lineTo(6.076f, 13.0f)
                lineTo(17.925f, 13.0f)
                lineToRelative(-0.714f, -1.548f)
                arcTo(2.507f, 2.507f, 0.0f, false, false, 14.941f, 10.0f)
                lineTo(9.06f, 10.0f)
                arcTo(2.506f, 2.506f, 0.0f, false, false, 6.79f, 11.453f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
