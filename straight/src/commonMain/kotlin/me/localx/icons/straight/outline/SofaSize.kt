package me.localx.icons.straight.outline

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

public val Icons.Outline.SofaSize: ImageVector
    get() {
        if (_sofaSize != null) {
            return _sofaSize!!
        }
        _sofaSize = Builder(name = "SofaSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.184f)
                verticalLineToRelative(-1.184f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(-0.314f, -0.112f, -0.648f, -0.184f, -1.0f, -0.184f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(0.525f, 5.255f)
                curveTo(0.215f, 4.982f, 0.0f, 4.502f, 0.0f, 4.0f)
                reflectiveCurveToRelative(0.214f, -0.982f, 0.588f, -1.318f)
                lineTo(3.009f, 0.078f)
                lineToRelative(1.464f, 1.363f)
                lineToRelative(-1.452f, 1.559f)
                horizontalLineToRelative(17.963f)
                lineToRelative(-1.458f, -1.562f)
                lineToRelative(1.463f, -1.363f)
                lineToRelative(2.488f, 2.67f)
                curveToRelative(0.31f, 0.272f, 0.524f, 0.753f, 0.524f, 1.255f)
                reflectiveCurveToRelative(-0.214f, 0.982f, -0.588f, 1.318f)
                lineToRelative(-2.5f, 2.684f)
                lineToRelative(-1.462f, -1.365f)
                lineToRelative(1.528f, -1.636f)
                lineTo(3.019f, 5.001f)
                lineToRelative(1.502f, 1.606f)
                lineToRelative(-1.463f, 1.364f)
                lineTo(0.525f, 5.255f)
                close()
            }
        }
        .build()
        return _sofaSize!!
    }

private var _sofaSize: ImageVector? = null
