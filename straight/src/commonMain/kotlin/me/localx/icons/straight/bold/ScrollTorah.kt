package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ScrollTorah: ImageVector
    get() {
        if (_scrollTorah != null) {
            return _scrollTorah!!
        }
        _scrollTorah = Builder(name = "ScrollTorah", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 2.0f)
                lineTo(5.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.626f, 15.505f)
                horizontalLineToRelative(4.267f)
                lineToRelative(2.107f, 3.455f)
                lineToRelative(2.107f, -3.455f)
                horizontalLineToRelative(4.267f)
                lineToRelative(-2.132f, -3.501f)
                lineToRelative(2.133f, -3.499f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(-2.111f, -3.467f)
                lineToRelative(-2.111f, 3.467f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(2.133f, 3.499f)
                lineToRelative(-2.132f, 3.501f)
                close()
                moveTo(7.405f, 14.505f)
                lineToRelative(0.939f, -1.541f)
                lineToRelative(0.94f, 1.541f)
                horizontalLineToRelative(-1.878f)
                close()
                moveTo(12.0f, 17.039f)
                lineToRelative(-0.935f, -1.534f)
                horizontalLineToRelative(1.871f)
                lineToRelative(-0.935f, 1.534f)
                close()
                moveTo(16.595f, 14.505f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.94f, -1.541f)
                lineToRelative(0.939f, 1.541f)
                close()
                moveTo(16.595f, 9.505f)
                lineToRelative(-0.937f, 1.537f)
                lineToRelative(-0.936f, -1.537f)
                horizontalLineToRelative(1.874f)
                close()
                moveTo(12.001f, 6.961f)
                lineToRelative(0.94f, 1.544f)
                horizontalLineToRelative(-1.881f)
                lineToRelative(0.94f, -1.544f)
                close()
                moveTo(10.452f, 9.505f)
                horizontalLineToRelative(3.099f)
                lineToRelative(1.521f, 2.498f)
                lineToRelative(-1.526f, 2.502f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(-1.526f, -2.502f)
                lineToRelative(1.521f, -2.498f)
                close()
                moveTo(7.408f, 9.505f)
                horizontalLineToRelative(1.874f)
                lineToRelative(-0.936f, 1.537f)
                lineToRelative(-0.937f, -1.537f)
                close()
            }
        }
        .build()
        return _scrollTorah!!
    }

private var _scrollTorah: ImageVector? = null
