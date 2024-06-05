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

public val Icons.Bold.FloppyDiskPen: ImageVector
    get() {
        if (_floppyDiskPen != null) {
            return _floppyDiskPen!!
        }
        _floppyDiskPen = Builder(name = "FloppyDiskPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 20.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(9.763f)
                curveToRelative(0.928f, 0.0f, 1.834f, 0.378f, 2.486f, 1.037f)
                lineToRelative(3.236f, 3.265f)
                curveToRelative(0.654f, 0.658f, 1.015f, 1.534f, 1.015f, 2.464f)
                verticalLineToRelative(1.734f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.734f)
                curveToRelative(0.0f, -0.133f, -0.051f, -0.257f, -0.145f, -0.351f)
                lineToRelative(-3.238f, -3.267f)
                curveToRelative(-0.093f, -0.094f, -0.222f, -0.148f, -0.354f, -0.148f)
                horizontalLineToRelative(-0.263f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.45f)
                curveToRelative(-1.14f, 0.232f, -2.0f, 1.242f, -2.0f, 2.45f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(14.5f, 12.75f)
                curveToRelative(0.0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
                reflectiveCurveToRelative(-3.75f, 1.679f, -3.75f, 3.75f)
                reflectiveCurveToRelative(1.679f, 3.75f, 3.75f, 3.75f)
                reflectiveCurveToRelative(3.75f, -1.679f, 3.75f, -3.75f)
                close()
                moveTo(23.512f, 12.849f)
                curveToRelative(-0.875f, -1.07f, -2.456f, -1.129f, -3.409f, -0.176f)
                lineToRelative(-6.808f, 6.808f)
                curveToRelative(-0.813f, 0.813f, -1.269f, 1.915f, -1.269f, 3.064f)
                verticalLineToRelative(0.955f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.955f)
                curveToRelative(1.149f, 0.0f, 2.252f, -0.457f, 3.064f, -1.269f)
                lineToRelative(6.715f, -6.715f)
                curveToRelative(0.85f, -0.85f, 1.013f, -2.236f, 0.252f, -3.167f)
                close()
            }
        }
        .build()
        return _floppyDiskPen!!
    }

private var _floppyDiskPen: ImageVector? = null
