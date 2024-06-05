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

public val Icons.Outline.ArrowUpFromGroundWater: ImageVector
    get() {
        if (_arrowUpFromGroundWater != null) {
            return _arrowUpFromGroundWater!!
        }
        _arrowUpFromGroundWater = Builder(name = "ArrowUpFromGroundWater", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.999f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                curveTo(0.0f, 10.346f, 1.345f, 9.0f, 2.999f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.999f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(14.999f, 11.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.502f, 21.316f)
                curveToRelative(-0.38f, 0.435f, -0.928f, 0.684f, -1.503f, 0.684f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.575f, 0.0f, -1.123f, -0.249f, -1.503f, -0.684f)
                lineTo(-0.01f, 22.632f)
                curveToRelative(0.759f, 0.87f, 1.855f, 1.368f, 3.009f, 1.368f)
                curveToRelative(1.201f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                curveToRelative(1.153f, 0.0f, 2.25f, -0.499f, 3.009f, -1.368f)
                lineToRelative(-1.506f, -1.315f)
                close()
                moveTo(10.999f, 3.012f)
                verticalLineToRelative(14.988f)
                horizontalLineToRelative(2.0f)
                lineTo(12.999f, 2.978f)
                lineToRelative(2.801f, 2.737f)
                lineToRelative(1.398f, -1.431f)
                lineToRelative(-3.785f, -3.699f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.75f, -2.738f)
                close()
            }
        }
        .build()
        return _arrowUpFromGroundWater!!
    }

private var _arrowUpFromGroundWater: ImageVector? = null
