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

public val Icons.Bold.CarGarage: ImageVector
    get() {
        if (_carGarage != null) {
            return _carGarage!!
        }
        _carGarage = Builder(name = "CarGarage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.822f, 7.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.032f, 0.611f)
                lineTo(13.4f, 3.3f)
                arcToRelative(3.272f, 3.272f, 0.0f, false, false, -2.84f, 0.025f)
                lineTo(2.21f, 7.814f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.79f, 5.172f)
                lineTo(9.184f, 0.661f)
                arcTo(6.336f, 6.336f, 0.0f, false, true, 14.768f, 0.636f)
                lineTo(23.21f, 5.172f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.822f, 7.2f)
                close()
                moveTo(21.122f, 12.765f)
                arcTo(9.568f, 9.568f, 0.0f, false, true, 22.0f, 16.75f)
                verticalLineToRelative(1.2f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, true, -2.0f, 3.485f)
                verticalLineToRelative(0.553f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(8.0f, 21.988f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.565f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -0.806f, -0.632f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, true, -1.168f, -2.881f)
                arcToRelative(11.24f, 11.24f, 0.0f, false, true, 0.849f, -5.147f)
                lineToRelative(1.191f, -2.581f)
                arcTo(5.517f, 5.517f, 0.0f, false, true, 9.059f, 6.993f)
                horizontalLineToRelative(5.882f)
                arcToRelative(5.517f, 5.517f, 0.0f, false, true, 4.993f, 3.194f)
                close()
                moveTo(18.951f, 15.99f)
                lineTo(17.0f, 15.99f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                lineTo(10.0f, 15.99f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                lineTo(5.094f, 15.99f)
                arcToRelative(17.25f, 17.25f, 0.0f, false, false, -0.068f, 1.92f)
                arcToRelative(1.055f, 1.055f, 0.0f, false, false, 0.3f, 0.772f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, false, 0.738f, 0.308f)
                horizontalLineToRelative(11.9f)
                arcTo(1.04f, 1.04f, 0.0f, false, false, 19.0f, 17.955f)
                verticalLineToRelative(-1.2f)
                arcTo(6.381f, 6.381f, 0.0f, false, false, 18.955f, 15.993f)
                close()
                moveTo(6.789f, 11.445f)
                lineToRelative(-0.714f, 1.548f)
                horizontalLineToRelative(11.85f)
                lineToRelative(-0.714f, -1.548f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, false, -2.27f, -1.452f)
                lineTo(9.059f, 9.993f)
                arcTo(2.509f, 2.509f, 0.0f, false, false, 6.789f, 11.445f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
