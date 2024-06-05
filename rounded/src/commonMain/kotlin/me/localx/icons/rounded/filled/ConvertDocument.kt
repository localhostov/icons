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

public val Icons.Filled.ConvertDocument: ImageVector
    get() {
        if (_convertDocument != null) {
            return _convertDocument!!
        }
        _convertDocument = Builder(name = "ConvertDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 1.3f)
                curveToRelative(0.697f, 0.245f, 1.341f, 0.627f, 1.879f, 1.164f)
                lineToRelative(3.656f, 3.657f)
                curveToRelative(0.537f, 0.537f, 0.919f, 1.182f, 1.165f, 1.878f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(17.0f, 1.3f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.095f)
                lineToRelative(-1.802f, -1.793f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.415f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                lineToRelative(2.799f, 2.801f)
                curveToRelative(0.387f, 0.387f, 0.581f, 0.896f, 0.581f, 1.405f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f)
                curveToRelative(0.0f, 0.509f, -0.193f, 1.017f, -0.58f, 1.404f)
                lineToRelative(-2.8f, 2.802f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.792f, -1.793f)
                horizontalLineToRelative(-6.085f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(0.0f, -1.538f, 0.586f, -2.937f, 1.54f, -4.0f)
                horizontalLineToRelative(-2.54f)
                curveTo(1.794f, 1.0f, 0.0f, 2.794f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.54f)
                curveToRelative(-0.954f, -1.063f, -1.54f, -2.462f, -1.54f, -4.0f)
                close()
            }
        }
        .build()
        return _convertDocument!!
    }

private var _convertDocument: ImageVector? = null
