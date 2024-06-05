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

public val Icons.Filled.BoxCircleCheck: ImageVector
    get() {
        if (_boxCircleCheck != null) {
            return _boxCircleCheck!!
        }
        _boxCircleCheck = Builder(name = "BoxCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.353f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(12.715f, 24.0f)
                horizontalLineToRelative(-6.715f)
                curveToRelative(-2.76f, -0.003f, -4.997f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.995f)
                curveToRelative(-4.409f, 0.003f, -7.995f, 3.59f, -7.995f, 8.0f)
                curveToRelative(0.0f, 2.387f, 1.051f, 4.533f, 2.715f, 6.0f)
                close()
                moveTo(3.0f, 8.0f)
                curveToRelative(-1.656f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                curveTo(0.0f, 2.238f, 2.238f, 0.0f, 5.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 14.145f, 0.002f, 14.218f, 0.005f)
                curveToRelative(2.762f, 0.12f, 4.903f, 2.456f, 4.782f, 5.218f)
                curveToRelative(-0.102f, 1.575f, -1.42f, 2.796f, -3.0f, 2.777f)
                lineTo(3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _boxCircleCheck!!
    }

private var _boxCircleCheck: ImageVector? = null
