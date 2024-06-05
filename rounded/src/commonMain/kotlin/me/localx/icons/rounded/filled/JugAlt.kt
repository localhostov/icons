package me.localx.icons.rounded.filled

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

public val Icons.Filled.JugAlt: ImageVector
    get() {
        if (_jugAlt != null) {
            return _jugAlt!!
        }
        _jugAlt = Builder(name = "JugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 4.0f)
                curveToRelative(-1.129f, 0.0f, -2.204f, 0.442f, -2.947f, 1.213f)
                curveToRelative(-0.374f, 0.388f, -0.649f, 0.849f, -0.827f, 1.347f)
                lineToRelative(-0.503f, -0.587f)
                curveToRelative(-0.466f, -0.544f, -0.723f, -1.237f, -0.723f, -1.953f)
                verticalLineToRelative(-2.021f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(2.021f)
                curveToRelative(0.0f, 0.715f, -0.256f, 1.409f, -0.722f, 1.952f)
                lineToRelative(-4.074f, 4.753f)
                curveToRelative(-0.56f, 0.654f, -0.931f, 1.44f, -1.099f, 2.274f)
                horizontalLineToRelative(11.395f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(1.101f, 19.999f)
                curveToRelative(0.465f, 2.279f, 2.484f, 4.0f, 4.899f, 4.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.021f)
                curveToRelative(0.0f, -0.04f, -0.01f, -0.078f, -0.011f, -0.118f)
                curveToRelative(1.726f, -0.443f, 3.011f, -1.999f, 3.011f, -3.861f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(0.0f, 0.917f, -0.623f, 1.683f, -1.466f, 1.918f)
                curveToRelative(-0.193f, -0.426f, -0.43f, -0.833f, -0.738f, -1.193f)
                lineToRelative(-1.796f, -2.096f)
                verticalLineToRelative(-0.665f)
                curveToRelative(-0.019f, -0.538f, 0.151f, -1.009f, 0.493f, -1.362f)
                curveToRelative(0.368f, -0.383f, 0.918f, -0.602f, 1.508f, -0.602f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.5f, 18.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _jugAlt!!
    }

private var _jugAlt: ImageVector? = null
