package me.localx.icons.rounded.bold

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

public val Icons.Bold.SquareV: ImageVector
    get() {
        if (_squareV != null) {
            return _squareV!!
        }
        _squareV = Builder(name = "SquareV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(18.914f, 7.002f)
                lineToRelative(-3.33f, 9.386f)
                curveToRelative(-0.547f, 1.537f, -1.953f, 2.53f, -3.584f, 2.53f)
                reflectiveCurveToRelative(-3.037f, -0.993f, -3.583f, -2.53f)
                lineToRelative(-3.331f, -9.386f)
                curveToRelative(-0.276f, -0.781f, 0.132f, -1.639f, 0.912f, -1.916f)
                curveToRelative(0.783f, -0.276f, 1.639f, 0.133f, 1.916f, 0.912f)
                lineToRelative(3.33f, 9.386f)
                curveToRelative(0.171f, 0.482f, 0.586f, 0.534f, 0.756f, 0.534f)
                reflectiveCurveToRelative(0.585f, -0.052f, 0.757f, -0.534f)
                lineToRelative(3.329f, -9.386f)
                curveToRelative(0.278f, -0.779f, 1.133f, -1.188f, 1.916f, -0.912f)
                curveToRelative(0.78f, 0.277f, 1.188f, 1.135f, 0.912f, 1.916f)
                close()
            }
        }
        .build()
        return _squareV!!
    }

private var _squareV: ImageVector? = null
