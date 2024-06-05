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

public val Icons.Filled.KeyLockCrypto: ImageVector
    get() {
        if (_keyLockCrypto != null) {
            return _keyLockCrypto!!
        }
        _keyLockCrypto = Builder(name = "KeyLockCrypto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.513f, 13.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(13.013f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.045f, 1.237f, -3.802f, 3.0f, -4.576f)
                verticalLineToRelative(-1.424f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(1.424f)
                curveToRelative(1.763f, 0.774f, 3.0f, 2.531f, 3.0f, 4.576f)
                close()
                moveTo(16.013f, 18.0f)
                curveToRelative(0.0f, -0.909f, -0.406f, -1.725f, -1.047f, -2.275f)
                curveToRelative(0.345f, -0.488f, 0.547f, -1.083f, 0.547f, -1.725f)
                curveToRelative(0.0f, -1.487f, -1.09f, -2.716f, -2.512f, -2.951f)
                verticalLineToRelative(-0.062f)
                curveToRelative(-0.009f, -0.552f, -0.485f, -1.029f, -1.013f, -0.987f)
                curveToRelative(-0.548f, 0.007f, -0.985f, 0.455f, -0.985f, 1.001f)
                curveToRelative(-1.098f, 0.006f, -1.99f, 0.9f, -1.99f, 1.999f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.099f, 0.892f, 1.993f, 1.99f, 1.999f)
                curveToRelative(0.0f, 0.546f, 0.437f, 0.994f, 0.985f, 1.001f)
                horizontalLineToRelative(0.013f)
                curveToRelative(0.547f, 0.0f, 0.993f, -0.439f, 1.0f, -0.987f)
                verticalLineToRelative(-0.013f)
                horizontalLineToRelative(0.013f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _keyLockCrypto!!
    }

private var _keyLockCrypto: ImageVector? = null
