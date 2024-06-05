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

public val Icons.Filled.BusinessTime: ImageVector
    get() {
        if (_businessTime != null) {
            return _businessTime!!
        }
        _businessTime = Builder(name = "BusinessTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.961f, 17.336f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.332f, -2.997f, -2.878f, -5.336f, -5.961f, -5.336f)
                curveToRelative(-7.514f, 0.194f, -8.097f, 10.912f, -0.702f, 11.955f)
                curveToRelative(3.767f, 0.499f, 7.135f, -2.85f, 6.663f, -6.62f)
                close()
                moveTo(20.0f, 20.0f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.006f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(2.393f, 0.0f, 4.534f, 1.056f, 6.0f, 2.721f)
                verticalLineToRelative(-3.721f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-1.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, 1.721f, -4.899f, 4.0f)
                horizontalLineToRelative(-1.101f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(12.721f, 12.0f)
                curveToRelative(1.409f, -1.241f, 3.254f, -2.0f, 5.279f, -2.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                horizontalLineToRelative(-7.631f)
                curveToRelative(0.414f, -1.161f, 1.514f, -2.0f, 2.816f, -2.0f)
                close()
                moveTo(12.721f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(11.079f, 14.0f)
                curveToRelative(-1.939f, 3.109f, -1.132f, 7.725f, 1.642f, 10.0f)
                close()
            }
        }
        .build()
        return _businessTime!!
    }

private var _businessTime: ImageVector? = null
