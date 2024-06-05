package me.localx.icons.rounded.outline

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

public val Icons.Outline.KeyLockCrypto: ImageVector
    get() {
        if (_keyLockCrypto != null) {
            return _keyLockCrypto!!
        }
        _keyLockCrypto = Builder(name = "KeyLockCrypto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 8.424f)
                verticalLineToRelative(-1.424f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                verticalLineToRelative(1.424f)
                curveToRelative(-1.763f, 0.774f, -3.0f, 2.531f, -3.0f, 4.576f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.045f, -1.237f, -3.802f, -3.0f, -4.576f)
                close()
                moveTo(7.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.013f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.513f, 15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.004f)
                lineToRelative(0.004f, 1.0f)
                curveToRelative(-1.1f, 0.002f, -1.996f, 0.898f, -1.996f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.101f, 0.895f, 1.997f, 1.996f, 2.0f)
                lineToRelative(-0.004f, 1.0f)
                horizontalLineToRelative(-4.004f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.996f)
                lineToRelative(0.004f, -1.0f)
                horizontalLineToRelative(0.004f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.909f, -0.406f, -1.725f, -1.047f, -2.275f)
                curveToRelative(0.345f, -0.488f, 0.547f, -1.083f, 0.547f, -1.725f)
                curveToRelative(0.0f, -1.484f, -1.086f, -2.712f, -2.504f, -2.95f)
                lineToRelative(-0.004f, -1.05f)
                horizontalLineToRelative(3.996f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _keyLockCrypto!!
    }

private var _keyLockCrypto: ImageVector? = null
