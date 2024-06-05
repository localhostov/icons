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

public val Icons.Outline.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.114f, 8.568f)
                lineTo(15.0f, 7.323f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 7.323f)
                lineTo(5.886f, 8.568f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 4.0f, 11.354f)
                lineTo(4.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 11.354f)
                arcTo(2.988f, 2.988f, 0.0f, false, false, 18.114f, 8.568f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 11.354f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.629f, -0.928f)
                lineTo(11.0f, 8.677f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.677f)
                lineToRelative(4.371f, 1.748f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.629f, 0.929f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
