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

public val Icons.Outline.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, 5.666f, 2.254f)
                lineToRelative(-1.33f, 1.494f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, -4.336f, 1.748f)
                lineToRelative(-1.33f, -1.494f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 14.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(14.0f, 10.461f)
                horizontalLineToRelative(0.0f)
                lineTo(14.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.53f, -1.09f)
                arcTo(2.31f, 2.31f, 0.0f, false, true, 18.0f, 9.0f)
                lineTo(18.0f, 7.0f)
                curveTo(14.719f, 7.0f, 14.0f, 9.5f, 14.0f, 10.461f)
                close()
                moveTo(7.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-0.039f)
                horizontalLineToRelative(0.0f)
                curveTo(10.0f, 9.5f, 9.281f, 7.0f, 6.0f, 7.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, true, 1.472f, 0.409f)
                arcTo(1.491f, 1.491f, 0.0f, false, false, 7.0f, 10.5f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
