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

public val Icons.Bold.RectangleCode: ImageVector
    get() {
        if (_rectangleCode != null) {
            return _rectangleCode!!
        }
        _rectangleCode = Builder(name = "RectangleCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.829f, 17.0f)
                curveToRelative(-0.384f, 0.0f, -0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(2.085f, -2.086f)
                curveToRelative(0.127f, -0.127f, 0.146f, -0.276f, 0.146f, -0.354f)
                reflectiveCurveToRelative(-0.019f, -0.226f, -0.146f, -0.353f)
                lineToRelative(-2.085f, -2.086f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.536f, -0.586f, 2.121f, 0.0f)
                lineToRelative(2.085f, 2.086f)
                curveToRelative(0.661f, 0.661f, 1.025f, 1.54f, 1.025f, 2.475f)
                reflectiveCurveToRelative(-0.364f, 1.814f, -1.025f, 2.475f)
                lineToRelative(-2.085f, 2.086f)
                curveToRelative(-0.292f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                close()
                moveTo(10.232f, 16.561f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.085f, -2.086f)
                curveToRelative(-0.127f, -0.127f, -0.146f, -0.276f, -0.146f, -0.353f)
                reflectiveCurveToRelative(0.019f, -0.226f, 0.146f, -0.354f)
                lineToRelative(2.085f, -2.086f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.085f, 2.085f)
                curveToRelative(-0.661f, 0.661f, -1.025f, 1.54f, -1.025f, 2.475f)
                reflectiveCurveToRelative(0.364f, 1.814f, 1.025f, 2.475f)
                lineToRelative(2.085f, 2.086f)
                curveToRelative(0.292f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                close()
                moveTo(24.0f, 16.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 2.0f)
                curveTo(2.467f, 2.0f, 0.0f, 4.467f, 0.0f, 7.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                close()
                moveTo(18.5f, 5.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _rectangleCode!!
    }

private var _rectangleCode: ImageVector? = null
