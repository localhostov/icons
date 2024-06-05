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

public val Icons.Outline.CodeMerge: ImageVector
    get() {
        if (_codeMerge != null) {
            return _codeMerge!!
        }
        _codeMerge = Builder(name = "CodeMerge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveToRelative(-1.861f, 0.0f, -3.428f, 1.277f, -3.873f, 3.0f)
                lineTo(8.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.127f)
                curveToRelative(1.724f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                curveTo(8.0f, 1.794f, 6.206f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.794f, 0.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.276f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(8.253f)
                curveToRelative(-1.724f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.86f, -1.276f, -3.428f, -3.0f, -3.873f)
                verticalLineToRelative(-4.129f)
                curveToRelative(0.836f, 0.629f, 1.875f, 1.002f, 3.0f, 1.002f)
                horizontalLineToRelative(8.127f)
                curveToRelative(0.445f, 1.723f, 2.013f, 3.0f, 3.873f, 3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(2.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _codeMerge!!
    }

private var _codeMerge: ImageVector? = null
