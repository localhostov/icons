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

public val Icons.Outline.TransformationBlock: ImageVector
    get() {
        if (_transformationBlock != null) {
            return _transformationBlock!!
        }
        _transformationBlock = Builder(name = "TransformationBlock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                curveToRelative(-0.46f, 0.0f, -0.886f, 0.133f, -1.256f, 0.35f)
                lineToRelative(-3.12f, -2.269f)
                lineToRelative(1.876f, -1.072f)
                lineTo(19.0f, 7.991f)
                lineToRelative(-1.876f, -1.072f)
                lineToRelative(3.12f, -2.269f)
                curveToRelative(0.37f, 0.217f, 0.796f, 0.35f, 1.256f, 0.35f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.185f, 0.023f, 0.364f, 0.061f, 0.537f)
                lineToRelative(-3.841f, 2.794f)
                lineToRelative(-3.22f, -1.84f)
                lineToRelative(-3.22f, 1.84f)
                lineToRelative(-3.841f, -2.794f)
                curveToRelative(0.038f, -0.173f, 0.061f, -0.352f, 0.061f, -0.537f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(0.0f, 1.119f, 0.0f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.46f, 0.0f, 0.886f, -0.133f, 1.256f, -0.35f)
                lineToRelative(3.12f, 2.269f)
                lineToRelative(-1.876f, 1.072f)
                verticalLineToRelative(8.018f)
                lineToRelative(1.876f, 1.072f)
                lineToRelative(-3.12f, 2.269f)
                curveToRelative(-0.37f, -0.217f, -0.796f, -0.35f, -1.256f, -0.35f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.185f, -0.023f, -0.364f, -0.061f, -0.537f)
                lineToRelative(3.841f, -2.794f)
                lineToRelative(3.22f, 1.84f)
                lineToRelative(3.22f, -1.84f)
                lineToRelative(3.841f, 2.794f)
                curveToRelative(-0.038f, 0.173f, -0.061f, 0.352f, -0.061f, 0.537f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.0f, 10.134f)
                lineToRelative(4.0f, 2.285f)
                verticalLineToRelative(4.716f)
                lineToRelative(-4.0f, -2.286f)
                verticalLineToRelative(-4.715f)
                close()
                moveTo(13.0f, 12.419f)
                lineToRelative(4.0f, -2.285f)
                verticalLineToRelative(4.715f)
                lineToRelative(-4.0f, 2.286f)
                verticalLineToRelative(-4.716f)
                close()
                moveTo(15.845f, 8.491f)
                lineToRelative(-3.845f, 2.196f)
                lineToRelative(-3.845f, -2.196f)
                lineToRelative(3.845f, -2.197f)
                lineToRelative(3.845f, 2.197f)
                close()
            }
        }
        .build()
        return _transformationBlock!!
    }

private var _transformationBlock: ImageVector? = null
