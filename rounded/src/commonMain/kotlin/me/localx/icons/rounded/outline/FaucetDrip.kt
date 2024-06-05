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

public val Icons.Outline.FaucetDrip: ImageVector
    get() {
        if (_faucetDrip != null) {
            return _faucetDrip!!
        }
        _faucetDrip = Builder(name = "FaucetDrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 14.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _faucetDrip!!
    }

private var _faucetDrip: ImageVector? = null
