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

public val Icons.Filled.HandsHoldingDiamond: ImageVector
    get() {
        if (_handsHoldingDiamond != null) {
            return _handsHoldingDiamond!!
        }
        _handsHoldingDiamond = Builder(name = "HandsHoldingDiamond", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.914f)
                lineTo(7.086f, 5.0f)
                lineTo(12.0f, 0.086f)
                lineToRelative(4.914f, 4.914f)
                lineToRelative(-4.914f, 4.914f)
                close()
                moveTo(13.017f, 15.487f)
                curveToRelative(0.626f, 0.569f, 0.983f, 1.375f, 0.983f, 2.221f)
                verticalLineToRelative(6.292f)
                lineTo(4.164f, 24.0f)
                lineToRelative(-3.117f, -3.412f)
                curveToRelative(-0.673f, -0.737f, -1.047f, -1.699f, -1.047f, -2.698f)
                lineTo(-0.0f, 5.5f)
                curveToRelative(0.0f, -1.466f, 1.261f, -2.637f, 2.758f, -2.487f)
                curveToRelative(1.301f, 0.13f, 2.242f, 1.322f, 2.242f, 2.63f)
                verticalLineToRelative(3.954f)
                reflectiveCurveToRelative(-0.76f, 0.616f, -0.907f, 0.778f)
                curveToRelative(-1.4f, 1.542f, -1.455f, 3.915f, -0.125f, 5.519f)
                lineToRelative(3.437f, 3.472f)
                lineToRelative(1.404f, -1.404f)
                lineToRelative(-3.243f, -3.275f)
                curveToRelative(-0.603f, -0.728f, -0.752f, -1.772f, -0.272f, -2.586f)
                curveToRelative(0.739f, -1.254f, 2.39f, -1.457f, 3.407f, -0.533f)
                lineToRelative(4.317f, 3.92f)
                close()
                moveTo(18.708f, 12.101f)
                curveToRelative(-0.739f, -1.254f, -2.39f, -1.457f, -3.407f, -0.533f)
                lineToRelative(-1.813f, 1.646f)
                lineToRelative(0.874f, 0.794f)
                curveToRelative(0.918f, 0.834f, 1.465f, 1.987f, 1.587f, 3.212f)
                lineToRelative(2.487f, -2.532f)
                curveToRelative(0.603f, -0.728f, 0.752f, -1.772f, 0.272f, -2.586f)
                close()
                moveTo(21.501f, 3.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(4.096f)
                reflectiveCurveToRelative(0.76f, 0.616f, 0.907f, 0.778f)
                curveToRelative(1.4f, 1.542f, 1.455f, 3.915f, 0.125f, 5.519f)
                lineToRelative(-4.033f, 4.088f)
                verticalLineToRelative(4.019f)
                horizontalLineToRelative(3.836f)
                lineToRelative(3.117f, -3.412f)
                curveToRelative(0.673f, -0.737f, 1.047f, -1.699f, 1.047f, -2.698f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _handsHoldingDiamond!!
    }

private var _handsHoldingDiamond: ImageVector? = null
