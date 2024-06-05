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

public val Icons.Bold.DisplayCode: ImageVector
    get() {
        if (_displayCode != null) {
            return _displayCode!!
        }
        _displayCode = Builder(name = "DisplayCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.975f, 7.025f)
                curveToRelative(1.365f, 1.364f, 1.365f, 3.585f, 0.0f, 4.949f)
                lineToRelative(-2.085f, 2.086f)
                curveToRelative(-0.292f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(2.085f, -2.086f)
                curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0.0f, -0.707f)
                lineToRelative(-2.085f, -2.086f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.536f, -0.586f, 2.121f, 0.0f)
                lineToRelative(2.085f, 2.086f)
                close()
                moveTo(10.232f, 7.06f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.536f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.085f, 2.086f)
                curveToRelative(-1.365f, 1.364f, -1.365f, 3.585f, 0.0f, 4.949f)
                lineToRelative(2.085f, 2.086f)
                curveToRelative(0.292f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.085f, -2.086f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0.0f, -0.707f)
                lineToRelative(2.085f, -2.086f)
                close()
                moveTo(24.0f, 5.499f)
                lineTo(24.0f, 13.5f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.468f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.499f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 2.999f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                lineTo(3.0f, 13.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _displayCode!!
    }

private var _displayCode: ImageVector? = null
