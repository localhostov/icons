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

public val Icons.Bold.BooksMedical: ImageVector
    get() {
        if (_booksMedical != null) {
            return _booksMedical!!
        }
        _booksMedical = Builder(name = "BooksMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(3.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 0.0f)
                close()
                moveTo(20.566f, 4.126f)
                lineToRelative(-0.477f, -2.5f)
                curveToRelative(-0.206f, -1.085f, -1.253f, -1.797f, -2.338f, -1.591f)
                lineToRelative(-1.672f, 0.317f)
                curveToRelative(-0.684f, 0.13f, -1.219f, 0.595f, -1.47f, 1.193f)
                curveToRelative(-0.513f, -0.918f, -1.482f, -1.546f, -2.609f, -1.546f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.967f)
                lineToRelative(4.599f, -0.874f)
                close()
                moveTo(20.941f, 6.09f)
                lineToRelative(-5.601f, 1.064f)
                lineToRelative(2.169f, 10.859f)
                lineToRelative(5.601f, -1.064f)
                lineToRelative(-2.169f, -10.859f)
                close()
                moveTo(10.0f, 23.999f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.964f, 21.307f)
                lineToRelative(-0.479f, -2.393f)
                lineToRelative(-5.601f, 1.064f)
                lineToRelative(0.48f, 2.396f)
                curveToRelative(0.207f, 1.084f, 1.254f, 1.796f, 2.338f, 1.59f)
                lineToRelative(1.672f, -0.317f)
                curveToRelative(1.086f, -0.206f, 1.798f, -1.254f, 1.591f, -2.34f)
                close()
                moveTo(10.0f, 16.999f)
                horizontalLineToRelative(5.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _booksMedical!!
    }

private var _booksMedical: ImageVector? = null
