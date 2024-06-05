package me.localx.icons.straight.bold

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

public val Icons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.462f)
                lineToRelative(-0.866f, -0.612f)
                curveTo(9.994f, 22.044f, 0.0f, 14.783f, 0.0f, 8.15f)
                arcTo(7.036f, 7.036f, 0.0f, false, true, 6.75f, 0.875f)
                arcTo(6.57f, 6.57f, 0.0f, false, true, 12.0f, 3.582f)
                arcTo(6.57f, 6.57f, 0.0f, false, true, 17.25f, 0.875f)
                arcTo(7.036f, 7.036f, 0.0f, false, true, 24.0f, 8.15f)
                curveToRelative(0.0f, 6.633f, -9.994f, 13.894f, -11.134f, 14.7f)
                close()
                moveTo(6.75f, 3.875f)
                arcTo(4.043f, 4.043f, 0.0f, false, false, 3.0f, 8.15f)
                curveToRelative(0.0f, 3.916f, 5.863f, 9.21f, 9.0f, 11.611f)
                curveToRelative(3.137f, -2.4f, 9.0f, -7.695f, 9.0f, -11.611f)
                arcToRelative(4.043f, 4.043f, 0.0f, false, false, -3.75f, -4.275f)
                arcTo(4.043f, 4.043f, 0.0f, false, false, 13.5f, 8.15f)
                horizontalLineToRelative(-3.0f)
                arcTo(4.043f, 4.043f, 0.0f, false, false, 6.75f, 3.875f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
