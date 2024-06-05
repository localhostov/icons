package me.localx.icons.straight.filled

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

public val Icons.Filled.CatHead: ImageVector
    get() {
        if (_catHead != null) {
            return _catHead!!
        }
        _catHead = Builder(name = "CatHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.937f, 1.621f)
                lineTo(22.653f, 0.009f)
                lineToRelative(-4.134f, 3.134f)
                curveToRelative(-2.078f, -1.483f, -4.213f, -2.166f, -6.538f, -2.143f)
                curveToRelative(-2.277f, 0.042f, -4.616f, 0.808f, -6.529f, 2.122f)
                lineTo(1.399f, 0.048f)
                lineToRelative(-0.33f, 1.538f)
                curveToRelative(-0.043f, 0.204f, -1.07f, 5.077f, -1.07f, 11.914f)
                curveToRelative(0.0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(5.79f, 0.0f, 10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveToRelative(-1.02f, -11.633f, -1.063f, -11.879f)
                close()
                moveTo(6.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.0f, 19.0f)
                curveToRelative(-1.994f, 0.0f, -3.246f, -0.831f, -4.0f, -1.877f)
                curveToRelative(-0.754f, 1.046f, -2.006f, 1.877f, -4.0f, 1.877f)
                verticalLineToRelative(-2.0f)
                curveToRelative(2.03f, 0.0f, 2.686f, -1.292f, 2.898f, -2.206f)
                curveToRelative(-0.908f, -0.362f, -1.398f, -1.12f, -1.398f, -1.606f)
                curveToRelative(0.0f, -0.656f, 0.889f, -1.188f, 2.5f, -1.188f)
                reflectiveCurveToRelative(2.5f, 0.532f, 2.5f, 1.188f)
                curveToRelative(0.0f, 0.486f, -0.49f, 1.244f, -1.398f, 1.606f)
                curveToRelative(0.212f, 0.914f, 0.869f, 2.206f, 2.898f, 2.206f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _catHead!!
    }

private var _catHead: ImageVector? = null
