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

public val Icons.Bold.FaucetDrip: ImageVector
    get() {
        if (_faucetDrip != null) {
            return _faucetDrip!!
        }
        _faucetDrip = Builder(name = "FaucetDrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 8.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                lineTo(1.5f, 8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3.0f)
                lineTo(1.5f, 14.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                curveToRelative(0.0f, -5.238f, -4.262f, -9.5f, -9.5f, -9.5f)
                close()
                moveTo(17.965f, 17.0f)
                curveToRelative(-0.244f, -1.694f, -1.705f, -3.0f, -3.465f, -3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(3.416f, 0.0f, 6.225f, 2.648f, 6.481f, 6.0f)
                horizontalLineToRelative(-3.017f)
                close()
            }
        }
        .build()
        return _faucetDrip!!
    }

private var _faucetDrip: ImageVector? = null
