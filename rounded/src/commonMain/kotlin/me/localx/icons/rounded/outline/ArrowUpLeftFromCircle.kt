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

public val Icons.Outline.ArrowUpLeftFromCircle: ImageVector
    get() {
        if (_arrowUpLeftFromCircle != null) {
            return _arrowUpLeftFromCircle!!
        }
        _arrowUpLeftFromCircle = Builder(name = "ArrowUpLeftFromCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.414f)
                verticalLineToRelative(6.586f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.414f, 2.0f)
                lineTo(15.707f, 14.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(2.0f, 3.414f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(-1.143f, 0.0f, -2.264f, 0.191f, -3.333f, 0.569f)
                curveToRelative(-0.521f, 0.184f, -0.793f, 0.755f, -0.609f, 1.276f)
                curveToRelative(0.145f, 0.41f, 0.531f, 0.667f, 0.943f, 0.667f)
                curveToRelative(0.11f, 0.0f, 0.223f, -0.019f, 0.333f, -0.058f)
                curveToRelative(0.854f, -0.302f, 1.751f, -0.455f, 2.667f, -0.455f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.915f, 0.153f, -1.812f, 0.455f, -2.667f)
                curveToRelative(0.184f, -0.521f, -0.089f, -1.092f, -0.609f, -1.276f)
                curveToRelative(-0.523f, -0.185f, -1.093f, 0.088f, -1.276f, 0.609f)
                curveToRelative(-0.378f, 1.069f, -0.569f, 2.19f, -0.569f, 3.333f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(19.514f, 4.0f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeftFromCircle!!
    }

private var _arrowUpLeftFromCircle: ImageVector? = null
