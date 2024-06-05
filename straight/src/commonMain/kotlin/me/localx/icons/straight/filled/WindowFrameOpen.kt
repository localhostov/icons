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

public val Icons.Filled.WindowFrameOpen: ImageVector
    get() {
        if (_windowFrameOpen != null) {
            return _windowFrameOpen!!
        }
        _windowFrameOpen = Builder(name = "WindowFrameOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _windowFrameOpen!!
    }

private var _windowFrameOpen: ImageVector? = null
