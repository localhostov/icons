package me.localx.icons.rounded.filled

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

public val Icons.Filled.ClearAlt: ImageVector
    get() {
        if (_clearAlt != null) {
            return _clearAlt!!
        }
        _clearAlt = Builder(name = "ClearAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(21.314f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(20.707f, 7.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.293f, -1.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.293f, 1.293f)
                close()
                moveTo(14.896f, 13.373f)
                lineToRelative(-0.896f, 1.008f)
                verticalLineToRelative(8.62f)
                curveToRelative(0.0f, 0.379f, -0.214f, 0.725f, -0.553f, 0.895f)
                curveToRelative(-0.142f, 0.071f, -0.295f, 0.105f, -0.447f, 0.105f)
                curveToRelative(-0.212f, 0.0f, -0.423f, -0.068f, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.0f)
                curveToRelative(-0.252f, -0.188f, -0.4f, -0.485f, -0.4f, -0.8f)
                verticalLineToRelative(-5.62f)
                lineTo(0.984f, 6.488f)
                curveToRelative(-0.635f, -0.715f, -0.984f, -1.634f, -0.984f, -2.59f)
                curveTo(0.0f, 1.749f, 1.749f, 0.0f, 3.898f, 0.0f)
                horizontalLineToRelative(8.828f)
                curveToRelative(-1.667f, 1.467f, -2.726f, 3.61f, -2.726f, 6.0f)
                curveToRelative(0.0f, 3.311f, 2.022f, 6.158f, 4.896f, 7.373f)
                close()
            }
        }
        .build()
        return _clearAlt!!
    }

private var _clearAlt: ImageVector? = null
