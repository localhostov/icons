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

public val Icons.Outline.H1: ImageVector
    get() {
        if (_h1 != null) {
            return _h1!!
        }
        _h1 = Builder(name = "H1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(21.383f, 4.076f)
                curveToRelative(-0.375f, -0.156f, -0.805f, -0.07f, -1.09f, 0.217f)
                lineToRelative(-3.0f, 3.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, -1.293f)
                verticalLineToRelative(11.586f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -0.404f, -0.244f, -0.77f, -0.617f, -0.924f)
                close()
            }
        }
        .build()
        return _h1!!
    }

private var _h1: ImageVector? = null
