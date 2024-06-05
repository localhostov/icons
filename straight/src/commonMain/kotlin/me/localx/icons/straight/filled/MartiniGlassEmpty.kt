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

public val Icons.Filled.MartiniGlassEmpty: ImageVector
    get() {
        if (_martiniGlassEmpty != null) {
            return _martiniGlassEmpty!!
        }
        _martiniGlassEmpty = Builder(name = "MartiniGlassEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.104f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.552f, -0.658f, 3.041f, -1.807f, 4.085f)
                lineToRelative(-9.193f, 8.358f)
                verticalLineToRelative(8.557f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.104f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-8.557f)
                lineTo(1.911f, 5.085f)
                curveTo(0.763f, 4.041f, 0.104f, 2.552f, 0.104f, 1.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _martiniGlassEmpty!!
    }

private var _martiniGlassEmpty: ImageVector? = null
