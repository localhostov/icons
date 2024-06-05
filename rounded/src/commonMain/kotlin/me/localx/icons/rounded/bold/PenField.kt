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

public val Icons.Bold.PenField: ImageVector
    get() {
        if (_penField != null) {
            return _penField!!
        }
        _penField = Builder(name = "PenField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.625f, 9.862f)
                curveToRelative(0.887f, 1.005f, 1.375f, 2.297f, 1.375f, 3.638f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 23.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.033f, 2.468f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.609f, -0.222f, -1.196f, -0.625f, -1.653f)
                curveToRelative(-0.548f, -0.621f, -0.488f, -1.569f, 0.133f, -2.117f)
                curveToRelative(0.621f, -0.549f, 1.569f, -0.489f, 2.117f, 0.133f)
                close()
                moveTo(5.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(10.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(13.526f, 11.0f)
                horizontalLineToRelative(0.955f)
                curveToRelative(1.149f, 0.0f, 2.252f, -0.457f, 3.064f, -1.269f)
                lineToRelative(5.715f, -5.715f)
                curveToRelative(0.85f, -0.85f, 1.013f, -2.236f, 0.252f, -3.167f)
                curveToRelative(-0.875f, -1.07f, -2.456f, -1.129f, -3.409f, -0.176f)
                lineToRelative(-5.808f, 5.808f)
                curveToRelative(-0.813f, 0.813f, -1.269f, 1.915f, -1.269f, 3.064f)
                verticalLineToRelative(0.955f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _penField!!
    }

private var _penField: ImageVector? = null
