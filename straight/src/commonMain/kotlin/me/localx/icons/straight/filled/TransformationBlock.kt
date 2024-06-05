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

public val Icons.Filled.TransformationBlock: ImageVector
    get() {
        if (_transformationBlock != null) {
            return _transformationBlock!!
        }
        _transformationBlock = Builder(name = "TransformationBlock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.943f, 7.387f)
                lineToRelative(-5.943f, 3.307f)
                lineToRelative(-5.943f, -3.307f)
                lineToRelative(0.819f, -0.468f)
                lineToRelative(-3.12f, -2.269f)
                curveToRelative(-0.37f, 0.217f, -0.796f, 0.35f, -1.256f, 0.35f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveTo(1.119f, 0.0f, 2.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.185f, -0.023f, 0.364f, -0.061f, 0.537f)
                lineToRelative(3.841f, 2.794f)
                lineToRelative(3.22f, -1.84f)
                lineToRelative(3.22f, 1.84f)
                lineToRelative(3.841f, -2.794f)
                curveToRelative(-0.038f, -0.173f, -0.061f, -0.352f, -0.061f, -0.537f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.46f, 0.0f, -0.886f, -0.133f, -1.256f, -0.35f)
                lineToRelative(-3.12f, 2.269f)
                lineToRelative(0.819f, 0.468f)
                close()
                moveTo(5.0f, 16.009f)
                lineToRelative(1.876f, 1.072f)
                lineToRelative(-3.12f, 2.269f)
                curveToRelative(-0.37f, -0.217f, -0.796f, -0.35f, -1.256f, -0.35f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.185f, -0.023f, -0.364f, -0.061f, -0.537f)
                lineToRelative(3.841f, -2.794f)
                lineToRelative(2.22f, 1.268f)
                verticalLineToRelative(-7.01f)
                lineToRelative(-6.0f, -3.339f)
                verticalLineToRelative(6.921f)
                close()
                moveTo(21.5f, 19.0f)
                curveToRelative(-0.46f, 0.0f, -0.886f, 0.133f, -1.256f, 0.35f)
                lineToRelative(-3.12f, -2.269f)
                lineToRelative(1.876f, -1.072f)
                verticalLineToRelative(-6.921f)
                lineToRelative(-6.0f, 3.339f)
                verticalLineToRelative(7.01f)
                lineToRelative(2.22f, -1.268f)
                lineToRelative(3.841f, 2.794f)
                curveToRelative(-0.038f, 0.173f, -0.061f, 0.352f, -0.061f, 0.537f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _transformationBlock!!
    }

private var _transformationBlock: ImageVector? = null
