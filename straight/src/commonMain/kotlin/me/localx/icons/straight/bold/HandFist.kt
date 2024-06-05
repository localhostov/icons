package me.localx.icons.straight.bold

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

public val Icons.Bold.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(13.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(21.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.402f, 10.5f)
                curveToRelative(0.797f, -0.797f, 0.797f, -2.089f, 0.0f, -2.886f)
                curveToRelative(-0.797f, -0.797f, -2.089f, -0.797f, -2.886f, 0.0f)
                lineToRelative(-2.512f, 1.883f)
                curveToRelative(-0.646f, 0.658f, -1.004f, 1.525f, -1.004f, 2.449f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.814f, 1.06f, 2.508f)
                lineToRelative(3.94f, 4.547f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.263f)
                lineToRelative(-4.412f, -5.025f)
                lineToRelative(2.814f, -2.212f)
                close()
                moveTo(9.0f, 5.586f)
                verticalLineToRelative(-3.086f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(2.647f)
                curveToRelative(1.008f, -0.245f, 2.084f, -0.099f, 3.0f, 0.44f)
                close()
                moveTo(18.0f, 9.649f)
                verticalLineToRelative(4.097f)
                curveToRelative(0.0f, 0.792f, -0.272f, 1.568f, -0.767f, 2.187f)
                lineToRelative(-1.233f, 1.541f)
                verticalLineToRelative(6.526f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.474f)
                lineToRelative(0.575f, -0.72f)
                curveToRelative(0.919f, -1.146f, 1.425f, -2.589f, 1.425f, -4.061f)
                verticalLineToRelative(-4.097f)
                curveToRelative(-0.456f, 0.219f, -0.961f, 0.351f, -1.5f, 0.351f)
                reflectiveCurveToRelative(-1.044f, -0.133f, -1.5f, -0.351f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
