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

public val Icons.Outline.RectangleCode: ImageVector
    get() {
        if (_rectangleCode != null) {
            return _rectangleCode!!
        }
        _rectangleCode = Builder(name = "RectangleCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.831f, 16.998f)
                curveToRelative(-0.256f, 0.0f, -0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.583f, -2.584f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                lineToRelative(-2.583f, -2.584f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.583f, 2.583f)
                curveToRelative(0.567f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.312f, 1.555f, -0.879f, 2.121f)
                lineToRelative(-2.583f, 2.584f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                close()
                moveTo(9.877f, 16.705f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.583f, -2.584f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.439f, -0.293f, -0.707f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.293f, -0.707f)
                lineToRelative(2.583f, -2.583f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.583f, 2.583f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.879f, 2.121f)
                lineToRelative(2.583f, 2.584f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
                moveTo(24.001f, 17.0f)
                lineTo(24.001f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(19.001f, 4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _rectangleCode!!
    }

private var _rectangleCode: ImageVector? = null
