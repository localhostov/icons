package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(15.0f)
                lineTo(7.0f, 23.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.085f)
                lineToRelative(-1.792f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.8f, -2.802f)
                curveToRelative(0.773f, -0.774f, 0.773f, -2.036f, 0.0f, -2.812f)
                lineToRelative(-2.799f, -2.801f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.802f, 1.793f)
                horizontalLineToRelative(-6.095f)
                lineTo(7.001f, 4.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.0f, -1.13f, 0.391f, -2.162f, 1.026f, -3.0f)
                horizontalLineToRelative(-3.026f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(5.0f)
                lineTo(5.0f, 4.0f)
                close()
                moveTo(19.0f, 1.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, -4.414f)
                close()
            }
        }
        .build()
        return _convertDocument!!
    }

private var _convertDocument: ImageVector? = null
