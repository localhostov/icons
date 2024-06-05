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

public val Icons.Filled.PptFile: ImageVector
    get() {
        if (_pptFile != null) {
            return _pptFile!!
        }
        _pptFile = Builder(name = "PptFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.207f, 6.985f)
                curveToRelative(0.0f, 0.398f, -0.349f, 0.735f, -0.762f, 0.735f)
                lineToRelative(-0.71f, 0.003f)
                lineToRelative(-0.005f, -1.473f)
                horizontalLineToRelative(0.715f)
                curveToRelative(0.413f, 0.0f, 0.762f, 0.336f, 0.762f, 0.735f)
                close()
                moveTo(5.967f, 6.25f)
                horizontalLineToRelative(-0.715f)
                lineToRelative(0.005f, 1.473f)
                lineToRelative(0.71f, -0.003f)
                curveToRelative(0.413f, 0.0f, 0.762f, -0.336f, 0.762f, -0.735f)
                reflectiveCurveToRelative(-0.349f, -0.735f, -0.762f, -0.735f)
                close()
                moveTo(19.0f, 23.414f)
                lineToRelative(4.414f, -4.414f)
                horizontalLineToRelative(-4.414f)
                verticalLineToRelative(4.414f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(7.979f, 6.985f)
                curveToRelative(0.0f, -1.094f, -0.902f, -1.985f, -2.012f, -1.985f)
                horizontalLineToRelative(-1.967f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.096f)
                lineToRelative(0.717f, -0.003f)
                curveToRelative(1.109f, 0.0f, 2.012f, -0.891f, 2.012f, -1.985f)
                close()
                moveTo(13.458f, 6.985f)
                curveToRelative(0.0f, -1.094f, -0.902f, -1.985f, -2.012f, -1.985f)
                horizontalLineToRelative(-1.967f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.096f)
                lineToRelative(0.717f, -0.003f)
                curveToRelative(1.109f, 0.0f, 2.012f, -0.891f, 2.012f, -1.985f)
                close()
                moveTo(18.616f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(1.375f)
                verticalLineToRelative(4.819f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-4.819f)
                horizontalLineToRelative(1.375f)
                verticalLineToRelative(-1.25f)
                close()
            }
        }
        .build()
        return _pptFile!!
    }

private var _pptFile: ImageVector? = null
