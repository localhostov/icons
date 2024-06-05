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

public val Icons.Filled.SofaSize: ImageVector
    get() {
        if (_sofaSize != null) {
            return _sofaSize!!
        }
        _sofaSize = Builder(name = "SofaSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.524f, 5.256f)
                curveToRelative(-0.31f, -0.273f, -0.524f, -0.753f, -0.524f, -1.256f)
                reflectiveCurveToRelative(0.214f, -0.983f, 0.588f, -1.318f)
                lineTo(3.009f, 0.078f)
                lineToRelative(1.463f, 1.363f)
                lineToRelative(-1.452f, 1.559f)
                horizontalLineToRelative(17.964f)
                lineToRelative(-1.458f, -1.562f)
                lineToRelative(1.463f, -1.363f)
                lineToRelative(2.487f, 2.669f)
                curveToRelative(0.31f, 0.272f, 0.524f, 0.753f, 0.524f, 1.255f)
                reflectiveCurveToRelative(-0.214f, 0.983f, -0.588f, 1.318f)
                lineToRelative(-2.5f, 2.683f)
                lineToRelative(-1.462f, -1.365f)
                lineToRelative(1.528f, -1.636f)
                lineTo(3.018f, 4.999f)
                lineToRelative(1.502f, 1.606f)
                lineToRelative(-1.463f, 1.364f)
                lineTo(0.524f, 5.256f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.956f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.044f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.459f, 0.789f, -2.723f, 1.956f, -3.421f)
                curveToRelative(-0.223f, -2.162f, -2.087f, -3.579f, -3.956f, -3.579f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.061f, 0.0f, -3.743f, 1.573f, -3.957f, 3.578f)
                curveToRelative(1.167f, 0.699f, 1.957f, 1.963f, 1.957f, 3.422f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _sofaSize!!
    }

private var _sofaSize: ImageVector? = null
