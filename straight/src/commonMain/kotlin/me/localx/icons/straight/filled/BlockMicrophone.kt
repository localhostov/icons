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

public val Icons.Filled.BlockMicrophone: ImageVector
    get() {
        if (_blockMicrophone != null) {
            return _blockMicrophone!!
        }
        _blockMicrophone = Builder(name = "BlockMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.74f, 0.216f, -1.424f, 0.567f, -2.019f)
                lineToRelative(5.452f, 5.453f)
                curveToRelative(-0.595f, 0.351f, -1.279f, 0.567f, -2.019f, 0.567f)
                close()
                moveTo(21.433f, 20.019f)
                lineToRelative(-5.452f, -5.453f)
                curveToRelative(0.595f, -0.351f, 1.279f, -0.567f, 2.019f, -0.567f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.74f, -0.216f, 1.424f, -0.567f, 2.019f)
                close()
                moveTo(12.721f, 24.0f)
                horizontalLineToRelative(-1.721f)
                curveTo(4.935f, 24.0f, 0.0f, 19.065f, 0.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(0.079f)
                curveToRelative(0.437f, 0.754f, 0.992f, 1.428f, 1.642f, 2.0f)
                close()
                moveTo(10.208f, 19.789f)
                curveToRelative(-3.231f, -0.745f, -5.719f, -3.446f, -6.138f, -6.789f)
                horizontalLineToRelative(4.931f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.069f, 7.0f)
                curveTo(4.564f, 3.06f, 7.928f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(7.436f, 3.06f, 7.931f, 7.0f)
                horizontalLineToRelative(-4.931f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.262f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 0.616f, 0.076f, 1.213f, 0.208f, 1.789f)
                close()
            }
        }
        .build()
        return _blockMicrophone!!
    }

private var _blockMicrophone: ImageVector? = null
