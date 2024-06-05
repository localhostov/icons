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
                moveTo(21.885f, 8.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(4.885f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.013f, 18.0f)
                curveToRelative(0.0f, -0.909f, -0.406f, -1.725f, -1.047f, -2.275f)
                curveToRelative(0.345f, -0.488f, 0.547f, -1.083f, 0.547f, -1.725f)
                curveToRelative(0.0f, -1.485f, -1.087f, -2.713f, -2.506f, -2.95f)
                lineToRelative(-0.007f, -1.057f)
                lineToRelative(-2.0f, 0.014f)
                lineToRelative(0.006f, 0.993f)
                horizontalLineToRelative(-1.994f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.994f)
                lineToRelative(-0.006f, 0.993f)
                lineToRelative(2.0f, 0.014f)
                lineToRelative(0.006f, -1.007f)
                horizontalLineToRelative(0.006f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(16.885f, 7.0f)
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
