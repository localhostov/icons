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

public val Icons.Bold.D: ImageVector
    get() {
        if (_d != null) {
            return _d!!
        }
        _d = Builder(name = "D", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineTo(5.5f)
                curveTo(2.0f, 2.467f, 4.468f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(6.341f, 0.0f, 11.5f, 5.159f, 11.5f, 11.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 6.341f, -5.159f, 11.5f, -11.5f, 11.5f)
                close()
                moveTo(7.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.687f, -3.813f, -8.5f, -8.5f, -8.5f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _d!!
    }

private var _d: ImageVector? = null
