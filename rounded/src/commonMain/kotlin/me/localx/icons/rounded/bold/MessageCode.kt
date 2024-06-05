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

public val Icons.Bold.MessageCode: ImageVector
    get() {
        if (_messageCode != null) {
            return _messageCode!!
        }
        _messageCode = Builder(name = "MessageCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.975f, 7.527f)
                curveToRelative(1.365f, 1.364f, 1.365f, 3.586f, 0.0f, 4.95f)
                lineToRelative(-2.083f, 2.083f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(2.083f, -2.083f)
                curveToRelative(0.195f, -0.195f, 0.195f, -0.513f, 0.0f, -0.708f)
                lineToRelative(-2.088f, -2.088f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(2.088f, 2.088f)
                close()
                moveTo(10.235f, 7.56f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.088f, 2.088f)
                curveToRelative(-1.365f, 1.364f, -1.365f, 3.586f, 0.0f, 4.95f)
                lineToRelative(2.083f, 2.083f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.083f, -2.083f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.513f, 0.0f, -0.708f)
                lineToRelative(2.088f, -2.088f)
                close()
                moveTo(24.001f, 5.499f)
                lineTo(24.001f, 14.5f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.172f)
                lineToRelative(-3.708f, 3.065f)
                curveToRelative(-0.448f, 0.399f, -1.024f, 0.601f, -1.606f, 0.601f)
                curveToRelative(-0.595f, 0.0f, -1.196f, -0.21f, -1.675f, -0.636f)
                lineToRelative(-3.598f, -3.03f)
                horizontalLineToRelative(-1.241f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.001f, 5.5f)
                curveTo(0.0f, 2.468f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(21.001f, 5.499f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 2.999f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                lineTo(3.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.789f)
                curveToRelative(0.354f, 0.0f, 0.696f, 0.125f, 0.966f, 0.353f)
                lineToRelative(3.749f, 3.158f)
                lineToRelative(3.83f, -3.167f)
                curveToRelative(0.269f, -0.222f, 0.607f, -0.344f, 0.956f, -0.344f)
                horizontalLineToRelative(1.711f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.001f, 5.5f)
                close()
            }
        }
        .build()
        return _messageCode!!
    }

private var _messageCode: ImageVector? = null
