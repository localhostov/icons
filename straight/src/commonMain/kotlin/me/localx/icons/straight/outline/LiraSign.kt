package me.localx.icons.straight.outline

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

public val Icons.Outline.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(13.354f)
                lineToRelative(8.0f, -2.195f)
                verticalLineToRelative(-2.053f)
                lineToRelative(-8.0f, 2.195f)
                verticalLineToRelative(-2.053f)
                lineToRelative(8.0f, -2.195f)
                verticalLineToRelative(-2.053f)
                lineToRelative(-8.0f, 2.195f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.743f)
                lineToRelative(-4.0f, 1.097f)
                verticalLineToRelative(2.053f)
                lineToRelative(4.0f, -1.097f)
                verticalLineToRelative(2.053f)
                lineToRelative(-4.0f, 1.097f)
                verticalLineToRelative(2.053f)
                lineToRelative(4.0f, -1.097f)
                verticalLineToRelative(10.097f)
                horizontalLineToRelative(5.0f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.935f, 11.0f, -11.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
