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

public val Icons.Bold.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.562f, 9.059f)
                lineToRelative(-12.588f, 12.622f)
                curveToRelative(-0.852f, 0.852f, -1.981f, 1.319f, -3.183f, 1.319f)
                horizontalLineToRelative(-0.009f)
                curveToRelative(-1.206f, -0.003f, -2.337f, -0.476f, -3.187f, -1.331f)
                lineTo(0.445f, 17.566f)
                curveToRelative(-0.589f, -0.582f, -0.595f, -1.532f, -0.012f, -2.121f)
                curveToRelative(0.583f, -0.59f, 1.532f, -0.595f, 2.122f, -0.012f)
                lineToRelative(4.16f, 4.112f)
                curveToRelative(0.293f, 0.295f, 0.67f, 0.453f, 1.073f, 0.454f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.4f, 0.0f, 0.777f, -0.156f, 1.061f, -0.439f)
                lineToRelative(12.587f, -12.62f)
                curveToRelative(0.584f, -0.588f, 1.535f, -0.588f, 2.121f, -0.003f)
                curveToRelative(0.587f, 0.585f, 0.588f, 1.535f, 0.003f, 2.121f)
                close()
                moveTo(5.024f, 11.767f)
                curveToRelative(0.786f, 0.793f, 1.834f, 1.23f, 2.95f, 1.233f)
                horizontalLineToRelative(0.009f)
                curveToRelative(1.113f, 0.0f, 2.159f, -0.434f, 2.952f, -1.226f)
                lineTo(19.066f, 3.555f)
                curveToRelative(0.583f, -0.589f, 0.578f, -1.539f, -0.011f, -2.122f)
                curveToRelative(-0.589f, -0.582f, -1.538f, -0.576f, -2.122f, 0.011f)
                lineToRelative(-8.126f, 8.213f)
                curveToRelative(-0.22f, 0.221f, -0.513f, 0.342f, -0.825f, 0.342f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.313f, 0.0f, -0.606f, -0.123f, -0.813f, -0.332f)
                lineToRelative(-3.589f, -3.711f)
                curveToRelative(-0.576f, -0.596f, -1.525f, -0.611f, -2.121f, -0.035f)
                curveToRelative(-0.595f, 0.576f, -0.611f, 1.525f, -0.035f, 2.121f)
                lineToRelative(3.603f, 3.724f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
