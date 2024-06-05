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

public val Icons.Bold.HouseDay: ImageVector
    get() {
        if (_houseDay != null) {
            return _houseDay!!
        }
        _houseDay = Builder(name = "HouseDay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.899f, 12.612f)
                curveToRelative(-0.245f, 0.372f, -0.443f, 0.773f, -0.59f, 1.193f)
                lineToRelative(-3.467f, 3.467f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.245f, -2.245f)
                curveToRelative(-0.36f, -0.582f, -0.629f, -1.225f, -0.791f, -1.909f)
                lineTo(0.0f, 10.997f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.176f)
                curveToRelative(0.162f, -0.683f, 0.433f, -1.325f, 0.793f, -1.907f)
                lineTo(1.721f, 3.842f)
                lineTo(3.842f, 1.721f)
                lineToRelative(2.248f, 2.248f)
                curveToRelative(0.581f, -0.36f, 1.223f, -0.63f, 1.907f, -0.793f)
                lineTo(7.997f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.174f)
                curveToRelative(0.684f, 0.162f, 1.327f, 0.432f, 1.909f, 0.792f)
                lineToRelative(2.245f, -2.245f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-2.244f, 2.244f)
                curveToRelative(0.196f, 0.316f, 0.365f, 0.649f, 0.505f, 0.998f)
                curveToRelative(-0.862f, 0.154f, -1.696f, 0.515f, -2.424f, 1.085f)
                lineToRelative(-0.289f, 0.226f)
                curveToRelative(-0.464f, -1.39f, -1.777f, -2.395f, -3.321f, -2.395f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.353f, 0.772f, 2.53f, 1.899f, 3.112f)
                close()
                moveTo(24.0f, 15.631f)
                verticalLineToRelative(8.37f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-8.37f)
                curveToRelative(0.0f, -1.084f, 0.49f, -2.089f, 1.343f, -2.757f)
                lineToRelative(4.0f, -3.13f)
                curveToRelative(1.27f, -0.994f, 3.043f, -0.994f, 4.314f, 0.0f)
                lineToRelative(4.0f, 3.13f)
                curveToRelative(0.854f, 0.667f, 1.343f, 1.672f, 1.343f, 2.756f)
                close()
                moveTo(21.0f, 15.631f)
                curveToRelative(0.0f, -0.155f, -0.07f, -0.298f, -0.191f, -0.394f)
                lineToRelative(-4.001f, -3.131f)
                curveToRelative(-0.182f, -0.142f, -0.434f, -0.142f, -0.615f, 0.0f)
                lineToRelative(-4.0f, 3.13f)
                curveToRelative(-0.122f, 0.096f, -0.192f, 0.239f, -0.192f, 0.394f)
                verticalLineToRelative(5.37f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.37f)
                close()
                moveTo(15.0f, 19.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _houseDay!!
    }

private var _houseDay: ImageVector? = null
