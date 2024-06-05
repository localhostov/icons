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

public val Icons.Filled.HotTub: ImageVector
    get() {
        if (_hotTub != null) {
            return _hotTub!!
        }
        _hotTub = Builder(name = "HotTub", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.293f, 3.707f)
                curveToRelative(-0.834f, -0.833f, -1.293f, -1.942f, -1.293f, -3.121f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 0.586f)
                curveToRelative(0.0f, 0.635f, 0.258f, 1.258f, 0.707f, 1.707f)
                curveToRelative(0.834f, 0.833f, 1.293f, 1.942f, 1.293f, 3.121f)
                verticalLineToRelative(1.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.635f, -0.258f, -1.258f, -0.707f, -1.707f)
                close()
                moveTo(17.0f, 6.414f)
                verticalLineToRelative(1.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -1.179f, -0.459f, -2.288f, -1.293f, -3.121f)
                curveToRelative(-0.449f, -0.449f, -0.707f, -1.072f, -0.707f, -1.707f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 1.586f)
                curveToRelative(0.0f, 1.179f, 0.459f, 2.288f, 1.293f, 3.121f)
                curveToRelative(0.449f, 0.449f, 0.707f, 1.072f, 0.707f, 1.707f)
                close()
                moveTo(12.021f, 12.0f)
                lineToRelative(-2.306f, -3.293f)
                curveToRelative(-0.747f, -1.068f, -1.972f, -1.707f, -3.277f, -1.707f)
                horizontalLineToRelative(-1.438f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(3.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 12.0f)
                lineTo(12.021f, 12.0f)
                close()
                moveTo(5.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(6.881f, 0.0f, 5.5f, 0.0f)
                reflectiveCurveTo(3.0f, 1.119f, 3.0f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _hotTub!!
    }

private var _hotTub: ImageVector? = null
